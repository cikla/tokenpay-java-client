package tr.com.tokenpay.response;

import lombok.Data;
import tr.com.tokenpay.model.CrossBookingTransactionStatus;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class CrossBookingTransactionResponse {

    private Long id;
    private BigDecimal price;
    private Date createdDate;
    private CrossBookingTransactionStatus transactionStatus;
}
