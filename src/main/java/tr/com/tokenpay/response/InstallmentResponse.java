package tr.com.tokenpay.response;

import lombok.Data;
import tr.com.tokenpay.model.CardAssociation;
import tr.com.tokenpay.model.CardType;
import tr.com.tokenpay.response.dto.InstallmentPriceDto;

import java.math.BigDecimal;
import java.util.List;

@Data
public class InstallmentResponse {

    private String binNumber;
    private BigDecimal price;
    private CardType cardType;
    private CardAssociation cardAssociation;
    private String cardBrand;
    private String bankName;
    private Long bankCode;
    private Boolean force3ds;
    private Boolean commercial;
    private List<InstallmentPriceDto> installmentPrices;
}
