package tr.com.tokenpay.request;

import lombok.Data;
import lombok.experimental.SuperBuilder;
import tr.com.tokenpay.request.common.BaseRequest;

@Data
@SuperBuilder
public class CompleteThreeDSRequest extends BaseRequest {

    private Long paymentId;

    private String conversationData;
}
