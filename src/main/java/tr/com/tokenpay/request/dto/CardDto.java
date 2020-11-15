package tr.com.tokenpay.request.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
public class CardDto {

    private String cardHolderName;

    private String cardNumber;

    private String expireYear;

    private String expireMonth;

    private String cvc;

    private String cardAlias;

    private String cardUserKey;

    private String cardToken;

    @Builder.Default
    private Boolean storeCardAfterSuccessPayment = false;
}
