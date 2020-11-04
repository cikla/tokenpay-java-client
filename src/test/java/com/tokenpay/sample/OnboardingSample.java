package com.tokenpay.sample;

import com.tokenpay.TokenPay;
import com.tokenpay.model.SubMerchantType;
import com.tokenpay.request.CreateSubMerchantRequest;
import com.tokenpay.request.RetrieveSubMerchantRequest;
import com.tokenpay.request.SearchSubMerchantRequest;
import com.tokenpay.request.UpdateSubMerchantRequest;
import com.tokenpay.response.SubMerchantListResponse;
import com.tokenpay.response.SubMerchantResponse;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class OnboardingSample {
    private final TokenPay tokenPay = new TokenPay("api-key", "secret-key", "http://localhost:8000");

    @Test
    void create_sub_merchant_sample() {
        CreateSubMerchantRequest request = CreateSubMerchantRequest.builder()
                .gsmNumber("905555555555")
                .email("sample.submerchant@tokenpay.com.tr")
                .identityNumber("00000000000")
                .name("sample sub merchant name")
                .iban("TR330006100519786457841326")
                .address("sample sub merchant address")
                .subMerchantType(SubMerchantType.PERSONAL)
                .contactName("sample sub merchant contactName")
                .contactSurname("sample sub merchant contactSurname")
                .subMerchantExternalId("sampleSubMerchantSubMerchantExternalId")
                .build();

        SubMerchantResponse subMerchantResponse = tokenPay.onboarding().createSubMerchant(request);
        System.out.println(String.format("Create sub merchant response: %s", subMerchantResponse));
    }

    @Test
    void update_sub_merchant_sample() {
        UpdateSubMerchantRequest request = UpdateSubMerchantRequest.builder()
                .id(7L)
                .gsmNumber("905555555555")
                .email("sample.submerchant@tokenpay.com.tr")
                .identityNumber("00000000000")
                .name("sample sub merchant name")
                .iban("TR330006100519786457841326")
                .address("sample sub merchant address")
                .contactName("sample sub merchant contactName")
                .contactSurname("sample sub merchant contactSurname")
                .build();

        SubMerchantResponse subMerchantResponse = tokenPay.onboarding().updateSubMerchant(request);
        System.out.println(String.format("Update sub merchant response: %s", subMerchantResponse));
    }

    @Test
    void retrieve_sub_merchant_sample() {
        RetrieveSubMerchantRequest request = RetrieveSubMerchantRequest.builder()
                .id(1L)
                .build();

        SubMerchantResponse subMerchantResponse = tokenPay.onboarding().retrieveSubMerchant(request);
        System.out.println(String.format("Retrieve sub merchant response: %s", subMerchantResponse));
    }

    @Test
    void search_sub_merchant_sample() {
        List<Long> subMerchantIds = Arrays.asList(1L, 7L);

        SearchSubMerchantRequest request = SearchSubMerchantRequest.builder()
                .subMerchantIds(subMerchantIds)
                .subMerchantType(SubMerchantType.PERSONAL)
                .build();

        SubMerchantListResponse subMerchantListResponse = tokenPay.onboarding().searchSubMerchant(request);
        System.out.println(String.format("Search sub merchant response: %s", subMerchantListResponse));
    }

}
