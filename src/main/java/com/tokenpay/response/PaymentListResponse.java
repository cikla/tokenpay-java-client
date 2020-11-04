package com.tokenpay.response;

import lombok.Data;

import java.util.List;

@Data
public class PaymentListResponse {

    private Long size;
    private List<PaymentResponse> items;
}
