package com.tokenpay.sample;

import com.tokenpay.TokenPay;
import com.tokenpay.model.SettlementType;
import com.tokenpay.request.BouncedSubMerchantRowRequest;
import com.tokenpay.request.PayoutCompletedTxRequest;
import com.tokenpay.response.BouncedSubMerchantRowListResponse;
import com.tokenpay.response.PayoutCompletedTxListResponse;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class SettlementReportingSample {
    private final TokenPay tokenPay = new TokenPay("api-key", "secret-key", "http://localhost:8000");

    @Test
    void retrieve_bounced_sub_merchant_rows_sample() throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");

        BouncedSubMerchantRowRequest request = BouncedSubMerchantRowRequest.builder()
                .startDate((formatter.parse("2020-02-28T00:00:00")))
                .endDate((formatter.parse("2020-11-28T23:59:59")))
                .build();

        BouncedSubMerchantRowListResponse bouncedSubMerchantRowListResponse = tokenPay.settlementReporting().retrieveBouncedSubMerchantRows(request);
        System.out.println(String.format("Bounced sub merchant row list response: %s", bouncedSubMerchantRowListResponse));
    }

    @Test
    void retrieve_payout_completed_transactions() throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        PayoutCompletedTxRequest request = PayoutCompletedTxRequest.builder()
                .startDate((formatter.parse("2020-02-28T00:00:00")))
                .endDate((formatter.parse("2020-11-04T23:59:59")))
                .settlementFileId(1L)
                .settlementType(SettlementType.SETTLEMENT)
                .build();

        PayoutCompletedTxListResponse payoutCompletedTxListResponse = tokenPay.settlementReporting().retrievePayoutCompletedTx(request);
        System.out.println(String.format("Payout completed row list response: %s", payoutCompletedTxListResponse));
    }


}
