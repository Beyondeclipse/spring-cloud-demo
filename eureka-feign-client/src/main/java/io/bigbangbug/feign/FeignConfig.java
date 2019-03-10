package io.bigbangbug.feign;

import feign.Retryer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static java.util.concurrent.TimeUnit.SECONDS;

/**
 * @author jackson.hou on 2019/3/11.
 */
@Configuration
public class FeignConfig {

	@Bean
	public Retryer feignRetryer(){
		return new Retryer.Default(100, SECONDS.toMillis(1),5);
	}
}
