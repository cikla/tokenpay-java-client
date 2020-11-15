package tr.com.tokenpay.request.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.math.BigDecimal;

@Getter
@Builder
@AllArgsConstructor
@RequiredArgsConstructor
public class CreatePaymentItemDto {

    private String externalId;

    private String name;

    private BigDecimal price;

    private Long subMerchantId;

    private BigDecimal subMerchantPrice;
}
