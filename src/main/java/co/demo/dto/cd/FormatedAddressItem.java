package co.demo.dto.cd;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class FormatedAddressItem{

	@JsonProperty("formattedRespAddressSubsidy")
	private String formattedRespAddressSubsidy;

	@JsonProperty("formattedRespAddress")
	private String formattedRespAddress;

	@JsonProperty("formattedRespSplitAddress")
	private String formattedRespSplitAddress;

	@JsonProperty("streetViaSuffix")
	private String streetViaSuffix;

	@JsonProperty("townIdGeographicAddress")
	private String townIdGeographicAddress;

	@JsonProperty("stateOrProvinceGeographicAddress")
	private String stateOrProvinceGeographicAddress;

	@JsonProperty("suburbNameGeographicAddress")
	private String suburbNameGeographicAddress;

	@JsonProperty("nameCountry")
	private String nameCountry;

	@JsonProperty("formattedSubAddress")
	private String formattedSubAddress;

	@JsonProperty("suburbRespCodeGeographicAddress")
	private String suburbRespCodeGeographicAddress;

	@JsonProperty("localityUrbanPropertyAddress")
	private String localityUrbanPropertyAddress;

	@JsonProperty("formattedRespGeoAddress")
	private String formattedRespGeoAddress;
}
