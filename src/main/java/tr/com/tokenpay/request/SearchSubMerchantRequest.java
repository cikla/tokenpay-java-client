package tr.com.tokenpay.request;

import lombok.Data;
import lombok.experimental.SuperBuilder;
import tr.com.tokenpay.model.SubMerchantType;
import tr.com.tokenpay.request.common.BaseRequest;

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
