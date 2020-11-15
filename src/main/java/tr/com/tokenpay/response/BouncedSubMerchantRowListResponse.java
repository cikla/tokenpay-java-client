package tr.com.tokenpay.response;

import lombok.Data;

import java.util.List;

@Data
public class BouncedSubMerchantRowListResponse {

    private Long size;
    private List<BouncedSubMerchantRowResponse> items;
}
