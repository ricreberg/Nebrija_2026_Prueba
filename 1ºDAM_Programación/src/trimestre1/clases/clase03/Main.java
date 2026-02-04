//-------------------------- 6-10-25

package trimestre1.clases.clase03;

public class Main {
	public static void main(String[] args) {

		// EXPLICACIÓN BUCLES

		// Bucle infinito
		// int index=0; 
		// while (index<5) { //Condición de parada
		// System.out.println("Hola")
		// }

		int index = 0;
		while (index < 5) {
			System.out.println("Hola");
			index = index + 1; // Previene el bucle, solo hace la acción las veces q le pido (5 en este caso)
		}

		int index1 = 0;
		while (index1 < 5) {
			System.out.println("Helou");
			index1++; // Forma mas fácil de q vaya sumando 1, tmb se puede poner --
		}

		int index2 = 0;
		while (index2 < 5) {
			System.out.println("Hi " + index2); // Cada uno tiene un numero (Hi 1, Hi 2...)
			index2++;
		}

		int index3 = 0;
		while (index3 < 10) {
			if (index3 % 2 == 0) { // Bucle anidado (mejor con un bucle for, todavía no lo hemos dado)
				System.out.println("Buenas " + index3);
			}
			index3++; // Muestra solo los pares hasta el 10
		}

		// Si hiciera otro bucle while con lo mismo, como el código se ejecuta en orden
		// solo se imprimiría 0 veces (mientras q el primero sería 5)
		// Si quisiera repetirlo tendría q usar otra variable index distinta, o
		// redefinir index3 = 0

	}
}