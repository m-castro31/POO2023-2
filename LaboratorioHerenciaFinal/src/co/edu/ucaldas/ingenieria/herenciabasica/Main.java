package co.edu.ucaldas.ingenieria.herenciabasica;

public class Main {

	public static void main(String[] args){

		Perro perro = new Perro("Labrador", "Mediano", 3);
		Gato gato = new Gato("Siamés", "Pequeño", 2);

		System.out.println("Información del perro:");
		System.out.println("Raza: " + perro.getRaza());
		System.out.println("Tamaño: " + perro.getTamaño());
		System.out.println("Edad: " + perro.getEdad());

		System.out.println("\nInformación del gato:");
		System.out.println("Raza: " + gato.getRaza());
		System.out.println("Tamaño: " + gato.getTamaño());
		System.out.println("Edad: " + gato.getEdad());

	}
		public static void accionesAnimal(Animal animal){

			animal.comer();
			animal.dormir();
			animal.mover();
		}
	}
