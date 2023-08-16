package co.demo.dto;

import lombok.*;

@Data
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ServiceResponse{
	private String idType;
	private String idHash;
	private int id;
	private String registryDate;
	private String idNumber;
}
