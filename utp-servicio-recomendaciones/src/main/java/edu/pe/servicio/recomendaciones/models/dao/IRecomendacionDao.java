package edu.pe.servicio.recomendaciones.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.pe.servicio.recomendaciones.models.entities.Recomendacion;

public interface IRecomendacionDao extends JpaRepository<Recomendacion, Long>{

}
