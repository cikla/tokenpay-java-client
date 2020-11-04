package com.tokenpay.adapter;

import com.tokenpay.net.HttpClient;
import com.tokenpay.request.*;
import com.tokenpay.request.common.RequestOptions;
import com.tokenpay.response.BuyerResponse;
import com.tokenpay.response.SubMerchantListResponse;
import com.tokenpay.response.SubMerchantResponse;

public class OnboardingAdapter extends BaseAdapter {

    private final RequestOptions requestOptions;

    public OnboardingAdapter(RequestOptions requestOptions) {
        this.requestOptions = requestOptions;
    }

    public SubMerchantResponse createSubMerchant(CreateSubMerchantRequest createSubMerchantRequest, RequestOptions options) {
        return HttpClient.post(options.getBaseUrl() + createSubMerchantRequest.getPath(), createHeaders(createSubMerchantRequest, options),
                createSubMerchantRequest, SubMerchantResponse.class);
    }

    public SubMerchantResponse createSubMerchant(CreateSubMerchantRequest createSubMerchantRequest) {
        return createSubMerchant(createSubMerchantRequest, requestOptions);
    }

    public SubMerchantResponse updateSubMerchant(UpdateSubMerchantRequest updateSubMerchantRequest, RequestOptions options) {
        return HttpClient.put(options.getBaseUrl() + updateSubMerchantRequest.getPath(), createHeaders(updateSubMerchantRequest, options),
                updateSubMerchantRequest, SubMerchantResponse.class);
    }

    public SubMerchantResponse updateSubMerchant(UpdateSubMerchantRequest updateSubMerchantRequest) {
        return updateSubMerchant(updateSubMerchantRequest, requestOptions);
    }

    public SubMerchantListResponse searchSubMerchant(SearchSubMerchantRequest searchSubMerchantRequest, RequestOptions options) {
        return HttpClient.get(options.getBaseUrl() + searchSubMerchantRequest.getPath(), createHeaders(searchSubMerchantRequest, options),
                null, SubMerchantListResponse.class);
    }

    public SubMerchantListResponse searchSubMerchant(SearchSubMerchantRequest searchSubMerchantRequest) {
        return searchSubMerchant(searchSubMerchantRequest, requestOptions);
    }

    public SubMerchantResponse retrieveSubMerchant(RetrieveSubMerchantRequest retrieveSubMerchantRequest, RequestOptions options) {
        return HttpClient.get(options.getBaseUrl() + retrieveSubMerchantRequest.getPath(), createHeaders(retrieveSubMerchantRequest, options),
                null, SubMerchantResponse.class);
    }

    public SubMerchantResponse retrieveSubMerchant(RetrieveSubMerchantRequest retrieveSubMerchantRequest) {
        return retrieveSubMerchant(retrieveSubMerchantRequest, requestOptions);
    }

    public BuyerResponse createBuyer(CreateBuyerRequest createBuyerRequest, RequestOptions options) {
        return HttpClient.post(options.getBaseUrl() + createBuyerRequest.getPath(), createHeaders(createBuyerRequest, options),
                createBuyerRequest, BuyerResponse.class);
    }

    public BuyerResponse createBuyer(CreateBuyerRequest createBuyerRequest) {
        return createBuyer(createBuyerRequest, requestOptions);
    }

    public BuyerResponse updateBuyer(UpdateBuyerRequest updateBuyerRequest, RequestOptions options) {
        return HttpClient.put(options.getBaseUrl() + updateBuyerRequest.getPath(), createHeaders(updateBuyerRequest, options),
                updateBuyerRequest, BuyerResponse.class);
    }

    public BuyerResponse updateBuyer(UpdateBuyerRequest updateBuyerRequest) {
        return updateBuyer(updateBuyerRequest, requestOptions);
    }

    public BuyerResponse retrieveBuyer(RetrieveBuyerRequest retrieveBuyerRequest, RequestOptions options) {
        return HttpClient.get(options.getBaseUrl() + retrieveBuyerRequest.getPath(), createHeaders(retrieveBuyerRequest, options),
                null, BuyerResponse.class);
    }

    public BuyerResponse retrieveBuyer(RetrieveBuyerRequest retrieveBuyerRequest) {
        return retrieveBuyer(retrieveBuyerRequest, requestOptions);
    }
}
