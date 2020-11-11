package com.tokenpay.request;

import com.tokenpay.model.RefundDestinationType;
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
}