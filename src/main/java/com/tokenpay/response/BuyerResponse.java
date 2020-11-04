package com.tokenpay.response;

import com.tokenpay.model.Status;
import lombok.Data;

@Data
public class BuyerResponse {

    private Long id;
    private Status status;
    private String email;
    private String tckn;
    private String name;
    private String surname;
    private String gsmNumber;
    private String buyerExternalId;
}
