package io.bigbangbug.feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author jackson.hou on 2019/3/11.
 */
@Service
public class HiService {

	@Autowired
	EurekaClientFeign eurekaClientFeign;

	public String syaHi(String name){
		return eurekaClientFeign.sayHiFromClientEureka(name);
	}
}
