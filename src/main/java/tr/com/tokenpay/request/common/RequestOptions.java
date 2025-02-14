package tr.com.tokenpay.request.common;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RequestOptions {

    private String apiKey;
    private String secretKey;
    private String baseUrl;
}
