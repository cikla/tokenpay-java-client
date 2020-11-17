package tr.com.tokenpay.response;

import lombok.Data;
import tr.com.tokenpay.model.CurrencyCode;
import tr.com.tokenpay.model.PaymentStatus;
import tr.com.tokenpay.model.PaymentType;
import tr.com.tokenpay.response.dto.PaymentCardDto;
import tr.com.tokenpay.response.dto.PaymentRefundDto;
import tr.com.tokenpay.response.dto.PaymentTxDto;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Data
public class PaymentDetailResponse {

    private Long id;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private String orderId;
    private BigDecimal price;
    private BigDecimal paidPrice;
    private BigDecimal walletPrice;
    private PaymentType paymentType;
    private CurrencyCode currency;
    private PaymentStatus paymentStatus;
    private String conversationId;
    private PaymentCardDto paymentCard;
    private List<PaymentRefundDto> paymentRefunds;
    private List<PaymentTxDto> paymentTxs;
}
