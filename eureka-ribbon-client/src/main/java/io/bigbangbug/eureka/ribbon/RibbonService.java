package io.bigbangbug.eureka.ribbon;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RibbonService {

    @Autowired
    RestTemplate restTemplate;

	@HystrixCommand(fallbackMethod = "hiError")
    public String hi(String name){
        return restTemplate.getForObject("http://eureka-client/hi?name="+name,String.class);
    }

    // 必须和 hi 方法入参一样
    public String hiError(String name){
		return "hi," + name + ", sorry, error!";
	}
}
