package co.demo.dto.cd;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class PropertyHWItemItem{

	@JsonProperty("idParameter")
	private String idParameter;

	@JsonProperty("valueParameter")
	private Object valueParameter;

}
