package com.captton.clases;

public class Cliente {
	
	private int idCli;
	private String razonsocial;
	private float deuda;
	
	

	public Cliente() {
		// TODO Auto-generated constructor stub
	}



	public Cliente(int idCli, String razonsocial, float deuda) {
		super();
		this.idCli = idCli;
		this.razonsocial = razonsocial;
		this.deuda = deuda;
	}



	public int getIdCli() {
		return idCli;
	}



	public void setIdCli(int idCli) {
		this.idCli = idCli;
	}



	public String getRazonsocial() {
		return razonsocial;
	}



	public void setRazonsocial(String razonsocial) {
		this.razonsocial = razonsocial;
	}



	public float getDeuda() {
		return deuda;
	}



	public void setDeuda(float deuda) {
		this.deuda = this.deuda + deuda;
	}
	
	

}
