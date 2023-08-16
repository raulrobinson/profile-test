package co.demo.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(value = "util-sl", url = "${sl.url}")
public interface USLClient {

    @GetMapping(path = "?IDCustomer={idCustomer}&APP_ID={appId}&APP_KEY={appKey}", produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<Object> getSubscriberList(@RequestHeader HttpHeaders httpHeaders,
                                                             @PathVariable String idCustomer,
                                                             @PathVariable String appId,
                                                             @PathVariable String appKey);
}
