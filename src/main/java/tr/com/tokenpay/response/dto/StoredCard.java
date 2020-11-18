package tr.com.tokenpay.response.dto;

import lombok.Data;
import tr.com.tokenpay.model.CardAssociation;
import tr.com.tokenpay.model.CardType;

@Data
public class StoredCard {

    private String binNumber;
    private String lastFourDigits;
    private String expireYear;
    private String expireMonth;
    private String cardHolderName;
    private String cardUserKey;
    private String cardToken;
    private String cardAlias;
    private CardType cardType;
    private CardAssociation cardAssociation;
    private String cardBrand;
    private String cardBankName;
    private Long cardBankId;
}
