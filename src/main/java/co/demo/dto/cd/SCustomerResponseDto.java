package co.demo.dto.cd;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class SCustomerResponseDto{

	@JsonProperty("rspBodyGCD1Item")
	private RspBodyGCD1Item rspBodyGCD1Item;

}
