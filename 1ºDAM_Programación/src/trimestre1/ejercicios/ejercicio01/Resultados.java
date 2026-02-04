package trimestre1.ejercicios.ejercicio01;

public class Resultados {
	public static void main(String[] args) {
		ejercicio1();
		ejercicio2();
		ejercicio3();
		ejercicio4();
		ejercicio5();
		ejercicio6();
		ejercicio7();
		ejercicio8();
		ejercicio9();
		ejercicio10();
		ejercicio11();
		ejercicio12();
		ejercicio13();
		ejercicio14();
		ejercicio15();
		ejercicio16();
		ejercicio17();
		ejercicio18();
		ejercicio19();
		ejercicio20();
		ejercicio21();
	}

	public static void ejercicio1() {
		System.out.println("---Ejercicio 1");
		int a = 5;
		int b = 15;
		int c = 1;
		double resultado1 = (-b + Math.sqrt(b * b - 4 * a * c)) / 2 * a;
		double resultado2 = (-b - Math.sqrt(b * b - 4 * a * c)) / 2 * a;
		System.out.println("Primer resultado: " + resultado1);
		System.out.println("Segundo resultado: " + resultado2);
	}

	public static void ejercicio2() {
		System.out.println("---Ejercicio 2"); 
		double radio = 5.1;
		System.out.println("El area del circulo es: " + Math.PI * radio * radio);
	}

	public static void ejercicio3() {
		System.out.println("---Ejercicio 3");
		double radio = 5.1;
		System.out.println("La longitud de la cirunferencia es: " + Math.PI * 2 * radio);
	}

	public static void ejercicio4() {
		System.out.println("---Ejercicio 4");
		int x = 1000;
		int y = 10;
		if (x == y) {
			System.out.println("Los dos números son iguales ==" + x + "-" + y);
		} else {
			System.out.println("Los dos números son diferentes !=" + x + "-" + y);
		}
	}

	public static void ejercicio5() {
		System.out.println("---Ejercicio 5");
		int y = 10;
		if (y > 0) {
			System.out.println("El número es positivo: " + y);
		} else if (y == 0) {
			System.out.println("El número es 0: " + y);
		} else {
			System.out.println("El número es negativo: " + y);
		}
	}

	public static void ejercicio6() {
		System.out.println("---Ejercicio 6");
		int x = 10;
		int y = 2;
		if (x % y == 0) {
			System.out.println("El número " + x + " es múltiplo de " + y);
		} else {
			System.out.println("Estos números no tienen relación");
		}
	}

	public static void ejercicio7() {
		System.out.println("---Ejercicio 7");
		int x = 5;
		int y = 50;
		if (x == y) {
			System.out.println("Los dos número son iguales");
		} else if (x > y) {
			System.out.println("El valor de x(" + x + ") es mayor a y(" + y + ")");
		} else {
			System.out.println("El valor de y(" + y + ") es mayor a x(" + x + ")");
		}
	}

	public static void ejercicio8() {
		System.out.println("---Ejercicio 8");
		int x = 5;
		int y = 50;
		if (x > y) {
			System.out.println(x + "-" + y);
		} else {
			System.out.println(y + "-" + x);
		}
	}

	public static void ejercicio9() {
		System.out.println("---Ejercicio 9");
		int x = 51;
		int y = 50;
		int z = 500;
		if (x > y) {
			if (x > z) {
				if (y > z) {
					System.out.println(x + "-" + y + "-" + z);
				} else {
					System.out.println(x + "-" + z + "-" + y);
				}
			} else {
				System.out.println(z + "-" + x + "-" + y);
			}
		} else {
			if (y > z) {
				if (x > z) {
					System.out.println(y + "-" + x + "-" + z);
				} else {
					System.out.println(y + "-" + z + "-" + x);
				}
			} else {
				System.out.println(z + "-" + y + "-" + x);
			}
		}
	}

	public static void ejercicio10() {
		System.out.println("---Ejercicio 10");
		int numero = 5481;
		System.out.println("El número " + numero + " tiene " + (numero + "").length() + " caracteres");
	}

	public static void ejercicio11() {
		System.out.println("---Ejercicio 11");
		int numero = 5461;
		int index = (numero + "").length() - 1;
		while (index >= 0) {
			System.out.print((numero + "").charAt(index));
			index--;
		}
		System.out.println();
	}

	public static void ejercicio12() {
		System.out.println("---Ejercicio 12");
		int nota = 6;
		if (nota < 5) {
			System.out.println("Insuficiente");
		} else if (nota >= 5 && nota <= 7) {
			System.out.println("Suficiente");
		} else {
			System.out.println("Bien");
		}
	}

	public static void ejercicio13() {
		System.out.println("---Ejercicio 13");
		int index = 1;
		while (index <= 1000) {
			if (index % 3 == 0 || index % 5 == 0) {
				if (!(index % 3 == 0 && index % 5 == 0)) {
					System.out.println(index);
				}
			}
			index++;
		}
	}

	public static void ejercicio14() {
		System.out.println("---Ejercicio 14");
		int contador = 0;
		int index = 1;
		while (index <= 100) {
			if (index % 2 != 0) {
				contador = contador + index;
			}
			index++;
		}
		System.out.println("La suma de todos los números impares es: " + contador);
	}

	public static void ejercicio15() {
		System.out.println("---Ejercicio 15");
		int numero = 100;
		int index = 1;
		while (index < numero / 2) {
			if (numero % index == 0) {
				System.out.println(index);
			}
			index++;
		}
	}

	public static void ejercicio16() {
		System.out.println("---Ejercicio 16");
		int numero = 100;
		int index = 2;
		int contador = 0;
		while (index < numero / 2) {
			if (numero % index == 0) {
				contador++;
			}
			index++;
		}
		if (contador == 0) {
			System.out.println("El número " + numero + "es primo");
		} else {
			System.out.println("El número no es primo ");
		}
	}

	public static void ejercicio17() {
		System.out.println("---Ejercicio 17");
	}

	public static void ejercicio18() {
		System.out.println("---Ejercicio 18");
	}

	public static void ejercicio19() {
		System.out.println("---Ejercicio 19");
		int base = 5;
		int exponente = 3;
		int resultado = 1;
		// 125
		System.out.print(base + " elevado a " + exponente + " = ");
		while (exponente > 0) {
			resultado = resultado * base;
			exponente--;
		}
		System.out.println(resultado);

	}

	public static void ejercicio20() {
		System.out.println("---Ejercicio 20");
		int numero = 15463;
		String txtNum = numero + "";
		int index = txtNum.length() - 1;
		while (index >= 0) {
			System.out.print(txtNum.charAt(index) + " ");
			index--;
		}
		System.out.println();

	}

	public static void ejercicio21() {
		System.out.println("---Ejercicio 21");
		int numero = 15463;
		int total = 0;
		while (numero > 10) {
			total = total + numero % 10;
			numero = numero / 10;
		}
		System.out.println("la suma de digitos es: " + total);
	}

}