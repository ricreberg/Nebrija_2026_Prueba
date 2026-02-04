package trimestre2.ejercicios.ejercicios04_Bingo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Carton {
	private ArrayList<Integer> numeros;

	// Crea el objeto e inicia la generación de los números
	public Carton() {
		this.numeros = new ArrayList<>();
		generarCeldasCarton();
	}

	// Elige dieciocho números al azar, los organiza por columnas de diez en diez y
	// los ordena
	private void generarCeldasCarton() {
		Random rand = new Random();
		for (int i = 0; i < 9; i++) {
			int min = (i * 10) + 1;
			int max = (i * 10) + 10;
			ArrayList<Integer> rangoActual = new ArrayList<>();
			while (rangoActual.size() < 2) {
				int num = rand.nextInt(max - min + 1) + min;
				if (!rangoActual.contains(num)) {
					rangoActual.add(num);
				}
			}
			this.numeros.addAll(rangoActual);
		}
		Collections.sort(this.numeros);
	}

	// Entrega la lista con todos los números que tiene el cartón
	public ArrayList<Integer> getNumeros() {
		return numeros;
	}

	// Enseña los números por pantalla divididos en dos filas para que se vea como
	// un cartón de verdad
	public void mostrarCarton() {
		for (int i = 0; i < 18; i += 2) {
			System.out.print(numeros.get(i) + " ");
		}
		System.out.println();
		for (int i = 1; i < 18; i += 2) {
			System.out.print(numeros.get(i) + " ");
		}
		System.out.println();
	}

	// Muestra el cartón al terminar la partida poniendo una X en los números que
	// han salido del bombo
	public void mostrarCartonFinal(ArrayList<Integer> bolasExtraidas) {
		for (int i = 0; i < 18; i += 2) {
			int num = numeros.get(i);
			if (bolasExtraidas.contains(num)) {
				System.out.print("X ");
			} else {
				System.out.print(num + " ");
			}
		}
		System.out.println();
		for (int i = 1; i < 18; i += 2) {
			int num = numeros.get(i);
			if (bolasExtraidas.contains(num)) {
				System.out.print("X ");
			} else {
				System.out.print(num + " ");
			}
		}
		System.out.println();
	}
}