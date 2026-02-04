//----------------------------------- 17-11
package trimestre1.clases.clase11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		listas0();
	}

	public static void listas0() {

		// Clase (empieza por mayus). Estructura de posición variable, se va ampliando
		// según le meto elementos (no
		// es fija como las arrays)

		// Las más tipicas son linked list y array list
		// Vamos a ver array list

		// Declaramos lista que concretamente es un Array List

		// En el primer <> le digo que clase estoy almacenando con mayus (Boolean, Int,
		// Double...). En el segundo <> no hce falta poner nada, se sobreentiende. En
		// los paréntesis no se pone nada

		// Para int --> Integer

		List<Integer> lista = new ArrayList<>();
		lista.add(1516);
		lista.add(356);
		lista.add(374);
		lista.add(129384);
		lista.add(874865);
		lista.add(3);

		System.out.println(lista);

		// Para saber longitud (en ese momento) uso .size en vez de .length

		System.out.println(lista.size());

		lista.add(12346);
		System.out.println(lista);
		System.out.println(lista.size());

		// Para borrar
		// Solo un numero lo interpreta como posición
		lista.remove(3);
		System.out.println(lista);

		// Si quiero borrar el valor en enteros
		List<Integer> lista2 = new ArrayList<>();
		lista2.add(10);
		lista2.add(100);
		lista2.add(1000);
		lista2.remove(Integer.valueOf(10));
		System.out.println(lista2);

		// Eliminar por valor en Strings
		List<String> lista1 = new ArrayList<>();
		lista1.add("ghfjdksalk");
		lista1.add("perro");
		lista1.add("5");
		lista1.add("23");

		lista1.remove(2);
		System.out.println(lista1);

		lista1.remove("23");
		System.out.println(lista1);

		//
		// Otras funciones:
		//

		// Borro el primer valor
		lista.removeFirst();
		System.out.println(lista);

		// List<Integer>lst=lista.removeAll(356, 129384);

		// Invierto la lista
		List<String> lst1 = lista1.reversed();
		System.out.println(lista1);
		System.out.println(lst1);

		// Le digo que añadir en que posición (mueve lo demás
		lista1.add(0, "wwertyu");
		System.out.println(lista1);

		// Le pido el valor de la lista en una posición
		System.out.println(lista1.get(2));

		// Quito lo q haya en una posición y pongo otro valor
		lista1.set(1, "labubu");
		System.out.println(lista1);

		// Te dice si contiene un valor
		System.out.println(lista1.contains("labubu"));

		// indexOf, lastIndexOf

		// Igual que los arrays se relacionaban con la clase Arrays, con listas es
		// Collections (explorar funciones)

		// Aumentar lista hasta un tamaño concreto
		List<Integer> lista3 = new ArrayList<>();

		lista3.add(10);
		lista3.add(100);
		lista3.add(1000);

		// Bucle infinito, hay que escribir la longitud (si quiero que se genere hasta
		// 50 lo pongo

		// for (int i = 0; i < lista3.size(); i++) {
		// System.out.println(lista3);
		// lista3.add(i);
		// }

		for (int i = 0; i < 50; i++) {
			System.out.println(lista3);
			lista3.add(i);
		}

	}
}