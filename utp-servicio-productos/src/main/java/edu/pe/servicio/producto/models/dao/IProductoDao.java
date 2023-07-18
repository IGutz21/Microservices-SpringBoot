package edu.pe.servicio.producto.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.pe.servicio.producto.models.entities.Producto;

public interface IProductoDao extends JpaRepository<Producto, Long> {

}
