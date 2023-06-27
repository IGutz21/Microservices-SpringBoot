package edu.pe.servicio.producto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class UtpServicioProductosApplication {

	public static void main(String[] args) {
		SpringApplication.run(UtpServicioProductosApplication.class, args);
	}

}
