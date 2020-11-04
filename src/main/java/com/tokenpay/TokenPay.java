package com.tokenpay;

import com.tokenpay.adapter.PaymentAdapter;
import com.tokenpay.request.common.RequestOptions;

public class TokenPay {

    private final PaymentAdapter payment;
    private static final String baseUrl = "https://api.tokenpay.com.tr";

    public TokenPay(String apiKey, String secretKey) {
        this(apiKey, secretKey, baseUrl);
    }

    public TokenPay(String apiKey, String secretKey, String baseUrl) {
        RequestOptions requestOptions = RequestOptions.builder()
                .apiKey(apiKey)
                .secretKey(secretKey)
                .baseUrl(baseUrl)
                .build();

        this.payment = new PaymentAdapter(requestOptions);
    }

    public PaymentAdapter payment() {
        return payment;
    }
}
