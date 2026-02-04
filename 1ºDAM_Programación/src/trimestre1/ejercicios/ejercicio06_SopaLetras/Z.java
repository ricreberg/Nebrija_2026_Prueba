//----------------------- 7-11

package trimestre1.ejercicios.ejercicio06_SopaLetras;

import java.util.Arrays;
import java.util.Random;
import javax.swing.plaf.TreeUI;

public class Z {

	public static void main(String[] args) {
		sopaLetras();
	}

	public static void sopaLetras() {

		boolean encontrada;
		String palabra = "";
		char caracter_inical;
		int j_posicion_inicial, k_posicion_inicial, posicion_j, posicion_k;
		char[][] sopaLetras = { { 'Y', 'W', 'D', 'E', 'N', 'V', 'U', 'D', 'M', 'R' },
				{ 'A', 'Q', 'C', 'V', 'U', 'J', 'Y', 'O', 'A', 'D' },
				{ 'O', 'L', 'W', 'T', 'N', 'M', 'G', 'M', 'Z', 'J' },
				{ 'W', 'E', 'G', 'T', 'G', 'I', 'A', 'P', 'R', 'V' },
				{ 'F', 'G', 'N', 'U', 'D', 'R', 'X', 'L', 'L', 'B' },
				{ 'Q', 'J', 'B', 'O', 'R', 'K', 'W', 'X', 'N', 'R' },
				{ 'K', 'E', 'C', 'O', 'B', 'I', 'I', 'U', 'A', 'I' },
				{ 'D', 'F', 'R', 'S', 'O', 'L', 'T', 'W', 'W', 'I' },
				{ 'B', 'P', 'S', 'V', 'P', 'L', 'J', 'M', 'U', 'G' },
				{ 'K', 'T', 'S', 'V', 'Z', 'O', 'C', 'H', 'O', 'D' } };

		String[] palabras = { "PROGRAMAR", "ALGORITMO", "DEBUG", "CODIGO" };

		int[][] direcciones = { { 0, 1 }, // derecha
				{ 0, -1 }, // izquierda
				{ 1, 0 }, // abajo
				{ -1, 0 }, // arriba
				{ 1, 1 }, // diag abajo-dcha
				{ -1, 1 }, // diag arriba-dcha
				{ -1, -1 }, // diag arriba-izda
				{ 1, -1 } // diag abajo-izda
		};

		for (int i = 0; i < palabras.length; i++) {
			for (int j = 0; j < sopaLetras.length; j++) {
				for (int k = 0; k < sopaLetras.length; k++) {
					if (sopaLetras[j][k] == palabras[i].charAt(0)) {
						j_posicion_inicial = j;
						k_posicion_inicial = k;
						posicion_j = j;
						posicion_k = k;

						for (int n = 0; n < direcciones.length; n++) {
							int contador = 0;
							int index_palabra = 0;
							while (contador < palabras[i].length()) {
								posicion_j += direcciones[n][0];
								posicion_k += direcciones[n][0];
								System.out.println(palabras[i] + " " + index_palabra);
								if (sopaLetras[posicion_j][posicion_k] == palabras[i].charAt(index_palabra)) {
									System.out
											.print("estamos en la direccion " + direcciones[n][0] + direcciones[n][1]);
									index_palabra++;
								} else {
									index_palabra++;
								}
							}

						}

					}
				}
			}
		}
	}
}
