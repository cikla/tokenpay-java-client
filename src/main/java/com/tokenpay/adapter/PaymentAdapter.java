package com.tokenpay.adapter;

import com.tokenpay.net.HttpClient;
import com.tokenpay.request.*;
import com.tokenpay.request.common.RequestOptions;
import com.tokenpay.response.*;

public class PaymentAdapter extends BaseAdapter {

    private final RequestOptions requestOptions;

    public PaymentAdapter(RequestOptions requestOptions) {
        this.requestOptions = requestOptions;
    }

    public PaymentResponse createPayment(CreatePaymentRequest createPaymentRequest, RequestOptions options) {
        return HttpClient.post(options.getBaseUrl() + createPaymentRequest.getPath(), createHeaders(createPaymentRequest, options),
                createPaymentRequest, PaymentResponse.class);
    }

    public PaymentResponse createPayment(CreatePaymentRequest createPaymentRequest) {
        return createPayment(createPaymentRequest, requestOptions);
    }

    public ThreeDSInitResponse init3DSPayment(InitThreeDSPaymentRequest initThreeDSPaymentRequest, RequestOptions options) {
        return HttpClient.post(options.getBaseUrl() + initThreeDSPaymentRequest.getPath(), createHeaders(initThreeDSPaymentRequest, options),
                initThreeDSPaymentRequest, ThreeDSInitResponse.class);
    }

    public ThreeDSInitResponse init3DSPayment(InitThreeDSPaymentRequest initThreeDSPaymentRequest) {
        return init3DSPayment(initThreeDSPaymentRequest, requestOptions);
    }

    public PaymentResponse complete3DSPayment(CompleteThreeDSRequest completeThreeDSRequest, RequestOptions options) {
        return HttpClient.post(options.getBaseUrl() + completeThreeDSRequest.getPath(), createHeaders(completeThreeDSRequest, options),
                completeThreeDSRequest, PaymentResponse.class);
    }

    public PaymentResponse complete3DSPayment(CompleteThreeDSRequest completeThreeDSRequest) {
        return complete3DSPayment(completeThreeDSRequest, requestOptions);
    }

    public PaymentTxApprovalListResponse paymentTransactionApprove(PaymentTxApprovalRequest paymentTxApprovalRequest, RequestOptions options) {
        return HttpClient.post(options.getBaseUrl() + paymentTxApprovalRequest.getPath(), createHeaders(paymentTxApprovalRequest, options),
                paymentTxApprovalRequest, PaymentTxApprovalListResponse.class);
    }

    public PaymentTxApprovalListResponse paymentTransactionApprove(PaymentTxApprovalRequest paymentTxApprovalRequest) {
        return paymentTransactionApprove(paymentTxApprovalRequest, requestOptions);
    }

    public PaymentTxApprovalListResponse paymentTransactionDisapprove(PaymentTxDisapprovalRequest paymentTxDisapprovalRequest, RequestOptions options) {
        return HttpClient.post(options.getBaseUrl() + paymentTxDisapprovalRequest.getPath(), createHeaders(paymentTxDisapprovalRequest, options),
                paymentTxDisapprovalRequest, PaymentTxApprovalListResponse.class);
    }

    public PaymentTxApprovalListResponse paymentTransactionDisapprove(PaymentTxDisapprovalRequest paymentTxDisapprovalRequest) {
        return paymentTransactionDisapprove(paymentTxDisapprovalRequest, requestOptions);
    }

    public RefundResponse createRefund(CreateRefundRequest createRefundRequest, RequestOptions options) {
        return HttpClient.post(options.getBaseUrl() + createRefundRequest.getPath(), createHeaders(createRefundRequest, options),
                createRefundRequest, RefundResponse.class);
    }

    public RefundResponse createRefund(CreateRefundRequest createRefundRequest) {
        return createRefund(createRefundRequest, requestOptions);
    }

    public RefundResponse retrieveRefund(RetrieveRefundRequest retrieveRefundRequest, RequestOptions options) {
        return HttpClient.get(options.getBaseUrl() + retrieveRefundRequest.getPath(), createHeaders(retrieveRefundRequest, options),
                retrieveRefundRequest, RefundResponse.class);
    }

    public RefundResponse retrieveRefund(RetrieveRefundRequest retrieveRefundRequest) {
        return retrieveRefund(retrieveRefundRequest, requestOptions);
    }

    public RefundTxResponse createRefundTx(CreateRefundTxRequest createRefundTxRequest, RequestOptions options) {
        return HttpClient.post(options.getBaseUrl() + createRefundTxRequest.getPath(), createHeaders(createRefundTxRequest, options),
                createRefundTxRequest, RefundTxResponse.class);
    }

    public RefundTxResponse createRefundTx(CreateRefundTxRequest createRefundTxRequest) {
        return createRefundTx(createRefundTxRequest, requestOptions);
    }

    public RefundTxResponse retrieveRefundTx(RetrieveRefundTxRequest retrieveRefundTxRequest, RequestOptions options) {
        return HttpClient.get(options.getBaseUrl() + retrieveRefundTxRequest.getPath(), createHeaders(retrieveRefundTxRequest, options),
                retrieveRefundTxRequest, RefundTxResponse.class);
    }

    public RefundTxResponse retrieveRefundTx(RetrieveRefundTxRequest retrieveRefundTxRequest) {
        return retrieveRefundTx(retrieveRefundTxRequest, requestOptions);
    }

    public RefundTxListResponse searchRefundTx(SearchRefundTxRequest searchRefundTxRequest, RequestOptions options) {
        return HttpClient.get(options.getBaseUrl() + searchRefundTxRequest.getPath(), createHeaders(searchRefundTxRequest, options),
                searchRefundTxRequest, RefundTxListResponse.class);
    }

    public RefundTxListResponse searchRefundTx(SearchRefundTxRequest searchRefundTxRequest) {
        return searchRefundTx(searchRefundTxRequest, requestOptions);
    }

    public PaymentResponse retrievePayment(RetrievePaymentRequest retrievePaymentRequest, RequestOptions options) {
        return HttpClient.get(options.getBaseUrl() + retrievePaymentRequest.getPath(), createHeaders(retrievePaymentRequest, options),
                retrievePaymentRequest, PaymentResponse.class);
    }

    public PaymentResponse retrievePayment(RetrievePaymentRequest retrievePaymentRequest) {
        return retrievePayment(retrievePaymentRequest, requestOptions);
    }

    public PaymentListResponse searchPayment(SearchPaymentRequest searchPaymentRequest, RequestOptions options) {
        return HttpClient.get(options.getBaseUrl() + searchPaymentRequest.getPath(), createHeaders(searchPaymentRequest, options),
                searchPaymentRequest, PaymentListResponse.class);
    }

    public PaymentListResponse searchPayment(SearchPaymentRequest searchPaymentRequest) {
        return searchPayment(searchPaymentRequest, requestOptions);
    }

    public CrossBookingTransactionResponse crossBookingSend(CrossBookingSendRequest crossBookingSendRequest, RequestOptions options) {
        return HttpClient.post(options.getBaseUrl() + crossBookingSendRequest.getPath(), createHeaders(crossBookingSendRequest, options),
                crossBookingSendRequest, CrossBookingTransactionResponse.class);
    }

    public CrossBookingTransactionResponse crossBookingSend(CrossBookingSendRequest crossBookingSendRequest) {
        return crossBookingSend(crossBookingSendRequest, requestOptions);
    }

    public CrossBookingTransactionResponse crossBookingReceive(CrossBookingReceiveRequest crossBookingReceiveRequest, RequestOptions options) {
        return HttpClient.post(options.getBaseUrl() + crossBookingReceiveRequest.getPath(), createHeaders(crossBookingReceiveRequest, options),
                crossBookingReceiveRequest, CrossBookingTransactionResponse.class);
    }

    public CrossBookingTransactionResponse crossBookingReceive(CrossBookingReceiveRequest crossBookingReceiveRequest) {
        return crossBookingReceive(crossBookingReceiveRequest, requestOptions);
    }

    public CrossBookingTransactionResponse crossBookingCancel(CrossBookingCancelRequest crossBookingCancelRequest, RequestOptions options) {
        return HttpClient.post(options.getBaseUrl() + crossBookingCancelRequest.getPath(), createHeaders(crossBookingCancelRequest, options),
                crossBookingCancelRequest, CrossBookingTransactionResponse.class);
    }

    public CrossBookingTransactionResponse crossBookingCancel(CrossBookingCancelRequest crossBookingCancelRequest) {
        return crossBookingCancel(crossBookingCancelRequest, requestOptions);
    }

    public CrossBookingTransactionListResponse searchCrossBooking(SearchCrossBookingRequest searchCrossBookingRequest, RequestOptions options) {
        return HttpClient.get(options.getBaseUrl() + searchCrossBookingRequest.getPath(), createHeaders(searchCrossBookingRequest, options),
                searchCrossBookingRequest, CrossBookingTransactionListResponse.class);
    }

    public CrossBookingTransactionListResponse searchCrossBooking(SearchCrossBookingRequest searchCrossBookingRequest) {
        return searchCrossBooking(searchCrossBookingRequest, requestOptions);
    }

    public CardResponse createCard(CreateCardRequest createCardRequest, RequestOptions options) {
        return HttpClient.post(options.getBaseUrl() + createCardRequest.getPath(), createHeaders(createCardRequest, options),
                createCardRequest, CardResponse.class);
    }

    public CardResponse createCard(CreateCardRequest createCardRequest) {
        return createCard(createCardRequest, requestOptions);
    }

    public Void deleteCard(DeleteCardRequest deleteCardRequest, RequestOptions options) {
        return HttpClient.delete(options.getBaseUrl() + deleteCardRequest.getPath(), createHeaders(deleteCardRequest, options),
                deleteCardRequest, Void.class);
    }

    public Void deleteCard(DeleteCardRequest deleteCardRequest) {
        return deleteCard(deleteCardRequest, requestOptions);
    }

    public CardListResponse searchCard(SearchCardRequest searchCardRequest, RequestOptions options) {
        return HttpClient.get(options.getBaseUrl() + searchCardRequest.getPath(), createHeaders(searchCardRequest, options),
                searchCardRequest, CardListResponse.class);
    }

    public CardListResponse searchCard(SearchCardRequest searchCardRequest) {
        return searchCard(searchCardRequest, requestOptions);
    }
}
