//----------------------------------- 10-12
package trimestre1.clases.clase14;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		debug0();
	}

	// ------------------------- DEBUGS
	public static void debug0() {

		// Doble click, se pone un punto de stop

		char[][] sopaLetras = { 
				{ 'Y', 'W', 'D', 'E', 'N', 'V', 'U', 'D', 'M', 'R' },
				{ 'A', 'Q', 'C', 'V', 'U', 'J', 'Y', 'O', 'A', 'D' },
				{ 'O', 'L', 'W', 'T', 'N', 'M', 'G', 'M', 'Z', 'J' },
				{ 'W', 'E', 'G', 'T', 'G', 'I', 'A', 'P', 'R', 'V' },
				{ 'F', 'G', 'N', 'U', 'D', 'R', 'X', 'L', 'L', 'B' },
				{ 'Q', 'J', 'B', 'O', 'G', 'K', 'W', 'X', 'N', 'R' },
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

		for (int contadorPalabra = 0; contadorPalabra < palabras.length; contadorPalabra++) {
			String palabra = palabras[contadorPalabra];
			boolean palabraEncontrada = false;
			for (int i = 0; i < sopaLetras.length; i++) {
				for (int j = 0; j < sopaLetras[i].length; j++) {
					for (int indiceDirecciones = 0; indiceDirecciones < direcciones.length; indiceDirecciones++) {
						if (palabra.charAt(0) == sopaLetras[i][j]) {
							String palabraACompletar = "";
							for (int indicePalabra = 0; indicePalabra < palabra.length(); indicePalabra++) {
								try {
									int ejeX = direcciones[indiceDirecciones][0];
									int ejeY = direcciones[indiceDirecciones][1];
									palabraACompletar += sopaLetras[i + ejeX * indicePalabra][j + ejeY * indicePalabra];
								} catch (Exception e) {
									break;
								}
							}
							if (palabra.equals(palabraACompletar)) {
								palabraEncontrada = true;
								System.out.println("La palabra " + palabra + " se encuentra en [" + i + "," + j
										+ "] en la dirección" + ":" + Arrays.toString(direcciones[indiceDirecciones]));
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