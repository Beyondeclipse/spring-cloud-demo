package io.bigbangbug.eureka.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaRibbonStoresClientApplication {
    public static void main(String[] args){
        SpringApplication.run(EurekaRibbonStoresClientApplication.class,args);
    }
}
