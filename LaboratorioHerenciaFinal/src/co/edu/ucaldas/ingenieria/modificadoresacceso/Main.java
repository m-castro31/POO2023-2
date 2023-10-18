package co.edu.ucaldas.ingenieria.modificadoresacceso;

public class Main {

	public static void main(String[] args) {
		Perro miPerro = new Perro("Max", 3);

		miPerro.nombrePublico = "Max";
		System.out.println("Nuevo nombre del perro: " + miPerro.nombrePublico);

		System.out.println("Edad del perro: " + miPerro.obtenerEdad());

		miPerro.intentarMetodoProtegido();

		miPerro.saludar();
	}

}
