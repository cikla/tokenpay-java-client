package com.tokenpay.request;

import com.tokenpay.net.HttpMethod;
import com.tokenpay.request.common.BaseRequest;
import com.tokenpay.request.common.RequestQueryParamsBuilder;
import lombok.Data;
import lombok.experimental.SuperBuilder;


@Data
@SuperBuilder
public class SearchPaymentRequest extends BaseRequest {

    private Long paymentId;
    private String conversationId;

    @Override
    public String getPath() {
        String query = RequestQueryParamsBuilder.builder()
                .add("paymentId", paymentId)
                .add("conversationId", conversationId)
                .getQuery();

        return "/payment/v1/card-payments" + query;
    }

    @Override
    public HttpMethod getMethod() {
        return HttpMethod.GET;
    }
}