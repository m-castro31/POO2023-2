package co.edu.ucaldas.ingenieria.estudiocaso;

public class Vehiculo {

	private String marca;

	private String modelo;

	public Vehiculo(String marca, String modelo, int año) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.año = año;
	}

	public Vehiculo() {
		// TODO Auto-generated constructor stub
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	private int año;

	public void acelerar() {

	}

	public void frenar() {

	}
	
    @Override
    public String toString() {
        return "Motocicleta{" +
                "marca='" + getMarca() + '\'' +
                ", modelo='" + getModelo() + '\'' +
                ", año=" + getAño() +
                '}';
    }
}
