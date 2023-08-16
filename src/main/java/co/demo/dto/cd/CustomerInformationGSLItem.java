package co.demo.dto.cd;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import java.util.List;

@Getter
public class CustomerInformationGSLItem{

	@JsonProperty("interactionStatusBusinessInteraction")
	private Object interactionStatusBusinessInteraction;

	@JsonProperty("IDCustomer")
	private String iDCustomer;

	@JsonProperty("nameCustomer")
	private String nameCustomer;

	@JsonProperty("customerRankCustomer")
	private Object customerRankCustomer;

	@JsonProperty("customerSegment")
	private String customerSegment;

	@JsonProperty("customerStatusTime")
	private String customerStatusTime;

	@JsonProperty("endDateTimeTimePeriod")
	private String endDateTimeTimePeriod;

	@JsonProperty("startDateTimeTimePeriod")
	private String startDateTimeTimePeriod;

	@JsonProperty("customerSubSegment")
	private String customerSubSegment;

	@JsonProperty("nameGSLItem")
	private Object nameGSLItem;

	@JsonProperty("propertyHWItem")
	private List<PropertyHWItemItem> propertyHWItem;

	@JsonProperty("statusCustomer")
	private String statusCustomer;
}
