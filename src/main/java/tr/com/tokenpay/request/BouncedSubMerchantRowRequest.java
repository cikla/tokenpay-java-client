package tr.com.tokenpay.request;

import lombok.Data;
import lombok.experimental.SuperBuilder;
import tr.com.tokenpay.request.common.BaseRequest;

import java.time.LocalDateTime;

@Data
@SuperBuilder
public class BouncedSubMerchantRowRequest extends BaseRequest {

    private LocalDateTime startDate;
    private LocalDateTime endDate;
}
