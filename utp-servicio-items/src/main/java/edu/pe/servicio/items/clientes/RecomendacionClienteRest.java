package edu.pe.servicio.items.clientes;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import edu.pe.servicio.items.models.entities.Recomendacion;

@FeignClient(name = "servicio-recomendaciones", url="localhost:8003")
public interface RecomendacionClienteRest {
	@GetMapping("/recomendaciones")
	public List<Recomendacion> Listar();
	
	@GetMapping("/ver/{id}")
	public Recomendacion BuscarRecomendacion(@PathVariable Long id);
}
