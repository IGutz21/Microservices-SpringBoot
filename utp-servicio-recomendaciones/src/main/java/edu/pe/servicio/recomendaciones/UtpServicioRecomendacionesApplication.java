package edu.pe.servicio.recomendaciones;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class UtpServicioRecomendacionesApplication {

	public static void main(String[] args) {
		SpringApplication.run(UtpServicioRecomendacionesApplication.class, args);
	}

}
