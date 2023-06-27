package edu.pe.servicio.producto.services;

import java.util.List;

import edu.pe.servicio.producto.models.entities.Producto;

public interface IProductoService {
	public List<Producto> findAll();

	public Producto findById(Long id);
	
	public Producto save(Producto producto);
	
	public Producto update(Long id, Producto producto);
	
	public void delete(Long id);
}
