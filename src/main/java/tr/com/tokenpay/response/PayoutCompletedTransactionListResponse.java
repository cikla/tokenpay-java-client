package tr.com.tokenpay.response;

import lombok.Data;

import java.util.List;

@Data
public class PayoutCompletedTransactionListResponse {

    private Long size;
    private List<PayoutCompletedTransactionResponse> items;
}
