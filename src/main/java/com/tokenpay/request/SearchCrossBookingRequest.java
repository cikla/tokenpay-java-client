package com.tokenpay.request;

import com.tokenpay.model.CrossBookingTransactionStatus;
import com.tokenpay.model.MerchantType;
import com.tokenpay.request.common.BaseRequest;
import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class SearchCrossBookingRequest extends BaseRequest {

    private CrossBookingTransactionStatus transactionStatus;
    private Long sourceMerchantId;
    private Long destinationMerchantId;
    private MerchantType sourceMerchantType;
    private MerchantType destinationMerchantType;

    private Integer page = 0;
    private Integer size = 10;
}