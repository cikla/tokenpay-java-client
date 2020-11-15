package tr.com.tokenpay.adapter;

import tr.com.tokenpay.net.HttpClient;
import tr.com.tokenpay.request.BouncedSubMerchantRowRequest;
import tr.com.tokenpay.request.PayoutCompletedTxRequest;
import tr.com.tokenpay.request.common.RequestOptions;
import tr.com.tokenpay.request.common.RequestQueryParamsBuilder;
import tr.com.tokenpay.response.BouncedSubMerchantRowListResponse;
import tr.com.tokenpay.response.PayoutCompletedTxListResponse;

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
