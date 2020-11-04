package com.tokenpay.request;

import com.tokenpay.net.HttpMethod;
import com.tokenpay.request.common.BaseRequest;
import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class CrossBookingCancelRequest extends BaseRequest {

    private Long crossBookingId;

    @Override
    public String getPath() {
        return "/payment/v1/cross-bookings/cancel";
    }

    @Override
    public HttpMethod getMethod() {
        return HttpMethod.POST;
    }
}