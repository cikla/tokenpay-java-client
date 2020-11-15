package tr.com.tokenpay.response.dto;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class ConvertedPaymentTxPayoutDto {

    private BigDecimal paidPrice;
    private String currency;
    private BigDecimal merchantPayoutAmount;
    private BigDecimal subMerchantPayoutAmount;
    private BigDecimal pfCommissionRateAmount;
    private BigDecimal pfConversionRateAmount;
}
