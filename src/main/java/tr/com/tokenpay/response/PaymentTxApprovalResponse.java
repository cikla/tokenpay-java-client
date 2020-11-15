package tr.com.tokenpay.response;

import lombok.Data;
import tr.com.tokenpay.model.ApprovalStatus;

@Data
public class PaymentTxApprovalResponse {

    private Long paymentTransactionId;
    private ApprovalStatus approvalStatus;
    private String failedReason;
}
