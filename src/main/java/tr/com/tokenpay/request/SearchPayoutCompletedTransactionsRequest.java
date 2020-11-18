package tr.com.tokenpay.request;

import lombok.Data;
import lombok.experimental.SuperBuilder;
import tr.com.tokenpay.model.SettlementType;
import tr.com.tokenpay.request.common.BaseRequest;

import java.time.LocalDateTime;

@Data
@SuperBuilder
public class SearchPayoutCompletedTransactionsRequest extends BaseRequest {

    private Long settlementFileId;
    private SettlementType settlementType;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
}