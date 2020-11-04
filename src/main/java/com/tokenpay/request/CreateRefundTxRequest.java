package com.tokenpay.request;

import com.tokenpay.model.RefundDestinationType;
import com.tokenpay.net.HttpMethod;
import com.tokenpay.request.common.BaseRequest;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;

@Data
@SuperBuilder
public class CreateRefundTxRequest extends BaseRequest {

    private Long paymentTransactionId;

    private String conversationId;

    private BigDecimal refundPrice;

    @Builder.Default
    private RefundDestinationType refundDestinationType = RefundDestinationType.CARD;

    @Override
    public String getPath() {
        return "/payment/v1/refund-transactions";
    }

    @Override
    public HttpMethod getMethod() {
        return HttpMethod.POST;
    }
}