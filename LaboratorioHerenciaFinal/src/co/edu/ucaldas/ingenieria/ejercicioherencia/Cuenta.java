package co.edu.ucaldas.ingenieria.ejercicioherencia;

public class Cuenta {

	private double saldo;

	public Cuenta(double montoInicial) {
		this.saldo = montoInicial;
	}

	public void ingreso(double cifra) {
		if (cifra > 0) {
			saldo += cifra;
			System.out.println("Ingreso de $" + cifra + " realizado. Nuevo saldo: $" + saldo);
		} else {
			System.out.println("La cantidad de ingreso debe ser mayor que 0.");
		}
	}

	public void retiro(double cifra) {
		if (cifra > 0 && cifra <= saldo) {
			saldo -= cifra;
			System.out.println("Retiro de $" + cifra + " realizado. Nuevo saldo: $" + saldo);
		} else {
			System.out.println("No es posible realizar el retiro. Saldo insuficiente o cantidad no válida.");
		}
	}

	public double obtenerSaldo() {
		return saldo;
	}

}
