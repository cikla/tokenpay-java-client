package tr.com.tokenpay.request;

import lombok.Builder;
import lombok.Data;
import lombok.experimental.SuperBuilder;
import tr.com.tokenpay.model.CrossBookingTransactionStatus;
import tr.com.tokenpay.model.MerchantType;
import tr.com.tokenpay.request.common.BaseRequest;

@Data
@SuperBuilder
public class SearchCrossBookingsRequest extends BaseRequest {

    private Long sourceMerchantId;
    private MerchantType sourceMerchantType;

    private Long destinationMerchantId;
    private MerchantType destinationMerchantType;

    private CrossBookingTransactionStatus transactionStatus;

    @Builder.Default
    private Integer page = 0;

    @Builder.Default
    private Integer size = 10;
}
