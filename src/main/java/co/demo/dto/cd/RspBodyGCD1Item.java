package co.demo.dto.cd;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class RspBodyGCD1Item{

	@JsonProperty("customerGSLInfoItem")
	private CustomerGSLInfoItem customerGSLInfoItem;

}
