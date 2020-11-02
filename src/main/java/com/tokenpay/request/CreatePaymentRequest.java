package com.tokenpay.request;

import com.tokenpay.model.CurrencyCode;
import com.tokenpay.model.PaymentGroup;
import com.tokenpay.model.PaymentPhase;
import com.tokenpay.request.common.BaseRequest;
import com.tokenpay.request.dto.CardDto;
import com.tokenpay.request.dto.CreatePaymentItemDto;
import lombok.Builder;

import java.math.BigDecimal;
import java.util.List;

@Builder
public class CreatePaymentRequest extends BaseRequest {
    private BigDecimal price;
    private BigDecimal paidPrice;
    @Builder.Default
    private BigDecimal walletPrice = BigDecimal.ZERO;
    private Integer installment;
    private CurrencyCode currency;
    private PaymentGroup paymentGroup;
    private String conversationId;
    private String callbackUrl;
    @Builder.Default
    private PaymentPhase paymentPhase = PaymentPhase.AUTH;
    private Long buyerId;
    private CardDto card;
    private List<CreatePaymentItemDto> items;

    @Override
    public String getPath() {
        return "/payment/v1/card-payments";
    }
}
