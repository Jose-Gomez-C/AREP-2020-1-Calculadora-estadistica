package edu.escuelaing.arem.ASE.app;
/**
 * Clase encargada de manejar las excepciones de la lista
 * @author Jose Luis Gomez Camacho 
 */
public class ListaException extends Exception {
	private static final long serialVersionUID = 1L;
	public static final String index= "index out of range";
	
	public ListaException( String message) {
		super(message);
	} 
}
