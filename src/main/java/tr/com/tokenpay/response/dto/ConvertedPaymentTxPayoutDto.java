package tr.com.tokenpay.response.dto;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Currency;

@Data
@Builder
public class ConvertedPaymentTxPayoutDto {

    private BigDecimal paidPrice;
    private String currency;
    private BigDecimal merchantPayoutAmount;
    private BigDecimal subMerchantPayoutAmount;
    private BigDecimal pfConversionRate;
    private BigDecimal pfCommissionRateAmount;
    private BigDecimal pfConversionRateAmount;
}
