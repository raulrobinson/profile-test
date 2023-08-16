package co.demo.dto.pqs;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class SPResponseDto {

	@JsonProperty("code")
	private String code;

	@JsonProperty("serviceResponse")
	private List<SPResponse> serviceResponse;

	@JsonProperty("type")
	private String type;

	@JsonProperty("message")
	private String message;

	public String getCode(){
		return code;
	}

	public List<SPResponse> getServiceResponse(){
		return serviceResponse;
	}

	public String getType(){
		return type;
	}

	public String getMessage(){
		return message;
	}
}
