package com.tokenpay.adapter;

import com.tokenpay.net.HttpClient;
import com.tokenpay.request.BouncedSubMerchantRowRequest;
import com.tokenpay.request.PayoutCompletedTxRequest;
import com.tokenpay.request.common.RequestOptions;
import com.tokenpay.response.BouncedSubMerchantRowListResponse;
import com.tokenpay.response.PayoutCompletedTxListResponse;

public class SettlementReportingAdapter extends BaseAdapter {

    private final RequestOptions requestOptions;

    public SettlementReportingAdapter(RequestOptions requestOptions) {
        this.requestOptions = requestOptions;
    }

    public BouncedSubMerchantRowListResponse retrieveBouncedSubMerchantRows(BouncedSubMerchantRowRequest bouncedSubMerchantRowRequest, RequestOptions options) {
        return HttpClient.get(options.getBaseUrl() + bouncedSubMerchantRowRequest.getPath(), createHeaders(bouncedSubMerchantRowRequest, options),
                null, BouncedSubMerchantRowListResponse.class);
    }

    public BouncedSubMerchantRowListResponse retrieveBouncedSubMerchantRows(BouncedSubMerchantRowRequest bouncedSubMerchantRowRequest) {
        return retrieveBouncedSubMerchantRows(bouncedSubMerchantRowRequest, requestOptions);
    }

    public PayoutCompletedTxListResponse retrievePayoutCompletedTx(PayoutCompletedTxRequest payoutCompletedTxRequest, RequestOptions options) {
        return HttpClient.get(options.getBaseUrl() + payoutCompletedTxRequest.getPath(), createHeaders(payoutCompletedTxRequest, options),
                null, PayoutCompletedTxListResponse.class);
    }

    public PayoutCompletedTxListResponse retrievePayoutCompletedTx(PayoutCompletedTxRequest payoutCompletedTxRequest) {
        return retrievePayoutCompletedTx(payoutCompletedTxRequest, requestOptions);
    }

}
