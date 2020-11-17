package tr.com.tokenpay.request;

import lombok.Data;
import lombok.experimental.SuperBuilder;
import tr.com.tokenpay.request.common.BaseRequest;

@SuperBuilder
@Data
public class UpdateBuyerRequest extends BaseRequest {

    private transient Long id;

    private String email;

    private String name;

    private String surname;

    private String identityNumber;

    private String gsmNumber;

}
