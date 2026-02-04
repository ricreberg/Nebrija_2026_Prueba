package trimestre1.ejercicios.ejercicio03_AdivinaElNumero;
// El archivo pertenece al paquete "ejercicios".

import java.util.Scanner;
import java.util.Random;
// Se importan Scanner para leer del teclado y Random para generar números aleatorios.

public class Comentado {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // Lector para entradas del usuario.
		Random rd = new Random();            // Generador de números aleatorios.

		int modo = 0; // Variable donde se guarda el modo de juego elegido.
		int numsec = rd.nextInt(1, 101); 
		// Genera el número secreto entre 1 y 100.

		System.out.println(
				"Bienvenido/a! El objetivo de este  juego es tratar de adivinar el número secreto, el cual se genera aleatoriamente del 1 al 100 (incluidos), mediante las pistas que se proporcionan.");

		// Bucle que pide el modo de juego hasta que se introduzca 1 o 2.
		while (modo != 1 && modo != 2) {
			System.out.print("A continuación, elige el modo de juego (1: vidas infinitas, 2: vidas limitadas): ");

			try {
				modo = sc.nextInt(); // Lee el modo introducido.

				if (modo == 1) {
					System.out.println("Has elegido el modo de vidas infinitas.");
				} else if (modo == 2) {
					System.out.println("Has elegido el modo de vidas limitadas.");
					System.out.println("Empezarás con 5 vidas, y cada intento incorrecto te restará una.");
				} else {
					// Caso en que se introduce un número distinto a 1 o 2.
					System.out.println("Opción no válida. Debes elegir 1 o 2.");
				}

			} catch (Exception e) {
				// Caso en que se introduce algo que no es un número.
				System.out.println("Has introducido algo que no es válido. Por favor, introduce un número.");
				sc.nextLine(); // Limpia el buffer.
			}

		}

		// ---------------------------------------------------------------------
		// ------------------------- MODO 1: VIDAS INFINITAS -------------------
		// ---------------------------------------------------------------------
		if (modo == 1) {
			int numjug = 0;      // Número introducido por el jugador.
			int contnumjug = 0;  // Contador de intentos realizados.
			int numalto = 0;     // Número más alto introducido.
			int numbajo = 100;   // Número más bajo introducido.

			// Bucle hasta adivinar el número.
			while (numjug != numsec) {
				System.out.print("Introduce un número del 1 al 100: ");

				try {
					numjug = sc.nextInt(); // Lee el número.

					if (numjug > numsec && numjug < 101 && numjug > 0) {
						// Número demasiado alto.
						System.out.println("Demasiado alto!");
						contnumjug++;

						// Actualización de máximos y mínimos.
						if (numjug > numalto) numalto = numjug;
						if (numjug < numbajo) numbajo = numjug;

					} else if (numjug < numsec && numjug < 101 && numjug > 0) {
						// Número demasiado bajo.
						System.out.println("Demasiado bajo!");
						contnumjug++;

						if (numjug > numalto) numalto = numjug;
						if (numjug < numbajo) numbajo = numjug;

					} else if (numjug == numsec) {
						// Número correcto → victoria.
						System.out.println("Correcto! Has ganado!!");
						contnumjug++;

						if (numjug > numalto) numalto = numjug;
						if (numjug < numbajo) numbajo = numjug;

						// Muestra resumen final.
						System.out.println("RESUMEN:");
						System.out.println("El número secreto era " + numsec);
						System.out.println("Has realizado un total de " + contnumjug + " intentos");
						System.out.println("El número más alto que has introducido ha sido " + numalto);
						System.out.println("El número más bajo que has introducido ha sido " + numbajo);
						System.out.println("Gracias por jugar!");
						break;
					} else {
						// Número fuera del rango 1–100.
						System.out.println("Opción no válida. Debes elegir un número entre 1 o 2.");
					}

				} catch (Exception e) {
					// El usuario introdujo algo que no es un número.
					System.out.println("Has introducido algo que no es un número.");
					sc.nextLine();
				}

			}
		}

		// ---------------------------------------------------------------------
		// ------------------------ MODO 2: VIDAS LIMITADAS --------------------
		// ---------------------------------------------------------------------
		if (modo == 2) {
			int numjug = 0;      // Número introducido por el jugador.
			int contnumjug = 0;  // Intentos realizados.
			int vidas = 5;       // Vidas iniciales.
			int numalto = 0; 
			int numbajo = 100;

			while (numjug != numsec) {
				System.out.print("Introduce un número del 1 al 100: ");

				try {
					numjug = sc.nextInt(); // Lee el número.

					// ---------------------- Demasiado alto ----------------------
					if (numjug > numsec && numjug < 101 && numjug > 0) {
						vidas--; // Pierde una vida.

						if (vidas != 1 && vidas > 0) {
							// Mensaje si quedan varias vidas.
							System.out.println("Demasiado alto! Te quedan " + vidas + " vidas.");
							contnumjug++;

							// Actualización de máximos/mínimos.
							if (numjug > numalto) numalto = numjug;
							if (numjug < numbajo) numbajo = numjug;

						} else if (vidas == 1 && vidas > 0) {
							// Mensaje especial si queda 1 vida.
							System.out.println("Demasiado alto! Te queda " + vidas + " vida.");
							contnumjug++;

							if (numjug > numalto) numalto = numjug;
							if (numjug < numbajo) numbajo = numjug;
						}

						// Caso: sin vidas → derrota.
						if (vidas == 0) {
							System.out.println("Te has quedado sin vidas! Has perdido.");
							contnumjug++;

							if (numjug > numalto) numalto = numjug;
							if (numjug < numbajo) numbajo = numjug;

							// Resumen de derrota.
							System.out.println("RESUMEN:");
							System.out.println("El número secreto era " + numsec);
							System.out.println("Has realizado un total de " + contnumjug + " intentos");
							System.out.println("El número más alto que has introducido ha sido " + numalto);
							System.out.println("El número más bajo que has introducido ha sido " + numbajo);
							System.out.println("Gracias por jugar!");
							break;
						}

					// ---------------------- Demasiado bajo ----------------------
					} else if (numjug < numsec && numjug < 101 && numjug > 0) {
						vidas--;

						if (vidas != 1 && vidas > 0) {
							System.out.println("Demasiado bajo! Te quedan " + vidas + " vidas.");
							contnumjug++;

							if (numjug > numalto) numalto = numjug;
							if (numjug < numbajo) numbajo = numjug;

						} else if (vidas == 1 && vidas > 0) {
							System.out.println("Demasiado bajo! Te queda " + vidas + " vida.");
							contnumjug++;
							contnumjug++; // LINEA QUE NO TOCO — está en tu código original.

							if (numjug > numalto) numalto = numjug;
							if (numjug < numbajo) numbajo = numjug;
						}

						if (vidas == 0) {
							System.out.println("Te has quedado sin vidas! Has perdido.");
							System.out.println("RESUMEN:");
							System.out.println("El número secreto era " + numsec);
							System.out.println("Has realizado un total de " + contnumjug + " intentos.");
							System.out.println("El número más alto que has introducido ha sido " + numalto);
							System.out.println("El número más bajo que has introducido ha sido " + numbajo);
							System.out.println("Gracias por jugar!");
							break;
						}

					// ---------------------------- Acierto ----------------------------
					} else if (numjug == numsec) {
						System.out.println("Correcto! Has ganado!!");
						contnumjug++;

						if (numjug > numalto) numalto = numjug;
						if (numjug < numbajo) numbajo = numjug;

						// Resumen de victoria.
						System.out.println("RESUMEN:");
						System.out.println("El número secreto era " + numsec);
						System.out.println("Has tenido un total de " + contnumjug + " intentos");
						System.out.println("El número más alto que has introducido ha sido " + numalto);
						System.out.println("El número más bajo que has introducido ha sido " + numbajo);
						System.out.println("Gracias por jugar!");
						break;

					} else {
						// Número fuera del rango.
						System.out.println("Opción no válida. Debes elegir un número entre 1 o 2.");
					}

				} catch (Exception e) {
					// Entrada no numérica.
					System.out.println("Has introducido algo que no es un número");
					sc.nextLine();
				}

			}
		}
	}
}
