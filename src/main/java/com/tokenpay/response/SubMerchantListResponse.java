package com.tokenpay.response;

import lombok.Data;

import java.util.List;

@Data
public class SubMerchantListResponse {

    private List<SubMerchantResponse> items;
    private Integer page;
    private Integer size;
    private Long totalSize;
}