//----------------------------------- 20-11
package trimestre1.clases.clase12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		listas0();
	}

	public static void listas0() {
		List<Integer> lista = new ArrayList<>();

		lista.add(10);
		lista.add(3);
		lista.add(100);
		lista.add(6);
		lista.add(1000);
		lista.add(9);

		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i) % 3 == 0) {
				lista.remove(i);
			}
		}
		System.out.println(lista + "\n");

		// Iteradores: solo tienen tres funciones (Has Next, Next o Remove). Permiten
		// recorrer de forma segura un elemento dinámico.

		List<String> lst = new ArrayList();
		lst.add("uno");
		lst.add("");
		lst.add("dos");
		lst.add("tres");
		// for (String s : lst) {
		// if (s.isEmpty()) {
		// lst.remove(s);

		Iterator<String> it = lst.iterator();

		// Va comprobando si hay o no siguiente elemento
		while (it.hasNext()) {
			String s = it.next();
			if (s.isEmpty()) {
				it.remove();
			}
		}

		// Solo vuelve al principio si lo pido de nuevo, o hago otro
		for (String s : lst) {
			System.out.println(s);
		}

		//
		//
		//
		//
		//
		//

		System.out.println("\n\n\n\n");

		// FOR EACH
		//
		// Arrays list los vamos a recorrer con bucle for normal (como en los array)
		// para recuperar datos o modificar contenido (cualquier acción que no sea
		// modificar el tamaño, ya que aunque aquí funciona, suele dar excepción)

		List<Integer> lista1 = new ArrayList<>();

		lista1.add(10);
		lista1.add(3);
		lista1.add(100);
		lista1.add(6);
		lista1.add(1000);
		lista1.add(9);

		// aux es el valor, no el índice (como un for each en Python). Recorro cada uno
		// de los elementos internos
		for (Integer aux : lista1) {
			System.out.println(aux);
		}
		System.out.println("\n");

		// Con Strings, convertirlo a Char Array (for each solo funciona con arrays o
		// listas)
		String txt = "hola buenos días";
		for (Character aux1 : txt.toCharArray()) {
			System.out.println(aux1);
		}

		//
		// Recorremos por valores accediendo directamente al valor, el índice no aparece
		int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8 };
		for (Integer aux2 : nums) {
			System.out.println(aux2);
		}
		System.out.println("\n");

		//
		// Con matrices, en este caso trabajaría con 3 bucles for (3 arrays de enteros)
		int[][] nums1 = { { 1, 2, 3, 4, 5, 6, 7, 8 }, { 1, 23, 3 }, { 1 } };

		for (int[] array : nums1) {
			for (Integer aux3 : array) {

				System.out.println(aux3 + " ");
			}
			System.out.println();
		}
	}
}