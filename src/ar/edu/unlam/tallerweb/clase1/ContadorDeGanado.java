package ar.edu.unlam.tallerweb.clase1;

public class ContadorDeGanado {
	private Integer cantidad=0;
	
	public void contar() {
		cantidad=cantidad+1;
	}
	
	public Integer mostrarCantidad() {
		return cantidad;
	}
}
