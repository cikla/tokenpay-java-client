package com.tokenpay.response;

import com.tokenpay.model.CardAssociation;
import com.tokenpay.model.CardType;
import com.tokenpay.response.dto.InstallmentPriceDto;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;
@Data
public class InstallmentResponse {

    private String binNumber;
    private BigDecimal price;
    private CardType cardType;
    private CardAssociation cardAssociation;
    private String cardBrand;
    private String bankName;
    private Long bankCode;
    private Boolean force3ds;
    private Boolean commercial;
    private List<InstallmentPriceDto> installmentPrices;
}
