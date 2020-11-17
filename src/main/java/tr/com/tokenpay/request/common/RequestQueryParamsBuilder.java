package tr.com.tokenpay.request.common;

import lombok.Data;

import java.lang.reflect.Field;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Data
public class RequestQueryParamsBuilder {

    public static RequestQueryParamsBuilder builder() {
        return new RequestQueryParamsBuilder();
    }

    public static String buildQueryParam(Object object) {
        try {
            Field[] fields = object.getClass().getDeclaredFields();

            StringBuilder query = new StringBuilder(fields.length > 0 ? "?" : "");

            for (Field field : fields) {
                field.setAccessible(true);
                Object value = field.get(object);

                if (Objects.nonNull(value)) {
                    query.append(field.getName()).append("=").append(URLEncoder.encode(formatValue(value), StandardCharsets.UTF_8)).append("&");
                }
            }

            return query.toString().replace("+", "%20");
        } catch (Exception e) {
            return "";
        }
    }

    private static String formatValue(Object value) {
        if (value instanceof Date) return formatDateValue((Date) value);
        if (value instanceof List) return formatListValue((List) value);
        return value.toString();
    }

    private static String formatDateValue(Date date) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        return formatter.format(date);
    }

    private static String formatListValue(List<Object> value) {
        return value.stream().map(String::valueOf).collect(Collectors.joining(","));
    }
}
