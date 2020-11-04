package com.tokenpay.response;

import com.tokenpay.model.RefundDestinationType;
import com.tokenpay.model.RefundStatus;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class RefundTxResponse {

    private Long id;
    private String conversationId;
    private Date createdDate;
    private RefundStatus status;
    private Boolean isAfterSettlement;
    private BigDecimal refundPrice;
    private BigDecimal refundBankPrice;
    private BigDecimal refundWalletPrice;
    private String currency;
    private Long paymentTransactionId;
    private Long paymentId;
    private RefundDestinationType refundDestinationType;
}