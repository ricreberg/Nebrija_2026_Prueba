//----------------------- 10-11

package trimestre1.ejercicios.ejercicio06_SopaLetras;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		sopaLetras();
	}

	public static void sopaLetras() {

		char[][] sopaLetras = { //
				{ 'W', 'W', 'D', 'E', 'N', 'V', 'U', 'D', 'M', 'R' },
				{ 'A', 'Q', 'C', 'O', 'D', 'I', 'G', 'O', 'O', 'R' },
				{ 'W', 'Q', 'Y', 'G', 'N', 'I', 'T', 'S', 'I', 'L' },
				{ 'Q', 'K', 'A', 'L', 'G', 'O', 'R', 'I', 'T', 'M' },
				{ 'Q', 'D', 'Q', 'V', 'X', 'I', 'L', 'V', 'N', 'R' },
				{ 'K', 'U', 'D', 'S', 'E', 'T', 'A', 'L', 'I', 'N' },
				{ 'D', 'E', 'B', 'U', 'G', 'C', 'O', 'D', 'E', 'M' },
				{ 'P', 'R', 'O', 'G', 'R', 'A', 'M', 'A', 'R', 'R' },
				{ 'V', 'Z', 'O', 'C', 'M', 'H', 'O', 'D', 'D', 'O' },
				{ 'S', 'W', 'Z', 'O', 'C', 'M', 'H', 'O', 'D', 'O' } };

		String[] palabras = { "PROGRAMAR", "ALGORITMO", "DEBUG", "CODIGO" };

		int[][] direcciones = { //
				{ 0, 1 }, // derecha
				{ 0, -1 }, // izquierda
				{ 1, 0 }, // abajo
				{ -1, 0 }, // arriba
				{ 1, 1 }, // diag abajo-dcha
				{ -1, 1 }, // diag arriba-dcha
				{ -1, -1 }, // diag arriba-izda
				{ 1, -1 } // diag abajo-izda
		};

		for (int contadorPalabra = 0; contadorPalabra < palabras.length; contadorPalabra++) {
			String palabra = palabras[contadorPalabra];
			boolean palabraEncontrada = false;

			for (int i = 0; i < sopaLetras.length; i++) {
				for (int j = 0; j < sopaLetras[i].length; j++) {
					for (int indiceDirecciones = 0; indiceDirecciones < direcciones.length; indiceDirecciones++) {
						if (palabra.charAt(0) == sopaLetras[i][j]) {
							String palabraCompletar = "";

							for (int indicePalabra = 0; indicePalabra < palabra.length(); indicePalabra++) {
								try {
									int ejeX = direcciones[indiceDirecciones][0];
									int ejeY = direcciones[indiceDirecciones][1];
									palabraCompletar += sopaLetras[i + ejeX * indicePalabra][j + ejeY * indicePalabra];
								} catch (Exception e) {
									break;
								}
							}

							if (palabra.equals(palabraCompletar)) {
								palabraEncontrada = true;
								System.out.println("La palabra " + palabra + " se encuentra en [" + i + "," + j + "]"
										+ " en la dirección " + Arrays.toString(direcciones[indiceDirecciones]));
							}
						}
					}
				}
			}

			if (!palabraEncontrada) {
				System.out.println("La palabra " + palabra + " no se encuentra en la sopa de letras");
			}
		}
	}
}
