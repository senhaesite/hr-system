package br.com.cylon.payrollapi;

import com.netflix.discovery.EurekaClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
//@EnableDiscoveryClient //if it has spring-cloud-starter-netflix-eureka-client depency, this annotation is not necessary
public class PayrollApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PayrollApiApplication.class, args);
	}

}
