package edu.escuelaing.arem.ASE.app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class calculadoraTest 
extends TestCase
{
	/**
	 * Create the test case
	 *
	 * @param testName name of the test case
	 */
	public calculadoraTest( String testName )
	{
		super( testName );
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite()
	{
		return new TestSuite( calculadoraTest.class );
	}
	/**
	 * prueba del promedio de la tabla uno del pdf.
	 */
	public void testMeanColumn1() {
		Calculadora datos = new Calculadora();
		datos.addNumber((double) 160);
		datos.addNumber((double) 591);
		datos.addNumber((double) 114);
		datos.addNumber((double) 229);
		datos.addNumber((double) 230);
		datos.addNumber((double) 270);
		datos.addNumber((double) 128);
		datos.addNumber((double) 1657);
		datos.addNumber((double) 624);
		datos.addNumber((double) 1503);
		try {
			assertEquals(datos.mean(), (double)550.6);
		} catch (ListaException e) {
			assertTrue(false);
		}
		
	}
	/**
	 * prueba del promedio de la tabla uno del pdf.
	 */
	public void testMeanColumn2() {
		Calculadora datos = new Calculadora();
		datos.addNumber((double) 15);
		datos.addNumber((double) 69.9);
		datos.addNumber((double) 6.5);
		datos.addNumber((double) 28.4);
		datos.addNumber((double) 65.9);
		datos.addNumber((double) 19.4);
		datos.addNumber((double) 198.7);
		datos.addNumber((double) 38.8);
		datos.addNumber((double) 138.2);
		datos.addNumber((double) 22.4);
		try {
			assertEquals(datos.mean(), (double)60.32);
		} catch (ListaException e) {
			assertTrue(false);
		}
		
	}
	/**
	 * prueba del promedio de la tabla tres del pdf.
	 */
	public void testMeanTable3() {
		Calculadora datos = new Calculadora();
		datos.addNumber((double) 186);
		datos.addNumber((double) 699);
		datos.addNumber((double) 132);
		datos.addNumber((double) 272);
		datos.addNumber((double) 331);
		datos.addNumber((double) 199);
		datos.addNumber((double) 1890);
		datos.addNumber((double) 788);
		datos.addNumber((double) 1601);
		datos.addNumber((double) 291);
		try {
			assertEquals(datos.mean(), (double)638.9);
		} catch (ListaException e) {
			assertTrue(false);
		}
		
	}
	/**
	 * Prueba creada por el autor para comprobar el promedio.
	 */
	public void testMean1() {
		Calculadora datos = new Calculadora();
		datos.addNumber((double) 150);
		datos.addNumber((double) 160);
		datos.addNumber((double) 161);
		datos.addNumber((double) 5);
		datos.addNumber((double) 1);
		datos.addNumber((double) 51);
		datos.addNumber((double) 5132);
		datos.addNumber((double) 15);
		datos.addNumber((double) 15);
		datos.addNumber((double) 151);
		try {
			assertEquals(datos.mean(), (double)584.1);
		} catch (ListaException e) {
			assertTrue(false);
		}
		
	}
	/**
	 * Prueba creada por el autor para comprobar el promedio.
	 */
	public void testMean2() {
		Calculadora datos = new Calculadora();
		datos.addNumber((double) 51);
		datos.addNumber((double) 5);
		datos.addNumber((double) 15);
		datos.addNumber((double) 48);
		datos.addNumber((double) 79);
		datos.addNumber((double) 5425);
		datos.addNumber((double) 8);
		datos.addNumber((double) 45);
		datos.addNumber((double) 18);
		datos.addNumber((double) 4);
		try {
			assertEquals(datos.mean(), (double)569.8);
		} catch (ListaException e) {
			assertTrue(false);
		}
		
	}
	/**
	 * prueba de la desviación estándar de la tabla uno del pdf.
	 */
	public void testStdDevColumn1() {
		Calculadora datos = new Calculadora();
		datos.addNumber((double) 160);
		datos.addNumber((double) 591);
		datos.addNumber((double) 114);
		datos.addNumber((double) 229);
		datos.addNumber((double) 230);
		datos.addNumber((double) 270);
		datos.addNumber((double) 128);
		datos.addNumber((double) 1657);
		datos.addNumber((double) 624);
		datos.addNumber((double) 1503);
		try {
			assertEquals(datos.stddev(), (double)572.03);
		} catch (ListaException e) {
			assertTrue(false);
		}
	}
	/**
	 * prueba de la desviación estándar de la tabla uno del pdf.
	 */
	public void testStdDevColumn2() {
		Calculadora datos = new Calculadora();
		datos.addNumber((double) 15);
		datos.addNumber((double) 69.9);
		datos.addNumber((double) 6.5);
		datos.addNumber((double) 28.4);
		datos.addNumber((double) 65.9);
		datos.addNumber((double) 19.4);
		datos.addNumber((double) 198.7);
		datos.addNumber((double) 38.8);
		datos.addNumber((double) 138.2);
		datos.addNumber((double) 22.4);
		try {
			assertEquals(datos.stddev(), (double)62.26);
		} catch (ListaException e) {
			assertTrue(false);
		}
		
	}
	/**
	 * prueba de la desviación estándar de la tabla tres del pdf.
	 */
	public void testStdDevTable3() {
		Calculadora datos = new Calculadora();
		datos.addNumber((double) 186);
		datos.addNumber((double) 699);
		datos.addNumber((double) 132);
		datos.addNumber((double) 272);
		datos.addNumber((double) 331);
		datos.addNumber((double) 199);
		datos.addNumber((double) 1890);
		datos.addNumber((double) 788);
		datos.addNumber((double) 1601);
		datos.addNumber((double) 291);
		try {
			assertEquals(datos.stddev(), (double)625.63);
		} catch (ListaException e) {
			assertTrue(false);
		}
		
	}
	/**
	 * Prueba creada por el autor para comprobar la desviación estándar.
	 */
	public void testStdDev1() {
		Calculadora datos = new Calculadora();
		datos.addNumber((double) 150);
		datos.addNumber((double) 160);
		datos.addNumber((double) 161);
		datos.addNumber((double) 5);
		datos.addNumber((double) 1);
		datos.addNumber((double) 51);
		datos.addNumber((double) 5132);
		datos.addNumber((double) 15);
		datos.addNumber((double) 15);
		datos.addNumber((double) 151);
		try {
			assertEquals(datos.stddev(), (double)1599.5);
		} catch (ListaException e) {
			assertTrue(false);
		}
		
	}
	/**
	 * Prueba creada por el autor para comprobar la desviación estándar.
	 */
	public void testStdDev2() {
		Calculadora datos = new Calculadora();
		datos.addNumber((double) 51);
		datos.addNumber((double) 5);
		datos.addNumber((double) 15);
		datos.addNumber((double) 48);
		datos.addNumber((double) 79);
		datos.addNumber((double) 5425);
		datos.addNumber((double) 8);
		datos.addNumber((double) 45);
		datos.addNumber((double) 18);
		datos.addNumber((double) 4);
		try {
			assertEquals(datos.stddev(), (double) 1706.12);
		} catch (ListaException e) {
			assertTrue(false);
		}
		
	}
	/**
	 * Prueba creada para probar la lectura de archivos de la calculadora y sus respectivos calculos. 
	 */
	public void testLecturaArchivos() {
		Calculadora calculos= new Calculadora("datos.txt");
		try {
			assertEquals(calculos.mean(), (double)550.6);
			assertEquals(calculos.stddev(), (double)572.03);
		} catch (ListaException e) {
			assertTrue(false);
		}
		
	}
	
}
