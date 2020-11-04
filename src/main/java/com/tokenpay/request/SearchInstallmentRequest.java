package com.tokenpay.request;

import com.tokenpay.model.CurrencyCode;
import com.tokenpay.net.HttpMethod;
import com.tokenpay.request.common.BaseRequest;
import com.tokenpay.request.common.RequestQueryParamsBuilder;
import lombok.Data;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;
import java.util.Currency;


@Data
@SuperBuilder
public class SearchInstallmentRequest extends BaseRequest {

    private String binNumber;

    private BigDecimal price;

    private CurrencyCode currency;

    @Override
    public String getPath() {
        String query = RequestQueryParamsBuilder.builder()
                .add("binNumber", binNumber)
                .add("price", price)
                .add("currency", currency)
                .getQuery();

        return "/installment/v1/installments" + query;
    }

    @Override
    public HttpMethod getMethod() {
        return HttpMethod.GET;
    }
}