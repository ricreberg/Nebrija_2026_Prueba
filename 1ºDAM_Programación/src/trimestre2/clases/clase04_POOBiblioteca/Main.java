package trimestre2.clases.clase04_POOBiblioteca;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Bibliotecario b1 = new Bibliotecario(1, "Andrés");
		Bibliotecario b2 = new Bibliotecario(2, "Miguel");

		Persona p1 = new Persona(15, "Pablo");
		Persona p2 = new Persona(150, "Noelia");

		Libro l1 = new Libro(1, "Libro 1", false);
		Libro l2 = new Libro(2, "Libro 2", true);
		Libro l3 = new Libro(3, "Libro 3", false);
		Libro l4 = new Libro(4, "labubu 4", false);
		Libro l5 = new Libro(5, "Libro 5", false);
		List<Libro> lstLibros = new ArrayList<>();
		lstLibros.add(l1);
		lstLibros.add(l2);
		lstLibros.add(l3);
		lstLibros.add(l4);

		Biblioteca biblioteca = new Biblioteca();

		biblioteca.agregarBibliotecario(b1);

		biblioteca.agregarLibro(l4);
		biblioteca.agregarLibro(lstLibros);

		biblioteca.verLibrosEnBiblioteca();

		biblioteca.alquilarLibro(l1, b2, p1);
		biblioteca.alquilarLibro(l1, b1, p2);
		biblioteca.alquilarLibro(l2, b1, p1);
		biblioteca.alquilarLibro(l3, b1, p1);
		biblioteca.alquilarLibro(l4, b1, p1);

		biblioteca.registroUsuario(p1);
		biblioteca.registroUsuario(p2);

		System.out.println();

		biblioteca.devolverLibro(l4, b2);
		biblioteca.devolverLibro(l4, b1);
		biblioteca.devolverLibro(l4, b1);
		biblioteca.devolverLibro(l5, b1);

		System.out.println();

		biblioteca.buscarLibro("labubu");

	}
}
