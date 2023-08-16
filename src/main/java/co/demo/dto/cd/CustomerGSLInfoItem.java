package co.demo.dto.cd;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import java.util.List;

@Getter
public class CustomerGSLInfoItem{

	@JsonProperty("customerGSLItem")
	private CustomerGSLItem customerGSLItem;

	@JsonProperty("contactInformationItem")
	private Object contactInformationItem;

	@JsonProperty("customerInformationGSLItem")
	private CustomerInformationGSLItem customerInformationGSLItem;

	@JsonProperty("customerAuxInfoItem")
	private CustomerAuxInfoItem customerAuxInfoItem;

	@JsonProperty("certificationHWItem")
	private List<CertificationHWItemItem> certificationHWItem;

	@JsonProperty("partyGSLItem")
	private List<PartyGSLItemItem> partyGSLItem;

}
