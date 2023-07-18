package edu.pe.servicio.items.models.entities;

public class Recomendacion {
	private Long itemId;
	private String nombre;
	private String descripcion;
	private double similitud;
	
	public Recomendacion(Long itemId, String nombre, String descripcion, double similitud) {
		super();
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
