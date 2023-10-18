package co.edu.ucaldas.ingenieria.herenciabasica;

public class Gato extends Animal{
	
	public Gato() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Gato(String raza, String tamaño, int edad) {
		super(raza, tamaño, edad);
		// TODO Auto-generated constructor stub
	}

	public void maullar() {
		System.out.println("El gato esta maullando");
	}
	
	@Override
	public void dormir() {
		System.out.println("El gato esta durmiendo");
	}
	
	@Override
	public void comer() {
		System.out.println("El gato esta comiendo");		
	}

	@Override
	public void mover () {
		System.out.println("El gato se esta moviendo");
	}
	
}
