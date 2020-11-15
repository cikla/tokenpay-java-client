package tr.com.tokenpay.request;

import lombok.Data;
import lombok.experimental.SuperBuilder;
import tr.com.tokenpay.model.SettlementType;
import tr.com.tokenpay.request.common.BaseRequest;

import java.util.Date;

@Data
@SuperBuilder
public class PayoutCompletedTxRequest extends BaseRequest {

    private Long settlementFileId;

    private SettlementType settlementType;

    private Date startDate;

    private Date endDate;
}
