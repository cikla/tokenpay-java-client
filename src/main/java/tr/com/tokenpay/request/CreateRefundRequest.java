package tr.com.tokenpay.request;

import lombok.Builder;
import lombok.Data;
import lombok.experimental.SuperBuilder;
import tr.com.tokenpay.model.RefundDestinationType;
import tr.com.tokenpay.request.common.BaseRequest;

@Data
@SuperBuilder
public class CreateRefundRequest extends BaseRequest {

    private Long paymentId;

    private String conversationId;

    @Builder.Default
    private RefundDestinationType refundDestinationType = RefundDestinationType.CARD;
}
