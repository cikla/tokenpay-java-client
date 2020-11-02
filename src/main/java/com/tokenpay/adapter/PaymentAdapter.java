package com.tokenpay.adapter;

import com.tokenpay.model.TokenPayResource;
import com.tokenpay.net.HttpClient;
import com.tokenpay.request.CreatePaymentRequest;
import com.tokenpay.request.common.RequestOptions;
import com.tokenpay.response.PaymentResponse;

public class PaymentAdapter {

    public PaymentResponse createPayment(CreatePaymentRequest createPaymentRequest, RequestOptions options) {
        return HttpClient.post(options.getBaseUrl() + createPaymentRequest.getPath(), TokenPayResource.getHttpHeaders(createPaymentRequest, options),
                createPaymentRequest, PaymentResponse.class);
    }

    public PaymentResponse createPayment(CreatePaymentRequest createPaymentRequest) {
        return createPayment(createPaymentRequest, RequestOptions.getDefaultOptions());
    }
}
