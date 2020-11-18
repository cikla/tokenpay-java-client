package tr.com.tokenpay.request;

import lombok.Data;
import lombok.experimental.SuperBuilder;
import tr.com.tokenpay.request.common.BaseRequest;

@Data
@SuperBuilder
public class UpdateBuyerRequest extends BaseRequest {

    private String email;
    private String name;
    private String surname;
    private String identityNumber;
    private String gsmNumber;
}