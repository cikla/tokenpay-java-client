package tr.com.tokenpay.response;

import lombok.Data;

import java.util.List;

@Data
public class PaymentTxApprovalListResponse {

    private Long size;
    private List<PaymentTxApprovalResponse> items;
}
