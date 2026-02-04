package trimestre1.ejercicios.ejercicio03_AdivinaElNumero;

import java.util.Scanner;
import java.util.Random;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random rd = new Random();

		int modo = 0;
		int numsec = rd.nextInt(1, 101);
		System.out.println(
				"Bienvenido/a! El objetivo de este  juego es tratar de adivinar el número secreto, el cual se genera aleatoriamente del 1 al 100 (incluidos), mediante las pistas que se proporcionan.");
		while (modo != 1 && modo != 2) {
			System.out.print("A continuación, elige el modo de juego (1: vidas infinitas, 2: vidas limitadas): ");

			try {
				modo = sc.nextInt();
				if (modo == 1) {
					System.out.println("Has elegido el modo de vidas infinitas.");
				} else if (modo == 2) {
					System.out.println("Has elegido el modo de vidas limitadas.");
					System.out.println("Empezarás con 5 vidas, y cada intento incorrecto te restará una.");
				} else {
					System.out.println("Opción no válida. Debes elegir 1 o 2.");

				}

			} catch (Exception e) {
				System.out.println("Has introducido algo que no es válido. Por favor, introduce un número.");
				sc.nextLine();
			}

		}

		if (modo == 1) {
			int numjug = 0;
			int contnumjug = 0;
			int numalto = 0;
			int numbajo = 100;

			while (numjug != numsec) {
				System.out.print("Introduce un número del 1 al 100: ");
				try {
					numjug = sc.nextInt();

					if (numjug > numsec && numjug < 101 && numjug > 0) {
						System.out.println("Demasiado alto!");
						contnumjug++;
						if (numjug > numalto) {
							numalto = numjug;
						}
						if (numjug < numbajo) {
							numbajo = numjug;
						}

					} else if (numjug < numsec && numjug < 101 && numjug > 0) {
						System.out.println("Demasiado bajo!");
						contnumjug++;
						if (numjug > numalto) {
							numalto = numjug;
						}
						if (numjug < numbajo) {
							numbajo = numjug;
						}

					} else if (numjug == numsec) {
						System.out.println("Correcto! Has ganado!!");
						contnumjug++;
						if (numjug > numalto) {
							numalto = numjug;
						}
						if (numjug < numbajo) {
							numbajo = numjug;
						}

						System.out.println("RESUMEN:");
						System.out.println("El número secreto era " + numsec);
						System.out.println("Has realizado un total de " + contnumjug + " intentos");
						System.out.println("El número más alto que has introducido ha sido " + numalto);
						System.out.println("El número más bajo que has introducido ha sido " + numbajo);
						System.out.println("Gracias por jugar!");
						break;
					} else {
						System.out.println("Opción no válida. Debes elegir un número entre 1 o 2.");
					}
				} catch (Exception e) {
					System.out.println("Has introducido algo que no es un número.");
					sc.nextLine();
				}

			}
		}

		if (modo == 2) {
			int numjug = 0;
			int contnumjug = 0;
			int vidas = 5;
			int numalto = 0;
			int numbajo = 100;

			while (numjug != numsec) {
				System.out.print("Introduce un número del 1 al 100: ");
				try {
					numjug = sc.nextInt();

					if (numjug > numsec && numjug < 101 && numjug > 0) {
						vidas--;
						if (vidas != 1 && vidas > 0) {
							System.out.println("Demasiado alto! Te quedan " + vidas + " vidas.");
							contnumjug++;
							if (numjug > numalto) {
								numalto = numjug;
							}
							if (numjug < numbajo) {
								numbajo = numjug;
							}
						} else if (vidas == 1 && vidas > 0) {
							System.out.println("Demasiado alto! Te queda " + vidas + " vida.");
							contnumjug++;
							if (numjug > numalto) {
								numalto = numjug;
							}
							if (numjug < numbajo) {
								numbajo = numjug;
							}
						}
						if (vidas == 0) {
							System.out.println("Te has quedado sin vidas! Has perdido.");
							contnumjug++;
							if (numjug > numalto) {
								numalto = numjug;
							}
							if (numjug < numbajo) {
								numbajo = numjug;
							}
							System.out.println("RESUMEN:");
							System.out.println("El número secreto era " + numsec);
							System.out.println("Has realizado un total de " + contnumjug + " intentos");
							System.out.println("El número más alto que has introducido ha sido " + numalto);
							System.out.println("El número más bajo que has introducido ha sido " + numbajo);
							System.out.println("Gracias por jugar!");
							break;
						}

					} else if (numjug < numsec && numjug < 101 && numjug > 0) {
						vidas--;
						if (vidas != 1 && vidas > 0) {
							System.out.println("Demasiado bajo! Te quedan " + vidas + " vidas.");
							contnumjug++;
							if (numjug > numalto) {
								numalto = numjug;
							}
							if (numjug < numbajo) {
								numbajo = numjug;
							}
						} else if (vidas == 1 && vidas > 0) {
							System.out.println("Demasiado bajo! Te queda " + vidas + " vida.");
							contnumjug++;
							contnumjug++;
							if (numjug > numalto) {
								numalto = numjug;
							}
							if (numjug < numbajo) {
								numbajo = numjug;
							}
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
					} else if (numjug == numsec) {
						System.out.println("Correcto! Has ganado!!");
						contnumjug++;
						if (numjug > numalto) {
							numalto = numjug;
						}
						if (numjug < numbajo) {
							numbajo = numjug;
						}
						System.out.println("RESUMEN:");
						System.out.println("El número secreto era " + numsec);
						System.out.println("Has tenido un total de " + contnumjug + " intentos");
						System.out.println("El número más alto que has introducido ha sido " + numalto);
						System.out.println("El número más bajo que has introducido ha sido " + numbajo);
						System.out.println("Gracias por jugar!");
						break;
					} else {
						System.out.println("Opción no válida. Debes elegir un número entre 1 o 2.");
					}
				} catch (Exception e) {
					System.out.println("Has introducido algo que no es un número");
					sc.nextLine();
				}

			}
		}
	}
}