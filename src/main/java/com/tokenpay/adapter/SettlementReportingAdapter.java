package com.tokenpay.adapter;

import com.tokenpay.net.HttpClient;
import com.tokenpay.request.BouncedSubMerchantRowRequest;
import com.tokenpay.request.PayoutCompletedTxRequest;
import com.tokenpay.request.common.RequestOptions;
import com.tokenpay.request.common.RequestQueryParamsBuilder;
import com.tokenpay.response.BouncedSubMerchantRowListResponse;
import com.tokenpay.response.PayoutCompletedTxListResponse;

public class SettlementReportingAdapter extends BaseAdapter {

    private final RequestOptions requestOptions;

    public SettlementReportingAdapter(RequestOptions requestOptions) {
        this.requestOptions = requestOptions;
    }

    public BouncedSubMerchantRowListResponse retrieveBouncedSubMerchantRows(BouncedSubMerchantRowRequest bouncedSubMerchantRowRequest) {
        String query = RequestQueryParamsBuilder.buildQueryParam(bouncedSubMerchantRowRequest);
        String path = "/settlement-reporting/v1/settlement-file/bounced-sub-merchant-rows" + query;

        return HttpClient.get(requestOptions.getBaseUrl() + path, createHeaders(path, requestOptions), BouncedSubMerchantRowListResponse.class);
    }

    public PayoutCompletedTxListResponse retrievePayoutCompletedTx(PayoutCompletedTxRequest payoutCompletedTxRequest) {
        String query = RequestQueryParamsBuilder.buildQueryParam(payoutCompletedTxRequest);
        String path = "/settlement-reporting/v1/settlement-file/payout-completed-transactions" + query;

        return HttpClient.get(requestOptions.getBaseUrl() + path, createHeaders(path, requestOptions), PayoutCompletedTxListResponse.class);
    }

}
