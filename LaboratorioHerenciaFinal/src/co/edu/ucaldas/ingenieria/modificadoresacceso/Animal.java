package co.edu.ucaldas.ingenieria.modificadoresacceso;

public class Animal {

	public String nombrePublico;

	private int edadPrivada;

	public Animal(String nombre, int edad) {
		this.nombrePublico = nombre;
		this.edadPrivada = edad;
	}

	public int obtenerEdad() {
		return edadPrivada;
	}

	protected void metodoProtegido() {
		System.out.println("Este es un método protegido en la clase base.");
	}

	void metodoDefault() {
		System.out.println("Este es un método por defecto en la clase base.");
	}

	private void metodoRestringido() {
		System.out.println("Este es un método privado en la clase base.");
	}
}
