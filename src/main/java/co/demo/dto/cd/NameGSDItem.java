package co.demo.dto.cd;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class NameGSDItem{

	@JsonProperty("secondLastNameCustomer")
	private Object secondLastNameCustomer;

	@JsonProperty("firstNameCustomer")
	private String firstNameCustomer;

	@JsonProperty("lastNameCustomer")
	private String lastNameCustomer;

	@JsonProperty("middleNameCustomer")
	private Object middleNameCustomer;

}
