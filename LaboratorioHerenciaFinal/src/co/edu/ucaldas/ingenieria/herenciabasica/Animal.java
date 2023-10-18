package co.edu.ucaldas.ingenieria.herenciabasica;

public class Animal {

	private String raza;

	private String tamaño;

	private int edad;

	public Animal() {
		// TODO Auto-generated constructor stub
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getTamaño() {
		return tamaño;
	}

	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Animal(String raza, String tamaño, int edad) {
		this.raza = raza;
		this.tamaño = tamaño;
		this.edad = edad;
	}
	
	public void comer() {
		System.out.println("El animal esta comiendo");		
	}
	
	public void dormir () {
		System.out.println("El animal esta durmiendo");
	}
	public void mover () {
		System.out.println("El animal se esta moviendo");
	}
	


}
