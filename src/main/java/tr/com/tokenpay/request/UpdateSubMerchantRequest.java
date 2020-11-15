package tr.com.tokenpay.request;

import lombok.Data;
import lombok.experimental.SuperBuilder;
import tr.com.tokenpay.request.common.BaseRequest;

@Data
@SuperBuilder
public class UpdateSubMerchantRequest extends BaseRequest {

    private Long id;

    private String name;

    private String address;

    private String email;

    private String iban;

    private String gsmNumber;
    private String taxOffice;
    private String taxNumber;
    private String contactName;
    private String contactSurname;
    private String identityNumber;
    private String legalCompanyTitle;
}
