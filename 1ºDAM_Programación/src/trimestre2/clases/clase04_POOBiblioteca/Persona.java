package trimestre2.clases.clase04_POOBiblioteca;

//------ Atributos de clase

public class Persona {
	public int edad;
	public String nombre;

//------ Constructores

	public Persona() {
		nombre = "";
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

}
