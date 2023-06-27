package edu.pe.servicio.recomendaciones.services;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.pe.servicio.recomendaciones.models.entities.Recomendacion;


public interface IRecomendacionService {
	public List<Recomendacion> findAll();
	public Recomendacion findById(Long id);
	public Recomendacion save(Recomendacion recomendacion);
	public Recomendacion update(Long id, Recomendacion recomendacion);
	public void delete(Long id);
}
