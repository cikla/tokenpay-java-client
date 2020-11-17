package tr.com.tokenpay.request;

import lombok.Builder;
import lombok.Data;
import lombok.experimental.SuperBuilder;
import tr.com.tokenpay.model.CurrencyCode;
import tr.com.tokenpay.model.PaymentStatus;
import tr.com.tokenpay.request.common.BaseRequest;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;


@Data
@SuperBuilder
public class SearchPaymentRequest extends BaseRequest {

    @Builder.Default
    private Integer page = 0;

    @Builder.Default
    private Integer size = 10;

    private List<Long> paymentIds;
    private List<Long> paymentTxIds;
    private List<Long> subMerchantIds;
    private List<String> itemExternalIds;
    private PaymentStatus paymentStatus;

    private CurrencyCode currency;
    private String binNumber;
    private String lastFourDigits;

    private BigDecimal minPrice;
    private BigDecimal minPaidPrice;
    private BigDecimal maxPrice;
    private BigDecimal maxPaidPrice;

    private Integer installment;
    private String conversationId;
    private Boolean isThreeDS;
    private LocalDateTime minCreatedDate;
    private LocalDateTime maxCreatedDate;
}
