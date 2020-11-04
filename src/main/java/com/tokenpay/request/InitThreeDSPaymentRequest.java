package com.tokenpay.request;

import com.tokenpay.net.HttpMethod;
import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class InitThreeDSPaymentRequest extends CreatePaymentRequest {

    private String callbackUrl;

    @Override
    public String getPath() {
        return "/payment/v1/card-payments/3ds-init";
    }

    @Override
    public HttpMethod getMethod() {
        return HttpMethod.POST;
    }
}
