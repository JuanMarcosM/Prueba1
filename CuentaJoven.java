package Banco;

public class CuentaJoven extends CuentaBancaria{
	
	private double comision = 10;

	public CuentaJoven(double comision) {
		super();
		this.comision = comision;
	}

	public CuentaJoven(String titular, String numeroCuenta, double saldo, double comision) {
		super(titular, numeroCuenta, saldo);
		this.comision=comision;
	}

	public double getComision() {
		return comision;
	}

	public void setComision(double comision) {
		this.comision = comision;
	}
}