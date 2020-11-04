package com.tokenpay.request;

import com.tokenpay.model.CrossBookingTransactionStatus;
import com.tokenpay.model.MerchantType;
import com.tokenpay.net.HttpMethod;
import com.tokenpay.request.common.BaseRequest;
import com.tokenpay.request.common.RequestQueryParamsBuilder;
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

    @Override
    public String getPath() {
        String query = RequestQueryParamsBuilder.builder()
                .add("transactionStatus", transactionStatus)
                .add("sourceMerchantId", sourceMerchantId)
                .add("destinationMerchantId", destinationMerchantId)
                .add("sourceMerchantType", sourceMerchantType)
                .add("destinationMerchantType", destinationMerchantType)
                .add("page", page)
                .add("size", size)
                .getQuery();

        return "/payment/v1/cross-bookings" + query;
    }

    @Override
    public HttpMethod getMethod() {
        return HttpMethod.GET;
    }
}