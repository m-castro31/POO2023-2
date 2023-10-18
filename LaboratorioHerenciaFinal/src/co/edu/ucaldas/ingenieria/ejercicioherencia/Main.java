package co.edu.ucaldas.ingenieria.ejercicioherencia;

public class Main {

	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta(1000);
		CuentaLimite cuentaConLimite = new CuentaLimite(2000);

		cuenta.ingreso(500);
		cuenta.retiro(300);
		System.out.println("Saldo de cuenta: $" + cuenta.obtenerSaldo());

		cuentaConLimite.ingreso(800);
		cuentaConLimite.retiro(1000);
		cuentaConLimite.ajustarLimite();
		cuentaConLimite.retiro(700);
		System.out.println("Saldo de cuenta con límite: $" + cuentaConLimite.obtenerSaldo());
	}

}
