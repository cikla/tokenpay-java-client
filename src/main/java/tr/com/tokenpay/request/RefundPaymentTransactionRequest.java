package tr.com.tokenpay.request;

import lombok.Builder;
import lombok.Data;
import lombok.experimental.SuperBuilder;
import tr.com.tokenpay.model.RefundDestinationType;
import tr.com.tokenpay.request.common.BaseRequest;

import java.math.BigDecimal;

@Data
@SuperBuilder
public class RefundPaymentTransactionRequest extends BaseRequest {

    private Long paymentTransactionId;
    private String conversationId;
    private BigDecimal refundPrice;

    @Builder.Default
    private RefundDestinationType refundDestinationType = RefundDestinationType.CARD;
}
