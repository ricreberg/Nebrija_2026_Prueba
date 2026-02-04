//-------------------------- 17-10-25
package trimestre1.clases.clase06__F__;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// -----------------------------
		// SWITCH CASE
		// -----------------------------
		int i = 1;

		switch (i) {
		case 10:
			System.out.println("El valor es 10");
			break;
		case 11:
			System.out.println("El valor es 11");
			break;
		default:
			System.out.println("No sé qué número es");
		}

		// Puedes unir dos cases y que hagan lo mismo antes del break
		int j = 10;

		switch (j) {
		case 10:
			System.out.println("Hola"); // si j es 10 entra aquí
		case 11:
			System.out.println("El valor es 11");
			break;
		default:
			System.out.println("No sé qué número es");
		}

		// -----------------------------
		// ESTRUCTURA DE CONTROL TRY-CATCH
		// -----------------------------
		// Sirve para capturar errores y evitar que el programa se detenga
		try {
			int k = 10 / 0; // provocamos un error (división por 0)
			System.out.println(k);
		} catch (Exception e) {
			System.out.println("No se puede ejecutar: " + e.getMessage());
		}

		System.out.println("Continúo con el código"); // el programa sigue

		// -----------------------------
		// SCANNER (ENTRADA POR TECLADO)
		// -----------------------------
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce un número: ");
		try {
			int numero = sc.nextInt();
			System.out.println("El número es: " + numero);
		} catch (Exception e) {
			System.out.println("Has introducido algo que no es un número");
			sc.nextLine(); // limpiar el buffer
		}

		// Ejemplo combinando texto y número
		sc.nextLine(); // limpiar buffer después de nextInt
 
		String texto = "";
		int edad = 0;

		try {
			System.out.print("Introduce tu edad: ");
			edad = sc.nextInt();
			sc.nextLine(); // limpiar buffer

			System.out.print("Introduce un texto: ");
			texto = sc.nextLine();

		} catch (Exception e) {
			System.out.println("Has introducido un valor incorrecto");
		}

		System.out.println("El texto es: " + texto + " y la edad es " + edad);

		sc.close(); // cerrar el Scanner al final
	}
}
