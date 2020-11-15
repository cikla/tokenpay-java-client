package tr.com.tokenpay.response;

import lombok.Data;
import tr.com.tokenpay.model.*;
import tr.com.tokenpay.response.dto.CardPaymentTxDto;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
public class PaymentResponse {

    private Long id;
    private Date createdDate;
    private BigDecimal price;
    private BigDecimal paidPrice;
    private BigDecimal walletPrice;
    private String currency;
    private Long buyerId;
    private Integer installment;
    private String conversationId;
    private PaymentType paymentType;
    private PaymentGroup paymentGroup;
    private PaymentStatus paymentStatus;
    private PaymentPhase paymentPhase;
    private Boolean isThreeDS;
    private BigDecimal merchantCommissionRate;
    private BigDecimal merchantCommissionRateAmount;
    private BigDecimal pfCommissionRateAmount;
    private String cardUserKey;
    private String cardToken;
    private Boolean paidWithStoredCard;
    private String binNumber;
    private String lastFourDigits;
    private CardType cardType;
    private CardAssociation cardAssociation;
    private String cardBrand;
    private List<CardPaymentTxDto> paymentTransactions;
}
