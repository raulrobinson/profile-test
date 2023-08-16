package co.demo.dto.cd;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import java.util.List;

@Getter
public class IndividualGSLItem{

	@JsonProperty("partyIdParty")
	private String partyIdParty;

	@JsonProperty("birthday")
	private String birthday;

	@JsonProperty("genderIndividual")
	private String genderIndividual;

	@JsonProperty("education")
	private Object education;

	@JsonProperty("occupation")
	private Object occupation;

	@JsonProperty("race")
	private Object race;

	@JsonProperty("passportNrPassportIdentification")
	private Object passportNrPassportIdentification;

	@JsonProperty("endDateTimeTimePeriod")
	private String endDateTimeTimePeriod;

	@JsonProperty("startDateTimeTimePeriod")
	private String startDateTimeTimePeriod;

	@JsonProperty("idTypeNationalIdentityCardIdentification")
	private Object idTypeNationalIdentityCardIdentification;

	@JsonProperty("salary")
	private Object salary;

	@JsonProperty("religion")
	private Object religion;

	@JsonProperty("formOfAddressIndividualName")
	private Object formOfAddressIndividualName;

	@JsonProperty("nameGSDItem")
	private NameGSDItem nameGSDItem;

	@JsonProperty("nationalityIndividual")
	private Object nationalityIndividual;

	@JsonProperty("maritalStatusIndividual")
	private String maritalStatusIndividual;

	@JsonProperty("LanguageHWItem")
	private Object languageHWItem;

	@JsonProperty("propertyHWItem")
	private List<Object> propertyHWItem;

	@JsonProperty("position")
	private Object position;

}
