package tr.com.tokenpay.response;

import lombok.Data;

import java.util.List;

@Data
public class PayoutCompletedTxListResponse {

    private Long size;
    private List<PayoutCompletedTxResponse> items;
}
