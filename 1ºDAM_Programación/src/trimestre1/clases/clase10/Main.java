//----------------------------------- 30-10
package trimestre1.clases.clase10;

import java.util.Random;

/* import java.util.Arrays;
 * import java.util.Random;
 * import java.util.Scanner; */



public class Main {


	public static void main(String[] args) {
		array0();
	}

	// -------------------------- ARRAYS (2)
	public static void array0() {
		boolean[] arrayEnteros = new boolean[9];
		Random rd = new Random();
		
		for(int i=0; i<arrayEnteros.length; i++) {
			arrayEnteros[i]=rd.nextBoolean();	//para rellenar, no usamos arrays fill ya q solo rellena con el mismo elemento
		}
		
		for(int i=0;i<arrayEnteros.length;i++) {
			System.out.println(arrayEnteros[i]);
		}
		
		
		
	}
}
	