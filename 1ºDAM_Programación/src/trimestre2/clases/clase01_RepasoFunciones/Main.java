//----------------------------------- 08-01
package trimestre2.clases.clase01_RepasoFunciones;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		sumar(0, 0, null);
		sumar(0, null, 0);
		int i = 0;
		sumar(i);
		System.out.println(i);
		// .
		System.out.println();
		List<Integer> lst = new ArrayList<>();
		System.out.println(lst);
		agregarDatos(lst, 1);
		System.out.println(lst);
		/*
		 * Salen dos, la primera null porque no habia llamado a la funcion, la segunda
		 * con el valor. No es un clon
		 * 
		 */
		System.out.println();
		List<Integer> lst2 = new ArrayList<>();
		System.out.println(lst2);
		System.out.println(agregarDatos2(lst2, 1));
		System.out.println(lst2);
		//
		String txt = "carmelo";
		System.out.println(txt);
		prueba(txt);
		txt.equals(prueba(txt));
		System.out.println(txt);
	}

	// -------------------------
	/*
	 * void iba a hacer cosas pero no va a retornar nada Se pueden declarar antes o
	 * despues del uso (en java) Si queremos q nos devuelva algo, se indica (en el
	 * mismo orden) null =sin valor conocido ("" si sería un valor)
	 */

	public static void sumar(int n1, int n2, String txt) {
		System.out.println();
	}

	/*
	 * Si cambio el orden de los parametros tecnicamente son dos funciones distintas
	 * Se pueden tener funcionescon nombres identicos mientras el orden de los
	 * parametros no coincida Se puede cambiar nombre de las variables, pero no
	 * importa si es el mismo
	 */

	public static void sumar(int n1, String txt, int n3) {
		System.out.println();
	}

	public static void sumar(int n2) {
		n2++;
		System.out.println(n2);
	}
	/*
	 * No imprime aunque pusiera return Cojo valor de la i, se la pasa a la funcion
	 * como clon (el roiginal no es afectado) El original vale 0, y el clon vale 1
	 * Para q funcione, paso la funcion de void a int, y pongo en el principal
	 * i=sumar (i). Importante q aunque cambie de void al tipo de valor, si no
	 * igualo, sigue sin actualizarseel original, tendría que hacer print del clon
	 * Sirve para numeros, booleanos y char
	 */

	/*
	 * Paso por referencia Quiero agregar datos a la lista a partir de una funcion
	 * (se podría hacer con lst.add, pero se quiere con funciones ya que puede
	 * usarse para filtrar datos como numeros pares, etc) Le paso a la funcion la
	 * lista q voy a trabajar y el dato q quiero agregar Al pasar por valor como
	 * antes, estaríamos generando un clon de la variable Los basicos (int, char,
	 * boolean) se pasan por valor siempre (clon) Los objetos (como las listas) se
	 * pasan por referencia (siempre) Le puedo poner el nombre q quiera, pero sigue
	 * siendo la misma lista No hay q poner return
	 */

	public static void agregarDatos(List<Integer> lstsfgs, int i3) {
		lstsfgs.add(i3);
	}

	/*
	 * Intento de agregar algo a una lista (q pudiera fallar) True significa q la
	 * accion se ha agregado con exito, false q ha habido error Todo lo que se
	 * quiera devolver q no esté definido en los parametros de la función, hay q
	 * poner return La lista está en paso por referencia, el int en paso por valor
	 */

	public static boolean agregarDatos2(List<Integer> lstsfgs, int i3) {
		try {
			lstsfgs.add(i3);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	/*
	 * Probar q datos pasan por valor y cuales por referencia Mi teoríaes que
	 * contenedores (arrays, arrays list y mapas) pasan por referencia y que
	 * contenido (int, char, boolean) por valor. Tengo duda con Strings
	 */

	public static String prueba(String txt) {
		return txt.replace("carmelo", "carmela");
	}
}