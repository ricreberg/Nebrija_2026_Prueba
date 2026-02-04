package trimestre1.ejercicios.ejercicio05_Sudoku;

import java.util.Arrays;
import java.util.Random;

public class Main {

	public static void main(String[] args) {

		// ALEATORIO
		int[][] random = Aleatorio();

		// EJEMPLOS
		int[][] sudoku1 = { //
				{ 5, 3, 4, 6, 7, 8, 9, 1, 2 }, //
				{ 6, 7, 2, 1, 9, 5, 3, 4, 8 }, //
				{ 1, 9, 8, 3, 4, 2, 5, 6, 7 }, //
				{ 8, 5, 9, 7, 6, 1, 4, 2, 3 }, //
				{ 4, 2, 6, 8, 2, 3, 7, 9, 1 }, //
				{ 7, 1, 3, 9, 5, 4, 8, 5, 6 }, //
				{ 9, 6, 1, 5, 3, 7, 2, 8, 4 }, //
				{ 2, 8, 7, 4, 1, 9, 6, 3, 5 }, //
				{ 3, 4, 5, 2, 8, 6, 1, 7, 9 } //
		};

		int[][] sudoku2 = { //
				{ 8, 2, 7, 1, 5, 4, 3, 9, 6 }, //
				{ 9, 6, 5, 3, 2, 7, 1, 4, 8 }, //
				{ 3, 4, 1, 6, 8, 9, 7, 5, 2 }, //
				{ 5, 9, 3, 4, 6, 8, 2, 7, 1 }, //
				{ 4, 7, 2, 5, 1, 3, 6, 8, 9 }, //
				{ 6, 1, 8, 9, 7, 2, 4, 3, 5 }, //
				{ 7, 8, 6, 2, 3, 5, 9, 1, 4 }, //
				{ 1, 5, 4, 7, 9, 6, 8, 2, 3 }, //
				{ 2, 3, 9, 8, 4, 1, 5, 6, 7 } //
		};

		int[][] sudoku3 = { //
				{ 4, 3, 5, 2, 6, 9, 7, 8, 1 }, //
				{ 6, 8, 2, 5, 7, 1, 4, 9, 3 }, //
				{ 1, 9, 7, 8, 3, 4, 5, 6, 2 }, //
				{ 8, 2, 6, 1, 9, 5, 3, 4, 7 }, //
				{ 3, 7, 4, 6, 8, 2, 9, 1, 5 }, //
				{ 9, 5, 1, 7, 4, 3, 6, 2, 8 }, //
				{ 5, 1, 9, 3, 2, 6, 8, 7, 4 }, //
				{ 2, 4, 8, 9, 5, 7, 1, 3, 6 }, //
				{ 7, 6, 3, 4, 1, 8, 2, 5, 9 } //
		};

		// Pruebas
		System.out.println("SUDOKU ALEATORIO:");
		comprobar(random);

		System.out.println("SUDOKU 1 \n");
		comprobar(sudoku1);

		System.out.println("SUDOKU 2 \n");
		comprobar(sudoku2);

		System.out.println("SUDOKU 3 \n");
		comprobar(sudoku3);
	}

	public static int[][] Aleatorio() {
		Random rd = new Random();
		int[][] matriz = new int[9][9];
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = rd.nextInt(1, 10);
			}
		}
		return matriz;
	}

	public static void comprobar(int[][] matriz) {

		int[] comprobacion = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		boolean filasCorrectas = true;
		boolean columnasCorrectas = true;
		boolean cuadradosCorrectos = true;

		// PRINT SUDOKU
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println("");
		}
		System.out.println();

		// COMPRUEBA FILAS
		for (int i = 0; i < matriz.length; i++) {
			int[] fila = new int[matriz.length];
			for (int j = 0; j < matriz.length; j++) {
				fila[j] = matriz[i][j];
			}
			Arrays.sort(fila);
			if (Arrays.equals(fila, comprobacion))
				System.out.println("Fila " + (i + 1) + " correcta");
			else {
				System.out.println("Fila " + (i + 1) + " incorrecta");
				filasCorrectas = false;
			}
		}

		// COMPRUEBA COLUMNAS
		for (int j = 0; j < matriz.length; j++) {
			int[] columna = new int[matriz.length];
			for (int i = 0; i < matriz.length; i++) {
				columna[i] = matriz[i][j];
			}
			Arrays.sort(columna);
			if (Arrays.equals(columna, comprobacion))
				System.out.println("Columna " + (j + 1) + " correcta");
			else {
				System.out.println("Columna " + (j + 1) + " incorrecta");
				columnasCorrectas = false;
			}
		}

		// COMPRUEBA CUADRADOS
		for (int fil = 0; fil < matriz.length; fil += 3) {
			for (int col = 0; col < matriz.length; col += 3) {
				int[] cuadrado = new int[matriz.length];
				int k = 0;
				for (int i = fil; i < fil + 3; i++) {
					for (int j = col; j < col + 3; j++) {
						cuadrado[k++] = matriz[i][j];
					}
				}
				Arrays.sort(cuadrado);
				int numCuadrado = (fil / 3) * 3 + (col / 3) + 1;
				if (Arrays.equals(cuadrado, comprobacion))
					System.out.println("Cuadrado " + numCuadrado + " correcto");
				else {
					System.out.println("Cuadrado " + numCuadrado + " incorrecto");
					cuadradosCorrectos = false;
				}
			}
		}

		// RESUMEN
		if (filasCorrectas && columnasCorrectas && cuadradosCorrectos)
			System.out.println("\n El sudoku es correcto");
		else
			System.out.println("\n El sudoku es incorrecto");

		System.out.println("-------------------------------------\n");
	}

}
