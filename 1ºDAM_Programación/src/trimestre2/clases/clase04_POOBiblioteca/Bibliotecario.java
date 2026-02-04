package trimestre2.clases.clase04_POOBiblioteca;

public class Bibliotecario {
	private int id;
	private String nombre;

	public Bibliotecario(int id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
