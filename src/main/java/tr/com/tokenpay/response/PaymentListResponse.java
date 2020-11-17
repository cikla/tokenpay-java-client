package tr.com.tokenpay.response;

import lombok.Data;

import java.util.List;

@Data
public class PaymentListResponse {

    private Integer page;
    private Integer size;
    private Long totalSize;
    private List<PaymentDetailResponse> items;
}
