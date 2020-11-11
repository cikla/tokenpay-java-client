package com.tokenpay.request;

import com.tokenpay.model.SettlementType;
import com.tokenpay.request.common.BaseRequest;
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
}