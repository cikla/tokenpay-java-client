package com.tokenpay.adapter;

import com.tokenpay.net.HttpClient;
import com.tokenpay.request.BinCheckRequest;
import com.tokenpay.request.SearchInstallmentRequest;
import com.tokenpay.request.common.RequestOptions;
import com.tokenpay.response.BinCheckResponse;
import com.tokenpay.response.InstallmentListResponse;

public class InstallmentAdapter extends BaseAdapter {

    private final RequestOptions requestOptions;

    public InstallmentAdapter(RequestOptions requestOptions) {
        this.requestOptions = requestOptions;
    }

    public BinCheckResponse binCheck(BinCheckRequest binCheckRequest, RequestOptions options) {
        return HttpClient.get(options.getBaseUrl() + binCheckRequest.getPath(), createHeaders(binCheckRequest, options),
                null, BinCheckResponse.class);
    }

    public BinCheckResponse binCheck(BinCheckRequest binCheckRequest) {
        return binCheck(binCheckRequest, requestOptions);
    }

    public InstallmentListResponse retrieveInstallments(SearchInstallmentRequest searchInstallmentRequest, RequestOptions options) {
        return HttpClient.get(options.getBaseUrl() + searchInstallmentRequest.getPath(), createHeaders(searchInstallmentRequest, options),
                null, InstallmentListResponse.class);
    }

    public InstallmentListResponse retrieveInstallments(SearchInstallmentRequest searchInstallmentRequest) {
        return retrieveInstallments(searchInstallmentRequest, requestOptions);
    }

}
