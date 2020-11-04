package com.tokenpay.request;

import com.tokenpay.net.HttpMethod;
import com.tokenpay.request.common.BaseRequest;
import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
public class CreateCardRequest extends BaseRequest {

    private String cardHolderName;

    private String cardNumber;

    private String expireYear;

    private String expireMonth;

    private String cardAlias;

    private String cardUserKey;

    @Override
    public String getPath() {
        return "/payment/v1/cards";
    }

    @Override
    public HttpMethod getMethod() {
        return HttpMethod.POST;
    }
}
