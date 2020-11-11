package com.tokenpay.request;

import com.tokenpay.model.CardAssociation;
import com.tokenpay.model.CardType;
import com.tokenpay.request.common.BaseRequest;
import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class SearchCardRequest extends BaseRequest {

    private String cardAlias;
    private String cardBrand;
    private CardType cardType;
    private String cardUserKey;
    private String cardToken;
    private String cardBankName;
    private CardAssociation cardAssociation;
    private Integer page = 0;
    private Integer size = 10;
}