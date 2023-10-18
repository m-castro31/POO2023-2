package co.edu.ucaldas.ingenieria.estudiocaso;

public class Main {

	public static void main(String[] args) {
		
		Carro auto = new Carro("Ferrari", "California", 2018);

		System.out.println(auto);
		auto.acelerar();
		auto.frenar();

		System.out.println();

	}
}
