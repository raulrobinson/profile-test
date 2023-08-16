package co.demo.dto.sl;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class SSResponseDto {
    @JsonProperty("rspBodyGCD1Item")
    private Object rspBodyGSD1Item;
}
