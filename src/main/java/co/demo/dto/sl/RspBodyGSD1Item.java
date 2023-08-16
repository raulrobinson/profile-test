package co.demo.dto.sl;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class RspBodyGSD1Item {
    @JsonProperty("suscriberGDLItem")
    private Object suscriberGDLItem;
}
