package com.tokenpay.request.common;

import lombok.Data;
import org.apache.commons.lang3.StringUtils;

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
            query += paramName + "=" + value + "&";
        }

        return this;
    }

    public String getQuery() {
        return StringUtils.isEmpty(query) ? StringUtils.EMPTY : query;
    }
}
