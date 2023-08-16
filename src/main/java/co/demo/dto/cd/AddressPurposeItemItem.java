package co.demo.dto.cd;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class AddressPurposeItemItem{

	@JsonProperty("idCodOpGeographicAddress")
	private String idCodOpGeographicAddress;

	@JsonProperty("secondReqFlag")
	private Object secondReqFlag;

}
