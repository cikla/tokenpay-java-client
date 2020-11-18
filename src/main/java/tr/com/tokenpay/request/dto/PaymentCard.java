package tr.com.tokenpay.request.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PaymentCard implements Card {

    private String cardHolderName;
    private String cardNumber;
    private String expireYear;
    private String expireMonth;
    private String cvc;
    private String cardAlias;

    @Builder.Default
    private Boolean storeCardAfterSuccessPayment = false;
}
