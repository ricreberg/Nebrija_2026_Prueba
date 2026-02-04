//----------------------------------- 30-10
package trimestre1.ejercicios.ejercicio04_Arrays;

import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		ejercicioNoCuadrada();
	}

	public static void ejercicio1() {
		// 1. Crea un array de enteros y calcula la suma total de sus elementos.
		int[] arrayEnteros = { 1, 2, 60, 76, 81, 90 }; // al asignar los elementos así no tengo q definir la capacidad,
														// ya q se sobre entiende q es de 6.

		int suma = 0;
		for (int i = 0; i < arrayEnteros.length; i++) {
			suma += arrayEnteros[i];
		}
		System.out.println("--" + suma + "--");

		// OPCIONAL (si quiero además ver cada uno de los números q se han sumado
		mostrarArray(arrayEnteros);
	}

	public static void ejercicio2() {
		// 2. Dado un array de enteros, encuentra el valor máximo y el mínimo.

		Random rd = new Random();

		int[] arrayEnteros = new int[6];
		int max = 0;
		int min = 101;

		for (int i = 0; i < arrayEnteros.length; i++) {
			arrayEnteros[i] = rd.nextInt(100);
		}

		for (int i = 0; i < arrayEnteros.length; i++) {
			if (arrayEnteros[i] > max) {
				max = arrayEnteros[i];
			}
			if (arrayEnteros[i] < min) {
				min = arrayEnteros[i]; // no se puede poner como min = i
			}
		}
		System.out.println("El valor máximo del array es " + max + ", mientras que el mínimo es " + min);
		mostrarArray(arrayEnteros);

	}

	public static void ejercicio3() {
		// 3. Usa un array de double para almacenar notas y calcula la media aritmética.

		Random rd = new Random();

		double[] arrayDouble = new double[6];
		for (int i = 0; i < arrayDouble.length; i++) {
			arrayDouble[i] = rd.nextDouble(10.00);
		}

		double suma = 0;
		for (int i = 0; i < arrayDouble.length; i++) {
			suma += arrayDouble[i];
		}

		double media = suma / arrayDouble.length;

		media = Math.round(media * 100.0) / 100.0; // Redondear la media a 2 decimales
		System.out.println("--" + media + "--");

		mostrarArray2(arrayDouble);
	}

	public static void ejercicio4() {
		// 4. Recorre un array de enteros y cuenta cuántos son pares y cuántos impares.

		Random rd = new Random();

		int[] arrayEnteros = new int[10];

		for (int i = 0; i < arrayEnteros.length; i++) {
			arrayEnteros[i] = rd.nextInt(100);
		}

		int pares = 0;
		// podría declarar una variable impares, pero voy a hacerlo restando al total
		// del array los pares
		for (int i = 0; i < arrayEnteros.length; i++) {

			if (arrayEnteros[i] % 2 == 0) {
				pares++;
			}

		}
		System.out.println("La cantidad de números pares es de " + pares + ", mientras que el de impares es de "
				+ (arrayEnteros.length - pares));
		mostrarArray(arrayEnteros);
	}

	public static void ejercicio5() {
		// 5. Crea un método que reciba un array y devuelva otro con los elementos en
		// orden inverso.

		Random rd = new Random();

		int[] arrayEnteros = new int[10];
		int[] arrayEnterosReves = new int[10];

		for (int i = 0; i < arrayEnteros.length; i++) {
			arrayEnteros[i] = rd.nextInt(100);

			for (int j = 0; i < arrayEnterosReves.length; j++) {
				arrayEnterosReves[j] = arrayEnteros[i] - (arrayEnteros.length - i - 1);
			}

		}
	}

	public static void ejercicioBidimensional() { // 5-11

		Random rd = new Random();

		// MÉTODO 1 PARA RELLENAR
		int[][] numeros = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, { 10, 11, 12 } };

		// MÉTODO 2
		int[][] matriz = new int[4][3];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = rd.nextInt(10);
			}

		}

		// MÉTODO 3
		int[][] matriz2 = new int[4][3];
		for (int i = 0; i < matriz2.length; i++) {
			for (int j = 0; j < matriz2[i].length; j++) {
				matriz2[i][j] = i * 3 + j + 1;

			}

		}

		// PRINT MÉTODO 1
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {
				System.out.print(numeros[i][j] + " ");
			}
			System.out.println(" \n");

		}

		System.out.println();

		// PRINT MÉTODO 2
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println(" \n");

		}

		System.out.println();

		// PRINT MÉTODO 3
		for (int i = 0; i < matriz2.length; i++) {
			for (int j = 0; j < matriz2[i].length; j++) {
				System.out.print(matriz2[i][j] + " ");
			}
			System.out.println(" \n");

		}

	}

	public static void ejercicioNoCuadrada() { // 17-11
		Random rd = new Random();
		Random rd1 = new Random();

		System.out.println("\n");

		int[][] cuadricula = new int[6][];

		// Asigno filas aleatoriamente
		for (int i = 0; i < cuadricula.length; i++) {
			int fil = rd.nextInt(10);
			cuadricula[i] = new int[fil + 1];
		}

		// Asigno contenido aleatorio
		for (int i = 0; i < cuadricula.length; i++) {
			for (int j = 0; j < cuadricula[i].length; j++) {
				cuadricula[i][j] = rd1.nextInt(10);
			}
		}

		// Print matriz
		for (int i = 0; i < cuadricula.length; i++) {
			for (int j = 0; j < cuadricula[i].length; j++) {
				System.out.print(cuadricula[i][j] + " ");
			}
			System.out.println("");
		}
		System.out.println("\n");

	}

	/*
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

	public static void mostrarArray(int[] array) {
		System.out.println("Contenido del array:"); // se pone fuera del bucle ya que si no repite "contenido del array"
													// con cada número
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

	public static void mostrarArray2(double[] array) {
		System.out.println("Contenido del array:"); // se pone fuera del bucle ya que si no repite "contenido del array"
													// con cada número
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

}