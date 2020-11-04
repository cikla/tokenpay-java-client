package com.tokenpay.response;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class PayoutCompletedTxResponse {
    private Long transactionId;
    private String transactionType;
    private BigDecimal payoutAmount;
    private String currency;
    private Long merchantId;
    private String merchantType;
}