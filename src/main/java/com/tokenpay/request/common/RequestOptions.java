package com.tokenpay.request.common;

import com.tokenpay.TokenPay;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RequestOptions {
    private String apiKey;
    private String secretKey;
    private String baseUrl;

    public static RequestOptions getDefaultOptions() {
        return RequestOptions.builder()
                .apiKey(TokenPay.apiKey)
                .secretKey(TokenPay.secretKey)
                .baseUrl(TokenPay.baseUrl)
                .build();
    }
}
