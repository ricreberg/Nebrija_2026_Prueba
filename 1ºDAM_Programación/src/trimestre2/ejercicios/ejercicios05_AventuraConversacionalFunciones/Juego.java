package trimestre2.ejercicios.ejercicios05_AventuraConversacionalFunciones;

import java.util.Random;
import java.util.Scanner;

public class Juego {
	private final String ANSI_RESET = "\u001B[0m";
	private final String ANSI_RED = "\u001B[31m";
	private final String ANSI_GREEN = "\u001B[32m";
	private final String ANSI_YELLOW = "\u001B[33m";
	private final String ANSI_CYAN = "\u001B[36m";
	private final String ANSI_PURPLE = "\u001B[35m";

	private Random ran = new Random();
	private Scanner sc = new Scanner(System.in);
	private Personaje p;

	// FUNCIONES DE INCIO DEL JUEGO
	public void iniciar() {
		System.out.println(ANSI_PURPLE + "\n========================================================");
		System.out.println("Elige tu propia aventura VERSIÓN: LOS JUEGOS DEL HAMBRE");
		System.out.println("CREADORES: Ignacio Bobes, Ricardo Crespo, Pablo Soriano");
		System.out.println("========================================================" + ANSI_RESET);

		if (realizarLogin()) {
			int personaje_escogido = seleccionarPersonaje();
			lanzarRuta(personaje_escogido);
		}
	}

	private boolean realizarLogin() {
		String contraseña_jugador = "", contraseña = "jugones";
		System.out.println(ANSI_CYAN + "\n--- INICIO DE SESIÓN ---" + ANSI_RESET);
		System.out.println("Introduce la contraseña:");
		System.out.print(ANSI_CYAN + "> " + ANSI_RESET);
		contraseña_jugador = sc.nextLine();

		while (!contraseña.equals(contraseña_jugador)) {
			System.out.println(ANSI_RED + "\nContraseña incorrecta." + ANSI_RESET);
			System.out.println("Vuelve a intentarlo:");
			System.out.print(ANSI_CYAN + "> " + ANSI_RESET);
			contraseña_jugador = sc.nextLine();
		}
		System.out.println(ANSI_GREEN + "Inicio correcto.\n" + ANSI_RESET);
		return true;
	}

	private int seleccionarPersonaje() {
		int personaje_escogido = 0;
		do {
			System.out.println("SELECCIÓN DE PERSONAJE:");
			System.out.println("Pulse 1 para: KATNISS");
			System.out.println("Pulse 2 para: PEETA");
			System.out.println("Pulse 3 para: FINNICK");
			System.out.println("\nTu elección: ");
			System.out.print(ANSI_CYAN + "> " + ANSI_RESET);
			try {
				personaje_escogido = sc.nextInt();
				sc.nextLine();
			} catch (Exception e) {
				sc.nextLine();
				System.out.println("Valor no válido, introdúzcalo de nuevo.");
			}
		} while (personaje_escogido < 1 || personaje_escogido > 3);
		return personaje_escogido;
	}

	private void lanzarRuta(int opcion) {
		switch (opcion) {
		case 1:
			jugarKatniss();
			break;
		case 2:
			jugarPeeta();
			break;
		case 3:
			jugarFinnick();
			break;
		}
	}

	// FUNCIONES REUTILIZABLES
	private boolean resolverAnagrama() {
		String anagrama = "voluntario";
		String intento_anagrama = "";
		try {
			System.out.println("\nResuelve el siguiente anagrama:   oolntraiv");
			System.out.print(ANSI_CYAN + "> " + ANSI_RESET);
			intento_anagrama = sc.nextLine();
		} catch (Exception e) {
			sc.nextLine();
		}
		return intento_anagrama.toLowerCase().trim().equals(anagrama);
	}

	private int jugarPPT() {
		int eleccion = 0;
		int ppt_maquina = ran.nextInt(1, 4);
		do {
			try {
				System.out.println("\nPulse 1 para: Piedra.");
				System.out.println("Pulse 2 para: Papel.");
				System.out.println("Pulse 3 para: Tijera.");
				System.out.print(ANSI_CYAN + "> " + ANSI_RESET);
				eleccion = sc.nextInt();
				sc.nextLine();
			} catch (Exception e) {
				sc.nextLine();
			}
		} while (eleccion < 1 || eleccion > 3);

		if (eleccion == ppt_maquina)
			return 0; // Empate
		if ((eleccion == 1 && ppt_maquina == 3) || (eleccion == 2 && ppt_maquina == 1)
				|| (eleccion == 3 && ppt_maquina == 2))
			return 1; // Victoria
		return -1; // Derrota
	}

	private void mostrarLogo() {
		System.out.println(ANSI_YELLOW + "\n ██▓ ███▄    █  ██▓ ▄████▄   ██▓ ▄▄▄       ███▄    █      \r\n"
				+ "▓██▒ ██ ▀█   █ ▓██▒▒██▀ ▀█  ▓██▒▒████▄     ██ ▀█   █      \r\n"
				+ "▒██▒▓██  ▀█ ██▒▒██▒▒▓█    ▄ ▒██▒▒██  ▀█▄  ▓██  ▀█ ██▒     \r\n"
				+ "░██░▓██▒  ▓ ██▒░██░▒▓▓▄ ▄██▒░██░░██▄▄▄▄██ ▓██▒  ▓ ██▒     \r\n"
				+ "░██░▒██░   ▓██░░██░▒ ▓███▀ ░░██░ ▓█   ▓██▒▒██░   ▓██░     \r\n"
				+ "░▓  ░ ▒░   ▒ ▒ ░▓  ░ ░▒ ▒  ░░▓   ▒▒   ▓▒█░░ ▒░   ▒ ▒      \r\n"
				+ " ▒ ░░ ░░   ░ ▒░ ▒ ░  ░  ▒    ▒ ░  ▒   ▒▒ ░░ ░░   ░ ▒░     \r\n"
				+ " ▒ ░   ░   ░ ░  ▒ ░░         ▒ ░  ░   ▒      ░   ░ ░      \r\n"
				+ " ░           ░  ░  ░ ░       ░        ░  ░         ░      \r\n"
				+ "                   ░                                      \r\n"
				+ "             ██▓     ▒█████    ██████                     \r\n"
				+ "            ▓██▒    ▒██▒  ██▒▒██    ▒                     \r\n"
				+ "            ▒██░    ▒██░  ██▒░ ▓██▄                       \r\n"
				+ "            ▒██░    ▒██   ██░  ▒   ██▒                    \r\n"
				+ "            ░██████▒░ ████▓▒░▒██████▒▒                    \r\n"
				+ "            ░ ▒░▓  ░░ ▒░▒░▒░ ▒ ▒▓▒ ▒ ░                    \r\n"
				+ "            ░ ░ ▒  ░  ░ ▒ ▒░ ░ ░▒  ░ ░                    \r\n"
				+ "              ░ ░   ░ ░ ░ ▒  ░  ░  ░                      \r\n"
				+ "                ░  ░    ░ ░        ░                      \r\n"
				+ "                                                          \r\n"
				+ " ▄▄▄██▀▀▀█    ██ ▓█████   ▄████  ▒█████    ██████         \r\n"
				+ "   ▒██   ██  ▓██▒▓█   ▀  ██▒ ▀█▒▒██▒  ██▒▒██    ▒         \r\n"
				+ "   ░██  ▓██  ▒██░▒███   ▒██░▄▄▄░▒██░  ██▒░ ▓██▄           \r\n"
				+ "▓██▄██▓ ▓▓█  ░██░▒▓█  ▄ ░▓█  ██▓▒██   ██░  ▒   ██▒        \r\n"
				+ " ▓███▒  ▒▒█████▓ ░▒████▒░▒▓███▀▒░ ████▓▒░▒██████▒▒        \r\n"
				+ " ▒▓▒▒░  ░▒▓▒ ▒ ▒ ░░ ▒░ ░ ░▒   ▒ ░ ▒░▒░▒░ ▒ ▒▓▒ ▒ ░        \r\n"
				+ " ▒ ░▒░  ░░▒░ ░ ░  ░ ░  ░  ░   ░   ░ ▒ ▒░ ░ ░▒  ░ ░        \r\n"
				+ " ░ ░ ░   ░░░ ░ ░    ░   ░ ░   ░ ░ ░ ░ ▒  ░  ░  ░          \r\n"
				+ " ░   ░     ░        ░  ░      ░     ░ ░        ░          " + ANSI_RESET);
	}

	// FUNCIONES DE RUTAS
	private void jugarKatniss() {
		p = new Personaje("Katniss", 20);
		int eleccion = 0, vidas_mono = 25, daño = 0;
		boolean combate_finalizado = false, turno = false, voluntario = false, esquivar = false, plan = false;

		System.out.println(ANSI_RED + "\n------------------------------------------------");
		System.out.println("ERES KATNISS EVERDEEN");
		System.out.println("------------------------------------------------" + ANSI_RESET);
		System.out.println(ANSI_RED + "La Chica en Llamas. Eres el símbolo de la rebelión, lo sepas o no.\n"
				+ "Tu instinto de supervivencia es inigualable.\n"
				+ "Eres una cazadora, letal con el arco y experta en trampas.\n"
				+ "Te mueves por el bosque como una sombra.\n"
				+ "Tu debilidad es tu desconfianza; te cuesta hacer aliados y tu temperamento puede alejar a los patrocinadores."
				+ ANSI_RESET);

		System.out.println("\nEstás esperando, en poco sacarán el nombre del tributo de tu distrito.");
		System.out.println("Hay una opción mala: que salga tu nombre.");
		System.out.println("Pero salió una peor... Prim Everdeen.");
		System.out.println("Tienes que salvarla.");

		if (resolverAnagrama())
			voluntario = true;

		if (!voluntario) {
			System.out.println("\nTe quedas en silencio... miras a Prim desesperada.");
			System.out.println("La culpa te come pero no tienes la fuerza de voluntad para presentarte.");
			System.out.println(ANSI_RED + "\nFINAL 1: COBARDE" + ANSI_RESET);
			return;
		}

		System.out.println("\nTu grito silencia a la multitud: \"¡Me presento voluntaria!\".");
		System.out.println(
				"Te llevan bajo custodia al Capitolio. Tras el desfile y días de entrenamiento, llega el momento de puntuar tu valía ante los Vigilantes.");
		System.out.println("\nEntras en la habitación para mostrar habilidades, por lo que coges tu arco.\n"
				+ "Clavas tu flecha en el centro de la diana tres veces pero ves que ningún rico te está prestando atención.\n"
				+ "¿Qué haces?");

		do {
			System.out.println("\nPulse 1 para: Irte.");
			System.out.println("Pulse 2 para: Disparar a los ricos.");
			System.out.print(ANSI_CYAN + "> " + ANSI_RESET);
			try {
				eleccion = sc.nextInt();
				sc.nextLine();
			} catch (Exception e) {
				sc.nextLine();
				System.out.println("Valor no válido, introdúzcalo de nuevo.");
			}
		} while (eleccion < 1 || eleccion > 2);

		if (eleccion == 1) {
			System.out.println("\nTe vas, mostrando buena técnica y fuerza.\n"
					+ "Los participantes te han prestado atención, pero los patrocinadores no saben ni quién eres.");
		} else {
			System.out.println(
					"\nDisparas la flecha hacia la sala, golpea rompiendo una lámpara y echando cristales a la comida.\n"
							+ "Te miran con desprecio. YA SABEN QUIÉN ERES, ya tienes algo positivo y algo negativo.");
		}

		mostrarLogo();

		System.out.println("\nEstás en una oscuridad acogedora, no hay ruido, escuchas como late tu corazón.");
		System.out.println(
				"De repente notas que te mueves y te ciega una luz. Miras a tu alrededor, ves la imponente Cornucopia en el centro.");
		System.out.println(
				"Suena la bocina casi inmediatamente. Observas un arco brillando y te planteas ir a por él, pero Gloss ya está yendo hacia él.");
		System.out.println("Notas un mensaje brillante bajo el agua:\n"
				+ "\"El camino más rápido es el que nadie pisa, el reflejo marca la piedra segura\".\n"
				+ "Ves unas piedras que sobresalen y otras sumergidas que se ven por el reflejo.");

		do {
			System.out.println("\nPulse 1 para: Saltar por las piedras secas y visibles.");
			System.out.println("Pulse 2 para: Pisar donde el agua hace reflejo.");
			System.out.print(ANSI_CYAN + "> " + ANSI_RESET);
			try {
				eleccion = sc.nextInt();
				sc.nextLine();
			} catch (Exception e) {
				sc.nextLine();
			}
		} while (eleccion < 1 || eleccion > 2);

		if (eleccion == 1) {
			System.out.println(
					"\nEs una trampa, se hunden. Gloss llega antes, te quedas sin arco y pierdes 5 HP por ahogamiento.");
			p.setVidas(p.getVidas() - 5);
			p.setTenerArco(false);
		} else {
			System.out.println(
					"\nCorrecto. Son pilares de cristal invisibles. Llegas antes, coges el arco y huyes ilesa.");
			p.setTenerArco(true);
			p.setFlechas(6);
		}

		System.out.println("\nTras la situación de la cornucopia decides esconderte en el bosque para sobrevivir.\n"
				+ "Escuchas un ruido tras unos árboles.");

		do {
			System.out.println("\nPulse 1 para: Ir a comprobarlo.");
			System.out.println("Pulse 2 para: Quedarte escondida.");
			System.out.print(ANSI_CYAN + "> " + ANSI_RESET);
			try {
				eleccion = sc.nextInt();
				sc.nextLine();
			} catch (Exception e) {
				sc.nextLine();
			}
		} while (eleccion < 1 || eleccion > 2);

		if (eleccion == 1) {
			System.out.println(
					"\nEl ruido lo provocaba otra persona: WIRESS, quien está muy nerviosa y repite sin parar tic-tac tic-tac.\n"
							+ "Para calmarla y conseguir información: ENCUENTRO CON WIRESS — “APUESTA DE MANOS”");
			System.out.println("Minijuego a jugar: piedra, papel o tijera.");

			int res = jugarPPT();
			if (res == 0)
				System.out.println(
						"EMPATE: Wiress se calla, se empieza a alejar, la pierdes de vista, no sacaste nada en claro.");
			else if (res == 1) {
				System.out.println(
						"GANAS: Wiress te muestra algo brillante y te dice en un susurro: Es un reloj, Katniss.");
				p.setTenerReloj(true);
			} else
				System.out.println("PIERDES: Wiress huye pegando gritos, solo has perdido el tiempo.");
		}

		if (!p.isTenerReloj()) {
			System.out.println(
					"\nEstás descansando, tranquila, crees que nada puede salir mal, ESE SERÁ TU ÚLTIMO ERROR.");
			System.out.println(
					"Empiezas a escuchar ruidos de animales, están sufriendo, pero no sabes por qué, hasta que es demasiado tarde.");
			System.out.println("Una humareda blanca te ha rodeado, NO TIENES DÓNDE HUIR.\n"
					+ "Empiezas a notar que te cuesta respirar y empiezas a toser sangre.");
			System.out.println("HAS MUERTO: no sabías cómo funcionaba la arena.");
			System.out.println(ANSI_RED + "\nFINAL 5: LOCURA" + ANSI_RESET);
			return;
		}

		System.out.println(
				"\nEl sol cae, tu campo visual se está reduciendo, notas que el entorno vibra, hasta que aparece la razón:\n"
						+ "Un mono mutante alfa.");
		System.out.println("Solo tienes una decisión que tomar. MATAR O MORIR.");
		System.out.println("Inicio del combate, tu vida = " + p.getVidas());

		turno = ran.nextBoolean();
		while (!combate_finalizado) {
			if (turno) {
				System.out.println(ANSI_GREEN + "\nTU TURNO, vidas = " + p.getVidas() + ANSI_RESET);
				System.out.println("Ataques disponibles:");
				do {
					try {
						if (p.getFlechas() > 0)
							System.out.println("Pulse 1 para: Flechazo Certero");
						System.out.println("Pulse 2 para: Cuchillo Corto");
						System.out.println("Pulse 3 para: Patada y Huida");
						System.out.print(ANSI_CYAN + "> " + ANSI_RESET);
						eleccion = sc.nextInt();
						sc.nextLine();
						if (eleccion == 1 && p.getFlechas() == 0)
							eleccion = 0;
					} catch (Exception e) {
						sc.nextLine();
					}
				} while (eleccion > 3 || eleccion < 1);

				if (eleccion == 1) {
					p.setFlechas(p.getFlechas() - 1);
					daño = 8;
					esquivar = false;
				} else if (eleccion == 2) {
					daño = 4;
					esquivar = false;
				} else {
					daño = 2;
					esquivar = true;
				}

				int impacto = ran.nextInt(1, 4);
				if (impacto == 1) {
					System.out.println("El ataque impacta totalmente.");
					vidas_mono -= daño;
					System.out.println("Vidas mono - " + daño);
				} else if (impacto == 2) {
					System.out.println("El ataque impacta parcialmente.");
					vidas_mono -= daño / 2;
					System.out.println("Vidas mono - " + daño / 2);
				} else {
					System.out.println("El ataque falla.");
					esquivar = false;
				}
				if (vidas_mono <= 0) {
					System.out.println("\nHas ganado el combate.");
					combate_finalizado = true;
				}
			} else {
				System.out.println(ANSI_RED + "\nTurno del MONO MUTANTE" + ANSI_RESET);
				System.out.println("VIDAS MONO RESTANTE: " + vidas_mono);
				int ataqueMono = ran.nextInt(1, 4);
				daño = (ataqueMono == 1) ? 6 : (ataqueMono == 2) ? 4 : 2;
				if (ataqueMono == 1)
					System.out.println("El mono ataca con un mordisco.");
				else if (ataqueMono == 2)
					System.out.println("El mono ataca con un arañazo.");
				else
					System.out.println("El mono ataca con un grito.");

				int acierto = ran.nextInt(1, 4);
				if (acierto == 1) {
					if (esquivar && ran.nextBoolean())
						System.out.println("Esquivas el ataque.");
					else {
						System.out.println("El golpe impacta completamente.");
						p.setVidas(p.getVidas() - daño);
						System.out.println("Vidas jugador - " + daño);
					}
				} else if (acierto == 2) {
					if (esquivar && ran.nextBoolean())
						System.err.println("Esquivas el ataque.");
					else {
						System.out.println("El golpe impacta parcialmente.");
						p.setVidas(p.getVidas() - (daño / 2));
						System.out.println("Vidas jugador - " + daño / 2);
					}
				} else
					System.out.println("El ataque falla.");
				if (p.getVidas() <= 0) {
					System.out.println("\nEstás muy débil, pero consigues distraer al mono y huir.");
					combate_finalizado = true;
				}
			}
			turno = !turno;
		}

		if (p.getVidas() <= 0) {
			System.out.println(ANSI_RED + "\nFINAL 3 — MÁRTIR" + ANSI_RESET);
			System.out.println("Intentas tensar el arco, pero estás muy débil.");
			System.out.println("No consigues disparar.");
			System.out.println("El capitolio te captura.");
			System.out.println("TU HISTORIA ACABA AQUÍ.");
			return;
		}

		System.out.println(
				"\nEl combate ha finalizado, te sigues moviendo por la arena y encuentras a Beetee sentando sobre una roca, enrollando un cable metálico casi invisible.");
		System.out.println("EL ACERTIJO DEL ALAMBRE — BEETEE\nBEETEE te plantea la siguiente pregunta:");
		System.out.println(
				"Para atrapar un rayo necesito un conductor y una toma de tierra. El árbol será el conductor.\n¿La toma de tierra… cuál es?");
		do {
			try {
				System.out.println("\nPulse 1 para: EL SUELO DE LA SELVA\nPulse 2 para: EL MAR");
				System.out.print(ANSI_CYAN + "> " + ANSI_RESET);
				eleccion = sc.nextInt();
				sc.nextLine();
			} catch (Exception e) {
				sc.nextLine();
			}
		} while (eleccion < 1 || eleccion > 2);

		if (eleccion == 1) {
			System.out.println(
					"Beetee niega lentamente. La arena no conduce electricidad, no hay tiempo para pensar más.");
			System.out.println("PLAN FALLIDO");
			plan = false;
		} else {
			System.out.println("Beetee sonríe satisfecho. El agua salada es la clave. El plan puede funcionar.");
			plan = true;
		}

		if (!plan) {
			System.out.println(ANSI_RED + "\nFINAL 6: FUEGO CRUZADO" + ANSI_RESET);
			System.out.println(
					"Beetee conecta el cable al suelo. Nada ocurre.\nEl rayo cae sin control, estalla en el aire y revienta media arena.\nTú estás demasiado cerca. La explosión te derrumba.\nEn los últimos segundos, el Capitolio te recoge inconsciente.\nSigues con vida, pero te conviertes en rehén propagandístico.\nUn final sin gloria.");
		} else if (!p.isTenerArco()) {
			System.out.println(ANSI_YELLOW + "\nFINAL 4: VENCEDORA SOLITARIA" + ANSI_RESET);
			System.out.println(
					"Te das cuenta que al plan le falta algo. TU ARCO, no pueden ganar así... pero TÚ SÍ.\nDecides traicionar a tu equipo.\nSobrevives con trampas, cazas, resistes.\nERES LA GANADORA DE LOS 75º JUEGOS DEL HAMBRE...\nPero estás sola.");
		} else {
			System.out.println(ANSI_GREEN + "\nFINAL 2 — EL SINSAJO" + ANSI_RESET);
			System.out.println(
					"Disparas tu arco, el rayo desciende.\nLa arena estalla.\nEres rescatada por los rebeldes.\nHABÉIS GANADO CONTRA EL CAPITOLIO.");
		}
	}

	private void jugarPeeta() {
		p = new Personaje("Peeta", 25);
		int vidas_brutus = 35, eleccion = 0, daño = 0;
		boolean voluntario = false, combate_finalizado = false, turno = false, aliada = false, muerto = false,
				cegar = false, logica = false;

		System.out.println(ANSI_YELLOW
				+ "\n------------------------------------------------\nERES PEETA MELLARK\n------------------------------------------------"
				+ ANSI_RESET);
		System.out.println(ANSI_YELLOW
				+ "El Chico del Pan. Tu arma no es la fuerza bruta, aunque la tienes, sino tus palabras.\nEres el maestro de la estrategia social y el carisma.\nSabes cómo ganarte al público y conseguir patrocinadores. Además, eres un experto en camuflaje.\nTu debilidad es tu brújula moral; tu aversión a matar te pone en desventaja."
				+ ANSI_RESET);

		System.out.println(
				"\nEstás esperando, en poco sacarán el nombre del tributo de tu distrito.\nHay una opción mala: que salga tu nombre.\nPero salió una peor... una amiga de tu infancia.\nTienes que salvarla.");

		if (resolverAnagrama())
			voluntario = true;
		if (!voluntario) {
			System.out.println("Te quedas en silencio... miras a Hemlich desesperado.");
			System.out.println("La culpa te come pero no tienes la fuerza de voluntad para presentarte.");
			System.out.println(ANSI_RED + "\nFINAL 1: COBARDE" + ANSI_RESET);
			return;
		}

		System.out.println(
				"\nTe presentas voluntario para protegerla. El viaje en tren es silencioso.\nYa en el Capitolio, tras días de preparación, te enfrentas a tu evaluación privada.");
		System.out.println("\nEntras en la habitación para mostrar habilidades. ¿Intentas hablar con gente?");
		do {
			System.out.println("\nPulse 1 para: Si. / Pulse 2 para: No.");
			System.out.print(ANSI_CYAN + "> " + ANSI_RESET);
			try {
				eleccion = sc.nextInt();
				sc.nextLine();
			} catch (Exception e) {
				sc.nextLine();
			}
		} while (eleccion < 1 || eleccion > 2);

		if (eleccion == 1)
			System.out.println(
					"Consigues hablar con gente asustada, usas tu gran carisma para tranquilizarlos.\nIMPORTANTE: has conseguido aliados.");
		else
			System.out.println(
					"Te vas sin dejar marca en nadie, nadie te tiene como objetivo pero tampoco creen que eres útil.");

		mostrarLogo();

		System.out.println(
				"\nSaltas a la arena y consigues tu machete.\nVas hacia el bosque a esconderte.\nEntre los árboles húmedos aparece Johanna Mason, debes tener cuidado.\nLleva un hacha apoyada en el hombro. La baja hasta apuntarte con ella.\n—Dame una excusa para no matarte —dice—.\n Y que no sea “Katniss”. Estoy harta de ella.");

		do {
			try {
				System.out.println(
						"\nPulse 1 para: “Soy bueno con el camuflaje, puedo esconderte”.\nPulse 2 para: “Hago buen pan. Y sé qué plantas son comestibles aquí”.");
				System.out.print(ANSI_CYAN + "> " + ANSI_RESET);
				eleccion = sc.nextInt();
				sc.nextLine();
			} catch (Exception e) {
				sc.nextLine();
			}
		} while (eleccion < 1 || eleccion > 2);

		if (eleccion == 1) {
			System.out.println(
					"Johanna suelta una carcajada.\n—¿Esconderme? ¿A mí?\nTe da un golpe fuerte con el mango del hacha.");
			p.setVidas(p.getVidas() - 5);
			System.out.println("Johanna NO se une.");
		} else {
			System.out.println("Johanna baja el hacha lentamente.\n—Tengo hambre. Vienes conmigo.\nALIADA CONSEGUIDA");
			aliada = true;
		}

		System.out.println(
				"\nTras tu encuentro con Johanna decides buscar suministros.\nLa sed te consume.\nCrees que tu suerte ha mejorado cuando escuchas agua... \nResulta que tu suerte solo empeoró, ante ti está ¡BRUTUS!\nEs mucho más fuerte que tú, pero también rápido, solo puedes luchar.");

		turno = ran.nextBoolean();
		while (!combate_finalizado) {
			if (turno) {
				System.out.println(ANSI_GREEN + "\nTus vidas son: " + p.getVidas() + ANSI_RESET);
				do {
					try {
						System.out.println(
								"Pulse 1 para: Golpe de machete.\nPulse 2 para: Lanzar arena.\nPulse 3 para: Embestida de placaje.");
						System.out.print(ANSI_CYAN + "> " + ANSI_RESET);
						eleccion = sc.nextInt();
						sc.nextLine();
					} catch (Exception e) {
						sc.nextLine();
					}
				} while (eleccion < 1 || eleccion > 3);
				daño = (eleccion == 1) ? 6 : (eleccion == 2) ? 2 : 8;
				if (eleccion == 2)
					cegar = true;
				int impact = ran.nextInt(1, 4);
				if (impact == 1) {
					System.out.println("El golpe impacta completamente.");
					vidas_brutus -= daño;
					System.out.println("Vidas Brutus - " + daño);
				} else if (impact == 2) {
					System.out.println("El golpe impacta parcialmente.");
					vidas_brutus -= daño / 2;
					System.out.println("Vidas Brutus -" + daño / 2);
				} else
					System.out.println("El ataque falla.");
				if (vidas_brutus <= 0) {
					System.out.println("Has derrotado a Brutus.");
					combate_finalizado = true;
				}
			} else {
				System.out.println(ANSI_RED + "\nTurno de Brutus" + ANSI_RESET);
				int atBrutus = ran.nextInt(1, 4);
				daño = (atBrutus == 1) ? 8 : (atBrutus == 2) ? 6 : 2;
				if (atBrutus == 1)
					System.out.println("Brutus ataca con un cuchillo.");
				else if (atBrutus == 2)
					System.out.println("Brutus ataca con una patada.");
				else
					System.out.println("Brutus ataca con el puño.");
				int hit = ran.nextInt(1, 4);
				if (hit == 1) {
					if (cegar) {
						System.out.println("Brutus estaba cegado y falla el ataque.");
						cegar = false;
					} else {
						System.out.println("El golpe impacta completamente.");
						p.setVidas(p.getVidas() - daño);
						System.out.println("Vidas Jugador - " + daño);
					}
				} else if (hit == 2) {
					if (cegar) {
						System.out.println("Brutus estaba cegado y falla el ataque.");
						cegar = false;
					} else {
						System.out.println("El golpe impacta parcialmente.");
						p.setVidas(p.getVidas() - (daño / 2));
						System.out.println("Vidas Jugador -" + daño / 2);
					}
				} else {
					System.out.println("El ataque falla.");
					cegar = false;
				}
				if (p.getVidas() <= 0) {
					combate_finalizado = true;
					muerto = true;
					System.out.println("Has sido derrotado por Brutus.");
				}
			}
			turno = !turno;
		}

		if (muerto) {
			System.out.println(ANSI_RED + "\nFINAL 3 — MUERTE HEROICA" + ANSI_RESET);
			System.out.println(
					"El mar golpea la arena mientras sangras.\nMiras al cielo, sabiendo que tu muerte encenderá algo más grande que tú.\nTu sacrificio inspira a la rebelión.");
			return;
		}

		System.out.println(
				"\nLlegas herido al borde del bosque.\nUna figura del Distrito 6 —la Morfina— aparece silenciosa.\nLleva una dosis de medicina que necesitas con urgencia.\nNo habla. Solo te mira y mueve la mano en un gesto claro.\nPiedra, Papel o Tijera.");
		int res = jugarPPT();
		if (res == 0) {
			System.out.println(
					"EMPATE: la Morfina se encoge de hombros antes de darte una pequeña hoja de menta.\nLa muerdes y te sientes un poco mejor.");
			p.setVidas(p.getVidas() + 2);
		} else if (res == 1) {
			System.out.println("GANAS: Ella sonríe débilmente.\nTe da la medicina.");
			p.setVidas(p.getVidas() + 10);
			System.out.println("Más adelante, se sacrificará por ti.");
			p.setTenerMedicina(true);
		} else {
			System.out.println("PIERDES: la Morfina se guarda la medicina.\nSe esfuma entre los árboles.");
		}

		if (!p.isTenerMedicina() && p.getVidas() <= 10) {
			System.out.println("Las heridas te arden, no puedes continuar...\nEmpiezas a perder la consciencia.");
			System.out.println(ANSI_RED + "\nFINAL 5: INFECCIÓN" + ANSI_RESET);
			System.out.println(
					"La fiebre te consume.\nMueres sin violencia... no derramas sangre.\nPero caes en el olvido.");
			return;
		}

		System.out.println(
				"\nHa caído ya la noche, puedes descansar un poco.\nEl sol te despierta, es momento de moverte.\nViajas en busca de comida.\nVes un trozo de pan fresco, vas a comértelo...\nAntes de darle un mordisco ves un patrón quemado en la corteza.\n12-6-12-6\nPiensas qué puedes hacer.");
		do {
			try {
				System.out.println(
						"\nPulse 1 para: Ir a la Cornucopia a las 12.\nPulse 2 para: Moverse de norte a sur cada 6 horas.");
				System.out.print(ANSI_CYAN + "> " + ANSI_RESET);
				eleccion = sc.nextInt();
				sc.nextLine();
			} catch (Exception e) {
				sc.nextLine();
			}
		} while (eleccion < 1 || eleccion > 2);

		if (eleccion == 1) {
			System.out.println("Es la hora del rayo.\nUna explosión sacude la arena.\nDECISIÓN EQUIVOCADA");
			logica = false;
		} else {
			System.out.println("Encaja.\nSigues el patrón del reloj. \nEvitas zonas letales.\nPUZLE RESUELTO");
			logica = true;
		}

		if (aliada && logica) {
			System.out.println(ANSI_GREEN + "\nFINAL 4 — EL LÍDER" + ANSI_RESET);
			System.out.println(
					"Johanna lucha a tu lado.\nInterpretaste el patrón del reloj. \nGuías a los demás entre las zonas seguras.\nCuando la arena cae, escapas con Katniss al Distrito 13.\nTe conviertes en líder, eres la esperanza del resto.");
		} else if (p.getVidas() < 8) {
			System.out.println(ANSI_RED + "\nFINAL 2 — SECUESTRADO" + ANSI_RESET);
			System.out.println(
					"Te encuentras en la orilla cuando llega el aerodeslizador rebelde.\nLevantan a Katniss.\nUna red electromagnética te atrapa a ti.\nEl Capitolio te arrastra al cielo.\nTu historia continúa… como prisionero.");
		} else {
			System.out.println(ANSI_YELLOW + "\nFINAL 6 — EL TÍTERE" + ANSI_RESET);
			System.out.println(
					"Pero nunca luchas por escapar.\nSnow te considera útil y te mantiene vivo.\nTe mandan de vuelta a tu distrito.\nNo mueres pero tu libertad desaparece.");
		}
	}

	private void jugarFinnick() {
		p = new Personaje("Finnick", 30);
		int vidas_cashmere = 20, eleccion = 0, daño = 0;
		boolean voluntario = false, combate_finalizado = false, turno = false, pulso = false, combate_perfecto = false,
				sacrificar_mags = false, combate = false;

		System.out.println(ANSI_GREEN
				+ "\n------------------------------------------------\nERES FINNICK ODAIR\n------------------------------------------------"
				+ ANSI_RESET);
		System.out.println(ANSI_GREEN
				+ "El Favorito del Capitolio. Eres una leyenda de los Juegos, un profesional nato.\nEncantador, atlético y absolutamente letal con el tridente.\nEl agua es tu elemento natural. Usas tu arrogancia y belleza como un escudo, pero bajo la superficie yace una mente astuta.\nTu debilidad es tu exceso de confianza y el peso de tu reputación."
				+ ANSI_RESET);

		System.out.println(
				"\nEstás esperando, en poco sacarán el nombre del tributo de tu distrito.\nHay una opción mala: que salga tu nombre.\nTuviste suerte, no es tu nombre, aun así piensas en si deberías salvar a este señor.");

		if (resolverAnagrama())
			voluntario = true;
		if (!voluntario) {
			System.out.println("Te quedas en silencio... miras al desconocido.");
			System.out.println("La culpa te come pero no tienes la fuerza de voluntad para presentarte.");
			System.out.println(ANSI_RED + "\nFINAL 1: COBARDE" + ANSI_RESET);
			return;
		}

		System.out.println(
				"\nTomas el lugar del tributo. El Capitolio te recibe con aplausos, pero sabes que es una sentencia.\nLlega el momento de demostrar por qué sigues siendo el favorito en tu evaluación privada.");
		System.out.println(
				"\nEntras en la habitación para mostrar habilidades, caminas recto y con cara confiada, conoces bien las habilidades que posees.\nPiensas en dar un espectáculo.");
		do {
			try {
				System.out.println("\nPulse 1 para: Si. / Pulse 2 para: No.");
				System.out.print(ANSI_CYAN + "> " + ANSI_RESET);
				eleccion = sc.nextInt();
				sc.nextLine();
			} catch (Exception e) {
				sc.nextLine();
			}
		} while (eleccion < 1 || eleccion > 2);

		if (eleccion == 1)
			System.out.println(
					"Lanzas el tridente hacia un maniquí (se parece a PEETA), le arranca la cabeza de un solo golpe y ríes en alto.");
		else
			System.out.println("Vuelves a dejar el tridente en la sala, te vas sin llamar mucho la atención.");

		mostrarLogo();

		System.out.println(
				"\nTe diriges a la cornucopia, es un caos.\nCashmere, rápida como un filo, se lanza hacia Katniss.\nTe colocas entre ambas.\n—Apártate, Finnick —escupe ella—. O te abro en dos.");

		turno = ran.nextBoolean();
		while (!combate_finalizado) {
			if (turno) {
				System.out.println(ANSI_GREEN + "\nTU TURNO, vidas: " + p.getVidas() + ANSI_RESET);
				do {
					try {
						if (p.isTenerTridente())
							System.out.println("Pulse 1 para: Lanzamiento de Tridente.");
						System.out.println("Pulse 2 para: Red de Pescador.\nPulse 3 para: Golpe de Mango.");
						System.out.print(ANSI_CYAN + "> " + ANSI_RESET);
						eleccion = sc.nextInt();
						sc.nextLine();
					} catch (Exception e) {
						sc.nextLine();
					}
				} while (eleccion < 1 || eleccion > 3);
				daño = (eleccion == 1) ? 8 : (eleccion == 2) ? 6 : 4;
				if (eleccion == 1)
					System.out.println("Decides lanzar tu tridente para atacar.");
				else if (eleccion == 2)
					System.out.println("Decides envolverla con una red de pescador con púas.");
				else
					System.out.println("Decides golpear con el mango.");
				int impact = ran.nextInt(1, 4);
				if (impact == 1) {
					System.out.println("El ataque impacta totalmente.");
					vidas_cashmere -= daño;
					System.out.println("Vidas CASHMERE - " + daño);
				} else if (impact == 2) {
					System.out.println("El ataque impacta parcialmente.");
					vidas_cashmere -= daño / 2;
					System.out.println("Vidas CASHMERE - " + daño / 2);
				} else
					System.out.println("El ataque falla.");
				if (vidas_cashmere <= 0) {
					System.out.println("\nHas derrotado a Cashmere.");
					combate_finalizado = true;
					combate = true;
					if (p.getVidas() == 30)
						combate_perfecto = true;
				}
			} else {
				System.out.println(ANSI_RED + "\nTurno de Cashmere" + ANSI_RESET);
				int at = ran.nextInt(1, 4);
				daño = (at == 1) ? 2 : (at == 2) ? 6 : 4;
				if (at == 1)
					System.out.println("CASHMERE ataca con una patada.");
				else if (at == 2)
					System.out.println("CASHMERE ataca lanzando el cuchillo.");
				else
					System.out.println("CASHMERE ataca con los puños de frente.");
				int hit = ran.nextInt(1, 4);
				if (hit == 1) {
					System.out.println("El ataque impacta totalmente.");
					p.setVidas(p.getVidas() - daño);
					System.out.println("Vidas jugador - " + daño);
				} else if (hit == 2) {
					System.out.println("El ataque impacta parcialmente.");
					p.setVidas(p.getVidas() - (daño / 2));
					System.out.println("Vidas jugador - " + daño / 2);
				} else
					System.out.println("El ataque falla.");
				if (p.getVidas() <= 0) {
					combate_finalizado = true;
					combate = false;
					System.out.println("Huyes del combate viendo que vas perdiendo.");
				}
			}
			turno = !turno;
		}

		if (p.getVidas() <= 0) {
			System.out.println(ANSI_RED + "\nFINAL: MUERTO EN COMBATE" + ANSI_RESET);
			return;
		}

		System.out.println(
				"\nTras el combate, sigues avanzando a través del bosque.\nTe encuentras a Chaff, del distrito 11. Amigo y Líder.\nPero hay un problema, no quiere seguir el plan.\n—No me mandas —dice tambaleándose—. ¡A pulso te gano!\nMINIJUEGO: piedra, papel, tijera.");
		int res = jugarPPT();
		if (res == 0) {
			System.out.println("EMPATE: Chaff sigue sin querer seguir el plan pero se queda contigo.");
			pulso = true;
		} else if (res == 1) {
			System.out.println("GANAS: Chaff se ríe, te abraza, y promete cubrir tu flanco.");
			pulso = true;
		} else {
			System.out.println("PIERDES: Chaff se aleja de ti.\nChaff muere esta noche y tú quedas desprotegido.");
			pulso = false;
		}

		System.out.println(
				"\nTras tu situación delicada con Chaff sigues moviéndote, atento a cualquier cosa que te pueda dar una ventaja.\nDe repente ves algo.\nOculto bajo unas rocas encuentras un regalo de Annie.\nUna ostra metálica.\nEn la tapa está grabado:\n“Solo me abro ante aquello que nos separa ahora mismo”.\nLa sostienes con manos temblorosas, extrañas a Annie más que al aire.\n¿Qué representa “lo que os separa”? 1. La Arena. / 2. El mar.");
		do {
			try {
				System.out.print(ANSI_CYAN + "> " + ANSI_RESET);
				eleccion = sc.nextInt();
				sc.nextLine();
			} catch (Exception e) {
				sc.nextLine();
			}
		} while (eleccion < 1 || eleccion > 2);

		if (eleccion == 1) {
			System.out.println("Nada sucede.\nLa caja permanece fría, cerrada, silenciosa.");
			System.out.println(ANSI_RED + "\nFINAL 4 — LOCURA" + ANSI_RESET);
			System.out.println(
					"Tu mente se rompe.\nSolo tienes recuerdos dolorosos y miedo.\nEn un acto de delirio, corres hacia el campo de fuerza buscando silencio.\nEl silencio llega. La muerte es inmediata.");
			return;
		} else {
			System.out.println(
					"Tomas agua de mar y la viertes sobre la cerradura.\nUn clic. La ostra se abre.\nDentro, un ungüento para quemaduras.\nEl olor te recuerda a casa.\nPUZLE RESUELTO");
		}

		System.out.println(
				"\nTu grupo sigue viajando a través del bosque.\nVuestras defensas y atención han bajado debido al cansancio.\nLa arena te vuelve a recordar que no puedes bajar la guardia.\nLa niebla venenosa os ha alcanzado.\nMags ha sufrido daño al igual que Peeta.\nDebes escoger qué hacer.");
		do {
			try {
				System.out.println(
						"\nPulse 1 para: Intentar cargar a ambos.\nPulse 2 para: Dejar que Mags se sacrifique.");
				System.out.print(ANSI_CYAN + "> " + ANSI_RESET);
				eleccion = sc.nextInt();
				sc.nextLine();
			} catch (Exception e) {
				sc.nextLine();
			}
		} while (eleccion < 1 || eleccion > 2);

		if (eleccion == 1) {
			System.out.println(
					"Tu fuerza es extraordinaria… pero no suficiente.\nTu velocidad cae.\nLa niebla os envuelve.\nMags muere de todas formas.");
			System.out.println(ANSI_RED + "\nFINAL 3 — MUERTE DE HONOR" + ANSI_RESET);
			System.out.println(
					"Las quemaduras y el cansancio te destrozan.\nCuando Enobaria ataca, te interpones para proteger a Peeta.\nTu tridente y tus esperanzas caen al suelo.\nHas muerto como has vivido: defendiendo.");
			return;
		} else {
			System.out.println(
					"Mags te sonríe con dulzura.\nSe adentra sola en la niebla... Desaparece.\nGuardas silencio.\nPero salvas a Peeta… y sigues con vida.\nELECCIÓN CORRECTA PARA SOBREVIVIR");
			sacrificar_mags = true;
		}

		if (!pulso) {
			System.out.println(ANSI_YELLOW + "\nFINAL 5 — TRAIDOR" + ANSI_RESET);
			System.out.println(
					"A pesar de salvar a gente.\nEstás acorralado y sin aliados en buena forma.\nComprendes que solo hay un camino para sobrevivir…\nY ese camino pasa por la espalda de Katniss.\nEl Capitolio sonríe al ver tus actos.");
		} else if (combate_perfecto) {
			System.out.println(ANSI_YELLOW + "\nFINAL 6 - REENCUENTRO" + ANSI_RESET);
			System.out.println(
					"Sobrevives al caos.\nTe mantuviste en perfecta forma.\nEres un campeón… otra vez.\nEl Capitolio, satisfecho con tu desempeño, te recompensa devolviéndote a Annie.\nPero os mutila la lengua para impedir que habléis de la rebelión.\nOs abrazáis en silencio.\nUn silencio que dice más que cualquier palabra.");
		} else if (combate && sacrificar_mags) {
			System.out.println(ANSI_GREEN + "\nFINAL 2 — RESCATADO" + ANSI_RESET);
			System.out.println(
					"Te mantienes firme, letal y decidido.\nCuando el campo colapsa, el aerodeslizador rebelde te arranca de la arena.\nVuelves con vida.\nLa guerra te espera.");
		}
	}
}