package tr.com.tokenpay.response;

import lombok.Data;
import tr.com.tokenpay.response.common.ListResponse;
import tr.com.tokenpay.response.dto.StoredCard;

@Data
public class StoredCardListResponse extends ListResponse<StoredCard> {

}
