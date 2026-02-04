package trimestre1.ejercicios.ejercicio02_Strings;

public class Main {
	public static void main(String[] args) {
		ejercicio12_r();
	}

	public static void ejercicio1() {
		// 1. Escribe un programa que reciba una cadena y devuelva cuántas vocales
		// contiene
		String txt = "labUbu";
		txt = txt.toLowerCase();
		int vocales = 0; // contador, necesito si o si

		for (int i = 0; i < txt.length(); i++) {
			if (txt.charAt(i) == 'a' || txt.charAt(i) == 'e' || txt.charAt(i) == 'i' || txt.charAt(i) == 'o'
					|| txt.charAt(i) == 'u') {
				vocales++;
			}
		}
		System.out.println("El texto contiene " + vocales + " vocales");
	}

	public static void ejercicio2() {
		// 2. Comprueba si una cadena se lee igual de izquierda a derecha y de derecha a
		// izquierda (primero hay que quitar todos los espacios).
		String txt = "      al   o      la ";
		String txtc = txt.replace("\\s+", "").toLowerCase(); // no hacía falta crear una nueva variable, se podían
																// aplicar
																// los cambios a txt

		boolean palindromo = true;

		for (int i = 0; i < txtc.length() / 2; i++) { // el entre dos es para q solo compare una mitad con la otra, y q
														// no se repita en bucle. El -1 es para corresponder los
														// caracteres (4) con las posiciones (5)
			if (txtc.charAt(i) != txtc.charAt(txtc.length() - 1 - i)) { // ej: letra 1 != 6-1-2; letra 1 (l) != letra 3
																		// (l)
				palindromo = false;
				break; // si ya no coincide, no hace falta seguir
			}
		}

		if (palindromo) { // si se pone así, se asume q es true (no poner "if palindromo = true)
			System.out.println(
					"La palabra si se lee igual de izquierda a derecha que de derecha a izquierda (es un palíndromo)");
		} else {
			System.out.println(
					"La palabra no se lee igual de izquierda a derecha que de derecha a izquierda (no es un palíndromo)");
		}
	}

	public static void ejercicio3() {
		// 3. Dada una frase, devuelve cuántas palabras contiene.

		String txt = " Silksong     no es   real  ";
		txt = txt.replaceAll("\\s+", " ").strip(); // significa 1 o más espacios en blanco entre palabras + borrar todos
													// los espacos en blanco del principio y final

		int palabras = 1; // empieza en 1 para poder registrar la última palabra, ya que al no haber un
							// espacio en blanco al final, de normal no la tendría en cuenta
		for (int i = 0; i < txt.length(); i++) {
			if (txt.charAt(i) == ' ') {
				palabras++;
			}
		}
		System.out.println("El texto contiene " + palabras + " palabras");

	}

	public static void ejercicio4() {
		// 4. Cuenta cuántas veces aparece un carácter determinado en una cadena.

		String txt = "mimImi    mii mimim  ";
		txt = txt.replaceAll("\\s+", " ").strip().toLowerCase();

		char caracterBuscado = 'i';
		int contador = 0;
		for (int i = 0; i < txt.length(); i++) {
			if (txt.charAt(i) == caracterBuscado) {
				contador++;
			}
		}
		System.out.println("El texto contiene el caracter " + caracterBuscado + " " + contador + " veces");
	}

	public static void ejercicio5() {
		// 5. Cuenta cuántas consonantes tiene una cadena.
		String txt = "  HElLouu Quee   f  tAAAll    ";
		txt = txt.replaceAll("\\s+", "").strip().toLowerCase(); // quito todos los espacios en blanco, ya que si no las
																// va interpretar como consonantes
		int consonantes = 0;

		for (int i = 0; i < txt.length(); i++) {
			char c = txt.charAt(i); // filtro los datos, mediante ASCII dejo solo las letras
			if (c >= 97 && c <= 122) {
				if (txt.charAt(i) != 'a' && txt.charAt(i) != 'e' && txt.charAt(i) != 'i' && txt.charAt(i) != 'o'
						&& txt.charAt(i) != 'u') {
					consonantes++;
				}
			}
			// para contar vocales, sería == y || (me basta con q una condición se cumpla).
			// Para consonantes, es != y ¬¬ (que no se cumpla ninguna de las condiciones)
		}
		System.out.println("El texto contiene " + consonantes + " consonantes");
	}

	public static void ejercicio6() {
		// 6. Elimina todos los números de una cadena
		String txt = "  m1mfbhjeghj643886 7 fe 8394 fehu4 8    ";
		txt = txt.replaceAll("\\s+", " ").strip().toLowerCase();

		txt = txt.replaceAll("[0123456789]", ""); // mas eficiente que poner un replacecon cada numero
		// recordar las comillas dobles con replace, aunque sean caracteres
		System.out.println(txt);
	}

	public static void ejercicio7() {
		// 7. Dadas dos cadenas de igual longitud, forma una tercera alternando sus
		// caracteres.
		String txt1 = "helou";
		String txt2 = "holaa";
		String txt3 = "";
		for (int i = 0; i < txt1.length(); i++) {
			txt3 += txt1.charAt(i);
			txt3 += txt2.charAt(i);
			// el + es lo que hace que concatene un caracter a un string

		}
		System.out.println(txt3);
	}

	public static void ejercicio8() {
		// 8. Elimina las apariciones repetidas de un mismo carácter, dejando solo la
		// primera.

		String txt1 = "   mameemimomu";
		String txt2 = "";

		txt1 = txt1.replaceAll("\\s+", " ").strip().toLowerCase();

		for (int i = 0; i < txt1.length(); i++) { // recorre el texto original
			char comprobar = txt1.charAt(i);
			boolean repetido = true;

			for (int j = 0; j < txt2.length(); j++) { // recorre lo q llevamos del texto dos hasta que encuentra el
														// caracter a comprbar
				if (comprobar == txt2.charAt(j)) {
					repetido = false;
					break;
				}
			}
			if (repetido) { // como no lo ha encontrado, lo añade
				txt2 += comprobar;
			}
		}
		System.out.println(txt2);

	}

	public static void ejercicio8_v2() {
		// 8. Elimina las apariciones repetidas de un mismo carácter, dejando solo la
		// primera.

		String txt1 = "   mameemimomu";
		String txt2 = "";

		txt1 = txt1.replaceAll("\\s+", " ").strip().toLowerCase();

		for (int i = 0; i < txt1.length(); i++) { // recorre el texto original
			char comprobar = txt1.charAt(i);
			if (txt2.indexOf(comprobar) == -1) { // devuelve caracter en la posición q se le indica, si no existe,
													// devuelve -1
				txt2 = txt2 + comprobar;
			}
		}
		System.out.println("El string sin caracteres repetidos es: " + txt2);
	}

	public static void ejercicio9() {
		// 9. Desplaza cada letra de una cadena n posiciones en el alfabeto usando la
		// codificación CESAR.

	}

	public static void ejercicio10_r() {
		// 10. Elimina manualmente los espacios iniciales y finales sin usar trim()

		// *No puedo usar replace porque me elimina los espacios de en medio tmb
		// trim vs strip?
		String txt = "     kfrnjkden njfek jefknk jdne  ";
		String resultado = "";
		int inicio = 0;
		int ultimo = txt.length();
		for (int i = 0; i < txt.length(); i++) {

			if (txt.charAt(i) != ' ') {
				break;
			}
			inicio++; // apunto posiciones que me interesan, las que tienen caracteres y no espacios
		}

		for (int i = txt.length() - 1; i >= 0; i--) {

			if (txt.charAt(i) != ' ') {
				break;
			}
			ultimo--;

		}
		for (int i = inicio; i < ultimo; i++) {
			resultado = resultado + txt.charAt(i);
		}
		System.out.println("'" + resultado + "'");
	}

	public static void ejercicio11_r() {
		// 11. Convierte los caracteres de forma alterna entre mayúscula y minúscula.
		String txt = "Hola buenos días";
		String resultado = "";
		for (int i = 0; i < txt.length(); i++) {
			char c = txt.charAt(i);

			if (i % 2 != 0) {
				resultado = resultado + Character.toLowerCase(c);
			} else {
				resultado = resultado + Character.toUpperCase(c);
			}
		}
		System.out.println(resultado);
	}

	public static void ejercicio12_r() {
		// 12. Devuelve las iniciales de una frase (por ejemplo, “Juan Pérez López” →
		// “JPL”).
		String txt = "   Ricardo Crespo Berg   ";
		txt = txt.trim();
		String iniciales = "" + txt.charAt(0);
		for (int i = 0; i < txt.length(); i++) {
			if (txt.charAt(i) == ' ') {
				iniciales = iniciales + txt.charAt(i + 1); //si hubiera un doble espacio entre cada palabra no funciona
			}
		}
		System.out.println("Inicales: " + iniciales);
	}
}
