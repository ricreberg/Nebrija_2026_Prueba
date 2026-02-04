//----------------------- 13-11

package trimestre1.ejercicios.ejercicio07_CuatroEnRaya;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		cuatroRaya();
	}

	public static void cuatroRaya() {
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);

		System.out.println(
				"Bienvenidos al juego del cuatro en raya. El jugador 1 utilizará las 'O' y el jugador 2 las 'X' \n");

		// RELLENAR CUADRÍCULA VACÍA
		char[][] cuadricula = new char[6][7];
		for (int i = 0; i < cuadricula.length; i++) {
			for (int j = 0; j < cuadricula[i].length; j++) {
				cuadricula[i][j] = '_';
			}
		}

		// PRINT CUADRÍCULA VACÍA
		for (int i = 0; i < cuadricula.length; i++) {
			for (int j = 0; j < cuadricula[i].length; j++) {
				System.out.print(cuadricula[i][j] + " ");
			}
			System.out.println("");
		}
		System.out.println("\n");

		System.out.println("Se va a elegir aleatoriamente que jugador empieza.");

		boolean jugador = rd.nextBoolean();
		int numcol = 0;
		int jugada = 0;
		boolean linea1Encontrada = false;
		boolean linea2Encontrada = false;


		int[][] direcciones = { //
				{ 0, 1 }, // derecha
				{ 1, 0 }, // abajo
				{ 1, 1 }, // diag abajo-dcha
				{ -1, 1 }, // diag arriba-dcha
				
		};

		while (jugada != 43 && linea1Encontrada != true && linea2Encontrada != true) {

			if (jugador == true) {
				System.out.println("Turno del jugador 1. Por favor, selecciona una columna (del 1 al 7): ");
			} else {
				System.out.println("Turno del jugador 2. Por favor, selecciona una columna (del 1 al 7): ");
			}

			try {
				numcol = sc.nextInt();

				if (numcol >= 1 && numcol <= 7) {
					boolean colocada = false;
					System.out.println("Has elegido colocar ficha en la columna " + numcol + ".\n");
					numcol = numcol - 1;
					jugada++;

					for (int i = cuadricula.length - 1; i >= 0; i--) {
						if (cuadricula[i][numcol] == '_') {
							if (jugador == true) {
								cuadricula[i][numcol] = 'O';
							} else {
								cuadricula[i][numcol] = 'X';
							}
							colocada = true;
							break;
						}
					}

					if (!colocada) {
						System.out.println("Esa columna está llena, elige otra.");
						continue;
					}

					// PRINT CUADRÍCULA
					for (int i = 0; i < cuadricula.length; i++) {
						for (int j = 0; j < cuadricula[i].length; j++) {
							System.out.print(cuadricula[i][j] + " ");
						}
						System.out.println("");
					}
					System.out.println("\n");

					jugador = !jugador;

					// ----------- DETECCIÓN DE LÍNEA -------------
					String compr1 = "OOOO";
					String compr2 = "XXXX";
					
					for (int i = 0; i < cuadricula.length; i++) {
						for (int j = 0; j < cuadricula[i].length; j++) {
							for (int indiceDirecciones = 0; indiceDirecciones < direcciones.length; indiceDirecciones++) {

								if (compr1.charAt(0) == cuadricula[i][j] || compr2.charAt(0) == cuadricula[i][j]) {

									String lineaCompletar = "";

									for (int indiceLinea = 0; indiceLinea < compr1.length(); indiceLinea++) {
										try {
											int ejeX = direcciones[indiceDirecciones][0];
											int ejeY = direcciones[indiceDirecciones][1];
											lineaCompletar += cuadricula[i + ejeX * indiceLinea][j
													+ ejeY * indiceLinea];
										} catch (Exception e) {
											break;
										}
									}

									if (compr1.equals(lineaCompletar)) {
										linea1Encontrada = true;
										System.out.println("El jugador 1 (O) ha hecho línea en [" + i + "," + j + "]"
												+ " en la dirección "
												+ Arrays.toString(direcciones[indiceDirecciones]));

										System.out.println("\n---Ha ganado el jugador 1 (O)---");
										
									} else if (compr2.equals(lineaCompletar)) {
										linea2Encontrada = true;
										System.out.println("El jugador 2 (X) ha hecho línea en [" + i + "," + j + "]"
												+ " en la dirección "
												+ Arrays.toString(direcciones[indiceDirecciones]));
										System.out.println("\n---Ha ganado el jugador 2 (X)---");
										
									}
								}
							}
						}
					}
					// ----------- FIN DETECCIÓN DE LÍNEA -----------

				} else {
					System.out.println("\nOpción no válida. Debes elegir una posición del 1 al 7.");
				}

			} catch (Exception e) {
				System.out.println("\nHas introducido algo que no es válido. Por favor, introduce un número.");
				sc.nextLine();
			}

		} // <-- cierre del while
		
		System.out.println("\n--Fin de la partida--");
		sc.close();
		} 

} 
