package com.tokenpay.request;

import com.tokenpay.model.CardAssociation;
import com.tokenpay.model.CardType;
import com.tokenpay.net.HttpMethod;
import com.tokenpay.request.common.BaseRequest;
import com.tokenpay.request.common.RequestQueryParamsBuilder;
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

    @Override
    public String getPath() {
        String query = RequestQueryParamsBuilder.builder()
                .add("cardAlias", cardAlias)
                .add("cardBrand", cardBrand)
                .add("cardType", cardType)
                .add("cardUserKey", cardUserKey)
                .add("cardToken", cardToken)
                .add("cardBankName", cardBankName)
                .add("cardAssociation", cardAssociation)
                .add("page", page)
                .add("size", size)
                .getQuery();

        return "/payment/v1/cards" + query;
    }

    @Override
    public HttpMethod getMethod() {
        return HttpMethod.GET;
    }
}