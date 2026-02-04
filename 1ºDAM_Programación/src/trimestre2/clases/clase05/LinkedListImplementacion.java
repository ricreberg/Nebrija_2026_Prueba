package trimestre2.clases.clase05;

/* Listas de elementos que mantengan su orden de inserción, 
 * aunque los desordenemos o insertemos entre medias. 
 * Además es más rapido que hacerlo mediante índices */

//En las clases privadas no se pone private

class Nodo {
	int valor;
	Nodo siguiente;

	Nodo(int valor) {
		this.valor = valor;
		siguiente = null;
	}
}
 
public class LinkedListImplementacion {
	private Nodo primero;

	LinkedListImplementacion() {
		primero = null;
	}

	public void add(int valor) {
		Nodo n = new Nodo(valor);

		if (primero == null) {
			primero = n;
			n.siguiente = primero;
			return;
			
		} // no hace falta poner el else
		
		Nodo actual = primero;
		n.siguiente = primero;

		while (actual.siguiente != primero) {
			actual = actual.siguiente;
		}
		actual.siguiente = n;
	}

	public void print() {
		Nodo actual = primero;
		int contador = 1;
		
		while (contador != 0) {
			System.out.print(actual.valor + " --> ");
			actual = actual.siguiente;
			if (actual == primero) {
				contador--;
			}
			

		}System.out.println(actual.valor);

	}
}
