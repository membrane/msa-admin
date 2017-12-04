package de.predic8.workshop.msaadmin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDiscoveryClient
@EnableAdminServer
@SpringBootApplication
public class MsaAdminApplication {
	public static void main(String[] args) {
		SpringApplication.run(MsaAdminApplication.class, args);
	}
}
