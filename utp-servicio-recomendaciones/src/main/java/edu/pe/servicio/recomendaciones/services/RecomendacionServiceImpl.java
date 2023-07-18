package edu.pe.servicio.recomendaciones.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.pe.servicio.recomendaciones.models.dao.IRecomendacionDao;
import edu.pe.servicio.recomendaciones.models.entities.Recomendacion;

@Service
public class RecomendacionServiceImpl implements IRecomendacionService{
	
	@Autowired
	private IRecomendacionDao recomendacionDao;

	@Override
	public List<Recomendacion> findAll() {
		return recomendacionDao.findAll();
	}

	@Override
	public Recomendacion findById(Long id) {
		return recomendacionDao.findById(id).orElse(null);
	}

	@Override
	public Recomendacion save(Recomendacion recomendacion) {
		return recomendacionDao.save(recomendacion);
	}

	@Override
	public Recomendacion update(Long id, Recomendacion recomendacion) {
		return recomendacionDao.findById(id).map(rec -> {
			rec.setNombre(recomendacion.getNombre());
			rec.setDescripcion(recomendacion.getDescripcion());
			rec.setSimilitud(recomendacion.getSimilitud());
			return recomendacionDao.save(rec);
		}).orElseGet(() -> {
			recomendacion.setItemId(id);
			return recomendacionDao.save(recomendacion);
		});
	}

	@Override
	public void delete(Long id) {
		recomendacionDao.deleteById(id);
	}

}
