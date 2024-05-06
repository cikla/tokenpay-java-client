package tr.com.tokenpay.response;

import lombok.Data;
import tr.com.tokenpay.response.dto.BouncedSubMerchantRow;

import java.util.List;

@Data
public class BouncedSubMerchantRowListResponse {

    private Long size;
    private List<BouncedSubMerchantRow> items;
}
