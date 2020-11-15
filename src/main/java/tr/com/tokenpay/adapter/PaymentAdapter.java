package tr.com.tokenpay.adapter;

import tr.com.tokenpay.net.HttpClient;
import tr.com.tokenpay.request.*;
import tr.com.tokenpay.request.common.RequestOptions;
import tr.com.tokenpay.request.common.RequestQueryParamsBuilder;
import tr.com.tokenpay.response.*;

public class PaymentAdapter extends BaseAdapter {

    private final RequestOptions requestOptions;

    public PaymentAdapter(RequestOptions requestOptions) {
        this.requestOptions = requestOptions;
    }

    public PaymentResponse createPayment(CreatePaymentRequest createPaymentRequest) {
        String path = "/payment/v1/card-payments";
        return HttpClient.post(requestOptions.getBaseUrl() + path, createHeaders(createPaymentRequest, path, requestOptions),
                createPaymentRequest, PaymentResponse.class);
    }

    public ThreeDSInitResponse init3DSPayment(InitThreeDSPaymentRequest initThreeDSPaymentRequest) {
        String path = "/payment/v1/card-payments/3ds-init";
        return HttpClient.post(requestOptions.getBaseUrl() + path, createHeaders(initThreeDSPaymentRequest, path, requestOptions),
                initThreeDSPaymentRequest, ThreeDSInitResponse.class);
    }

    public PaymentResponse complete3DSPayment(CompleteThreeDSRequest completeThreeDSRequest) {
        String path = "/payment/v1/card-payments/3ds-complete";
        return HttpClient.post(requestOptions.getBaseUrl() + path, createHeaders(completeThreeDSRequest, path, requestOptions),
                completeThreeDSRequest, PaymentResponse.class);
    }

    public PaymentTxApprovalListResponse paymentTransactionApprove(PaymentTxApprovalRequest paymentTxApprovalRequest) {
        String path = "/payment/v1/payment-transactions/approve";
        return HttpClient.post(requestOptions.getBaseUrl() + path, createHeaders(paymentTxApprovalRequest, path, requestOptions),
                paymentTxApprovalRequest, PaymentTxApprovalListResponse.class);
    }

    public PaymentTxApprovalListResponse paymentTransactionDisapprove(PaymentTxDisapprovalRequest paymentTxDisapprovalRequest) {
        String path = "/payment/v1/payment-transactions/disapprove";
        return HttpClient.post(requestOptions.getBaseUrl() + path, createHeaders(paymentTxDisapprovalRequest, path, requestOptions),
                paymentTxDisapprovalRequest, PaymentTxApprovalListResponse.class);
    }

    public RefundResponse createRefund(CreateRefundRequest createRefundRequest) {
        String path = "/payment/v1/refunds";
        return HttpClient.post(requestOptions.getBaseUrl() + path, createHeaders(createRefundRequest, path, requestOptions),
                createRefundRequest, RefundResponse.class);
    }

    public RefundResponse retrieveRefund(RetrieveRefundRequest retrieveRefundRequest) {
        String path = "/payment/v1/refunds/" + retrieveRefundRequest.getId();
        return HttpClient.get(requestOptions.getBaseUrl() + path, createHeaders(path, requestOptions), RefundResponse.class);
    }

    public RefundTxResponse createRefundTx(CreateRefundTxRequest createRefundTxRequest) {
        String path = "/payment/v1/refund-transactions";
        return HttpClient.post(requestOptions.getBaseUrl() + path, createHeaders(createRefundTxRequest, path, requestOptions),
                createRefundTxRequest, RefundTxResponse.class);
    }

    public RefundTxResponse retrieveRefundTx(RetrieveRefundTxRequest retrieveRefundTxRequest) {
        String path = "/payment/v1/refund-transactions/" + retrieveRefundTxRequest.getId();
        return HttpClient.get(requestOptions.getBaseUrl() + path, createHeaders(path, requestOptions), RefundTxResponse.class);
    }

    public RefundTxListResponse searchRefundTx(SearchRefundTxRequest searchRefundTxRequest) {
        String query = RequestQueryParamsBuilder.buildQueryParam(searchRefundTxRequest);
        String path = "/payment/v1/refund-transactions" + query;

        return HttpClient.get(requestOptions.getBaseUrl() + path, createHeaders(path, requestOptions), RefundTxListResponse.class);
    }

    public PaymentResponse retrievePayment(RetrievePaymentRequest retrievePaymentRequest) {
        String path = "/payment/v1/card-payments/" + retrievePaymentRequest.getId();
        return HttpClient.get(requestOptions.getBaseUrl() + path, createHeaders(path, requestOptions), PaymentResponse.class);
    }

    public PaymentListResponse searchPayment(SearchPaymentRequest searchPaymentRequest) {
        String query = RequestQueryParamsBuilder.buildQueryParam(searchPaymentRequest);
        String path = "/payment/v1/card-payments" + query;

        return HttpClient.get(requestOptions.getBaseUrl() + path, createHeaders(path, requestOptions), PaymentListResponse.class);
    }

    public CrossBookingTransactionResponse crossBookingSend(CrossBookingSendRequest crossBookingSendRequest) {
        String path = "/payment/v1/cross-bookings/send";
        return HttpClient.post(requestOptions.getBaseUrl() + path, createHeaders(crossBookingSendRequest, path, requestOptions),
                crossBookingSendRequest, CrossBookingTransactionResponse.class);
    }

    public CrossBookingTransactionResponse crossBookingReceive(CrossBookingReceiveRequest crossBookingReceiveRequest) {
        String path = "/payment/v1/cross-bookings/receive";
        return HttpClient.post(requestOptions.getBaseUrl() + path, createHeaders(crossBookingReceiveRequest, path, requestOptions),
                crossBookingReceiveRequest, CrossBookingTransactionResponse.class);
    }

    public CrossBookingTransactionResponse crossBookingCancel(CrossBookingCancelRequest crossBookingCancelRequest) {
        String path = "/payment/v1/cross-bookings/cancel";
        return HttpClient.post(requestOptions.getBaseUrl() + path, createHeaders(crossBookingCancelRequest, path, requestOptions),
                crossBookingCancelRequest, CrossBookingTransactionResponse.class);
    }

    public CrossBookingTransactionListResponse searchCrossBooking(SearchCrossBookingRequest searchCrossBookingRequest) {
        String query = RequestQueryParamsBuilder.buildQueryParam(searchCrossBookingRequest);
        String path = "/payment/v1/cross-bookings" + query;

        return HttpClient.get(requestOptions.getBaseUrl() + path, createHeaders(path, requestOptions), CrossBookingTransactionListResponse.class);
    }

    public Void deleteCard(DeleteCardRequest deleteCardRequest) {
        String query = RequestQueryParamsBuilder.buildQueryParam(deleteCardRequest);
        String path = "/payment/v1/cards" + query;

        return HttpClient.delete(requestOptions.getBaseUrl() + path, createHeaders(path, requestOptions),
                deleteCardRequest, Void.class);
    }

    public CardListResponse searchCard(SearchCardRequest searchCardRequest) {
        String query = RequestQueryParamsBuilder.buildQueryParam(searchCardRequest);
        String path = "/payment/v1/cards" + query;

        return HttpClient.get(requestOptions.getBaseUrl() + path, createHeaders(path, requestOptions), CardListResponse.class);
    }
}
