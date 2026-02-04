package trimestre2.clases.clase04_POOBiblioteca;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Biblioteca {
	// private Map<Integer, Libro> librosDisponibles;
	// private Map<Integer, Libro> librosPrestados;

	/*
	 * Más sencillo poner atributo prestado que crear dos mapas distintos
	 */

	private Map<Integer, Libro> libros;
	private List<Bibliotecario> bibliotecarios;
	private Map<Persona, List<Libro>> historialLibrosAlquiladosPorUsuario;
	// Hemos visto arrays, arrayList y Mapas

	public Biblioteca() {
		bibliotecarios = new ArrayList<Bibliotecario>();
		historialLibrosAlquiladosPorUsuario = new HashMap<Persona, List<Libro>>();
		libros = new HashMap<Integer, Libro>();
	}

	public boolean agregarLibro(Libro x) {
		if (libros.containsKey(x.getId())) {
			return false;
		} else {
			libros.put(x.getId(), x);
			return true;
		}

	}

	public void agregarLibro(List<Libro> l) {
		for (Libro aux : l) {
			agregarLibro(aux);
		}
	}

	public boolean alquilarLibro(Libro l, Bibliotecario b, Persona p) {
		if (!bibliotecarios.contains(b)) {
			System.out.println("El bibliotecario no existe en el sistema.");
			return false;
		}

		if (!libros.containsKey(l.getId())) {
			System.out.println("El libro no pertenece a esta biblioteca.");
			return false;
		}

		if (l.isPrestado()) {
			System.out.println("El libro: " + l.getNombre() + " ya está prestado.");
			return false;
		}

		// Acción principal, realizar el préstamo
		System.out.println("El libro: " + l.getNombre() + ", es alquilado al usuario: " + p.getNombre()
				+ ", por el bibliotecario: " + b.getNombre());

		l.setPrestado(true);

		// Actualización del historial (Map y List)
		if (!historialLibrosAlquiladosPorUsuario.containsKey(p)) {
			// Si el usuario no tiene historial aún, le creamos una lista nueva
			historialLibrosAlquiladosPorUsuario.put(p, new ArrayList<Libro>());
		}

		// Añadimos el libro a la lista (ya sea la nueva o la que ya existía)
		historialLibrosAlquiladosPorUsuario.get(p).add(l);

		return true;
	}

	public boolean devolverLibro(Libro l, Bibliotecario b) {
		if (!libros.containsKey(l.getId())) {
			System.out.println("El libro no pertenece a esta biblioteca");
			return false;
		}
		if (!l.isPrestado()) {
			System.out.println("El libro no está prestado");
			return false;
		}
		if (!bibliotecarios.contains(b)) {
			System.out.println("El bibliotecario no existe en el sistema");
			return false;
		}
		l.setPrestado(false);
		System.out.println("Libro devuelto");
		return true;
	}

	/*
	 * Es mejor que, en caso de no querer poner sysout entre medias, no anidarlos,
	 * usar el && e ir uniendolos
	 */

	// Método original (más difícil de leer):

	/*
	 * if (libros.containsKey(l.getId())) { if (l.isPrestado()) { if
	 * (bibliotecarios.contains(b)) { l.setPrestado(false);
	 * System.out.println("Libro devuelto"); System.out.println(); return true; }
	 * System.out.println("El bibliotecario no existe en el sistema");
	 * System.out.println(); return false; }
	 * System.out.println("El libro no está prestado"); System.out.println(); return
	 * false; } System.out.println("El libro no pertenece a esta biblioteca");
	 * System.out.println(); return false; }
	 */

	public void buscarLibro(String txt) {
		List<String> aux = new ArrayList<>();
		for (Libro l : libros.values()) {
			if (l.getNombre().toLowerCase().contains(txt.toLowerCase())) {
				aux.add(l.getNombre());
			}
		}
		Collections.sort(aux);
		System.out.println("------Libros que contienen: " + txt + "------");
		for (String titulo : aux) {
			System.out.println(titulo);
		}
		System.out.println("-----");
	}

	// Otro método: 
	
	/*
	 * public void buscarLibro(String txt) {
	 * System.out.println("Resultados de búsqueda para: '" + txt + "'"); boolean
	 * encontrado = false;
	 * 
	 * for (Libro l : libros.values()) { // Comprobar si el nombre del libro
	 * contiene el texto buscado if
	 * (l.getNombre().toLowerCase().contains(txt.toLowerCase())) {
	 * System.out.println("- " + l.getNombre(); encontrado = true; } }
	 * 
	 * if (!encontrado) { System.out.
	 * println("No se han encontrado libros que coincidan con la búsqueda."); } }
	 */

	public void registroUsuario(Persona p) {
		if (historialLibrosAlquiladosPorUsuario.containsKey(p)) {
			System.out.println("--" + p.getNombre() + "--");
			for (Libro l : historialLibrosAlquiladosPorUsuario.get(p)) {
				System.out.println("\t" + l.getNombre());
			}
		} else {
			System.out.println("Este usuario no ha alquilado nada");
		}
	}

	public boolean agregarBibliotecario(Bibliotecario p) {
		if (!bibliotecarios.contains(p)) {
			bibliotecarios.add(p);
			return true;
		}
		return false;
	}

	public void verLibrosEnBiblioteca() {
		System.out.println("-----");
		for (Libro l : libros.values()) {
			System.out.println(l.getNombre());
		}
		System.out.println("-----");
	}
}
