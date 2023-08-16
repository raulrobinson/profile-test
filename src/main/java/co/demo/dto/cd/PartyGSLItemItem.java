package co.demo.dto.cd;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import java.util.List;

@Getter
public class PartyGSLItemItem{

	@JsonProperty("postalCodeAddress")
	private Object postalCodeAddress;

	@JsonProperty("formattedRespAddress")
	private String formattedRespAddress;

	@JsonProperty("addressInformationItem")
	private AddressInformationItem addressInformationItem;

	@JsonProperty("addressPurposeItem")
	private List<AddressPurposeItemItem> addressPurposeItem;

}
