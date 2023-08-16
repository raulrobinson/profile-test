package co.demo.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@Builder
public class ResponseDto{
	private ServiceResponse serviceResponse;
	private String message;
	private String timestamp;

	@JsonCreator
	public ResponseDto(@JsonProperty("serviceResponse") ServiceResponse serviceResponse,
					   @JsonProperty("message") String message,
					   @JsonProperty("timestamp") String timestamp) {
		this.message = message;
		this.timestamp = timestamp;
		this.serviceResponse = serviceResponse;
	}
}
