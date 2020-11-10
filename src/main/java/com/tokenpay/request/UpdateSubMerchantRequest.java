package com.tokenpay.request;

import com.tokenpay.net.HttpMethod;
import com.tokenpay.request.common.BaseRequest;
import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class UpdateSubMerchantRequest extends BaseRequest {

    private Long id;

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

    @Override
    public String getPath() {
        return "/onboarding/v1/sub-merchants";
    }

    @Override
    public HttpMethod getMethod() {
        return HttpMethod.PUT;
    }
}
