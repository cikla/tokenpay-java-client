package tr.com.tokenpay.sample;

import org.junit.jupiter.api.Test;
import tr.com.tokenpay.TokenPay;
import tr.com.tokenpay.model.SettlementType;
import tr.com.tokenpay.request.BouncedSubMerchantRowRequest;
import tr.com.tokenpay.request.PayoutCompletedTxRequest;
import tr.com.tokenpay.response.BouncedSubMerchantRowListResponse;
import tr.com.tokenpay.response.PayoutCompletedTxListResponse;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;

public class SettlementReportingSample {

    private final TokenPay tokenPay = new TokenPay("api-key", "secret-key", "http://localhost:8000");

    @Test
    void retrieve_bounced_sub_merchant_rows_sample() throws ParseException {
        BouncedSubMerchantRowRequest request = BouncedSubMerchantRowRequest.builder()
                .startDate(LocalDateTime.of(2020, 02, 28, 00, 00, 00))
                .endDate(LocalDateTime.of(2020, 11, 28, 23, 59, 59))
                .build();

        BouncedSubMerchantRowListResponse bouncedSubMerchantRowListResponse = tokenPay.settlementReporting().retrieveBouncedSubMerchantRows(request);
        System.out.println(String.format("Bounced sub merchant row list response: %s", bouncedSubMerchantRowListResponse));
    }

    @Test
    void retrieve_payout_completed_transactions() throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        PayoutCompletedTxRequest request = PayoutCompletedTxRequest.builder()
                .startDate(LocalDateTime.of(2020, 02, 28, 00, 00, 00))
                .endDate(LocalDateTime.of(2020, 11, 04, 23, 59, 59))
                .settlementFileId(1L)
                .settlementType(SettlementType.SETTLEMENT)
                .build();

        PayoutCompletedTxListResponse payoutCompletedTxListResponse = tokenPay.settlementReporting().retrievePayoutCompletedTx(request);
        System.out.println(String.format("Payout completed row list response: %s", payoutCompletedTxListResponse));
    }


}
