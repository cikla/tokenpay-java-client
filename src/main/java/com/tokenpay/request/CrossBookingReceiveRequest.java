package com.tokenpay.request;

import com.tokenpay.net.HttpMethod;
import com.tokenpay.request.common.BaseRequest;
import lombok.Data;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;

@Data
@SuperBuilder
public class CrossBookingReceiveRequest extends BaseRequest {

    private String reason;

    private BigDecimal price;

    private String currency;

    private Long subMerchantId;

    @Override
    public String getPath() {
        return "/payment/v1/cross-bookings/receive";
    }

    @Override
    public HttpMethod getMethod() {
        return HttpMethod.POST;
    }
}