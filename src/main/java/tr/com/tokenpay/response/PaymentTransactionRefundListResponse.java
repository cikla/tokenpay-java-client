package tr.com.tokenpay.response;

import lombok.Data;

import java.util.List;

@Data
public class PaymentTransactionRefundListResponse {

    private Long size;
    private List<PaymentTransactionRefundResponse> items;
}
