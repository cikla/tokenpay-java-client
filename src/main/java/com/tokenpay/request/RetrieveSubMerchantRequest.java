package com.tokenpay.request;

import com.tokenpay.request.common.BaseRequest;
import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class RetrieveSubMerchantRequest extends BaseRequest {

    private Long id;
}
