package com.tokenpay.request;

import com.tokenpay.request.common.BaseRequest;
import lombok.Data;
import lombok.experimental.SuperBuilder;


@Data
@SuperBuilder
public class SearchRefundTxRequest extends BaseRequest {

    private Long paymentId;
    private String conversationId;
    private Long paymentTransactionId;
}