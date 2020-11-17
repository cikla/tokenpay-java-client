package tr.com.tokenpay.response;

import lombok.Data;
import tr.com.tokenpay.model.RefundDestinationType;
import tr.com.tokenpay.model.RefundStatus;
import tr.com.tokenpay.model.RefundType;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Data
public class RefundResponse {

    private Long id;
    private String conversationId;
    private LocalDateTime createdDate;
    private RefundStatus status;
    private BigDecimal refundPrice;
    private BigDecimal refundBankPrice;
    private BigDecimal refundWalletPrice;
    private RefundType refundType;
    private RefundDestinationType refundDestinationType;
    private String currency;
    private Long paymentId;
    private List<RefundTxResponse> paymentTxRefunds;
}
