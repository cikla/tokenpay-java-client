package tr.com.tokenpay.request;

import lombok.Data;
import lombok.experimental.SuperBuilder;
import tr.com.tokenpay.model.CardAssociation;
import tr.com.tokenpay.model.CardType;
import tr.com.tokenpay.request.common.BaseRequest;

@Data
@SuperBuilder
public class SearchCardRequest extends BaseRequest {

    private String cardAlias;
    private String cardBrand;
    private CardType cardType;
    private String cardUserKey;
    private String cardToken;
    private String cardBankName;
    private CardAssociation cardAssociation;
    private Integer page = 0;
    private Integer size = 10;
}
