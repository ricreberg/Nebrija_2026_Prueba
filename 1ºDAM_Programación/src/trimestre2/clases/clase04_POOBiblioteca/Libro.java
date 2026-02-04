package trimestre2.clases.clase04_POOBiblioteca;

public class Libro {
	private int id;
	private String nombre;
	private boolean prestado;
	
	
	// CONSTRUCTORES
	public Libro(int id, String nombre, boolean prestado) {
		this.id = id;
		this.nombre = nombre;
		this.prestado = prestado;
	}
	
	
	//GETTERS AND SETTERS
	public int getId() {
		return id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public boolean isPrestado() {
		return prestado;
	}
	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}
}
