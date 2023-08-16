package co.demo.dto.infra;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class U3SResponseDto {
	private int expiresIn;
	private String token;
}
