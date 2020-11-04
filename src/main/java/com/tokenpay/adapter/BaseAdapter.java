package com.tokenpay.adapter;

import com.tokenpay.request.common.BaseRequest;
import com.tokenpay.request.common.HashGenerator;
import com.tokenpay.request.common.RequestOptions;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.HashMap;
import java.util.Map;

public abstract class BaseAdapter {

    private static final int RANDOM_STRING_SIZE = 8;
    private static final String API_VERSION_HEADER_VALUE = "v1";
    private static final String API_KEY_HEADER_NAME = "x-api-key";
    private static final String RANDOM_HEADER_NAME = "x-rnd-key";
    private static final String AUTH_VERSION_HEADER_NAME = "x-auth-version";
    private static final String SIGNATURE_HEADER_NAME = "x-signature";

    protected Map<String, String> createHeaders(BaseRequest request, RequestOptions requestOptions) {
        return createHttpHeaders(request, requestOptions);
    }

    private static Map<String, String> createHttpHeaders(BaseRequest request, RequestOptions options) {
        Map<String, String> headers = new HashMap<>();

        String randomString = RandomStringUtils.randomAlphanumeric(RANDOM_STRING_SIZE);
        headers.put(API_KEY_HEADER_NAME, options.getApiKey());
        headers.put(RANDOM_HEADER_NAME, randomString);
        headers.put(AUTH_VERSION_HEADER_NAME, API_VERSION_HEADER_VALUE);
        headers.put(SIGNATURE_HEADER_NAME, prepareAuthorizationString(request, randomString, options));
        return headers;
    }

    private static String prepareAuthorizationString(BaseRequest request, String randomString, RequestOptions options) {
        return HashGenerator.generateHash(options.getBaseUrl(),  options.getApiKey(), options.getSecretKey(), randomString, request);
    }
}
