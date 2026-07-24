package paq;
import java.util.*;
public class Cuadrante {
	
	private int dia; 
	private Feriante feriante;
	private Atraccion atraccion;
	
	
	public Cuadrante(int dia, Feriante feriante, Atraccion atraccion) {
		super();
		this.dia = dia;
		this.feriante = feriante;
		this.atraccion = atraccion;
	}


	public int getDia() {
		return dia;
	}


	public void setDia(int dia) {
		this.dia = dia;
	}


	public Feriante getFeriante() {
		return feriante;
	}


	public void setFeriante(Feriante feriante) {
		this.feriante = feriante;
	}


	public Atraccion getAtraccion() {
		return atraccion;
	}


	public void setAtraccion(Atraccion atraccion) {
		this.atraccion = atraccion;
	}


	@Override
	public String toString() {
		return "Cuadrante dia =" + this.dia + ", feriante=" + this.feriante + ", atraccion=" + this.atraccion ;
	} 
	
	
	
	
	

}
