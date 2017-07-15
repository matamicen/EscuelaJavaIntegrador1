package com.captton.programa;

import com.captton.clases.Cliente;
import com.captton.clases.Factura;
import com.captton.clases.Manofactura;
import com.captton.clases.Productos;
import com.captton.clases.Servicios;

public class inicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente cli1 = new Cliente(111,"Jorge SRL",0);
		Cliente cli2 = new Cliente(113,"PepsiCO SRL",0);
		Productos p1 = new Manofactura(100, "Latex 25L", 300, 10);
		Productos p3 = new Manofactura(120, "Satinol 30L", 1000, 10);
		Productos p2 = new Servicios(110, "Pintado de Auto", 5000);
		
		Factura fact1 = new Factura(1);
		fact1.setCliente(cli1);
		fact1.agregoItem(p1, 9);
		fact1.facturar();
		
		
		
		Factura fact2 = new Factura(2);
		fact2.setCliente(cli2);
		fact2.agregoItem(p3, 4);
		fact2.facturar();
		
		Factura fact5 = new Factura(5);
		fact5.setCliente(cli2);
		fact5.agregoItem(p3, 4);
		fact5.facturar();
		
		Factura fact3 = new Factura(3);
		fact3.setCliente(cli1);
		fact3.agregoItem(p1, 10);
		fact3.facturar();
		
		Factura fact4 = new Factura(4);
		fact4.setCliente(cli1);
		fact4.agregoItem(p2, 1);
		fact4.facturar();

	}

}
