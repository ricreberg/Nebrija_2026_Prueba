package trimestre1.ejercicios.ejercicio05_Sudoku;

import java.util.Arrays;

public class Resultados {

	public static void main(String[] args) {
		int[][] sudoku1 = { { 5, 3, 4, 6, 7, 8, 9, 1, 2 }, { 6, 7, 2, 1, 9, 5, 3, 4, 8 }, { 1, 9, 8, 3, 4, 2, 5, 6, 7 },
				{ 8, 5, 9, 7, 6, 1, 4, 2, 3 }, { 4, 2, 6, 8, 2, 3, 7, 9, 1 }, { 7, 1, 3, 9, 5, 4, 8, 5, 6 },
				{ 9, 6, 1, 5, 3, 7, 2, 8, 4 }, { 2, 8, 7, 4, 1, 9, 6, 3, 5 }, { 3, 4, 5, 2, 8, 6, 1, 7, 9 } };

		// Compruebo las horizontales
		boolean sudokuOK = true;
		for (int i = 0; i < sudoku1.length; i++) {
			if (!suma45(sudoku1[i])) {
				sudokuOK = false;
			}
		}
		// Compruebo las verticales
		for (int i = 0; i < sudoku1.length; i++) {
			int[] aux = new int[9];
			for (int j = 0; j < sudoku1.length; j++) {
				aux[j] = sudoku1[j][i];
			}
			if (!suma45(aux)) {
				sudokuOK = false;
			}
		}
		int[][] posicionesIniciales = { { 0, 0 }, { 0, 3 }, { 0, 6 }, { 3, 0 }, { 3, 3 }, { 3, 6 }, { 6, 0 }, { 6, 3 },
				{ 6, 6 } };
		// Compruebo los cuadrados de 3x3
		for (int pos = 0; pos < posicionesIniciales.length; pos++) {
			int[] aux = new int[9];
			int contador = 0;
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					aux[contador++] = sudoku1[posicionesIniciales[pos][0] + i][posicionesIniciales[pos][1] + j];
				}
			}
			if (!suma45(aux)) {
				sudokuOK = false;
			}
		}
		if (sudokuOK) {
			System.out.println("SUDOKU OK");
		} else {
			System.out.println("SUDOKU NO OK");
		}
	}

	public static boolean suma45(int[] arrayAAnalizar) {

		for (int j = 1; j < 10; j++) {
			boolean numeroEncontrado = false;
			for (int i = 0; i < arrayAAnalizar.length; i++) {
				if (j == arrayAAnalizar[i]) {
					numeroEncontrado = true;
				}
			}
			if (!numeroEncontrado) {
				return false;
			}
		}
		return true;
	}
}