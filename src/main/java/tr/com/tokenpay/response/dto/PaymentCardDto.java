package tr.com.tokenpay.response.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import tr.com.tokenpay.model.CardAssociation;
import tr.com.tokenpay.model.CardType;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PaymentCardDto {

    private CardType cardType;
    private CardAssociation cardAssociation;
    private String cardBrand;
    private String cardHolderName;
    private String binNumber;
    private String lastFourDigits;
    private Integer installment;
    private Boolean isThreeDS;
    private Integer mdStatus;
    private BigDecimal pfCommissionRateAmount;
    private BigDecimal merchantCommissionRate;
    private BigDecimal merchantCommissionRateAmount;
    private ErrorDto error;
}
