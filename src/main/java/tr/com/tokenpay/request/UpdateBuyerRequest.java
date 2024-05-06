package tr.com.tokenpay.request;

import lombok.Builder;
import lombok.Data;
import tr.com.tokenpay.request.common.Request;

@Data
@Builder
public class UpdateBuyerRequest implements Request {

    private String email;
    private String name;
    private String surname;
    private String identityNumber;
    private String gsmNumber;
}