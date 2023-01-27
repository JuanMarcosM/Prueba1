package Banco;
import java.util.Scanner;
public class CuentaPrincipal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String titular;
		String numeroCuenta;
		double cantidad,saldo;
		
		System.out.println("Dime el nombre del titular de la cuenta");
		titular = sc.next();
		
		System.out.println("Dime el número de cuenta");
		numeroCuenta = sc.next();
		
		System.out.println("Dime el saldo de la cuenta");
		saldo = sc.nextDouble();
		
		String operacion;
		System.out.println("Dime que operación quieres realizar");
		operacion = sc.next();
		
		System.out.println("Dime la cantidad");
		cantidad = sc.nextDouble();
		
		CuentaBancaria cb = new CuentaBancaria(titular, numeroCuenta, saldo);
		CuentaJoven joven = new CuentaJoven(saldo);
		cb.visualización();
		
		switch (operacion) {
		case "ingreso":
			cb.ingreso(cantidad);
			System.out.println("Operación Correcta");
			break;
		case "reintegro":
			cb.reintegro(cantidad);
			System.out.println("Operación Correcta");
			break;
		default:
			System.out.println("Error, operación incorrecta");
		}
		System.out.print("El saldo de la cuenta actual es: " + cb.getSaldo());
		sc.close();
	}
}