package edu.pe.servicio.items.models.entities;

public class Item {

	private Producto producto;
	private Recomendacion recomendacion;
	private Integer cantidad;

	public Item(Producto producto, Recomendacion recomendacion, Integer cantidad) {
		super();
		this.producto = producto;
		this.recomendacion = recomendacion;
		this.cantidad = cantidad;
	}

	public Item(Producto producto, Integer cantidad) {
		this.producto = producto;
		this.cantidad = cantidad;
	}
	
	

	public Item(Recomendacion recomendacion, Integer cantidad) {
		super();
		this.recomendacion = recomendacion;
		this.cantidad = cantidad;
	}

	public Item() {

	}
	
	

	public Recomendacion getRecomendacion() {
		return recomendacion;
	}

	public void setRecomendacion(Recomendacion recomendacion) {
		this.recomendacion = recomendacion;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	
	public Double getTotal()
	{
		return producto.getPrecio() *  cantidad.doubleValue();
	}
}
