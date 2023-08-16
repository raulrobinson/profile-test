package co.demo.dto.cd;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import java.util.List;

@Getter
public class CustomerGSLItem{

	@JsonProperty("formOfAddressIndividualName")
	private Object formOfAddressIndividualName;

	@JsonProperty("nameGSDItem")
	private NameGSDItem nameGSDItem;

	@JsonProperty("contactInformationItem")
	private List<ContactInformationItemItem> contactInformationItem;

	@JsonProperty("IDCustomer")
	private String iDCustomer;

	@JsonProperty("nameCustomer")
	private String nameCustomer;
}
