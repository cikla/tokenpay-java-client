package com.tokenpay.model;

import com.tokenpay.net.HttpClient;
import com.tokenpay.request.CreatePaymentRequest;
import com.tokenpay.request.RequestOptions;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
public class Payment {
    private Long id;

    public static Payment create(CreatePaymentRequest createPaymentRequest) {
        return create(createPaymentRequest, RequestOptions.getDefaultOptions());
    }

    public static Payment create(CreatePaymentRequest createPaymentRequest, RequestOptions options) {
        return HttpClient.post(options.getBaseUrl() + createPaymentRequest.getPath(),
                TokenPayResource.getHttpHeaders(createPaymentRequest,
                options), createPaymentRequest, Payment.class);
    }
}
