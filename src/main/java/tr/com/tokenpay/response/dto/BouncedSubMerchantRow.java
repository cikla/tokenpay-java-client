package tr.com.tokenpay.response.dto;

import lombok.Data;

@Data
public class BouncedSubMerchantRow {

    private Long id;
    private String iban;
    private String contactName;
    private String contactSurname;
    private String legalCompanyTitle;
}
