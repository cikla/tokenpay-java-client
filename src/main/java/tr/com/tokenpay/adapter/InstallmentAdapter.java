package tr.com.tokenpay.adapter;

import tr.com.tokenpay.net.HttpClient;
import tr.com.tokenpay.request.SearchInstallmentRequest;
import tr.com.tokenpay.request.common.RequestOptions;
import tr.com.tokenpay.request.common.RequestQueryParamsBuilder;
import tr.com.tokenpay.response.BinNumberResponse;
import tr.com.tokenpay.response.InstallmentListResponse;

public class InstallmentAdapter extends BaseAdapter {

    public InstallmentAdapter(RequestOptions requestOptions) {
        super(requestOptions);
    }

    public InstallmentListResponse searchInstallments(SearchInstallmentRequest searchInstallmentRequest) {
        String query = RequestQueryParamsBuilder.buildQueryParam(searchInstallmentRequest);
        String path = "/installment/v1/installments" + query;

        return HttpClient.get(requestOptions.getBaseUrl() + path, createHeaders(path, requestOptions), InstallmentListResponse.class);
    }

    public BinNumberResponse retrieveBinNumber(String binNumber) {
        String path = "/installment/v1/bins/" + binNumber;
        return HttpClient.get(requestOptions.getBaseUrl() + path, createHeaders(path, requestOptions), BinNumberResponse.class);
    }
}