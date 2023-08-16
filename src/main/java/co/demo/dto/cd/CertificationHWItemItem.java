package co.demo.dto.cd;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class CertificationHWItemItem{

	@JsonProperty("certificationAuthority")
	private Object certificationAuthority;

	@JsonProperty("idType")
	private String idType;

	@JsonProperty("validIdCustomerIdentification")
	private Object validIdCustomerIdentification;

	@JsonProperty("passportNrPassportIdentification")
	private String passportNrPassportIdentification;

	@JsonProperty("endDateTimeTimePeriod")
	private String endDateTimeTimePeriod;

	@JsonProperty("startDateTimeTimePeriod")
	private String startDateTimeTimePeriod;

	@JsonProperty("idTypeNationalIdentityCardIdentification")
	private String idTypeNationalIdentityCardIdentification;

}
