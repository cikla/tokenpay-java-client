package com.tokenpay.response;

import com.tokenpay.model.CardAssociation;
import com.tokenpay.model.CardType;
import lombok.Data;

@Data
public class BinCheckResponse {
    private String binNumber;
    private CardType cardType;
    private CardAssociation cardAssociation;
    private String cardBrand;
    private String bankName;
    private Long bankCode;
    private Boolean commercial;
}