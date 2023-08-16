package co.demo.dto.infra;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Setter
@Getter
@ToString
@NoArgsConstructor
@Configuration
@ConfigurationProperties(prefix = "p.scale")
public class U3SPParams {
    private String clientId;
    private String clientSecret;
    private String grantType;
    private String scope;
    private String channel;
    private String url;
}
