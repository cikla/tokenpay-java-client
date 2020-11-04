package com.tokenpay.response;

import com.tokenpay.model.CardAssociation;
import com.tokenpay.model.CardType;
import lombok.Data;

@Data
public class CardResponse {

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