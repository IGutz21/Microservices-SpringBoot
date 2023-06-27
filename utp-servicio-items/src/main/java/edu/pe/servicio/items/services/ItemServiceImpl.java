package edu.pe.servicio.items.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.pe.servicio.items.clientes.ProductoClienteRest;
import edu.pe.servicio.items.clientes.RecomendacionClienteRest;
import edu.pe.servicio.items.models.entities.Item;
import edu.pe.servicio.items.models.entities.Producto;
import edu.pe.servicio.items.models.entities.Recomendacion;

@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	private ProductoClienteRest clienteRest;
	
	@Autowired
	private RecomendacionClienteRest recomendacionClienteRest;
	
	@Override
	public List<Item> findAll() {
		return clienteRest.Listar().stream().map(p -> new Item(p, 1)).collect(Collectors.toList()); 
	}

	@Override
	public Item findById(Long id, Integer cantidad) {
		return new Item(clienteRest.BuscarProducto(id),cantidad);
	}

}
