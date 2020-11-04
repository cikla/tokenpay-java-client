package com.tokenpay.request.common;

import lombok.Data;
import org.apache.commons.lang3.StringUtils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Data
public class RequestQueryParamsBuilder {

    private String query;

    public static RequestQueryParamsBuilder builder() {
        return new RequestQueryParamsBuilder();
    }

    public RequestQueryParamsBuilder add(String paramName, Object value) {
        if (query == null && Objects.nonNull(value)) {
            query = "?";
        }

        if (Objects.nonNull(value)) {
            value = formatValue(value);
            query += paramName + "=" + value + "&";
        }

        return this;
    }

    private String formatValue(Object value) {
        if (value instanceof Date) return formatDateValue((Date) value);
        if (value instanceof List) return formatListValue((List) value);
        return value.toString();
    }

    private String formatDateValue(Date date) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        return formatter.format(date);
    }

    private String formatListValue(List value) {
        return StringUtils.join(value, ",");
    }

    public String getQuery() {
        return StringUtils.isEmpty(query) ? StringUtils.EMPTY : query;
    }
}
