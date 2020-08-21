package edu.escuelaing.arem.ASE.app;
import java.util.ArrayList;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


public class ListaTest 
extends TestCase
{
		/**
		 * Create the test case
		 *
		 * @param testName name of the test case
		 */
		public ListaTest( String testName )
		{
			super( testName );
		}

		/**
		 * @return the suite of tests being tested
		 */
		public static Test suite()
		{
			return new TestSuite( ListaTest.class );
		}
		/**
		 * prueba creada para saber si la lista encadenada conoce a todos sus vecinos. 
		 */
		public void testList() {
			ArrayList<Double>prueba= new ArrayList<Double>();
			prueba.add((double) 10);
			prueba.add((double) 15);
			prueba.add((double) 30);
			prueba.add((double) 100);
			Lista lista= new Lista();
			lista.add((double) 10);
			lista.add((double) 15);
			lista.add((double) 30);
			lista.add((double) 100);
			Double valor=null;
			for (int x=0;x<4;x+=1) {
				try {
					valor = lista.getValue(x);
				} catch (ListaException e) {
					assertTrue(false);
				}
				
				assertEquals(valor, prueba.get(x));
			}
		}
		/**
		 * prueba creada para saber si el puntero cabeza estaba funcionado
		 */
		public void testListCabeza() {
			Lista lista= new Lista();
			lista.add((double) 10);
			for (int x=0;x<4;x+=1) {
				try {
					assertEquals(lista.getValue(0), (double)10);
				} catch (ListaException e) {
					assertTrue(false);
				}
				
				
			}
		}
		/**
		 * prueba creada para saber si el puntero cola estaba funcionado
		 */
		public void testList2Cola() {
			Lista lista= new Lista();
			lista.add((double) 10);
			lista.add((double) 100);
			for (int x=0;x<4;x+=1) {
				try {
					assertEquals(lista.getValue(1), (double)100);
				} catch (ListaException e) {
					assertTrue(false);
				}
				
				
			}
		}

}
