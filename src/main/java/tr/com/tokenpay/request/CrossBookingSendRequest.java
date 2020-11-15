package tr.com.tokenpay.request;

import lombok.Data;
import lombok.experimental.SuperBuilder;
import tr.com.tokenpay.request.common.BaseRequest;

import java.math.BigDecimal;

@Data
@SuperBuilder
public class CrossBookingSendRequest extends BaseRequest {

    private String reason;

    private BigDecimal price;

    private String currency;

    private Long subMerchantId;
}
