//-------------------------- 3-10-25

package trimestre1.clases.clase02;

public class Main {
	public static void main(String[] args) {

		// Para crear la segundaClase, he creado un paquete al hacer click derecho en
		// primerProyecto, y luego una clase desde el paquete

		String txt = "Andrés";
		System.out.println(txt.length());

		// Todo lo que empieza por mayuscula es una clase (public class Primera clase)
		// Variables en minuscula, System y String son clases
		// Una variable de una clase es objeto
		// Funciones en minus seguido de ()
		// Una funcion sale un objeto o de una clase

		// EXPLICACIÓN FUNCIONES TEXTOS

		System.out.println(txt.charAt(1)); // Te devuelve el caracter q está en esa posición
											// 1 es la SEGUNDA, ya que empeiza a contar por 0
											// 5 posiciones, 6 elementos

		// System.out.println(text.charAt(6)); //Excepction es error catastrófico, en
		// este caso ha salido del rango permitido

		System.out.println(txt.contains("ndr")); // Booleano que devuelve true or false acerca de si un caracter o
													// secuencia está en el string

		System.out.println(txt.contains("dre")); // False, porque tiene en cuenta la tilde

		System.out.println(txt.contains("d") && txt.contains("A")); // Dentro de una función, no hay que poner comilla
																	// simple en los caracteres,
																	// solo al definir variables char

		System.out.println(txt.startsWith("An"));
		System.out.println(txt.endsWith("és")); // Otros booleanos

		System.out.println(txt.replace("rco", "123")); // Reemplaza las coincidencias por lo que tu quieras
														// Puede no tener la misma longitud o estar vacío
														// Útil para cosas como eliminar espacios

		String txt1 = "hola, buenos días";
		System.out.println(txt1.replace("buenos", "malos").length() + 2); // Reemplazo Y luego le pregunto la longitud Y
																			// le añado 2
		// Como el resultado es un string (una clase), he podido poner punto y añadir
		// otra función.

		System.out.println(txt1.indexOf("u")); // Digo caracter y devuelve la posición de la primera coincidencia
		System.out.println(txt1.indexOf("a"));

		System.out.println(txt1.indexOf("z")); // Como no existe ninguna coincidencia, devuelve posición -1
		System.out.println(txt1.indexOf("a") >= 0); // Booleano que nos dice si una letra existe (siempre que sea >=0
													// está en el String

		System.out.println(txt1.lastIndexOf("a")); // Devuelve la primera coincidencia pero empezando por el final

		// Deberes: no estudiar las funciones como tal,pero si ir ojeandolas (las de
		// texto)

		System.out.println(txt1.toUpperCase().toLowerCase()); // Cambia el string a mayus o minus

		String txt2 = "              hola 5buenos días             ";
		System.out.println("'" + txt.strip() + "'"); // Elimina los espacios al principio y al final (las comillas son
														// para ver mejor si ha funcionado

		String txt3 = "hola  5buenos  días";
		System.out.println("'" + txt3.strip().replace("  ", " ") + "'");

		// CURIOSIDADES

		// Que datos primitivos se relacionan con qué clases (para añadir funciones)
		int x = 10;
		Integer x1 = 1;
		System.out.println(Integer.MAX_VALUE); // Para ver el maximo que pueden almacenar los enteros; Long.MAX_VALUE o
												// Short.MAX_VALUE para ver en caso de que se necesite más o menos)
												// Bastante inútil (salvo para asegurarse de nunca poner un Integer o un
												// short en caso de necesitar un long)
		System.out.println(Long.MAX_VALUE);
		System.out.println(Short.MAX_VALUE);

		double y = 10;
		Double y1;
		System.out.println(Double.MAX_VALUE);

		boolean b = true;
		Boolean b1;

		
		
		// ESTRUCTURAS DE CONTROL:
		// 1. If, If else, If else if

		// if(condicion) {
		// si se cumple hace algo y continuo el código
		// }else {
		// } si no se cumple, hace algo tmb

		int y2 = 10; // Quiero saber si es par o impar

		if (y2 % 2 == 0) {
			System.out.println("El número es par");
		} else {
			System.out.println("El número es impar");
		}

		
		
		if (y2 > 12) {
			System.out.println("es mayor de 12");
		} else if (y2 == 12) {
			System.out.println("es 12");
		} else if (y < 10) {
			System.out.println("es menor de 10");
		} else {
			System.out.println("No lo sé"); // Respuesta genérica, si nada se cumple se sale del bucle
		}

		
		//PRÁCTICA CLASE 1
		
		String txtejemplo = "Tengo mucho sueño";

		if (txtejemplo.contains("a") && txtejemplo.contains("b") && txtejemplo.contains("c")) {
			System.out.println("El texto contiene la letra a, la b y la c.");
		} else {
			System.out.println("El texto no contiene las letras a, b y c (simultaneamente)");
		}
		
		
		// Método dos (profe)
		if (txtejemplo.contains("a")) {
			if (txtejemplo.contains("b")) {
				if (txtejemplo.contains("c"))
						System.out.println("Contiene las 3 letras");
			}else {
				System.out.println("No contiene las 3 letras");
			}
		}

		
		//PRÁCTICA CLASE 2
		
		if (txtejemplo.contains("a") || txtejemplo.contains("b") || txtejemplo.contains("c")) {
			System.out.println("El texto contiene alguna de las letras a, b o c.");
		} else {
			System.out.println("El texto no contiene ninguna de las letras a, b y c");
		}

		
		
		// Control+Shift+F --> en Eclipse, reestructura el código si no hay errores
	}
}
