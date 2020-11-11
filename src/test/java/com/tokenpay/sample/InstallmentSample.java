package com.tokenpay.sample;

import com.tokenpay.TokenPay;
import com.tokenpay.model.CurrencyCode;
import com.tokenpay.request.BinCheckRequest;
import com.tokenpay.request.SearchInstallmentRequest;
import com.tokenpay.response.BinCheckResponse;
import com.tokenpay.response.InstallmentListResponse;
import org.junit.jupiter.api.Test;

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
