package co.demo.client;

import co.demo.dto.pqs.SPResponseDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(value = "util-pqs", url = "${pqs.url}")
public interface UPQSClient {

    @GetMapping(path = "/dni/{idType}/{idNumber}", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<SPResponseDto> getPQS(
            @RequestHeader HttpHeaders headers,
            @PathVariable String idType,
            @PathVariable String idNumber);
}
