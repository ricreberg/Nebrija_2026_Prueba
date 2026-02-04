//-------------------------- 15-10-25

package trimestre1.clases.clase05;

public class Main {
	public static void main(String[] args) {
		String txt = "hola";
		int index = 0;
		while (index < txt.length()) { // diferencia entre while y for (el primero ademas es en casos muy concretos, el
										// segundo se usa mucho mas)
			// acción 
			index++;
		}

		for (int i = 0; i < txt.length(); i++) { // hacen lo mismo, solo que te impide q se generen bucles infinitos.
													// Además, puedes crear variables de usar y tirar al definirlas
													// dentro del propio bucle. Esto es porque en los while solo puedes
													// poner una condición, mientras q en el for son tres. Así no hay q
													// resetear cada variable cada vez. El for se usa para ir de un
													// punto a otro (recorrer), mientras que el while se usa mientras
													// que ocurra algo
			// acción
		}

	}

}
