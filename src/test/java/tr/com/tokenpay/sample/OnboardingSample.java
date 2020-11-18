package tr.com.tokenpay.sample;

import org.junit.jupiter.api.Test;
import tr.com.tokenpay.TokenPay;
import tr.com.tokenpay.model.SubMerchantType;
import tr.com.tokenpay.request.*;
import tr.com.tokenpay.response.BuyerResponse;
import tr.com.tokenpay.response.SubMerchantListResponse;
import tr.com.tokenpay.response.SubMerchantResponse;

import java.util.HashSet;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

public class OnboardingSample {

    private final TokenPay tokenPay = new TokenPay("api-key", "secret-key", "http://localhost:8000");

    @Test
    void create_sub_merchant_sample() {
        CreateSubMerchantRequest request = CreateSubMerchantRequest.builder()
                .contactName("Haluk")
                .contactSurname("Demir")
                .email("haluk.demir@example.com")
                .gsmNumber("905551111111")
                .iban("TR930006701000000001111111")
                .identityNumber("11111111110")
                .legalCompanyTitle("Dem Zeytinyağı Üretim Ltd. Şti.")
                .name("Dem Zeytinyağı Üretim Ltd. Şti.")
                .subMerchantExternalId(UUID.randomUUID().toString())
                .subMerchantType(SubMerchantType.LIMITED_OR_JOINT_STOCK_COMPANY)
                .taxNumber("1111111114")
                .taxOffice("Erenköy")
                .address("Suadiye Mah. Örnek Cd. No:23, 34740 Kadıköy/İstanbul")
                .build();

        SubMerchantResponse subMerchantResponse = tokenPay.onboarding().createSubMerchant(request);
        assertNotNull(subMerchantResponse.getId());
        assertEquals(request.getContactName(), subMerchantResponse.getContactName());
        assertEquals(request.getContactSurname(), subMerchantResponse.getContactSurname());
        assertEquals(request.getEmail(), subMerchantResponse.getEmail());
        assertEquals(request.getGsmNumber(), subMerchantResponse.getGsmNumber());
        assertEquals(request.getIban(), subMerchantResponse.getIban());
        assertEquals(request.getIdentityNumber(), subMerchantResponse.getIdentityNumber());
        assertEquals(request.getLegalCompanyTitle(), subMerchantResponse.getLegalCompanyTitle());
        assertEquals(request.getName(), subMerchantResponse.getName());
        assertEquals(request.getSubMerchantExternalId(), subMerchantResponse.getSubMerchantExternalId());
        assertEquals(request.getSubMerchantType(), subMerchantResponse.getSubMerchantType());
        assertEquals(request.getTaxNumber(), subMerchantResponse.getTaxNumber());
        assertEquals(request.getTaxOffice(), subMerchantResponse.getTaxOffice());
        assertEquals(request.getAddress(), subMerchantResponse.getAddress());
    }

    @Test
    void update_sub_merchant_sample() {
        Long subMerchantId = 1L;

        UpdateSubMerchantRequest request = UpdateSubMerchantRequest.builder()
                .contactName("Haluk")
                .contactSurname("Demir")
                .email("haluk.demir@example.com")
                .gsmNumber("905551111111")
                .iban("TR930006701000000001111111")
                .identityNumber("11111111110")
                .legalCompanyTitle("Dem Zeytinyağı Üretim Ltd. Şti.")
                .name("Dem Zeytinyağı Üretim Ltd. Şti.")
                .taxNumber("1111111114")
                .taxOffice("Erenköy")
                .address("Suadiye Mah. Örnek Cd. No:23, 34740 Kadıköy/İstanbul")
                .build();

        SubMerchantResponse subMerchantResponse = tokenPay.onboarding().updateSubMerchant(subMerchantId, request);
        assertEquals(subMerchantId, subMerchantResponse.getId());
        assertEquals(request.getContactName(), subMerchantResponse.getContactName());
        assertEquals(request.getContactSurname(), subMerchantResponse.getContactSurname());
        assertEquals(request.getEmail(), subMerchantResponse.getEmail());
        assertEquals(request.getGsmNumber(), subMerchantResponse.getGsmNumber());
        assertEquals(request.getIban(), subMerchantResponse.getIban());
        assertEquals(request.getIdentityNumber(), subMerchantResponse.getIdentityNumber());
        assertEquals(request.getLegalCompanyTitle(), subMerchantResponse.getLegalCompanyTitle());
        assertEquals(request.getName(), subMerchantResponse.getName());
        assertEquals(request.getTaxNumber(), subMerchantResponse.getTaxNumber());
        assertEquals(request.getTaxOffice(), subMerchantResponse.getTaxOffice());
        assertEquals(request.getAddress(), subMerchantResponse.getAddress());
    }

    @Test
    void retrieve_sub_merchant_sample() {
        Long subMerchantId = 1L;

        SubMerchantResponse subMerchantResponse = tokenPay.onboarding().retrieveSubMerchant(subMerchantId);
        assertEquals(subMerchantId, subMerchantResponse.getId());
    }

    @Test
    void search_sub_merchant_sample() {
        HashSet<Long> subMerchantIds = new HashSet<Long>() {{
            add(1L);
            add(2L);
        }};

        SearchSubMerchantsRequest request = SearchSubMerchantsRequest.builder()
                .subMerchantIds(subMerchantIds)
                .name("Zeytinyağı Üretim")
                .build();

        SubMerchantListResponse subMerchantListResponse = tokenPay.onboarding().searchSubMerchants(request);
        assertTrue(subMerchantListResponse.getItems().size() > 0);
    }

    @Test
    void create_buyer_sample() {
        CreateBuyerRequest request = CreateBuyerRequest.builder()
                .buyerExternalId(UUID.randomUUID().toString())
                .email("haluk.demir@example.com")
                .gsmNumber("905551111111")
                .name("Haluk")
                .surname("Demir")
                .identityNumber("11111111110")
                .build();

        BuyerResponse buyerResponse = tokenPay.onboarding().createBuyer(request);
        assertNotNull(buyerResponse.getId());
        assertEquals(request.getBuyerExternalId(), buyerResponse.getBuyerExternalId());
        assertEquals(request.getEmail(), buyerResponse.getEmail());
        assertEquals(request.getGsmNumber(), buyerResponse.getGsmNumber());
        assertEquals(request.getName(), buyerResponse.getName());
        assertEquals(request.getSurname(), buyerResponse.getSurname());
        assertEquals(request.getIdentityNumber(), buyerResponse.getIdentityNumber());
    }

    @Test
    void update_buyer_sample() {
        Long buyerId = 1L;

        UpdateBuyerRequest request = UpdateBuyerRequest.builder()
                .email("haluk.demir@example.com")
                .gsmNumber("905551111111")
                .name("Haluk")
                .surname("Demir")
                .identityNumber("11111111110")
                .build();

        BuyerResponse buyerResponse = tokenPay.onboarding().updateBuyer(buyerId, request);
        assertEquals(buyerId, buyerResponse.getId());
        assertEquals(request.getEmail(), buyerResponse.getEmail());
        assertEquals(request.getGsmNumber(), buyerResponse.getGsmNumber());
        assertEquals(request.getName(), buyerResponse.getName());
        assertEquals(request.getSurname(), buyerResponse.getSurname());
        assertEquals(request.getIdentityNumber(), buyerResponse.getIdentityNumber());
    }

    @Test
    void retrieve_buyer_sample() {
        Long buyerId = 1L;

        BuyerResponse buyerResponse = tokenPay.onboarding().retrieveBuyer(buyerId);
        assertEquals(buyerId, buyerResponse.getId());
    }
}