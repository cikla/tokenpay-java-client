package tr.com.tokenpay.request;

import lombok.Data;
import lombok.experimental.SuperBuilder;
import tr.com.tokenpay.request.common.BaseRequest;

@SuperBuilder
@Data
public class CreateBuyerRequest extends BaseRequest {

    private String email;

    private String name;

    private String surname;

    private String gsmNumber;

    private String identityNumber;

    private String buyerExternalId;
}
