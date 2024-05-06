package tr.com.tokenpay.request;

import lombok.Builder;
import lombok.Data;
import tr.com.tokenpay.request.common.Request;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Builder
public class CreateLinkRequest implements Request {

    private String name;
    private String description;
    private BigDecimal price;
    private Integer stock;
    private LocalDateTime expireDate;
    private String enabledInstallments;
}