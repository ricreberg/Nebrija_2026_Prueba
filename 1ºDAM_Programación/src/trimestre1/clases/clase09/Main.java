//----------------------------------- 29-10
package trimestre1.clases.clase09;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		array0();
	}

	public static void f0() { // revisar
		Scanner sc = new Scanner(System.in);
		String nombre = sc.nextLine();
		String nombreCompleto = fn("Andrés", "Martínez");

	}

	public static String fn(String nombre, String apellido) {
		return nombre + "" + apellido;
	}

	// -------------------------- ARRAYS
	public static void array0() {
		Random rd = new Random();
		// con float, char, string y boolean tmb

		int[] arrayEnteros = new int[5]; // le asigno obligatoriamente la cantidad de elementos q puede contener (no se
											// pueden negativos)
		int[] arrayEnteros1 = { 1, 2, 60 }; // método dos, le digo el total que puede contener (3) y además su
											// contenido. NO SE USA

		// Strings, conjuto de chars (Andrés, 6 letras con sus posiciones); arrays
		// igual, conjunto de elementos (del mismo tipo de dato) agrupados en una sola
		// estructura (les asigno posiciones 1, 2, 3...)

		System.out.println(arrayEnteros); // no saca nada válido, hay q recorrerlos con bucle for

		for (int i = 0; i < arrayEnteros.length; i++) {
			// quiero acceder a una posición concreta. En vez de char at...
			System.out.println(arrayEnteros[i]); // al no estar definida, va a rellenar todo de ceros (como ocupa 5,
													// pues cinco ceros). Con doubles sería 0.0. COn chars sería espacio
													// en blanco. Con booleans sería false por defecto. Con strings
													// sería null.
		}

		// Para rellenar:

		// 1. Declaro
		String[] arrayEnteros2 = new String[6];

		// 2. Relleno
		for (int i = 0; i < arrayEnteros2.length; i++) {
			arrayEnteros2[i] = "" + i;
		}

		// 3. Leo
		for (int i = 0; i < arrayEnteros2.length; i++) {
			System.out.println(arrayEnteros2[i]);
		}
		// ----------------------------------

		// |
		// |

		char c = '1';
		Character.isDigit(c); // char se asocia a la clase Character

		// |
		// |

		// ahorrarme primer for
		int[] arrayEnteros3 = new int[6];
		Arrays.fill(arrayEnteros3, 8);

		for (int i = 0; i < arrayEnteros3.length; i++) {
			System.out.println(arrayEnteros3[i]);
		}

		// ------ EJERCICIO:
		int[] arrayEnteros4 = new int[5];

		// Arrays.fill(arrayEnteros4, rd.NextInt()); No se puede hacer, ya que solo
		// genera el mismo número todas las veces

		for (int i = 0; i < arrayEnteros4.length; i++) {
			arrayEnteros4[i] = rd.nextInt(0, 100); // se puede poner (100) directamente
		}

		int suma = 0;
		for (int i = 0; i < arrayEnteros4.length; i++) {
			suma += arrayEnteros4[i];
		}
		System.out.println("--" + suma + "--"); // digo el valor del sumatorio
		for (int i = 0; i < arrayEnteros4.length; i++) {
			System.out.println(arrayEnteros4[i]); // digo cada uno de los números del array
		}

	}

}
