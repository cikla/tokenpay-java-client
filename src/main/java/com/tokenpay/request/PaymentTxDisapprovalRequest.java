package com.tokenpay.request;

import com.tokenpay.request.common.BaseRequest;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.SuperBuilder;

import java.util.Set;

@Data
@SuperBuilder
public class PaymentTxDisapprovalRequest extends BaseRequest {

    private Set<Long> paymentTransactionIds;

    @Builder.Default
    private Boolean isTransactional = false;
}