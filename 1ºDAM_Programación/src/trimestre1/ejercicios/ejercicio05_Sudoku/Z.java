//----------------------- 6-11

package trimestre1.ejercicios.ejercicio05_Sudoku;

import java.util.Arrays;
import java.util.Random;

public class Z {

	public static void main(String[] args) {
		sudoku();
	}

	public static void sudoku() {

		Random rd = new Random();

		// RELLENA SUDOKU
		int[] comprobacion = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] comprobacion2 = new int[9];
		int[] comprobacion3 = new int[9];
		int[] comprobacion4 = new int[9];
		int[] comprobacion5 = new int[9];
		int[] comprobacion6 = new int[9];
		int[] comprobacion7 = new int[9];
		int[] comprobacion8 = new int[9];
		int[] comprobacion9 = new int[9];
		int[] comprobacion10 = new int[9];
		int con1 = 0, con2 = 0, con3 = 0, con4 = 0, con5 = 0, con6 = 0, con7 = 0, con8 = 0, con9 = 0;

		int[][] matriz = new int[9][9];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = rd.nextInt(1, 10);

			}

		}
		// PRINT SUDOKU
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println("");
		}

		// COMPRUEBA FILAS
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				comprobacion2[j] = matriz[i][j];

			}
			Arrays.sort(comprobacion2);
			if (comprobacion.equals(comprobacion2)) {
				System.out.println("La fila " + i + " es correcta");
			} else {
				System.out.println("La fila " + i + " NO es correcta");
			}
		}

		// COMPRUEBA COLUMNAS
		for (int j = 0; j < matriz.length; j++) {
			for (int i = 0; i < matriz[j].length; i++) {
				comprobacion2[j] = matriz[i][j];

			}
			Arrays.sort(comprobacion2);
			if (comprobacion.equals(comprobacion2)) {
				System.out.println("La columna " + j + " es correcta");
			} else {
				System.out.println("La columna " + j + " NO es correcta");
			}

		}

		for (int j = 0; j < matriz.length; j++) {
			for (int i = 0; i < matriz[j].length; i++) {
				comprobacion2[j] = matriz[i][j];
				if (i >= 0 || i <= 2 || j >= 0 || j <= 2) {
					comprobacion2[con1] = matriz[i][j];
				} else if (i >= 0 || i <= 2 || j >= 3 || j <= 5) {
					comprobacion3[con2] = matriz[i][j];

				} else if (i >= 0 || i <= 2 || j >= 6 || j <= 8) {
					comprobacion4[con3] = matriz[i][j];

				} else if (i >= 3 || i <= 5 || j >= 0 || j <= 2) {
					comprobacion5[con4] = matriz[i][j];

				} else if (i >= 3 || i <= 5 || j >= 3 || j <= 5) {
					comprobacion6[con5] = matriz[i][j];

				} else if (i >= 3 || i <= 5 || j >= 6 || j <= 8) {
					comprobacion7[con6] = matriz[i][j];

				} else if (i >= 6 || i <= 8 || j >= 0 || j <= 2) {
					comprobacion8[con7] = matriz[i][j];

				} else if (i >= 6 || i <= 8 || j >= 3 || j <= 5) {
					comprobacion9[con8] = matriz[i][j];

				} else if (i >= 6 || i <= 8 || j >= 6 || j <= 8) {
					comprobacion10[con9] = matriz[i][j];

				}
				if (comprobacion.equals(comprobacion2)) {
					System.out.println("El cuadrado 1  es correcto");
				} else {
					System.out.println("El cuadrado 1   NO es correcto");
				}
				if (comprobacion.equals(comprobacion3)) {
					System.out.println("El cuadrado 2  es correcto");
				} else {
					System.out.println("El cuadrado 2   NO es correcto");
				}
				if (comprobacion.equals(comprobacion4)) {
					System.out.println("El cuadrado 3  es correcto");
				} else {
					System.out.println("El cuadrado 3   NO es correcto");
				}
				if (comprobacion.equals(comprobacion5)) {
					System.out.println("El cuadrado 4  es correcto");
				} else {
					System.out.println("El cuadrado 4   NO es correcto");
				}
				if (comprobacion.equals(comprobacion6)) {
					System.out.println("El cuadrado 1  es correcto");
				} else {
					System.out.println("El cuadrado 1   NO es correcto");
				}
				if (comprobacion.equals(comprobacion7)) {
					System.out.println("El cuadrado 1  es correcto");
				} else {
					System.out.println("El cuadrado 1   NO es correcto");
				}
				if (comprobacion.equals(comprobacion8)) {
					System.out.println("El cuadrado 1  es correcto");
				} else {
					System.out.println("El cuadrado 1   NO es correcto");
				}
				if (comprobacion.equals(comprobacion9)) {
					System.out.println("El cuadrado 1  es correcto");
				} else {
					System.out.println("El cuadrado 1   NO es correcto");
				}
				if (comprobacion.equals(comprobacion10)) {
					System.out.println("El cuadrado 1  es correcto");
				} else {
					System.out.println("El cuadrado 1   NO es correcto");
				}

			}
		}
	}

	public static void ejemplos() {
		int[][] sudoku1 = { { 5, 3, 4, 6, 7, 8, 9, 1, 2 }, { 6, 7, 2, 1, 9, 5, 3, 4, 8 }, { 1, 9, 8, 3, 4, 2, 5, 6, 7 },
				{ 8, 5, 9, 7, 6, 1, 4, 2, 3 }, { 4, 2, 6, 8, 2, 3, 7, 9, 1 }, { 7, 1, 3, 9, 5, 4, 8, 5, 6 },
				{ 9, 6, 1, 5, 3, 7, 2, 8, 4 }, { 2, 8, 7, 4, 1, 9, 6, 3, 5 }, { 3, 4, 5, 2, 8, 6, 1, 7, 9 } };
		int[][] sudoku2 = { { 8, 2, 7, 1, 5, 4, 3, 9, 6 }, { 9, 6, 5, 3, 2, 7, 1, 4, 8 }, { 3, 4, 1, 6, 8, 9, 7, 5, 2 },
				{ 5, 9, 3, 4, 6, 8, 2, 7, 1 }, { 4, 7, 2, 5, 1, 3, 6, 8, 9 }, { 6, 1, 8, 9, 7, 2, 4, 3, 5 },
				{ 7, 8, 6, 2, 3, 5, 9, 1, 4 }, { 1, 5, 4, 7, 9, 6, 8, 2, 3 }, { 2, 3, 9, 8, 4, 1, 5, 6, 7 } };
		int[][] sudoku3 = { { 4, 3, 5, 2, 6, 9, 7, 8, 1 }, { 6, 8, 2, 5, 7, 1, 4, 9, 3 }, { 1, 9, 7, 8, 3, 4, 5, 6, 2 },
				{ 8, 2, 6, 1, 9, 5, 3, 4, 7 }, { 3, 7, 4, 6, 8, 2, 9, 1, 5 }, { 9, 5, 1, 7, 4, 3, 6, 2, 8 },
				{ 5, 1, 9, 3, 2, 6, 8, 7, 4 }, { 2, 4, 8, 9, 5, 7, 1, 3, 6 }, { 7, 6, 3, 4, 1, 8, 2, 5, 9 } };

	}

}
