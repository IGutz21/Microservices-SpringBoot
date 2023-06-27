package edu.pe.servicio.items.clientes;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import edu.pe.servicio.items.models.entities.Producto;

@FeignClient(name = "servicio-productos",url = "localhost:8001")
public interface ProductoClienteRest {
	
	@GetMapping("/productos")
	public List<Producto> Listar();
	
	@GetMapping("/ver/{id}")
	public Producto BuscarProducto(@PathVariable Long id);
}
