package ar.edu.utn.frsf.isi.dan.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DanGatewayApplication
{
	public static void main(String[] args)
	{
		SpringApplication.run(DanGatewayApplication.class, args);
	}
}
