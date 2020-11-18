package tr.com.tokenpay.response;

import lombok.Data;
import tr.com.tokenpay.response.dto.Installment;

import java.util.List;

@Data
public class InstallmentListResponse {

    private List<Installment> items;
}
