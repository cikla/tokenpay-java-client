package com.tokenpay.response;

import com.tokenpay.model.CrossBookingTransactionStatus;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class CrossBookingTransactionResponse {

    private Long id;
    private BigDecimal price;
    private Date createdDate;
    private CrossBookingTransactionStatus transactionStatus;
}