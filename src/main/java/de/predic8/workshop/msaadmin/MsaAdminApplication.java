package de.predic8.workshop.msaadmin;

import de.codecentric.boot.admin.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@EnableAdminServer
@SpringBootApplication
public class MsaAdminApplication {
	public static void main(String[] args) {
		SpringApplication.run(MsaAdminApplication.class, args);
	}
}
