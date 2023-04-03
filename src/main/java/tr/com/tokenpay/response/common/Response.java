package tr.com.tokenpay.response.common;

import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Response {

    @Expose
    private ErrorResponse errors;
    @Expose
    private JsonObject data;
}
