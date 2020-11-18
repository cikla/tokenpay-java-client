package tr.com.tokenpay.request.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class StoredCard implements Card {

    private String cardUserKey;
    private String cardToken;
}
