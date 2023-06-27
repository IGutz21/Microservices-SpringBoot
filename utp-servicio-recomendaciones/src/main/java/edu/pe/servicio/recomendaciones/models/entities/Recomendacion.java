package edu.pe.servicio.recomendaciones.models.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "recomendaciones")
@Entity
public class Recomendacion {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long itemId;
	
	@Column(length = 250)
	private String nombre;
	
	@Column(length = 250)
	private String descripcion;
	
	@Column()
	private double similitud;
	
	
	public Recomendacion() {
	}

	public Recomendacion(Long itemId, String nombre, String descripcion, double similitud) {
		this.itemId = itemId;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.similitud = similitud;
	}
	
	public Long getItemId() {
		return itemId;
	}
	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getSimilitud() {
		return similitud;
	}
	public void setSimilitud(double similitud) {
		this.similitud = similitud;
	}
	
	
}
