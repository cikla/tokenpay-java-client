package com.tokenpay.request;

import com.tokenpay.net.HttpMethod;
import com.tokenpay.request.common.BaseRequest;
import com.tokenpay.request.common.RequestQueryParamsBuilder;
import lombok.Data;
import lombok.experimental.SuperBuilder;

import java.util.Date;

@Data
@SuperBuilder
public class BouncedSubMerchantRowRequest extends BaseRequest {
    private Date startDate;
    private Date endDate;

    @Override
    public String getPath() {
        String query = RequestQueryParamsBuilder.builder()
                .add("startDate", startDate)
                .add("endDate", endDate)
                .getQuery();

        return "/settlement-reporting/v1/settlement-file/bounced-sub-merchant-rows" + query;
    }

    @Override
    public HttpMethod getMethod() {
        return HttpMethod.GET;
    }
}
