package io.bigbangbug.feign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jackson.hou on 2019/3/11.
 */
@RestController
public class HiController {

	@Autowired
	HiService hiService;

	@GetMapping("/hi")
	public String sayHi(@RequestParam(defaultValue="forezp", required=false) String name){
		return hiService.syaHi(name);
	}
}
