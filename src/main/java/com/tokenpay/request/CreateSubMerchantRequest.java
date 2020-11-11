package com.tokenpay.request;

import com.tokenpay.model.SubMerchantType;
import com.tokenpay.request.common.BaseRequest;
import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class CreateSubMerchantRequest extends BaseRequest {

    private SubMerchantType subMerchantType;

    private String subMerchantExternalId;

    private String name;

    private String address;

    private String email;

    private String iban;

    private String gsmNumber;
    private String taxOffice;
    private String taxNumber;
    private String contactName;
    private String contactSurname;
    private String identityNumber;
    private String legalCompanyTitle;
}