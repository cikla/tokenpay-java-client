package com.tokenpay.request;

import com.tokenpay.net.HttpMethod;
import com.tokenpay.request.common.BaseRequest;
import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class BinCheckRequest extends BaseRequest {
    private String binNumber;

    @Override
    public String getPath() {
        return "/installment/v1/bins/" + binNumber;
    }

    @Override
    public HttpMethod getMethod() {
        return HttpMethod.GET;
    }
}
