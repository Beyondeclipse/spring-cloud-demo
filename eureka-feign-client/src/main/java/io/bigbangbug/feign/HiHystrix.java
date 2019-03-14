package io.bigbangbug.feign;

import org.springframework.stereotype.Component;

/**
 * 熔断器Hystrix fallback函数
 * @author jackson.hou on 2019/3/15.
 */
@Component
public class HiHystrix implements EurekaClientFeign {

	@Override
	public String sayHiFromClientEureka(String name) {
		return "hi, "+name+", sorry, error(Feign)!";
	}
}
