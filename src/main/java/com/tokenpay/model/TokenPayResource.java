package com.tokenpay.model;

import com.tokenpay.request.common.BaseRequest;
import com.tokenpay.request.common.HashGenerator;
import com.tokenpay.request.common.RequestOptions;
import lombok.Builder;
import lombok.Data;
import org.apache.commons.lang3.RandomStringUtils;

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

    public static Map<String, String> getHttpHeaders(BaseRequest request, RequestOptions options) {
        Map<String, String> headers = new HashMap<>();

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
}
