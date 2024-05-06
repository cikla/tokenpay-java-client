package tr.com.tokenpay.response;

import com.google.gson.annotations.Expose;
import lombok.Data;
import tr.com.tokenpay.model.*;
import tr.com.tokenpay.response.dto.PaymentTransaction;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Data
public class PaymentResponse {
    @Expose
    private Long id;
    @Expose
    private LocalDateTime createdDate;
    @Expose
    private BigDecimal price;
    @Expose
    private BigDecimal paidPrice;
    @Expose
    private BigDecimal walletPrice;
    @Expose
    private Currency currency;
    @Expose
    private Long buyerId;
    @Expose
    private Integer installment;
    @Expose
    private String conversationId;
    @Expose
    private PaymentType paymentType;
    @Expose
    private PaymentGroup paymentGroup;
    @Expose
    private PaymentStatus paymentStatus;
    @Expose
    private ConnectorType connectorType;
    @Expose
    private PaymentPhase paymentPhase;
    @Expose
    private Boolean isThreeDS;
    @Expose
    private BigDecimal merchantCommissionRate;
    @Expose
    private BigDecimal merchantCommissionRateAmount;
    @Expose
    private BigDecimal pfCommissionRateAmount;
    @Expose
    private String cardUserKey;
    @Expose
    private String cardToken;
    @Expose
    private Boolean paidWithStoredCard;
    @Expose
    private String binNumber;
    @Expose
    private String lastFourDigits;
    @Expose
    private CardType cardType;
    @Expose
    private CardAssociation cardAssociation;
    @Expose
    private String cardBrand;
    @Expose
    private List<PaymentTransaction> paymentTransactions;
}
