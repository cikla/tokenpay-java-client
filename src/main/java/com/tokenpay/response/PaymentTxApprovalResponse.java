package com.tokenpay.response;

import com.tokenpay.model.ApprovalStatus;
import lombok.Data;

@Data
public class PaymentTxApprovalResponse {

    private Long paymentTransactionId;
    private ApprovalStatus approvalStatus;
    private String failedReason;
}
