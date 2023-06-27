package edu.pe.servicio.producto.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import edu.pe.servicio.producto.models.entities.Producto;
import edu.pe.servicio.producto.services.IProductoService;

@RestController
public class ProductoController {

	@Autowired
	private IProductoService productoService;

	@ResponseStatus(HttpStatus.OK)
	@GetMapping("/productos")
	public List<Producto> Listar() {
		return productoService.findAll();
	}

	
	@ResponseStatus(HttpStatus.OK)
	@GetMapping("/ver/{id}")
	public Producto BuscarProducto(@PathVariable Long id) {
		return productoService.findById(id);
	}
	
	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping("/productos")
	public Producto Agregar(@RequestBody Producto producto) {
		return productoService.save(producto);
	}
	
	@PutMapping("/productos/{id}")
	public Producto Modificar(@PathVariable("id") Long id, @RequestBody Producto producto) {
		return productoService.update(id, producto);
	}
	
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@DeleteMapping("/productos/{id}")
	public void Eliminar(@PathVariable("id") Long id) {
		productoService.delete(id);
	}

}
