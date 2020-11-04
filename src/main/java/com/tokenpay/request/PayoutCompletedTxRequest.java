package com.tokenpay.request;

import com.tokenpay.model.SettlementType;
import com.tokenpay.net.HttpMethod;
import com.tokenpay.request.common.BaseRequest;
import com.tokenpay.request.common.RequestQueryParamsBuilder;
import lombok.Data;
import lombok.experimental.SuperBuilder;

import java.util.Date;

@Data
@SuperBuilder
public class PayoutCompletedTxRequest extends BaseRequest {

    private Long settlementFileId;

    private SettlementType settlementType;

    private Date startDate;

    private Date endDate;

    @Override
    public String getPath() {
        String query = RequestQueryParamsBuilder.builder()
                .add("settlementFileId", settlementFileId)
                .add("settlementType", settlementType)
                .add("startDate", startDate)
                .add("endDate", endDate)
                .getQuery();

        return "/settlement-reporting/v1/settlement-file/payout-completed-transactions" + query;
    }

    @Override
    public HttpMethod getMethod() {
        return HttpMethod.GET;
    }
}