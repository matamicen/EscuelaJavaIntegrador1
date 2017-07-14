package com.captton.clases;

public class Manofactura extends Productos {
	
	private int stock;
	

	public Manofactura(int idProd, String descripcion, float precio, int stock) {
		super(idProd, descripcion, precio);
		this.stock = stock;
		// TODO Auto-generated constructor stub
	}

	public void fabricar(int cantidad)
	{
		this.stock = this.stock + cantidad;
	}
	
	public void bajaStock(int cantidad)
	{
		this.stock = this.stock - cantidad;
	}

	public int getStock() {
		return stock;
	}
	
	
	
	
}
