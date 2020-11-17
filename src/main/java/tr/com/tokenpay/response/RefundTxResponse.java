package tr.com.tokenpay.response;

import lombok.Data;
import tr.com.tokenpay.model.RefundDestinationType;
import tr.com.tokenpay.model.RefundStatus;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class RefundTxResponse {

    private Long id;
    private String conversationId;
    private LocalDateTime createdDate;
    private RefundStatus status;
    private Boolean isAfterSettlement;
    private BigDecimal refundPrice;
    private BigDecimal refundBankPrice;
    private BigDecimal refundWalletPrice;
    private String currency;
    private Long paymentTransactionId;
    private Long paymentId;
    private RefundDestinationType refundDestinationType;
}
