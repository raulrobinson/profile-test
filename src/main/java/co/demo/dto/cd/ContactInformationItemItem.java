package co.demo.dto.cd;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class ContactInformationItemItem{

	@JsonProperty("idParameter")
	private Object idParameter;

	@JsonProperty("IDCustomer")
	private Object iDCustomer;

	@JsonProperty("nameCustomer")
	private Object nameCustomer;
}
