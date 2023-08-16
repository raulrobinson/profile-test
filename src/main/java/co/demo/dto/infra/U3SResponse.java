package co.demo.dto.infra;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class U3SResponse {

	@JsonProperty("access_token")
	private String accessToken;

	@JsonProperty("refresh_token")
	private String refreshToken;

	@JsonProperty("refresh_expires_in")
	private int refreshExpiresIn;

	@JsonProperty("not-before-policy")
	private int notBeforePolicy;

	@JsonProperty("scope")
	private String scope;

	@JsonProperty("token_type")
	private String tokenType;

	@JsonProperty("session_state")
	private String sessionState;

	@JsonProperty("expires_in")
	private int expiresIn;

}
