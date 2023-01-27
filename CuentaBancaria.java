package Banco;
/**
 * Nos permite obtener los ingresos y reintegros en una cuenta bancaria y consultar el saldo de la cuenta
 * @author Juan Marcos Galindo Mendoza
 * @version 1.0 24/10/2022
 */
public class CuentaBancaria {

	// Declaramos atributos
	/**
	 * 	titular es el nombre del propietario de la cuenta 
	 *  numeroCuenta es el numero de identificación de la cuenta 
	 *  saldo es la cantidad de la cuenta disponible 
	 */
	private String titular;
	private String numeroCuenta;
	private double saldo;
	
	// Creamos constructor sin parámetros
	public CuentaBancaria() {
	} 
	
	// Creamos constructor con parámetros
	public CuentaBancaria(String titular, String numeroCuenta, double saldo) {
		this.titular = titular;
		this.numeroCuenta = numeroCuenta;
		this.saldo = saldo;
	}
	// Metodo para visualisar los datos de la cuenta bancaria
	public void visualización() {
		System.out.println("Titular: " + titular);
		System.out.println("Número de cuenta: " + numeroCuenta);
		System.out.println("Saldo de cuenta: " + saldo);
	}
	// Getter y setter
	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	// Creamos método de ingreso
	/**
	 * Ingresa una cantidad de ingreso en la cuenta
	 * @param cantidad: dinero a ingresar
	 * @return valor boolean: true si se ha efectuado correctamente la operación y false si no se ha realizado la operación
	 */
	public boolean ingreso(double cantidad) {
		
		if (cantidad <= 0) {
			return false;
		} else {
			saldo += cantidad;
			return true;
		}
	}
	// Creamos método de reintegro
	/**
	 * Reintegro de la cuenta bancaria
	 * @param cantidad: dinero a retirar 
	 * @return un valor boolean: true si se puede realizar la operación y false en caso contrario
	 */
	public boolean reintegro(double cantidad) {
		
		if ((cantidad <= 0) || (saldo < cantidad)) {
			return false;
		} else {
			saldo -= cantidad;
			return true;
		}
	}
}