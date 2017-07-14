package com.captton.programa;

import com.captton.clases.Cliente;
import com.captton.clases.Factura;
import com.captton.clases.Manofactura;
import com.captton.clases.Productos;

public class inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente cli1 = new Cliente(111,"Jorge SRL",0);
		Productos p1 = new Manofactura(100, "Latex 25L", 300, 10);
		
		Factura fact1 = new Factura(1);
		fact1.setCliente(cli1);
		fact1.agregoItem(p1, 9);
		fact1.facturar();
		
		Factura fact2 = new Factura(2);
		fact2.setCliente(cli1);
		fact2.agregoItem(p1, 10);
		fact2.facturar();
		
		Factura fact3 = new Factura(3);
		fact3.setCliente(cli1);
		fact3.agregoItem(p1, 10);
		fact3.facturar();

	}

}
