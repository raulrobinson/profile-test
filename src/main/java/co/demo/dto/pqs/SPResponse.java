package co.demo.dto.pqs;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class SPResponse {

	@JsonProperty("dniNumber")
	private String dniNumber;

	@JsonProperty("product")
	private String product;

	@JsonProperty("serviceNumber")
	private String serviceNumber;

	@JsonProperty("clientId")
	private String clientId;

	@JsonProperty("paymentReference")
	private String paymentReference;

	@JsonProperty("namePlan")
	private String namePlan;

	@JsonProperty("dniType")
	private String dniType;

	@JsonProperty("accountId")
	private String accountId;

	@JsonProperty("codePlan")
	private String codePlan;

	@JsonProperty("productType")
	private String productType;

	@JsonProperty("email")
	private String email;

	@JsonProperty("status")
	private String status;

	@JsonProperty("digitalInvoice")
	private String digitalInvoice;

}
