package Junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class MultiplodeTestExcepcion {

	/* En esta prueba he conseguido romper el programa ya que no hay multiplos de 0 */
	@Test
	public void testTestEsmultiplodeInt() {
		try {
		Multiplode md = new Multiplode(2);
		boolean resultado = md.esmultiplode(0);
		assertEquals(true, resultado);
		}
		catch(ArithmeticException e) {
			System.out.println("No hay multiplo de 0");
		}
		}

}
