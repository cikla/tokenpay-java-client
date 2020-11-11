package com.tokenpay.request;

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

}