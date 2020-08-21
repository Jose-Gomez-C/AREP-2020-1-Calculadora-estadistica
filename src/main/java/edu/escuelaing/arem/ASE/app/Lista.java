package edu.escuelaing.arem.ASE.app;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Esta clase es la encargada de unir los Nodos.
 * @author Jose Luis Gomez Camacho
 */
public class Lista {
	private Nodo cabeza;
	private Nodo cola;
	private int length;
	
	/**
	 * Constructor para la lista,
	 */
	public Lista() {
		length=0;
	}
	/**
	 * Método encargado de crear y unir los Nodos.
	 * @param value El valor a guardar en el Nodo.
	 */
	public void add(double value) {
		Nodo aux;
		if (length == 0) {
			cabeza= new Nodo(value, null, length);
			cola = cabeza;
			length+=1;
		}else if (length == 1) {
			aux = new Nodo(value, cabeza, length);
			cabeza.add(aux);
			cola=aux;	
			length+=1;
		}else {
			aux = new Nodo(value, cola, length);
			cola.add(aux);
			cola=aux;
			length+=1;
		}
	}
	/**
	 * Método que se encarga de recorrer los nodos hasta encontrar el buscado.
	 * @param pos La posición de la lista que desea. 
	 * @return El valor almacenado en el nodo.
	 */
	public double getValue(int pos)throws ListaException {
		Nodo actual= cabeza;
		Double valor = null;
		for( int x=0; x<=length && valor == null; x+=1) {
			if (actual.setPos(pos)){
				valor= (Double) actual.getValue();
			}else {
				actual= actual.getNext();
			}
		}
		if (valor == null)throw new ListaException(ListaException.index);
		
		return valor;
	}
	/**
	 * @return La longitud de la lista. 
	 */
	public int getLength() {
		return length;
	}
}
