package tr.com.tokenpay.response;

import lombok.Data;

import java.util.List;

@Data
public class InstallmentListResponse {

    private List<InstallmentResponse> items;
}
