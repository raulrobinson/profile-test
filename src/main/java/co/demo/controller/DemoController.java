package co.demo.controller;

import co.demo.client.U3SDClient;
import co.demo.client.U3SPClient;
import co.demo.client.UPQSClient;
import co.demo.dto.infra.U3SDParams;
import co.demo.dto.infra.U3SPParams;
import co.demo.dto.infra.U3SResponseDto;
import co.demo.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;

@RestController
@RequestMapping("/api")
public class DemoController {

    @Value("${header.pqs.execId}")
    private String execId;
    private final U3SDClient dClient;
    private final U3SPClient pClient;
    private final U3SDParams dParam;
    private final U3SPParams pParam;
    private final UPQSClient pqsClient;

    @Autowired
    public DemoController(U3SDClient dClient, U3SPClient pClient, U3SDParams dParam, U3SPParams pParam, UPQSClient pqsClient) {
        this.dClient = dClient;
        this.pClient = pClient;
        this.dParam = dParam;
        this.pParam = pParam;
        this.pqsClient = pqsClient;
    }

    @PostMapping("/pqs")
    public ResponseEntity<?> getPQS(@RequestParam(name = "idType") String idType,
                                    @RequestParam(name = "idNumber") String idNumber) {
        var headers = new HttpHeaders();
        headers.add(Constants.SYSTEM, "system");
        headers.add(Constants.OPERATION, "operation");
        headers.add(Constants.EXEC, execId);
        headers.add(Constants.MSG_TYPE, "request");
        headers.add(Constants.AUTHORIZATION, "authorization");//Constants.BEARER + Objects.requireNonNull(getTD().getBody()).getToken());
        var require = pqsClient.getPQS(headers, idType, idNumber);
        if (require.getStatusCode().is5xxServerError()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(require.getBody(), HttpStatus.OK);
    }

    @GetMapping("/getTD")
    public ResponseEntity<U3SResponseDto> getTD() {
        var require = dClient.getTD(dParam.getChannel(), dParam.getGrantType(), dParam.getClientId(), dParam.getClientSecret(), dParam.getScope());
        if (require.getStatusCode().is2xxSuccessful()) {
            return new ResponseEntity<>(U3SResponseDto.builder()
                    .token(Objects.requireNonNull(require.getBody()).getAccessToken())
                    .expiresIn(Objects.requireNonNull(require.getBody()).getExpiresIn())
                    .build(), HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.SERVICE_UNAVAILABLE);
    }

    @GetMapping("/getTP")
    public ResponseEntity<U3SResponseDto> getTP() {
        var require = pClient.getTP(pParam.getChannel(), pParam.getGrantType(), pParam.getClientId(), pParam.getClientSecret(), pParam.getScope());
        if (require.getStatusCode().is2xxSuccessful()) {
            return new ResponseEntity<>(U3SResponseDto.builder()
                    .token(Objects.requireNonNull(require.getBody()).getAccessToken())
                    .expiresIn(Objects.requireNonNull(require.getBody()).getExpiresIn())
                    .build(), HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.SERVICE_UNAVAILABLE);
    }
}
