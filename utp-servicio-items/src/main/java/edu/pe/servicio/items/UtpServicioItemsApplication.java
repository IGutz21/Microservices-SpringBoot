package edu.pe.servicio.items;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication

public class UtpServicioItemsApplication {

	public static void main(String[] args) {
		SpringApplication.run(UtpServicioItemsApplication.class, args);
	}

}
