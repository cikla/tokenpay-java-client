package com.tokenpay.request;

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
}