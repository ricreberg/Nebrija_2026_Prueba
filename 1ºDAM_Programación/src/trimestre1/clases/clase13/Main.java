//----------------------------------- 4-12
package trimestre1.clases.clase13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		diccionarios_mapas0();
	}

	// ------------------------- DICCIONARIOS/MAPAS
	public static void diccionarios_mapas0() {
		Map<Integer, String> nombre = new HashMap<>(); // Asocio a un número un String
		nombre.put(1, "hola");
		nombre.put(3, null);
		nombre.put(200, "adios"); // No necesito índices (ni los puedo tener)
		System.out.println(nombre);
		System.out.println();
		System.out.println(nombre.get(1)); // No podrías poner get "hola", ya que los valores pueden repetirse

		System.out.println(nombre.get(2)); // Si no existe, sale Null, no Exception
		System.out.println(nombre.get(3)); // Me daría null tmb, como diferencio?

		System.out.println(nombre.containsKey(10)); // No existe, por eso da null
		System.out.println(nombre.containsKey(3)); // Si existe, pero su valor es Null

		// ------------- FORMAS DE RECORRER Y EXTRAER INFO

		System.out.println("");

		nombre.put(300, "hola1");
		nombre.put(500, "hola2");
		nombre.put(600, "hola3");
		nombre.put(700, "hola4");

		// No puedo recorrer con un bucle for normal porque no tengo índices, debo usar
		// un for each

		// RECORRER POR CLAVES
		for (Integer clave : nombre.keySet()) { // Uso el : para "desempacar"
			// Keyset da un listado de claves, como no son repetidas las mete en un set
			// (conjunto de datos q no admite repeticiones)
			System.out.println(nombre.get(clave));
		}

		// El orden se ejecuta así de "aleatorio" por su hash,ya lo veremos"

		System.out.println();

		// Para los valores, como si se pueden repetir, no utilizo un set

		// RECORRER POR VALORES
		for (String valores : nombre.values()) {
			System.out.println(valores); // Nos devuelve una colección, cosa que se puede recorrer
		}

		System.out.println();

		// DEVOLVER CLAVE Y VALOR ASOCIADO (en el orden que sea)

		for (Map.Entry<Integer, String> e : nombre.entrySet()) {

			// Si pusieramos System.out.println(e) sería parecido a
			// System.out.println(nombre)
			// Si queremos trabajar la info:

			System.out.println(e.getKey() + "---" + e.getValue());
		}

		System.out.println();

		// ------------- EDITAR VALORES

		nombre.put(800, null);
		System.out.println(nombre.get(800));

		/*
		 * Como cambiar el valor asociado? Ambos sirven igual, pero para entender el
		 * código a posteriori, el replace ayudaría. Si además nos equivocamos y el
		 * valor no existe, el replace no haría nada, pero el put si que añadiría una
		 * nueva clase, lo que puede dar problemas.
		 */

		// 1
		nombre.put(800, "nuevo");
		System.out.println(nombre.get(800));

		// 2
		nombre.replace(800, "replace");
		System.out.println(nombre.get(800));

		System.out.println();

		/*
		 * ------------- BORRAR CLAVES
		 */

		nombre.put(900, "a");
		System.out.println(nombre.containsKey(900));
		System.out.println(nombre.get(900));

		nombre.remove(900);
		System.out.println(nombre.containsKey(900));
		System.out.println(nombre.get(900));

		// nombre.clear reiniciaría todo el mapa
		// ----------------------------------- 5-12

		System.out.println();

		/*
		 * 
		 * ------------- HASH
		 * 
		 */

		Integer i = 10;
		System.out.println(i.hashCode());
		String txt = "andres";
		System.out.println(txt.hashCode());

		/*
		 * 
		 * ------------- EJERCICIO
		 * 
		 */

		System.out.println();

		// Declarar array o arraylist de nºs con datos repetidos,y a traves de un
		// diccionario decir cuantos datos de cada hay

		List<Integer> listaNumeros = new ArrayList<>(Arrays.asList(10, 20, 30, 10, 40, 20, 10, 50, 30));

		Map<Integer, Integer> frecuencias = new HashMap<>();

		for (int numero : listaNumeros) {
			if (frecuencias.containsKey(numero)) {
				frecuencias.put(numero, frecuencias.get(numero) + 1);
			} else {
				frecuencias.put(numero, 1);
			}
		}

		System.out.println("Lista: " + listaNumeros);
		System.out.println("Frecuencias:");

		for (Map.Entry<Integer, Integer> entrada : frecuencias.entrySet()) {
			System.out.println(entrada.getKey() + " -> " + entrada.getValue());
		}
	}
}
