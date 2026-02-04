package trimestre2.clases.clase03_IntroPOO;

import java.util.ArrayList;
import java.util.List;

//------ Atributos de clase

public class Persona {
	public int edad;
	public String nombre;
	public List<String> habilidades;


//------ Constructores
	
	public Persona() {
		nombre = "";
		habilidades = new ArrayList();
	}

	public Persona(int edad, String nombre) {
		this.edad = edad;
		this.nombre = nombre;
	}
	/*
	 * Tu puedes dejar los valores vacíos, asignar los valores originales, dar
	 * valores por defecto...
	 */

	public Persona(String nombre) {
		edad = 0;
		this.nombre = nombre;
		habilidades = new ArrayList();
	}

	// ------Getters and setters

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<String> getHabilidades() {
		return habilidades;
	}

	public void setHabilidades(List<String> habilidades) {
		this.habilidades = habilidades;
	}

	/*
	 * Algunos no tenrían sentido, serían redundantes... algunos set no se deberían
	 * crear porque no le quieres dar acceso al usuario
	 */

	// ------Resto de funciones

	public void cumplirAños() {
		this.edad += 1;
		/*
		 * lo mismo que edad++ La variable ya está definida al principio y es accesible
		 * por todas las funciones El this no sería necesario porque no hay ambigüedad
		 * de nombres. Mejor ir poniéndolo por si acaso
		 */
	}

	public String pedirInfo() {
		return edad + " -+- " + nombre;
	}

	public String pedirInfo2() {
		return edad + " -+- " + nombre + " -+- " + habilidades;
	}

	public void agregarHabilidad(String habilidad) {
		if (habilidad.length() >= 4) {
			this.habilidades.add(habilidad);
		}
	}
}
