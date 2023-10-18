package co.edu.ucaldas.ingenieria.sobreescritura;

public class Gato extends Animal{
	
	public Gato(String raza, String tamaño, int edad) {
        super(raza, tamaño, edad);
    }

    public void maullar() {
        System.out.println("El gato está maullando");
    }

    @Override
    public void mover() {
        System.out.println("El gato se está moviendo");
    }

}
