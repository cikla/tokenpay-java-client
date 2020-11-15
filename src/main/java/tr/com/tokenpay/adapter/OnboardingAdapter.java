package tr.com.tokenpay.adapter;

import tr.com.tokenpay.net.HttpClient;
import tr.com.tokenpay.request.*;
import tr.com.tokenpay.request.common.RequestOptions;
import tr.com.tokenpay.request.common.RequestQueryParamsBuilder;
import tr.com.tokenpay.response.BuyerResponse;
import tr.com.tokenpay.response.SubMerchantListResponse;
import tr.com.tokenpay.response.SubMerchantResponse;

public class OnboardingAdapter extends BaseAdapter {

    private final RequestOptions requestOptions;

    public OnboardingAdapter(RequestOptions requestOptions) {
        this.requestOptions = requestOptions;
    }

    public SubMerchantResponse createSubMerchant(CreateSubMerchantRequest createSubMerchantRequest) {
        String path = "/onboarding/v1/sub-merchants";
        return HttpClient.post(requestOptions.getBaseUrl() + path, createHeaders(createSubMerchantRequest, path, requestOptions),
                createSubMerchantRequest, SubMerchantResponse.class);
    }

    public SubMerchantResponse updateSubMerchant(UpdateSubMerchantRequest updateSubMerchantRequest) {
        String path = "/onboarding/v1/sub-merchants";
        return HttpClient.put(requestOptions.getBaseUrl() + path, createHeaders(updateSubMerchantRequest, path, requestOptions),
                updateSubMerchantRequest, SubMerchantResponse.class);
    }

    public SubMerchantListResponse searchSubMerchant(SearchSubMerchantRequest searchSubMerchantRequest) {
        String query = RequestQueryParamsBuilder.buildQueryParam(searchSubMerchantRequest);
        String path = "/onboarding/v1/sub-merchants" + query;

        return HttpClient.get(requestOptions.getBaseUrl() + path, createHeaders(path, requestOptions), SubMerchantListResponse.class);
    }

    public SubMerchantResponse retrieveSubMerchant(RetrieveSubMerchantRequest retrieveSubMerchantRequest) {
        String path = "/onboarding/v1/sub-merchants/" + retrieveSubMerchantRequest.getId();
        return HttpClient.get(requestOptions.getBaseUrl() + path, createHeaders(path, requestOptions), SubMerchantResponse.class);
    }

    public BuyerResponse createBuyer(CreateBuyerRequest createBuyerRequest) {
        String path = "/onboarding/v1/buyers";
        return HttpClient.post(requestOptions.getBaseUrl() + path, createHeaders(createBuyerRequest, path, requestOptions),
                createBuyerRequest, BuyerResponse.class);
    }

    public BuyerResponse updateBuyer(UpdateBuyerRequest updateBuyerRequest) {
        String path = "/onboarding/v1/buyers/" + updateBuyerRequest.getId();
        return HttpClient.put(requestOptions.getBaseUrl() + path, createHeaders(updateBuyerRequest, path, requestOptions),
                updateBuyerRequest, BuyerResponse.class);
    }

    public BuyerResponse retrieveBuyer(RetrieveBuyerRequest retrieveBuyerRequest) {
        String path = "/onboarding/v1/buyers/" + retrieveBuyerRequest.getId();
        return HttpClient.get(requestOptions.getBaseUrl() + path, createHeaders(path, requestOptions), BuyerResponse.class);
    }
}
