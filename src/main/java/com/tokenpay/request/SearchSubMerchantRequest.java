package com.tokenpay.request;

import com.tokenpay.model.SubMerchantType;
import com.tokenpay.request.common.BaseRequest;
import lombok.Data;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Data
@SuperBuilder
public class SearchSubMerchantRequest extends BaseRequest {

    private String name;
    private List<Long> subMerchantIds;
    private String subMerchantExternalId;
    private SubMerchantType subMerchantType;
    private Integer page = 0;
    private Integer size = 10;
}
