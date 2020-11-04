package com.tokenpay.request;

import com.tokenpay.net.HttpMethod;
import com.tokenpay.request.common.BaseRequest;
import com.tokenpay.request.common.RequestQueryParamsBuilder;
import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class DeleteCardRequest extends BaseRequest {

    private String cardUserKey;

    private String cardToken;

    @Override
    public String getPath() {
        String query = RequestQueryParamsBuilder.builder()
                .add("cardUserKey", cardUserKey)
                .add("cardToken", cardToken)
                .getQuery();

        return "/payment/v1/cards" + query;
    }

    @Override
    public HttpMethod getMethod() {
        return HttpMethod.DELETE;
    }
}
