package ar.edu.unlam.tallerweb.clase1;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class ContadorDeGanadoTest2 {

	@Test
	public void testQuePuedaContar() {
		ContadorDeGanado miContador=new ContadorDeGanado();
		Integer cantidadEsperada=1;
		miContador.contar();
		Integer cantidadObtenida=miContador.mostrarCantidad();
		Assert.assertEquals(cantidadEsperada, cantidadObtenida);
		miContador=null;
	}
	
	@Test
	public void testQueCuandoArranqueElContadorEnCero(){
		
	ContadorDeGanado miContador=new ContadorDeGanado();
	Integer cantidadEsperada=0;
	Integer cantidadObtenida=miContador.mostrarCantidad();
	Assert.assertEquals(cantidadEsperada, cantidadObtenida);
	miContador=null;
	}

}
