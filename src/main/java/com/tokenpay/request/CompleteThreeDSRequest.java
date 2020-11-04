package com.tokenpay.request;

import com.tokenpay.net.HttpMethod;
import com.tokenpay.request.common.BaseRequest;
import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class CompleteThreeDSRequest extends BaseRequest {

    private Long paymentId;

    private String conversationData;

    @Override
    public String getPath() {
        return "/payment/v1/card-payments/3ds-complete";
    }

    @Override
    public HttpMethod getMethod() {
        return HttpMethod.POST;
    }
}