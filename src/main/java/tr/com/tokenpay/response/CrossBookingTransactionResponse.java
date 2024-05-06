package tr.com.tokenpay.response;

import lombok.Data;
import tr.com.tokenpay.model.CrossBookingTransactionStatus;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class CrossBookingTransactionResponse {

    private Long id;
    private BigDecimal price;
    private LocalDateTime createdDate;
    private CrossBookingTransactionStatus transactionStatus;
}
