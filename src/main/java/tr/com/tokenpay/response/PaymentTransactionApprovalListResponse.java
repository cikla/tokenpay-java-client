package tr.com.tokenpay.response;

import lombok.Data;

import java.util.List;

@Data
public class PaymentTransactionApprovalListResponse {

    private Long size;
    private List<PaymentTransactionApprovalResponse> items;
}
