package edu.pe.servicio.recomendaciones.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.pe.servicio.recomendaciones.models.entities.Recomendacion;
import edu.pe.servicio.recomendaciones.services.IRecomendacionService;

@RestController
public class RecomendacionController {

	@Autowired
	private IRecomendacionService recomendacionService;

	@GetMapping("/recomendaciones")
	public List<Recomendacion> Listar() {
		return recomendacionService.findAll();
	}

	@GetMapping("/recomendaciones/ver/{id}")
	public Recomendacion BuscarRecomendacion(@PathVariable Long id) {
		return recomendacionService.findById(id);
	}

	@PostMapping("/recomendaciones")
	public Recomendacion Agregar(@RequestBody Recomendacion recomendacion) {
		return recomendacionService.save(recomendacion);
	}

	@PutMapping("/recomendaciones/{id}")
	public Recomendacion Modificar(@PathVariable("id") Long id, @RequestBody Recomendacion recomendacion) {
		return recomendacionService.update(id, recomendacion);
	}

	@DeleteMapping("/recomendaciones/{id}")
	public void Eliminar(@PathVariable("id") Long id) {
		recomendacionService.delete(id);
	}
}
