package co.edu.ucaldas.ingenieria.ejercicioherencia;

public class CuentaLimite extends Cuenta{

	private double limite;

	public CuentaLimite(double montoInicial) {
		super(montoInicial);
		ajustarLimite();
	}

	public void ajustarLimite() {
		limite = obtenerSaldo() / 2;
		System.out.println("Nuevo límite ajustado: $" + limite);
	}

	@Override
	public void retiro(double cifra) {
		if (cifra > 0 && cifra <= obtenerSaldo() && cifra <= limite) {
			super.retiro(cifra);
		} else {
			System.out.println("No es posible realizar el retiro. Saldo insuficiente, cantidad no válida o excede el límite.");
		}
	}

}
