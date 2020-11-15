package tr.com.tokenpay.sample;

import org.junit.jupiter.api.Test;
import tr.com.tokenpay.TokenPay;
import tr.com.tokenpay.model.CurrencyCode;
import tr.com.tokenpay.request.BinCheckRequest;
import tr.com.tokenpay.request.SearchInstallmentRequest;
import tr.com.tokenpay.response.BinCheckResponse;
import tr.com.tokenpay.response.InstallmentListResponse;

import java.math.BigDecimal;

public class InstallmentSample {

    private final TokenPay tokenPay = new TokenPay("api-key", "secret-key", "http://localhost:8000");

    @Test
    void bin_check_sample() {
        BinCheckRequest request = BinCheckRequest.builder().binNumber("527682").build();

        BinCheckResponse binCheckResponse = tokenPay.installment().binCheck(request);
        System.out.println(String.format("Bin check response: %s", binCheckResponse));
    }

    @Test
    void retrieve_installment_sample() {
        SearchInstallmentRequest request = SearchInstallmentRequest.builder()
                .binNumber("552096")
                .price(BigDecimal.valueOf(100L))
                .currency(CurrencyCode.TRY)
                .build();

        InstallmentListResponse installmentListResponse = tokenPay.installment().retrieveInstallments(request);
        System.out.println(String.format("Installment list response: %s", installmentListResponse));
    }
}
