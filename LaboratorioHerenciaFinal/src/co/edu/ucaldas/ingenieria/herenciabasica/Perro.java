package co.edu.ucaldas.ingenieria.herenciabasica;

public class Perro extends Animal{

	public Perro() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Perro(String raza, String tamaño, int edad) {
		super(raza, tamaño, edad);
		// TODO Auto-generated constructor stub
	}
	
	public void ladrar() {
		System.out.println("El perro ladro");
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
		System.out.println("El animal se esta moviendo");
	}
	

}
