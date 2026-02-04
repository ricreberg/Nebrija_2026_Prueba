package trimestre1.clases.clase08;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		forma1();
	}

	public static void forma0() {
		Scanner sc = new Scanner(System.in);
		int i = -1;
		while (i < 0) {
			try {
				System.out.println("Dame un número");
				i = sc.nextInt();
				sc.nextInt();
			} catch (Exception e) {
				// handle exception
			} finally { // opcional, hace q aunque en try, haya o no excepción, el finally se ejecute de
						// todos modos

			}
		}

		System.out.println(i);
	}

// Por qué se convierte en bucle infinito cuando introduces un String? Salta el catch (InmputMismatchException), continua el código y como las letras siguen definidas no las vuelve a pedir (nextInt solo consume números, no letras), sigue siendo una letra, error--> bucle infinito

//    \n salto de línea

	public static void forma1() {
		Scanner sc = new Scanner(System.in);
		int i = -1;
		while (i < 0) {
			try {
				System.out.println("Dame un número");
				i = sc.nextInt();
				sc.nextInt();
			} catch (Exception e) {
				// handle exception
			} finally { // opcional, hace q aunque en try, haya o no excepción, el finally se ejecute de
						// todos modos

			}
		}
		System.out.println(i);

	}
	
	public static void forma2() {
		Scanner sc = new Scanner(System.in);
		int i = -1;
		while (i < 0) {
			
				System.out.println("Dame un número");
				if (sc.hasNextInt()) {
				i = sc.nextInt();
			} 
				sc.nextLine();
		}
		System.out.println(i);

	}
}