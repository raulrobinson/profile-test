package co.demo.client;

import co.demo.dto.cd.SCustomerResponseDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(value = "util-cd", url = "${cd.url}")
public interface UCDClient {

    @GetMapping(path = "?idTypeNationalIdentityCardIdentification={idType}&passportNrPassportIdentification={idNumber}&APP_ID={appId}&APP_KEY={appKey}", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<SCustomerResponseDto> getCustomerDetail(@RequestHeader HttpHeaders httpHeaders,
                                                           @PathVariable String idType,
                                                           @PathVariable String idNumber,
                                                           @PathVariable String appId,
                                                           @PathVariable String appKey);
}
