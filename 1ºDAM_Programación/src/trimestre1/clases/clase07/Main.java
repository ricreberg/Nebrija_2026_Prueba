//-------------------------- 23-10-25

package trimestre1.clases.clase07;

import java.util.Random;

public class Main {

	// -------------------------- NÚMEROS ALEATORIOS
	public static void main(String[] args) {

		Random rd = new Random();
		System.out.println(rd.nextInt());

		Random rd1 = new Random(1); // Usaría una semilla, genera siempre el mismo número
		System.out.println(rd1.nextInt());

		Random rd2 = new Random();
		System.out.println(rd2.nextInt(10)); // Parámetro que da un random (del 1 al 10 sin incluir el 10)

		Random rd3 = new Random();
		System.out.println(rd3.nextBoolean()); // Cara o cruz

		Random rd4 = new Random(); // Tiras una moneda 1.000.000 de veces y expresar los resultados en porcentaje
		int cara = 0;
		int cruz = 0;
		for (int i = 0; i < 1000000; i++) {
			if (rd4.nextBoolean()) { // sería lo mismo que poner if (rd4.nextBoolean()==true) [True == True --> True
										// ; False == True --> False]. Poner !rd4 sería para false

				cara = cara + 1; // es lo mismo que [cara++] y [cara+=1];
			} else {
				cruz++;

			}
		}
		System.out.println("Cara: " + (cara / 10000.0) + "%"); // El .0 hace qel resultado sea un float, aunque el
																// contador fuera un int
		System.out.println("Cruz: " + (cruz / 10000.0) + "%");

		// -------------------------- FUNCIONES
		// Aparte de encerrar código y ejecutarlo por trozos, permite encerrar tmb
		// acciones repetidas (no hay q escribir el mismo código varias veces)

		// public static void: no devuelve nada, no es un tipo de dato concreto
		// Por tanto public static + boolean, string, int...

		// Llamadas a mis otros métodos:
		main1();
		main2();
	}

	public static int suma() {
		int i = 13;
		int j = 67;
		return i + j; // no podría devolver por ejemplo un decimal, tiene q coincidir tipo de dato
	} // devolvería siempre lo mismo, si quiero hacerlo más flexible:

	public static int suma1(int i, int j) {
		return i + j;

	}

	public static void main1() {
		System.out.println(suma1(4, 9)); // uno se asigna a la i y otro a la j
	}

	// Otra opción:
	public static void main2() {
		int num1 = 3;
		int num2 = 6;
		System.out.println(suma1(num1, num2)); // de nuevo, uno se asigna a la i y otro a la j
		
		int ashkj = suma1(1,2); //Forma de guardar el resultado de una función en una variable
		System.out.println(ashkj);
	}

}
