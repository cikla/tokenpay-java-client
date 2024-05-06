package tr.com.tokenpay.response;

import lombok.Data;
import org.apache.commons.codec.binary.Base64;

@Data
public class InitThreeDSPaymentResponse {

    private String htmlContent;

    public String getDecodedHtmlContent() {
        return new String(Base64.decodeBase64(htmlContent));
    }
}
