package com.tokenpay;

import com.tokenpay.model.CurrencyCode;
import com.tokenpay.model.Payment;
import com.tokenpay.model.PaymentGroup;
import com.tokenpay.model.PaymentPhase;
import com.tokenpay.request.CreatePaymentRequest;
import com.tokenpay.request.dto.CardDto;
import com.tokenpay.request.dto.CreatePaymentItemDto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TestApplication {

    public static void main(String[] args) {
        TokenPay.apiKey = "api-key";
        TokenPay.secretKey = "secret-key";
        TokenPay.baseUrl = "http://localhost:8000";

        List<CreatePaymentItemDto> items = new ArrayList<>();

        items.add(CreatePaymentItemDto.builder()
                .name("item 1")
                .externalId("sfdsdf")
                .price(BigDecimal.valueOf(30))
                .subMerchantMemberId(1L)
                .subMerchantMemberPrice(BigDecimal.valueOf(27))
                .build());

        items.add(CreatePaymentItemDto.builder()
                .name("item 2")
                .externalId("cvbxcvb")
                .price(BigDecimal.valueOf(50))
                .subMerchantMemberId(2L)
                .subMerchantMemberPrice(BigDecimal.valueOf(42))
                .build());

        items.add(CreatePaymentItemDto.builder()
                .name("item 3")
                .externalId("vmvcx")
                .price(BigDecimal.valueOf(20))
                .subMerchantMemberId(3L)
                .subMerchantMemberPrice(BigDecimal.valueOf(18))
                .build());

        CreatePaymentRequest request = CreatePaymentRequest.builder()
                .price(BigDecimal.valueOf(100))
                .paidPrice(BigDecimal.valueOf(100))
                .walletPrice(BigDecimal.ZERO)
                .installment(1)
                .currency(CurrencyCode.TRY)
                .conversationId("asdjasdjasdfjhasd")
                .paymentGroup(PaymentGroup.PRODUCT)
                .paymentPhase(PaymentPhase.AUTH)
                .card(CardDto.builder()
                        .cardHolderName("Pharmacy User")
                        .cardNumber("5406670000000009")
                        .expireYear("2035")
                        .expireMonth("11")
                        .cvc("123")
                        .build())
                .items(items)
                .build();

        Payment payment = Payment.create(request);
        System.out.println(String.format("Create Payment Result: %s", payment));
    }
}
