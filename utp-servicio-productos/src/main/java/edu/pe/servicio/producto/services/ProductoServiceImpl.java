package edu.pe.servicio.producto.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.pe.servicio.producto.models.dao.IProductoDao;
import edu.pe.servicio.producto.models.entities.Producto;

@Service
public class ProductoServiceImpl implements IProductoService {

	@Autowired
	private IProductoDao productoDao;
	
	@Override
	public List<Producto> findAll() {
		return productoDao.findAll();
	}

	@Override
	public Producto findById(Long id) {
		
		return productoDao.findById(id).orElse(null);
	}

	@Override
	public Producto save(Producto producto) {
		return productoDao.save(producto);
	}

	@Override
	public Producto update(Long id, Producto producto) {
		return productoDao.findById(id).map(product -> {
			product.setDescripcion(producto.getDescripcion());
			product.setCreateAt(producto.getCreateAt());
			product.setPrecio(producto.getPrecio());
			return productoDao.save(product);
		}).orElseGet(() -> {
			producto.setId(id);
			return productoDao.save(producto);
		});
	}

	@Override
	public void delete(Long id) {
		productoDao.deleteById(id);
	}
	
	

}
