//-------------------------- 8-10-25

package trimestre1.clases.clase04;

public class Main {
	public static void main(String[] args) {

		// DEFINIR VARIABLES EN BUCLES

		int index = 0;

		while (index < 10) { 
			System.out.println("Hola" + index);
			index++;
			int i = 0; // No se puede declarar aquí dentro, si la necesito solo para el bucle en
						// concreto si (pasa igual con los if).
		}
		int i = 1; // Es otra variable, la primera solo existe dentro del bucle. Pero si la pongo
					// antes del bucle, si se aplicaría dentro Y fuera del bucle
		System.out.println(i);

		// EXPLICACIÓN BUCLES (2)

		int index1 = 10;
		do {
			System.out.println(index1);
			index++;
		} while (index1 < 10); // Primero actua, luego pregunta la condicion (se va a ejecutar al menos 1 vez)
								// Suele dar problemas, no se usa mucho

		System.out.println();
		while (index1 < 10) {
			System.out.println(index1);
			index1++; // Primero pregunta condición, luego actua; no se va a ejecutar ninguna vez.
		}

		int index2 = 0;

		while (index2 < 10) {
			System.out.println(index2);
			index2++;
			if (index2 == 5) {
				break; // Sale del bucle (si hay varios anidados, el más cercano)
			}
		}

		System.out.println("Continúo el código");

		int index3 = 0;
		while (index < 10) {
			index3++;
			if (index3 == 5) {
				continue; // Se salta jsto esa parte y sigue el bucle (sacará todos los números menos el
							// 5)
							// No muy usado
			}
			System.out.println(index3);
		}
		System.out.println("Continúo el código");

		// PRÁCTICA CLASE
		// Con 2 bucles, hacer que salgan el 00, 01... hasta el 20 Y Parte 2, que no
		// salgan los pares

		int digitint = 0;
		int digitext = 0;

		while (digitext < 2) {
			digitint = 0;

			while (digitint < 10) {
				if (digitint % 2 == 0) {
					digitint++;
					continue;
				} else {
					System.out.println(digitext + "" + digitint); // Pongo un string ya que no quiero q se sumen los dos
																	// números
					digitint++;
				}
			}

			digitext++;
		}

		// Método dos (profe)

		int var = 0;

		while (var < 2) {
			int var1 = 0; // Tengo q hacer q se reinicie dentro del bucle
			while (var1 < 10) {
				if (var1 % 2 == 0) {
					var1++;
					continue; // No hace falta un else, ya que el continue te lleva al inicio. El else se usa
								// más con booleanos
				}
				System.out.println(var + "" + var1);
				var1++;
			}
			var++;
		}

	}
}
