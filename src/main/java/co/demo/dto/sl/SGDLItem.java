package co.demo.dto.sl;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class SGDLItem {
    @JsonProperty("subscriberInformationItem")
    private Object subscriberInformationItem;

    @JsonProperty("primaryOfferingItem")
    private Object primaryOfferingItem;

    @JsonProperty("supplementaryOfferingItem")
    private Object supplementaryOfferingItem;
}
