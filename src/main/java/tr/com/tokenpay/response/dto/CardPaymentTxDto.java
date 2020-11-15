package tr.com.tokenpay.response.dto;

import lombok.Builder;
import lombok.Data;
import tr.com.tokenpay.model.TransactionStatus;

import java.math.BigDecimal;
import java.util.Date;

@Data
@Builder
public class CardPaymentTxDto {

    private Long id;
    private String externalId;
    private String name;
    private BigDecimal price;
    private BigDecimal paidPrice;
    private BigDecimal walletPrice;
    private BigDecimal merchantCommissionRate;
    private BigDecimal merchantCommissionRateAmount;
    private BigDecimal merchantPayoutAmount;
    private Long subMerchantId;
    private BigDecimal subMerchantPrice;
    private BigDecimal subMerchantPayoutRate;
    private BigDecimal subMerchantPayoutAmount;
    private BigDecimal pfCommissionRateAmount;
    private TransactionStatus transactionStatus;
    private Date blockageResolvedDate;
    private ConvertedPaymentTxPayoutDto convertedPayout;
}
