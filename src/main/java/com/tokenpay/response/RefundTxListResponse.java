package com.tokenpay.response;

import lombok.Data;

import java.util.List;

@Data
public class RefundTxListResponse {

    private Long size;
    private List<RefundTxResponse> items;
}
