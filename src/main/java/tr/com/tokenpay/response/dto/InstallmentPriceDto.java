package tr.com.tokenpay.response.dto;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class InstallmentPriceDto {

    private Integer installmentNumber;
    private BigDecimal installmentPrice;
    private BigDecimal totalPrice;
}
