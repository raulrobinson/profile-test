package co.demo.client;

import co.demo.dto.infra.U3SResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "util-token-p", url = "${p.scale.url}")
public interface U3SPClient {

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<U3SResponse> getTP(@RequestParam(name = "channel") String channel,
                                                @RequestParam(name = "grant_type") String grantType,
                                                @RequestParam(name = "client_id") String clientId,
                                                @RequestParam(name = "client_secret") String clientSecret,
                                                @RequestParam(name = "scope") String scope);
}
