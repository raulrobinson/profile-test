package co.demo.dto.cd;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class CustomerAuxInfoItem{

	@JsonProperty("individualGSLItem")
	private IndividualGSLItem individualGSLItem;

	@JsonProperty("organizationGSLItem")
	private Object organizationGSLItem;

}
