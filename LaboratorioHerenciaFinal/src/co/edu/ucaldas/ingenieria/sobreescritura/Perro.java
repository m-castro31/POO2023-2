package co.edu.ucaldas.ingenieria.sobreescritura;

public class Perro extends Animal{

	public Perro(String raza, String tamaño, int edad) {
        super(raza, tamaño, edad);
    }

    public void ladrar() {
        System.out.println("El perro está ladrando");
    }

    @Override
    public void mover() {
        System.out.println("El perro se está moviendo");
    }
}
