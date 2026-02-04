package trimestre2.ejercicios.ejercicios03_Clases;

import java.util.ArrayList;
import java.util.List;

public class Cuenta {

	private String nombre;
	private String apellidos;
	private String IBAN;
	private String numTarjeta;
	private double saldo;

	public Cuenta(String nombre, String apellidos, int iBAN, int numTarjeta, double saldo) {
		this.nombre = "Pablo";
		this.apellidos = "Soriano";
		IBAN = "ES21 2100 0418 40 1234567890";
		this.numTarjeta = "4532 0152 8410 3257";
		this.saldo = -13.59;
	}

	public String pedirInfoCuenta() {
		return "RESUMEN CUENTA \n" + "TITULAR: " + nombre + " " + apellidos + "\n" + "IBAN: " + IBAN + "\n";
	}
}
