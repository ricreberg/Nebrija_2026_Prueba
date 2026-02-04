
//----------------------------------- 08-01
package trimestre2.ejercicios.ejercicio01_Varios;

public class Main {
	public static void main(String[] args) {
		ejercicio5();
	}

	public static void ejercicio1() {
		/*
		 * Escribe un método incrementar(int x) que sume 5 al valor recibido. Llama al
		 * método desde main, muestra el valor antes y después de la llamada y analiza
		 * el resultado observado
		 */
		int n1 = 6;
		System.out.println(n1);
		n1 = sumar(n1);
		System.out.println(n1);
		/*
		 * Al pasar por valor, debo igualar la variable a la ejecución de la función, es
		 * decir, al clon generado en la función Importante definir como int y no como
		 * void y poner el return
		 */

	}

	public static int sumar(int n1) {
		return n1 = n1 + 5;
	}

	public static void ejercicio2() {
		/*
		 * Crea un método cambiarValor(int[] v) que modifique el primer elemento del
		 * array asignándole el valor 100. Inicializa el array en main, muestra su
		 * contenido antes y después de la llamada.
		 */

		int[] v = { 1, 2, 3, 4 };

		for (int i = 0; i < v.length; i++) {
			System.out.println(v[i]);
		}

		System.out.println();

		cambiarValor(v);

		for (int i = 0; i < v.length; i++) {
			System.out.println(v[i]);
			// Los arrays se pasan por referencia
		}
	}

	// Tipo de dato + nombre de la variable
	public static void cambiarValor(int[] v) {
		v[0] = 100;
	}

	public static void ejercicio3() {
		/*
		 * Implementa un método resetear que asigne 0 a la variable contador. Comprueba
		 * el estado de la variable antes y después de la llamada.
		 */

		int contador = 25;
		contador++;
		System.out.println(contador);
		contador = reset(contador);
		System.out.println(contador);
	}

	public static int reset(int contador) {
		return contador = 0;

	}

	public static void ejercicio4() {
		/*
		 * Escribe un método intercambiar(int a, int b) que intente intercambiar los
		 * valores de dos variables. Llama al método desde main y muestra los valores
		 * antes y después.
		 */
		int a = 3;
		int b = 6;
		System.out.println(a);
		a = intercambiar(a, b);
		System.out.println(a);
	}

	public static int intercambiar(int a, int b) {
		return a = b;

	}

	public static void ejercicio5() {
		/*
		 * Crea un método reasignarArray(int[] v) que asigne un nuevo array al parámetro
		 * y le dé valores distintos. Observa si el array original cambia tras la
		 * llamada
		 */
		
		int[] x = { 1, 2, 3, 4 };
		int[] y = { 6, 7, 12, 17};

		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}



		System.out.println();

		reasignarArray(x, y);

		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}
	}

	
	public static void reasignarArray(int[] x, int[] y) {
		x = y;
	}
}
