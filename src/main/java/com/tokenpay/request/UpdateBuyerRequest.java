package com.tokenpay.request;

import com.tokenpay.net.HttpMethod;
import com.tokenpay.request.common.BaseRequest;
import lombok.Data;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Data
public class UpdateBuyerRequest extends BaseRequest {
    private transient Long id;

    private String email;

    private String name;

    private String surname;

    private String tckn;

    private String gsmNumber;

    @Override
    public String getPath() {
        return "/onboarding/v1/buyers/" + id;
    }

    @Override
    public HttpMethod getMethod() {
        return HttpMethod.PUT;
    }
}