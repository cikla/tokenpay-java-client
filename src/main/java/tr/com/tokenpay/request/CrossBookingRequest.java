package tr.com.tokenpay.request;

import lombok.Data;
import lombok.experimental.SuperBuilder;
import tr.com.tokenpay.model.Currency;
import tr.com.tokenpay.request.common.BaseRequest;

import java.math.BigDecimal;

@Data
@SuperBuilder
public class CrossBookingRequest extends BaseRequest {

    private String reason;
    private BigDecimal price;
    private Currency currency;
    private Long subMerchantId;
}
