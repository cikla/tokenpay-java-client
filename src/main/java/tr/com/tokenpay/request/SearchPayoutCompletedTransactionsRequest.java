package tr.com.tokenpay.request;

import lombok.Builder;
import lombok.Data;
import tr.com.tokenpay.model.SettlementType;
import tr.com.tokenpay.request.common.Request;

import java.time.LocalDateTime;

@Data
@Builder
public class SearchPayoutCompletedTransactionsRequest implements Request {

    private Long settlementFileId;
    private SettlementType settlementType;
    private LocalDateTime endDate;
    private LocalDateTime startDate;
}