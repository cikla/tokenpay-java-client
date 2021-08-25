package tr.com.tokenpay.request;

import lombok.Builder;
import lombok.Data;
import tr.com.tokenpay.request.common.Request;

import java.math.BigDecimal;

@Data
@Builder
public class PostAuthPaymentRequest implements Request {

    private BigDecimal paidPrice;
}
