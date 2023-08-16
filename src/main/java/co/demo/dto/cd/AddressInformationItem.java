package co.demo.dto.cd;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class AddressInformationItem{

	@JsonProperty("formattedRespSplitAddress")
	private Object formattedRespSplitAddress;

	@JsonProperty("formatedAddressItem")
	private FormatedAddressItem formatedAddressItem;

}
