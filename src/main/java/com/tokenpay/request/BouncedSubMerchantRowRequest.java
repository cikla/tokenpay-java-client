package com.tokenpay.request;

import com.tokenpay.request.common.BaseRequest;
import lombok.Data;
import lombok.experimental.SuperBuilder;

import java.util.Date;

@Data
@SuperBuilder
public class BouncedSubMerchantRowRequest extends BaseRequest {

    private Date startDate;
    private Date endDate;
}
