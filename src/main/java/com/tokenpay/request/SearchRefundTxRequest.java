package com.tokenpay.request;

import com.tokenpay.net.HttpMethod;
import com.tokenpay.request.common.BaseRequest;
import com.tokenpay.request.common.RequestQueryParamsBuilder;
import lombok.Data;
import lombok.experimental.SuperBuilder;


@Data
@SuperBuilder
public class SearchRefundTxRequest extends BaseRequest {

    private Long paymentId;
    private String conversationId;
    private Long paymentTransactionId;

    @Override
    public String getPath() {
        String query = RequestQueryParamsBuilder.builder()
                .add("paymentId", paymentId)
                .add("conversationId", conversationId)
                .add("paymentTransactionId", paymentTransactionId)
                .getQuery();

        return "/payment/v1/refund-transactions" + query;
    }

    @Override
    public HttpMethod getMethod() {
        return HttpMethod.GET;
    }
}