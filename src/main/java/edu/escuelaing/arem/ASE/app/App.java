package edu.escuelaing.arem.ASE.app;

public class App{
	/**
	 * @author Jose Luis Gomez Camacho
	 */
	public static void main(String[] args){ 
		Calculadora calculos= new Calculadora("datos.txt");
		try {
			System.out.println(calculos.mean());
			System.out.println(calculos.stddev());
		} catch (ListaException e) {
			e.printStackTrace();
		}
	}
}
