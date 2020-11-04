package com.tokenpay.response;

import lombok.Data;

@Data
public class BouncedSubMerchantRowResponse {

    private Long id;
    private String iban;
    private String contactName;
    private String contactSurname;
    private String legalCompanyTitle;
}