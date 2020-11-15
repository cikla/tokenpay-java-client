package tr.com.tokenpay.request;

import lombok.Data;
import lombok.experimental.SuperBuilder;
import tr.com.tokenpay.request.common.BaseRequest;

import java.util.Date;

@Data
@SuperBuilder
public class BouncedSubMerchantRowRequest extends BaseRequest {

    private Date startDate;
    private Date endDate;
}
