package com.tokenpay.request;

import com.tokenpay.model.RefundDestinationType;
import com.tokenpay.request.common.BaseRequest;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class CreateRefundRequest extends BaseRequest {

    private Long paymentId;

    private String conversationId;

    @Builder.Default
    private RefundDestinationType refundDestinationType = RefundDestinationType.CARD;
}