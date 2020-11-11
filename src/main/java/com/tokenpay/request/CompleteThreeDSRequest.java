package com.tokenpay.request;

import com.tokenpay.request.common.BaseRequest;
import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class CompleteThreeDSRequest extends BaseRequest {

    private Long paymentId;

    private String conversationData;
}