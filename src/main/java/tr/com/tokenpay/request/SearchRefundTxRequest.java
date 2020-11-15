package tr.com.tokenpay.request;

import lombok.Data;
import lombok.experimental.SuperBuilder;
import tr.com.tokenpay.request.common.BaseRequest;


@Data
@SuperBuilder
public class SearchRefundTxRequest extends BaseRequest {

    private Long paymentId;
    private String conversationId;
    private Long paymentTransactionId;
}
