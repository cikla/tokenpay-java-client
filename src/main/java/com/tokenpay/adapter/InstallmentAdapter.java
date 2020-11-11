package com.tokenpay.adapter;

import com.tokenpay.net.HttpClient;
import com.tokenpay.request.BinCheckRequest;
import com.tokenpay.request.SearchInstallmentRequest;
import com.tokenpay.request.common.RequestOptions;
import com.tokenpay.request.common.RequestQueryParamsBuilder;
import com.tokenpay.response.BinCheckResponse;
import com.tokenpay.response.InstallmentListResponse;

public class InstallmentAdapter extends BaseAdapter {

    private final RequestOptions requestOptions;

    public InstallmentAdapter(RequestOptions requestOptions) {
        this.requestOptions = requestOptions;
    }

    public BinCheckResponse binCheck(BinCheckRequest binCheckRequest) {
        String path = "/installment/v1/bins/" + binCheckRequest.getBinNumber();
        return HttpClient.get(requestOptions.getBaseUrl() + path, createHeaders(path, requestOptions), BinCheckResponse.class);
    }

    public InstallmentListResponse retrieveInstallments(SearchInstallmentRequest searchInstallmentRequest) {
        String query = RequestQueryParamsBuilder.buildQueryParam(searchInstallmentRequest);
        String path = "/installment/v1/installments" + query;

        return HttpClient.get(requestOptions.getBaseUrl() + path, createHeaders(path, requestOptions), InstallmentListResponse.class);
    }
}
