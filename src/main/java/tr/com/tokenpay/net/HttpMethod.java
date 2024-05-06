package tr.com.tokenpay.net;

public enum HttpMethod {

    GET,
    POST,
    DELETE,
    PUT;

    public static boolean hasBody(HttpMethod httpMethod) {
        return !GET.equals(httpMethod);
    }
}
