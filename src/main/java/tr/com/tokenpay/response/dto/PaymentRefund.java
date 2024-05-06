package tr.com.tokenpay.response.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import tr.com.tokenpay.model.PaymentType;
import tr.com.tokenpay.model.RefundDestinationType;
import tr.com.tokenpay.model.RefundStatus;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PaymentRefund {

    private Long id;
    private LocalDateTime createdDate;
    private RefundStatus refundStatus;
    private RefundDestinationType refundDestinationType;
    private BigDecimal price;
    private BigDecimal refundBankPrice;
    private BigDecimal refundWalletPrice;
    private String conversationId;
    private PaymentType paymentType;
    private Error error;
}
