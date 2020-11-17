package tr.com.tokenpay.response.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ErrorDto {

    private String errorCode;
    private String errorName;
    private String errorGroup;
    private String errorMessage;
}
