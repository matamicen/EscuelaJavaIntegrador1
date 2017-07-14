package com.captton.clases;

import java.util.ArrayList;

public class Factura {
	
	private int numFact;
	private ArrayList<Item> items;
	
	private Cliente cliente;

	public Factura() {
		// TODO Auto-generated constructor stub
		
	}
	
	
	
	public Factura(int numFact) {
		super();
		this.numFact = numFact;
		items = new ArrayList<Item>();
		
	}
	
	
	
	public Cliente getCliente() {
		return cliente;
	}



	public void setCliente(Cliente cliente) {
		if (cliente.getDeuda()<4000f){
		this.cliente = cliente;
		System.out.println("Cliente agregado");
		}else System.out.println("Cliente con deuda mayor a 1000, no se le puede vender");
			
	}



	public void agregoItem(Productos prod, int cant)
	{	
	if (this.cliente!=null)
	{		
	    if (prod instanceof Manofactura)
	    { 
	    	if ( cant < ((Manofactura)prod).getStock())
	       {//this.items.add(prod);
	       this.items.add(new Item(prod, cant));
	       System.out.println("item agregado correctamente");
	       } else  System.out.println("No hay stock para este item");
	     }else 
	      { // Es de Servicio
	    	 this.items.add(new Item(prod, cant));
	        }
	    
	}else System.out.println("No puede agregar items a una factura que no tiene cliente asignado");
	   
	}
	
	public void facturar()
	{
		if (!this.items.isEmpty())
		{	
		for(Item it: this.items)
		  {
			System.out.println("Descr: "+ it.getProd().getDescripcion());
			System.out.println("Precio Unit.: "+it.getProd().getPrecio());
			System.out.println("Qty: "+it.getQty());
			System.out.println("Total Linea:"+ (it.getQty()*it.getProd().getPrecio()));
			System.out.println("---------------------------------------------------------");
	        // Aumento la deuda del cliente
			cliente.setDeuda(it.getQty()*it.getProd().getPrecio());	
			((Manofactura)it.getProd()).bajaStock(it.getQty());
		  }
		}else System.out.println("No puede facturar si no tiene items en la factura");
		
	}
	
	

}
