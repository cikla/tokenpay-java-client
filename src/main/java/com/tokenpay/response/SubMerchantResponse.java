package com.tokenpay.response;

import com.tokenpay.model.Status;
import com.tokenpay.model.SubMerchantType;
import lombok.Data;

@Data
public class SubMerchantResponse {

    private Long id;
    private Status status;
    private String name;
    private String email;
    private String iban;
    private String address;
    private String gsmNumber;
    private String taxOffice;
    private String taxNumber;
    private String contactName;
    private String contactSurname;
    private String identityNumber;
    private String legalCompanyTitle;
    private String subMerchantExternalId;
    private SubMerchantType subMerchantType;
}