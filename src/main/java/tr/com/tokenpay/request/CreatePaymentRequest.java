package tr.com.tokenpay.request;

import lombok.Builder;
import lombok.Data;
import lombok.experimental.SuperBuilder;
import tr.com.tokenpay.model.CurrencyCode;
import tr.com.tokenpay.model.PaymentGroup;
import tr.com.tokenpay.model.PaymentPhase;
import tr.com.tokenpay.request.common.BaseRequest;
import tr.com.tokenpay.request.dto.CardDto;
import tr.com.tokenpay.request.dto.CreatePaymentItemDto;

import java.math.BigDecimal;
import java.util.List;

@Data
@SuperBuilder
public class CreatePaymentRequest extends BaseRequest {

    protected BigDecimal price;

    protected BigDecimal paidPrice;

    @Builder.Default
    protected BigDecimal walletPrice = BigDecimal.ZERO;

    protected Integer installment;

    protected CurrencyCode currency;

    protected PaymentGroup paymentGroup;

    protected String conversationId;

    @Builder.Default
    protected PaymentPhase paymentPhase = PaymentPhase.AUTH;

    protected Long buyerId;

    protected CardDto card;

    protected List<CreatePaymentItemDto> items;
}
