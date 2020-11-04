package com.tokenpay.request;

import com.tokenpay.net.HttpMethod;
import com.tokenpay.request.common.BaseRequest;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.SuperBuilder;

import java.util.Set;

@Data
@SuperBuilder
public class PaymentTxApprovalRequest extends BaseRequest {

    private Set<Long> paymentTransactionIds;

    @Builder.Default
    private Boolean isTransactional = false;

    @Override
    public String getPath() {
        return "/payment/v1/payment-transactions/approve";
    }

    @Override
    public HttpMethod getMethod() {
        return HttpMethod.POST;
    }
}