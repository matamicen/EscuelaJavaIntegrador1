package com.captton.clases;

public class Item {
	
	private Productos prod;
	private int qty;
	

	public Item() {
		// TODO Auto-generated constructor stub
	}
	
	


	public Item(Productos prod, int qty) {
		super();
		this.prod = prod;
		this.qty = qty;
	}




	public Productos getProd() {
		return prod;
	}


	public void setProd(Productos prod) {
		this.prod = prod;
	}


	public int getQty() {
		return qty;
	}


	public void setQty(int qty) {
		this.qty = qty;
	}
	
	

}
