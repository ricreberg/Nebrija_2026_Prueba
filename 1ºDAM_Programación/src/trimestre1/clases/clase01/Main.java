//------------------------ 2-10-25

package trimestre1.clases.clase01;

public class Main {
	public static void main(String[] args) {

		// holaa
		/*
		 * h o l a
		 */

		// EXPLICACIÓN NÚMEROS

		// declaramos una variable tipo nº entero
		int numero = 10;

		// para reutilizar la variable omito el tipo de dato
		numero = 11;
		numero = 1989;

		int numero1 = 23;

		// Función para que al ejecutar muestre por pantalla el valor actual de la
		// variable que pongas en el paréntesis

		System.out.println(numero);

		numero = 12;
		System.out.println(numero);

		// Sumar dos variables (creas una variable nueva cuyo valor es el resultado)

		int suma = numero + numero1; 
		System.out.println(suma);

		// Para restar y multiplicar

		int resta = numero - numero1;

		int operacion = numero * numero1;

		// Para dividir

		int division = numero / numero1; // Para divisor
		int resto = numero % numero1; // Para resto

		// si defines una variable con el nombre de una existente da error
		// si en un int escribes un numero decimal tmb da error (hay q usar double)

		double numero3 = 123.4;

		/*
		 * si sumo un entero mas un decimal, poner double, ya que el resultado va a ser
		 * probablemente decimal, y si se pone int se pierde info
		 */

		// EXPLICACIÓN BOOLEANOS

		boolean verdad = true;
		boolean falso = false;

		// Para ambos deben ser correctos

		System.out.println(true && true); // TRUE //EJ: usuario y contraseña son correctos--> log en cuenta
		System.out.println(false && true); // FALSE
		System.out.println(true && false); // FALSE
		System.out.println(false && false); // FALSE

		// Para uno u otro sea correcto (or)

		System.out.println(true || true); // TRUE
		System.out.println(false || true); // TRUE
		System.out.println(true || false); // TRUE
		System.out.println(false || false); // FALSE

		// No se pueden sumar numeros (int o double) con booleanos

		// EXPLICACIÓN TEXTOS

		// char para caracteres (con comilla simple)
		// solo se pueden imprimir en pantalla o compararlos

		char caracter = '6';
		char caracter1 = '9';
		char caracter2 = 'd';

		// Si se suman caracteres se suman sus valores ASCII, siendo la suma de 6 y 9 =
		// 111 (se corresponde con la o)
		// Alt y el valor pone en teclado numerico caracteres mediante ASCII
		System.out.println(caracter + caracter1);

		// String (S mayusc) para palabras o frases (no aparece como palabra reservada)
		String txt = "buenos días";
		String txt1 = ", que tal?";

		// se pueden sumar strings (concatenar)

		String txt2 = txt + txt1;
		System.out.println(txt2);

		// s!! yso y control espacio + enter para system.out.println()

		// Comparar variables (númericas en este caso)
		int x = 10;
		int y = 11;

		System.out.println(x == y); // Comparar si son iguales
		System.out.println(x < y);
		System.out.println(x > y);
		System.out.println(x <= y); // Comparar si es menor o igual
		System.out.println(x >= y);
		System.out.println(x != y); // Saber si son diferentes

		boolean resultado = x == y; // Creo variable para almacenar si x e y son iguales (como no lo son, será
									// false)
		System.out.println(resultado);

		// PRUEBAS

		int n1 = 13;
		double n2 = 14.25;

		System.out.println(n1 == n2 && n1 != n2); // Primero false porque no son iguales, luego true porque diferentes.
													// al ser &&, el resultado es false

		// Para texto y numeros, solo se puede sumar (y se hace como string)

	}

}

/* ============================================================
NOTAS DE VARIAS
============================================================ */

//Correo del profesor:
// amartime@nebrija.es

//Nombre del proyecto:
// - Debe ir en minúsculas (ejemplo: primerProyecto)

//Al crear el proyecto:
// - Borrar el módulo info.java dentro de la carpeta src

//Generar paquetes (carpetas dentro de src):
// - Click derecho sobre "src" → New → Package
// - Luego click derecho sobre el paquete → New → Class
//   * El nombre de la clase empieza con mayúscula
//   * Es el fichero donde se coloca el código

//Importante:
// - El nombre del fichero y el de la clase deben ser iguales

/* ------------------------------
PALABRAS RESERVADAS
------------------------------ */

//No se pueden usar como nombres de variables ni ficheros,
//porque son parte del lenguaje Java.
//Ejemplo: no se puede usar "int", "class", "public", etc.
//Se puede usar "String" porque es una clase, no una palabra reservada.

/* ------------------------------
SINTAXIS BÁSICA
------------------------------ */

//No se puede escribir nada fuera de las llaves { }
//(a diferencia de Python, no es necesario usar tabulación)

//Para crear el método principal (main):
// Escribir "main", presionar Ctrl + Espacio y aceptar.
// Esto genera automáticamente:
//
// public static void main(String[] args) {
//
// }
//
//Este método es la "puerta de entrada" al código.

//Una función (método) no puede contener otras funciones dentro en Java.

/* ------------------------------
COMENTARIOS
------------------------------ */

//Comentario de una sola línea:  // texto

//Comentario de varias líneas:
/*
Texto de varias líneas
entre los delimitadores
*/

/* ------------------------------
ATAJOS ÚTILES
------------------------------ */

//Ctrl + S → guardar el fichero.
//* También actualiza cosas como el listado de errores en Eclipse.

