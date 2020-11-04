package com.tokenpay.request;

import com.tokenpay.net.HttpMethod;
import com.tokenpay.request.common.BaseRequest;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class RetrievePaymentRequest extends BaseRequest {

    private Long id;

    @Override
    public String getPath() {
        return "/payment/v1/card-payments/" + id;
    }

    @Override
    public HttpMethod getMethod() {
        return HttpMethod.GET;
    }
}
