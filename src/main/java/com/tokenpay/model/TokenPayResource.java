package com.tokenpay.model;


import com.google.gson.Gson;
import com.tokenpay.request.BaseRequest;
import com.tokenpay.request.HashGenerator;
import com.tokenpay.request.RequestOptions;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.HashMap;
import java.util.Map;

@Data
@Builder
public class TokenPayResource {

    private static final String AUTHORIZATION = "Authorization";
    private static final String API_KEY_HEADER_NAME = "x-api-key";
    private static final String RANDOM_HEADER_NAME = "x-rnd-key";
    private static final String AUTH_VERSION_HEADER_NAME = "x-auth-version";
    private static final String SIGNATURE_HEADER_NAME = "x-signature";
    private static final int RANDOM_STRING_SIZE = 8;

    private String status;
    private String errorCode;
    private String errorMessage;
    private String errorGroup;
    private String locale;
    private long systemTime;
    private String conversationId;

    protected static Map<String, String> getHttpHeaders(BaseRequest request, RequestOptions options) {
        Map<String, String> headers = new HashMap<String, String>();

        String randomString = System.currentTimeMillis() + RandomStringUtils.randomAlphanumeric(RANDOM_STRING_SIZE);
        headers.put(API_KEY_HEADER_NAME, options.getApiKey());
        headers.put(RANDOM_HEADER_NAME, randomString);
        headers.put(AUTH_VERSION_HEADER_NAME, "1");
        headers.put(SIGNATURE_HEADER_NAME, prepareAuthorizationString(request, randomString, options));
        return headers;
    }

    private static String prepareAuthorizationString(BaseRequest request, String randomString, RequestOptions options) {
        return HashGenerator.generateHash(options.getBaseUrl(), request.getPath(), options.getApiKey(),
                options.getSecretKey(), randomString, request);
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }
}
