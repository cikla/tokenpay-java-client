package tr.com.tokenpay.request;

import lombok.Data;
import lombok.experimental.SuperBuilder;
import tr.com.tokenpay.model.CrossBookingTransactionStatus;
import tr.com.tokenpay.model.MerchantType;
import tr.com.tokenpay.request.common.BaseRequest;

@Data
@SuperBuilder
public class SearchCrossBookingRequest extends BaseRequest {

    private CrossBookingTransactionStatus transactionStatus;
    private Long sourceMerchantId;
    private Long destinationMerchantId;
    private MerchantType sourceMerchantType;
    private MerchantType destinationMerchantType;

    private Integer page = 0;
    private Integer size = 10;
}
