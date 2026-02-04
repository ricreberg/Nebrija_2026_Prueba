package trimestre2.ejercicios.ejercicios04_Bingo;

import java.util.ArrayList;
import java.util.Random;

public class Jugador {
	private String nombre;
	private ArrayList<Carton> cartones;

	// Registra al participante con su nombre y le asigna entre uno y cuatro
	// cartones
	public Jugador(String nombre) {
		this.nombre = nombre;
		this.cartones = new ArrayList<>();
		Random rand = new Random();
		int cantidadCartones = rand.nextInt(3) + 1;
		for (int i = 0; i < cantidadCartones; i++) {
			this.cartones.add(new Carton());
		}
	}

	// Dice el nombre del jugador
	public String getNombre() {
		return nombre;
	}

	// Permite verla colección de cartones que tiene el jugador
	public ArrayList<Carton> getCartones() {
		return cartones;
	}
}