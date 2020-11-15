package tr.com.tokenpay.response;

import lombok.Data;

import java.util.List;

@Data
public class CrossBookingTransactionListResponse {

    private Integer page;
    private Integer size;
    private Long totalSize;
    private List<CrossBookingTransactionResponse> items;
}
