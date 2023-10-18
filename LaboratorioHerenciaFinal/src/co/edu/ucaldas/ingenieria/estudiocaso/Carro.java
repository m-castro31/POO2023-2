package co.edu.ucaldas.ingenieria.estudiocaso;

public class Carro extends Vehiculo{

	private int cilindraje;

	public Carro() {
		// TODO Auto-generated constructor stub
	}

	public Carro(String marca, String modelo, int año) {
		super(marca, modelo, año);
		// TODO Auto-generated constructor stub
	}

	public int getCilindraje() {
		return cilindraje;
	}

	@Override
	public void acelerar() {
		System.out.println("El carro acelera.");
	}

	@Override
	public void frenar() {
		System.out.println("El carro frena.");
	}

	@Override
	public String toString() {
		return "Carro{" +
				"marca='" + getMarca() + '\'' +
				", modelo='" + getModelo() + '\'' +
				", año=" + getAño() +
				", cilindrada=" + cilindraje +
				'}';
	}
}
