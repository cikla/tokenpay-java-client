package tr.com.tokenpay.request;

import lombok.Data;
import lombok.experimental.SuperBuilder;
import tr.com.tokenpay.request.common.BaseRequest;

@Data
@SuperBuilder
public class CrossBookingCancelRequest extends BaseRequest {

    private Long crossBookingId;
}
