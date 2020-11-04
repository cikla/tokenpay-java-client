package com.tokenpay.request;

import com.tokenpay.net.HttpMethod;
import com.tokenpay.request.common.BaseRequest;
import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class RetrieveSubMerchantRequest extends BaseRequest {

    private Long id;

    @Override
    public String getPath() {
        return "/onboarding/v1/sub-merchants/" + id;
    }

    @Override
    public HttpMethod getMethod() {
        return HttpMethod.GET;
    }
}
