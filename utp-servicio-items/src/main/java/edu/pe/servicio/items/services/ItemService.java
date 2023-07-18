package edu.pe.servicio.items.services;

import java.util.List;

import edu.pe.servicio.items.models.entities.Item;

public interface ItemService {
	public List<Item> findAll();
	public Item findById(Long id, Integer cantidad);
}
