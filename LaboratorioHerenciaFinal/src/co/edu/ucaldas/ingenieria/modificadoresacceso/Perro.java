package co.edu.ucaldas.ingenieria.modificadoresacceso;

public class Perro extends Animal{
	
    public Perro(String nombre, int edad) {
        super(nombre, edad);
    }

    public void saludar() {
        System.out.println("¡Guau! Soy un perro llamado " + nombrePublico + " y tengo " + obtenerEdad() + " años.");
    }

    public void intentarMetodoProtegido() {
        metodoProtegido();
    }

}
