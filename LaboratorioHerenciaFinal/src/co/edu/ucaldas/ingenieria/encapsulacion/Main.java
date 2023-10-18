package co.edu.ucaldas.ingenieria.encapsulacion;

public class Main {


	public static void main(String[] args) {
		Persona persona = new Persona("Mariana", 20);

		System.out.println("Nombre: " + persona.getNombre());
		System.out.println("Edad: " + persona.getEdad());

		persona.setNombre("Maria Fernanda");
		persona.setEdad(22);

		System.out.println("Nuevo Nombre: " + persona.getNombre());
		System.out.println("Nueva Edad: " + persona.getEdad());
	}

}
