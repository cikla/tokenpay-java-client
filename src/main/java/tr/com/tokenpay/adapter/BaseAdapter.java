package tr.com.tokenpay.adapter;

import tr.com.tokenpay.request.common.HashGenerator;
import tr.com.tokenpay.request.common.Request;
import tr.com.tokenpay.request.common.RequestOptions;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public abstract class BaseAdapter {

    private static final String API_VERSION_HEADER_VALUE = "v1";
    private static final String API_KEY_HEADER_NAME = "x-api-key";
    private static final String RANDOM_HEADER_NAME = "x-rnd-key";
    private static final String AUTH_VERSION_HEADER_NAME = "x-auth-version";
    private static final String SIGNATURE_HEADER_NAME = "x-signature";

    protected final RequestOptions requestOptions;

    public BaseAdapter(RequestOptions requestOptions) {
        this.requestOptions = requestOptions;
    }

    protected Map<String, String> createHeaders(Request request, String path, RequestOptions requestOptions) {
        return createHttpHeaders(request, path, requestOptions);
    }

    protected Map<String, String> createHeaders(String path, RequestOptions requestOptions) {
        return createHttpHeaders(null, path, requestOptions);
    }

    private static Map<String, String> createHttpHeaders(Request request, String path, RequestOptions options) {
        Map<String, String> headers = new HashMap<>();

        String randomString = "Eria-random_Key123";//UUID.randomUUID().toString();
        headers.put(API_KEY_HEADER_NAME, options.getApiKey());
        headers.put(RANDOM_HEADER_NAME, randomString);
        headers.put(AUTH_VERSION_HEADER_NAME, API_VERSION_HEADER_VALUE);
        headers.put(SIGNATURE_HEADER_NAME, prepareAuthorizationString(request, path, randomString, options));
        return headers;
    }

    private static String prepareAuthorizationString(Request request, String path, String randomString, RequestOptions options) {    	
        return HashGenerator.generateHash(options.getBaseUrl(), options.getApiKey(), options.getSecretKey(), randomString, request, path);
    }
}
