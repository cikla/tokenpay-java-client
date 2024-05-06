package tr.com.tokenpay.unit;

import org.junit.jupiter.api.Test;
import tr.com.tokenpay.request.CreateBuyerRequest;
import tr.com.tokenpay.request.common.HashGenerator;

import org.apache.commons.codec.binary.Base64;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HashGeneratorTest {

    @Test
    void should_generate_hash() {
        //given
        String expectedSignature = "JaiELeQK7vZ4lJDb9uOWYVIYAm0h5dwJgFjDc5eV4Y4=";
        CreateBuyerRequest request = CreateBuyerRequest.builder()
                .buyerExternalId("ext-1511")
                .email("haluk.demir@example.com")
                .gsmNumber("905551111111")
                .name("Haluk")
                .surname("Demir")
                .identityNumber("11111111110")
                .build();

        //when
        String signature = HashGenerator.generateHash("http://api-gateway.tokenpay.com.tr", "api-key", "secret-key",
                "rand-2010", request, "/onboarding/v1/buyers");

        //then
        assertEquals(expectedSignature, signature);
    }

    @Test
    void should_generate_hash_when_request_body_null() {
        //given
        String expectedSignature = "yRf3Cblvjp9tfHtR9NWSmZpV91HibpzXJt88ndEWxik=";

        //when
        String signature = HashGenerator.generateHash("http://api-gateway.tokenpay.com.tr", "api-key", "secret-key",
                "rand-2010", null, "/onboarding/v1/buyers");

        //then
        assertEquals(expectedSignature, signature);
    }

}
