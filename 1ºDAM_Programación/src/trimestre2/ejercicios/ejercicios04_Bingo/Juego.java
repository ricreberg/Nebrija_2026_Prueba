package trimestre2.ejercicios.ejercicios04_Bingo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Juego {
	private ArrayList<Jugador> jugadores;
	private ArrayList<Integer> bombo;
	private ArrayList<Integer> bolasExtraidas;

	// Prepara el bombo, la lista de bolas que van saliendo y el grupo de jugadores
	public Juego() {
		jugadores = new ArrayList<>();
		bolasExtraidas = new ArrayList<>();
		prepararBombo();
	}

	// Mete noventa números en el bombo y los mezcla para que salgan de forma
	// aleatoria
	private void prepararBombo() {
		bombo = new ArrayList<>();
		for (int i = 1; i <= 90; i++) {
			bombo.add(i);
		}
		Collections.shuffle(bombo);
	}

	// Imprime los mensajes de bienvenida, decide cuantos jugadores hay, entre 1 y 5
	// y enseña los cartones de cada uno antes de empezar
	public void configurarPartida() {
		System.out.println("\n" + " ____  _                   \r\n" + "| __ )(_)_ __   __ _  ___  \r\n"
				+ "|  _ \\| | '_ \\ / _` |/ _ \\ \r\n" + "| |_) | | | | | (_| | (_) |\r\n"
				+ "|____/|_|_| |_|\\__, |\\___/ \r\n" + "               |___/       " + "\n");
		System.out.println("Hecho por: \nMateo García, Ricardo Crespo y Fabio Rieker");
		System.out.println("\n");
		System.out.println("--- JUGADORES ---");
		System.out.println();
		Random rand = new Random();
		int numJugadores = rand.nextInt(4) + 1;

		for (int i = 1; i <= numJugadores; i++) {
			Jugador j = new Jugador("Jugador " + i);
			jugadores.add(j);
			System.out.println("--- " + j.getNombre() + " (" + j.getCartones().size() + " cartones) ---");
			for (Carton c : j.getCartones()) {
				c.mostrarCarton();
				System.out.println();
			}
		}
	}

	// Saca las bolas una a una, las imprime en grupos de diez y detiene todo cuando
	// alguien hace bingo
	public void partida() {
		System.out.println("");
		System.out.println("--- ¡COMIENZA EL BINGO! ---");
		int contadorBolas = 0;

		for (Integer bola : bombo) {
			System.out.print(bola + " ");
			bolasExtraidas.add(bola);
			contadorBolas++;

			if (contadorBolas % 10 == 0) {
				System.out.println();
			}

			for (Jugador j : jugadores) {
				for (Carton c : j.getCartones()) {
					if (verificarCartonGanador(c)) {
						System.out.println("\n\n¡BINGO! El ganador es: " + j.getNombre());
						mostrarResultadosFinales();
						return;
					}
				}
			}
		}
	}

	// Revisa si todos los números de un cartón concreto están ya en la lista de
	// bolas extraídas(por lo que sería ganador)
	private boolean verificarCartonGanador(Carton c) {
		return bolasExtraidas.containsAll(c.getNumeros());
	}

	// Muestra como han quedado los cartones de todos los jugadores al final del
	// juego
	private void mostrarResultadosFinales() {
		System.out.println("\n");
		System.out.println("---RESULTADOS ---");
		System.out.println();
		for (Jugador j : jugadores) {
			System.out.println(j.getNombre());
			for (Carton c : j.getCartones()) {
				c.mostrarCartonFinal(bolasExtraidas);
				System.out.println();
			}
		}
	}
}