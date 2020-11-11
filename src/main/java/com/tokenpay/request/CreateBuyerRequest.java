package com.tokenpay.request;

import com.tokenpay.request.common.BaseRequest;
import lombok.Data;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Data
public class CreateBuyerRequest extends BaseRequest {

    private String email;

    private String name;

    private String surname;

    private String gsmNumber;

    private String tckn;

    private String buyerExternalId;
}