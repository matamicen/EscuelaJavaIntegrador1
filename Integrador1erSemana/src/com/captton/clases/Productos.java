package com.captton.clases;

public abstract class Productos {
	
	protected int IdProd;
	protected String descripcion;
	protected float precio;
	
	public Productos(int idProd, String descripcion, float precio) {
		super();
		IdProd = idProd;
		this.descripcion = descripcion;
		this.precio = precio;
	}

	public int getIdProd() {
		return IdProd;
	}

	public void setIdProd(int idProd) {
		IdProd = idProd;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	
	
	
	

}
