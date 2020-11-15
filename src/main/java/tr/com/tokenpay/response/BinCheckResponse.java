package tr.com.tokenpay.response;

import lombok.Data;
import tr.com.tokenpay.model.CardAssociation;
import tr.com.tokenpay.model.CardType;

@Data
public class BinCheckResponse {

    private String binNumber;
    private CardType cardType;
    private CardAssociation cardAssociation;
    private String cardBrand;
    private String bankName;
    private Long bankCode;
    private Boolean commercial;
}
