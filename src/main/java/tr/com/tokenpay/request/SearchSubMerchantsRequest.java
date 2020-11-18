package tr.com.tokenpay.request;

import lombok.Builder;
import lombok.Data;
import lombok.experimental.SuperBuilder;
import tr.com.tokenpay.model.SubMerchantType;
import tr.com.tokenpay.request.common.BaseRequest;

import java.util.Set;

@Data
@SuperBuilder
public class SearchSubMerchantsRequest extends BaseRequest {

    private String name;
    private Set<Long> subMerchantIds;
    private String subMerchantExternalId;
    private SubMerchantType subMerchantType;

    @Builder.Default
    private Integer page = 0;

    @Builder.Default
    private Integer size = 10;
}
