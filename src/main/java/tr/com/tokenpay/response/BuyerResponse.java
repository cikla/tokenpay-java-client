package tr.com.tokenpay.response;

import lombok.Data;
import tr.com.tokenpay.model.Status;

@Data
public class BuyerResponse {

    private Long id;
    private Status status;
    private String email;
    private String identityNumber;
    private String name;
    private String surname;
    private String gsmNumber;
    private String buyerExternalId;
}
