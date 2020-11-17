package tr.com.tokenpay.sample;

import org.junit.jupiter.api.Test;
import tr.com.tokenpay.TokenPay;
import tr.com.tokenpay.model.*;
import tr.com.tokenpay.request.*;
import tr.com.tokenpay.request.dto.CardDto;
import tr.com.tokenpay.request.dto.CreatePaymentItemDto;
import tr.com.tokenpay.response.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class PaymentSample {

    private final TokenPay tokenPay = new TokenPay("api-key", "secret-key", "http://localhost:8000");

    @Test
    void create_payment_sample() {
        List<CreatePaymentItemDto> items = new ArrayList<>();

        items.add(CreatePaymentItemDto.builder()
                .name("item 1")
                .externalId("sfdsdf")
                .price(BigDecimal.valueOf(30))
                .subMerchantId(1L)
                .subMerchantPrice(BigDecimal.valueOf(27))
                .build());

        items.add(CreatePaymentItemDto.builder()
                .name("item 2")
                .externalId("cvbxcvb")
                .price(BigDecimal.valueOf(50))
                .subMerchantId(2L)
                .subMerchantPrice(BigDecimal.valueOf(42))
                .build());

        items.add(CreatePaymentItemDto.builder()
                .name("item 3")
                .externalId("vmvcx")
                .price(BigDecimal.valueOf(20))
                .subMerchantId(3L)
                .subMerchantPrice(BigDecimal.valueOf(18))
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

        PaymentResponse paymentResponse = tokenPay.payment().createPayment(request);
        System.out.println(String.format("Create Payment Result: %s", paymentResponse));
    }

    @Test
    void init_3ds_payment_sample() {
        List<CreatePaymentItemDto> items = new ArrayList<>();

        items.add(CreatePaymentItemDto.builder()
                .name("item 1")
                .externalId("sfdsdf")
                .price(BigDecimal.valueOf(30))
                .subMerchantId(1L)
                .subMerchantPrice(BigDecimal.valueOf(27))
                .build());

        items.add(CreatePaymentItemDto.builder()
                .name("item 2")
                .externalId("cvbxcvb")
                .price(BigDecimal.valueOf(50))
                .subMerchantId(2L)
                .subMerchantPrice(BigDecimal.valueOf(42))
                .build());

        items.add(CreatePaymentItemDto.builder()
                .name("item 3")
                .externalId("vmvcx")
                .price(BigDecimal.valueOf(20))
                .subMerchantId(3L)
                .subMerchantPrice(BigDecimal.valueOf(18))
                .build());

        InitThreeDSPaymentRequest request = InitThreeDSPaymentRequest.builder()
                .price(BigDecimal.valueOf(100))
                .paidPrice(BigDecimal.valueOf(100))
                .walletPrice(BigDecimal.ZERO)
                .installment(1)
                .currency(CurrencyCode.TRY)
                .conversationId("asdjasdjasdfjhasd")
                .callbackUrl("http://callback.url")
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

        ThreeDSInitResponse threeDSInitResponse = tokenPay.payment().init3DSPayment(request);
        System.out.println(String.format("Init 3DS Result: %s", threeDSInitResponse.getHtmlContent()));
        System.out.println(String.format("Init 3DS Decoded Result: %s", threeDSInitResponse.getDecodedHtmlContent()));
    }

    @Test
    void complete_3ds_payment_sample() {
        CompleteThreeDSRequest request = CompleteThreeDSRequest.builder()
                .paymentId(12L)
                .build();

        PaymentResponse paymentResponse = tokenPay.payment().complete3DSPayment(request);
        System.out.println(String.format("Completed 3DS Payment Result: %s", paymentResponse));
    }

    @Test
    void approve_payment_tx_sample() {
        PaymentTxApprovalRequest request = PaymentTxApprovalRequest.builder()
                .isTransactional(true)
                .paymentTransactionIds(new HashSet<Long>() {{
                    add(1L);
                    add(2L);
                }})
                .build();

        PaymentTxApprovalListResponse paymentTxApprovalListResponse = tokenPay.payment().paymentTransactionApprove(request);
        System.out.println(String.format("Payment Tx Approval Result: %s", paymentTxApprovalListResponse));
    }

    @Test
    void disapprove_payment_tx_sample() {
        PaymentTxDisapprovalRequest request = PaymentTxDisapprovalRequest.builder()
                .isTransactional(true)
                .paymentTransactionIds(new HashSet<Long>() {{
                    add(1L);
                    add(2L);
                }})
                .build();

        PaymentTxApprovalListResponse paymentTxApprovalListResponse = tokenPay.payment().paymentTransactionDisapprove(request);
        System.out.println(String.format("Payment Tx Disapproval Result: %s", paymentTxApprovalListResponse));
    }

    @Test
    void create_refund_sample() {
        CreateRefundRequest request = CreateRefundRequest.builder()
                .paymentId(5L)
                .refundDestinationType(RefundDestinationType.CARD)
                .build();

        RefundResponse refundResponse = tokenPay.payment().createRefund(request);
        System.out.println(String.format("Create Refund Result: %s", refundResponse));
    }

    @Test
    void retrieve_refund_sample() {
        RetrieveRefundRequest request = RetrieveRefundRequest.builder()
                .id(1L)
                .build();

        RefundResponse refundResponse = tokenPay.payment().retrieveRefund(request);
        System.out.println(String.format("Retrieve Refund Result: %s", refundResponse));
    }

    @Test
    void create_refund_tx_sample() {
        CreateRefundTxRequest request = CreateRefundTxRequest.builder()
                .paymentTransactionId(19L)
                .refundPrice(BigDecimal.valueOf(3.9))
                .refundDestinationType(RefundDestinationType.CARD)
                .build();

        RefundTxResponse refundTxResponse = tokenPay.payment().createRefundTx(request);
        System.out.println(String.format("Create Refund Tx Result: %s", refundTxResponse));
    }

    @Test
    void retrieve_refund_tx_sample() {
        RetrieveRefundTxRequest request = RetrieveRefundTxRequest.builder()
                .id(1L)
                .build();

        RefundTxResponse refundTxResponse = tokenPay.payment().retrieveRefundTx(request);
        System.out.println(String.format("Retrieve Refund Tx Result: %s", refundTxResponse));
    }

    @Test
    void search_refund_tx_sample() {
        SearchRefundTxRequest request = SearchRefundTxRequest.builder()
                .paymentId(14L)
                .build();

        RefundTxListResponse refundTxListResponse = tokenPay.payment().searchRefundTx(request);
        System.out.println(String.format("Search Refund Tx Result: %s", refundTxListResponse));
    }

    @Test
    void retrieve_payment_sample() {
        PaymentDetailResponse paymentResponse = tokenPay.payment().retrievePayment(1L);
        System.out.println(String.format("Retrieve Payment Result: %s", paymentResponse));
    }

    @Test
    void search_payment_sample() {
        SearchPaymentRequest request = SearchPaymentRequest.builder()
                .currency(CurrencyCode.TRY)
                .paymentStatus(PaymentStatus.SUCCESS)
                .build();

        PaymentListResponse paymentListResponse = tokenPay.payment().searchPayment(request);
        System.out.println(String.format("Search Payment Result: %s", paymentListResponse));
    }

    @Test
    void cross_booking_send_sample() {
        CrossBookingSendRequest request = CrossBookingSendRequest.builder()
                .currency(CurrencyCode.TRY.name())
                .price(BigDecimal.TEN)
                .reason("send")
                .subMerchantId(1L)
                .build();

        CrossBookingTransactionResponse crossBookingTransactionResponse = tokenPay.payment().crossBookingSend(request);
        System.out.println(String.format("Cross Booking Send Result: %s", crossBookingTransactionResponse));
    }

    @Test
    void cross_booking_receive_sample() {
        CrossBookingReceiveRequest request = CrossBookingReceiveRequest.builder()
                .currency(CurrencyCode.TRY.name())
                .price(BigDecimal.TEN)
                .reason("receive")
                .subMerchantId(1L)
                .build();

        CrossBookingTransactionResponse crossBookingTransactionResponse = tokenPay.payment().crossBookingReceive(request);
        System.out.println(String.format("Cross Booking Receive Result: %s", crossBookingTransactionResponse));
    }

    @Test
    void cross_booking_cancel_sample() {
        CrossBookingCancelRequest request = CrossBookingCancelRequest.builder()
                .crossBookingId(4L)
                .build();

        CrossBookingTransactionResponse crossBookingTransactionResponse = tokenPay.payment().crossBookingCancel(request);
        System.out.println(String.format("Cross Booking Cancel Result: %s", crossBookingTransactionResponse));
    }

    @Test
    void cross_booking_search_sample() {
        SearchCrossBookingRequest request = SearchCrossBookingRequest.builder()
                .page(0)
                .size(10)
                .build();

        CrossBookingTransactionListResponse crossBookingTransactionListResponse = tokenPay.payment().searchCrossBooking(request);
        System.out.println(String.format("Cross Booking Search Result: %s", crossBookingTransactionListResponse));
    }

    @Test
    void delete_card_sample() {
        DeleteCardRequest request = DeleteCardRequest.builder()
                .cardUserKey("45012f78-3d68-4d58-902f-d4d858f14d67")
                .cardToken("0ca79029-d805-4e02-97fc-5c599734bc6b")
                .build();

        tokenPay.payment().deleteCard(request);
    }

    @Test
    void search_card_sample() {
        SearchCardRequest request = SearchCardRequest.builder()
                .cardType(CardType.CREDIT_CARD)
                .build();

        CardListResponse cardListResponse = tokenPay.payment().searchCard(request);
        System.out.println(String.format("Search Card Result: %s", cardListResponse));
    }
}
