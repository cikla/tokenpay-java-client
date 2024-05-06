package tr.com.tokenpay.response.dto;

import lombok.Builder;
import lombok.Data;
import tr.com.tokenpay.model.Currency;

import java.math.BigDecimal;

@Data
@Builder
public class Payout {

    private BigDecimal paidPrice;
    private Currency currency;
    private BigDecimal merchantPayoutAmount;
    private BigDecimal subMerchantPayoutAmount;
    private BigDecimal pfConversionRate;
    private BigDecimal pfCommissionRateAmount;
    private BigDecimal pfConversionRateAmount;
}
