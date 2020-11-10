package com.tokenpay.request;

import com.tokenpay.model.SubMerchantType;
import com.tokenpay.net.HttpMethod;
import com.tokenpay.request.common.BaseRequest;
import com.tokenpay.request.common.RequestQueryParamsBuilder;
import lombok.Data;
import lombok.experimental.SuperBuilder;

import java.util.List;
import java.util.Set;

@Data
@SuperBuilder
public class SearchSubMerchantRequest extends BaseRequest {

    private String name;
    private Set<Long> subMerchantIds;
    private String subMerchantExternalId;
    private SubMerchantType subMerchantType;
    private Integer page = 0;
    private Integer size = 10;

    @Override
    public String getPath() {
        String query = RequestQueryParamsBuilder.builder()
                .add("name", name)
                .add("subMerchantIds", subMerchantIds)
                .add("subMerchantExternalId", subMerchantExternalId)
                .add("subMerchantType", subMerchantType)
                .add("page", page)
                .add("size", size)
                .getQuery();

        return "/onboarding/v1/sub-merchants" + query;
    }

    @Override
    public HttpMethod getMethod() {
        return HttpMethod.GET;
    }
}
