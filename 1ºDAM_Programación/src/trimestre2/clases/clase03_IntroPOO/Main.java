package trimestre2.clases.clase03_IntroPOO;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Persona p = new Persona();
		Persona p1 = new Persona(31, "Andrés");
		Persona p2 = new Persona("Andrés");
		/*
		 * Puedo tener todas las funciones constructor que quiera, pero no suele ser
		 * necesario
		 */

		List<Persona> lst = new ArrayList<>();
		lst.add(p);
		lst.add(p1);
		lst.add(p2);

		/*
		 * Puedo englobar varios tipos de datos, igual que Integer es una clase, Persona
		 * es otra.
		 */

		for (Persona aux : lst) {
			System.out.println(aux);
			/*
			 * Imprime la dirección e identificador, no el elemento en sí De momento no
			 * puedo imprimir directamente
			 */
		}

		System.out.println();

		for (Persona aux : lst) {
			System.out.println(aux.edad + " - " + aux.nombre);

			/*
			 * Si puedo poner .edad o .nombre, pero no todo a la vez. En las vacías rellena
			 * con valores por defecto (0 y null)
			 */
		}

		p1.cumplirAños();
		// Se actualiza ahora

		System.out.println();

		for (Persona aux : lst) {
			System.out.println(aux.edad + " - " + aux.nombre);

			/*
			 * En vez de escribir todo esto, se puede hacer una función
			 */

		}

		System.out.println();

		for (Persona aux : lst) {
			System.out.println(aux.pedirInfo());

		}
		System.out.println();

		/*
		 * Puedo hacerlo para un solo elemento tmb
		 */
		System.out.println(p1.pedirInfo());

		/*
		 * Cumplo años otra vez:
		 */

		System.out.println();

		p1.cumplirAños();
		System.out.println(p1.pedirInfo());

		System.out.println();

		/*
		 * Está definido como null al principio, por lo que daría una exepción
		 */

		// for (Persona aux : lst) {
		// System.out.println(aux.edad + " - " + aux.nombre.toUpperCase());

		// }
		System.out.println(p1.nombre.toUpperCase());

		/*
		 * Si bien puedes seleccionar uno individualmente que si estédefinido (como p1),
		 * si la idea es leer todas (p está null) lo ideal es usar los constructores
		 * para llenarlo con datos vacíos no null (nombre=""; en la clase Persona)
		 */

		System.out.println();

		for (Persona aux : lst) {
			System.out.println(aux.nombre.toUpperCase());
		}
		System.out.println();
		for (Persona aux : lst) {
			System.out.println(aux.pedirInfo().toUpperCase());

		}

		/*
		 * No da error al poner numeros como upper Case, ya que al juntar int mas
		 * String, se convierte todo en string
		 */

		System.out.println();

		for (Persona aux : lst) {
			System.out.println(aux.edad + " - " + aux.nombre + " - " + aux.habilidades);

		}

		/*
		 * He definido la arrayList aunque no la haya usado, la dejo "preparada"
		 */
		System.out.println();

		p.agregarHabilidad("h1"); // no se va a mostrar
		p.agregarHabilidad("sociales");
		p.agregarHabilidad("getFHYQJRTBS");

		for (Persona aux : lst) {
			System.out.println(aux.pedirInfo2());

		}

		/*
		 * p.habilidades.add("1"); De forma directa sin pasar por la funcion me salto el
		 * minimo de 4 caracteres o la seguridad, la solución es ponerlo como private.
		 * Dejarían de funcionarme cosas como System.out.println(aux.edad + " - " +
		 * aux.nombre); pero a cambio solo se pueden modificar llamando a las funciones
		 * públcias ya existentes
		 */

		/*
		 * A partir de ahora, se podría crear función en Persona de pedirEdad,
		 * pedirNombre, cosas así. Pero lo más fácil es usar las funciones Get y Set. En
		 * Source hay opcion de generete getter and setter, para no tener q escribirlo
		 * manual. Siempre en publico
		 */
	}

}

/*
 *  NOTAS:
 */

