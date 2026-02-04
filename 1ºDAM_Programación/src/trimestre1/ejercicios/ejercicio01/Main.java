//-------------------------- 9-10-25

package trimestre1.ejercicios.ejercicio01;

public class Main {
	public static void main(String[] args) {
		// prueba();
		prueba1();
		ejercicio12();
	}

//GENERAR FUNCIONES
	// TIENEN Q ESTAR FUERA DEL MAIN!!!!
	// Si declaro una variable en una funcion, solo se declara en dicha funcion
	// (incluso aunque vaya la primera)
	// De momento no declarar nada en el main

	public static void prueba() {
		System.out.println("Hola");
	}

	public static void prueba1() {
		System.out.println("Prueba"); // si quiero q se ejecute solo este, vuelvo al main y pego el nombre
		// seguido de paréntesis
	}

	public static void ejercicio1() {
		// Pedir los coeficientes de una ecuación se 2º grado, y muestre sus soluciones
		// reales. Si no existen, debe indicarlo
		double a = 1;
		double b = 2;
		double c = 1;
		double discriminante = (b * b - 4 * a * c);
		double resultado1 = (-b + Math.sqrt(discriminante)) / (2 * a);
		double resultado2 = (-b - Math.sqrt(discriminante)) / (2 * a);

		if (discriminante > 0) {
			System.out.println("A partir de los coeficientes indicados, los resultados de la ecuación son " + resultado1
					+ " y " + resultado2);
		} else if (discriminante == 0) {
			System.out.println("A partir de los coeficientes indicados, la ecuación tiene un único resultado, que es "
					+ resultado1); 

		} else {
			System.out.println("La ecuación no tiene soluciones reales");

		}
	}
	// NaN: not a number
	// Math.sqrt() para raíces

	public static void ejercicio2() {
		// Pedir el radio de un círculo y calcular su área. A=PI*r^2
		double radio = 13.89;
		double area = (Math.PI * radio * radio);
		System.out.println("El área del círculo es " + area);
	}
	// Math.PI para el número π

	public static void ejercicio3() {
		// Pedir el radio de una circunferencia y calcular su longitud (L=2πr)
		double radio = 26.26;
		double longitud = (2 * Math.PI * radio);
		System.out.println("La longitud de la circunferencia es " + longitud);
	}

	public static void ejercicio4() {
		// Pedir dos números y decir si son iguales o no.
		double primern = 26;
		double segundon = 54;
		if (primern == segundon) {
			System.out.println("Ambos números son iguales");
		} else {
			System.out.println("Los números no son iguales");
		}
	}

	public static void ejercicio5() {
		// Pedir un número e indicar si es positivo o negativo.
		double numero = 55;
		if (numero < 0) {
			System.out.println("El número es negativo");
		} else if (numero == 0) {
			System.out.println("El número es neutro");
		} else {
			System.out.println("El número es positivo");
		}
	}

	public static void ejercicio6() {
		// Pedir dos números y decir si uno es múltiplo del otro.
		double numero = 24;
		double numero1 = 12;
		if ((numero % numero1) == 0) {
			System.out.println("Los números son mútiplos entre si");
		} else {
			System.out.println("Los numeros no son múltiplos entre si");
		}

	}
	// En divisiones: obtener cociente es n / n. Obtener resto es n % n

	public static void ejercicio7() {
		// Pedir dos números y decir cuál es el mayor o si son iguales
		double numero = 13;
		double numero1 = 12;
		if (numero > numero1) {
			System.out.println("El primer número (" + numero + " ) es mayor que el segundo (" + numero1 + " )");
		} else if (numero == numero1) {
			System.out.println("Los dos números son iguales");
		} else {
			System.out.println("El primer número (" + numero + " ) es menor que el segundo (" + numero1 + " )");
		}
	}

	public static void ejercicio8() {
		// Pedir dos números y mostrarlos ordenados de mayor a menor.
		double numero = 13;
		double numero1 = 16;
		if (numero > numero1) {
			System.out.println("Los números ordenados de mayor a menor serían: " + numero + " , " + numero1);
		} else if (numero == numero1) {
			System.out.println("Los dos números son iguales");
		} else {
			System.out.println("Los números ordenados de mayor a menor serían: " + numero1 + " , " + numero);
		}

	}

	public static void ejercicio9() {
		// Pedir tres números y mostrarlos ordenados de mayor a menor.
		// No funciona si hay dos números iguales
		double numero = 13;
		double numero1 = 16;
		double numero2 = 19;
		double mayor = 0;
		double menor = 0;
		double medio = 0;
		if (numero >= numero1 && numero >= numero2) {
			mayor = numero;
		} else if (numero1 >= numero && numero1 >= numero2) {
			mayor = numero1;
		}

		else {
			mayor = numero2;
		}

		if (numero <= numero1 && numero <= numero2) {
			menor = numero;
		} else if (numero1 <= numero && numero1 <= numero2) {
			menor = numero1;
		} else {
			menor = numero2;
		}

		if (mayor != numero && menor != numero) {
			medio = numero;
		} else if (mayor != numero1 && menor != numero1) {
			medio = numero1;
		} else {
			medio = numero2;
		}

		System.out.println(
				"Los tres números ordenados de mayor a menor se verían como: " + mayor + ", " + medio + ", " + menor);

		// else if ((numero == numero1) && (numero == numero2) && (numero1==numero2)) {
		// ("Los dos números son iguales");

	}

	public static void ejercicio10() {
		// Pedir un número entre 0 y 9999 y decir cuantas cifras tiene
		String numero = "8647";
		if (numero.length() <= 4) {
			System.out.println("El número introducido tiene " + numero.length() + " cifras");
		} else {
			System.out.println("El número introducido no está dentro del rango especificado");
		}
	}

	public static void ejercicio11() {
		// Pedir un número entre 0 y 9999 y mostrarlo con las cifras al revés
		String numero = "899";
		if (numero.length() == 4) {
			System.out.println("El número introducido con las cifras ordenadas al revés se leería como "
					+ numero.charAt(3) + numero.charAt(2) + numero.charAt(1) + numero.charAt(0));
		} else if (numero.length() == 3) {
			System.out.println("El número introducido con las cifras ordenadas al revés se leería como "
					+ numero.charAt(2) + numero.charAt(1) + numero.charAt(0));
		} else if (numero.length() == 2) {
			System.out.println("El número introducido con las cifras ordenadas al revés se leería como "
					+ numero.charAt(1) + numero.charAt(0));
		} else if (numero.length() == 1) {
			System.out.println(
					"El número introducido con las cifras ordenadas al revés se leería como " + numero.charAt(0));
		} else {
			System.out.println("El número introducido no está dentro del rango especificado");
		}
	}

	public static void ejercicio12() {
		// Pedir una nota de 0 a 10 y mostrarla de la forma: Insuficiente, Suficiente,
		// Bien
		int numero = 9;
		if (numero < 5) {
			System.out.println("Tu nota es: Insuficiente");
		} else if (numero >= 5 && numero < 6) {
			System.out.println("Tu nota es: Suficiente");
		} else if (numero >= 6 && numero < 7) {
			System.out.println("Tu nota es: Bien");
		} else if (numero >= 7 && numero < 9) {
			System.out.println("Tu nota es: Notable");
		} else if (numero >= 9 && numero <= 10) {
			System.out.println("Tu nota es: Sobresaliente");
		} else {
			System.out.println("El número introducido no es válido");
		}

	}
	
	public static void ejercicio13() {
		//Muestra todos los números del 1 al 100 que sean múltiplos de 3 o de 5, pero no de ambos
		

}
}