package com.tokenpay.request;

import com.tokenpay.model.CurrencyCode;
import com.tokenpay.request.common.BaseRequest;
import lombok.Data;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;


@Data
@SuperBuilder
public class SearchInstallmentRequest extends BaseRequest {

    private String binNumber;

    private BigDecimal price;

    private CurrencyCode currency;
}