package Junit;

import static org.junit.Assert.*;

import org.junit.Test;

import media.Media1;

public class MayorNumeroTestExcepcion {

	/* En esta prueba he conseguido romper el programa ya que no se puede dividir un numero entre 0, sin embargo me ha parecido muy curioso que se puedan meter fracciones,
	 * he metido antes una de prueba con 1/2 y el programa lo tira perfectamente */
	@Test
	public void testObt_mayorNumero() {
		try {
		//assertEquals(1,MayorNumero.obt_mayorNumero(new int [] { 0,0,0,1/2}));
		assertEquals(3,MayorNumero.obt_mayorNumero(new int [] { 1,2,3,1/0}));
	    }
		catch(ArithmeticException e){
			System.out.println("No se puede dividir entre 0");
		}
		}
	}


