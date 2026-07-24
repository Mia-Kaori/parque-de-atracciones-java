package paq;

import java.util.*;

public class Atraccion implements Abono{
	
	private String nombre;
	private double precioticket;
	private int numeroTickets;
	private double descuento;
	
	
	public Atraccion(String nombre, double precioticket, int numeroTickets, double descuento) {
		super();
		this.nombre = nombre;
		this.precioticket = precioticket;
		this.numeroTickets = numeroTickets;
		this.descuento = descuento;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public double getPrecioticket() {
		return precioticket;
	}



	public void setPrecioticket(double precioticket) {
		this.precioticket = precioticket;
	}



	public int getNumeroTickets() {
		return numeroTickets;
	}



	public void setNumeroTickets(int numeroTickets) {
		this.numeroTickets = numeroTickets;
	}



	public double getDescuento() {
		return descuento;
	}



	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}



	@Override
	public double precioAbono() {
		// TODO Auto-generated method stub
		return this.precioticket*this.numeroTickets*this.descuento;
	}



	@Override
	public String toString() {
		return this.nombre;
	}

	
	
	
	
	
}
