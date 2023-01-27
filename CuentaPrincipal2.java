package Banco;
import java.util.Scanner;
public class CuentaPrincipal2 {
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String operacion;
		Double cantidad;
		
		CuentaBancaria cuenta = new CuentaBancaria("Sara Merino","ES8540852702547825",1520.50);
		
		do {
			System.out.println("Dime la operación que deseas realizar (I/R)");
			operacion = sc.next();
			
			if (!operacion.equalsIgnoreCase("fin")) {
				System.out.println("Dime la cantidad");
				cantidad = sc.nextDouble();
				
				switch (operacion) {
					case "i":
						cuenta.ingreso(cantidad);
						break;
					case "r":
						cuenta.reintegro(cantidad);
						break;
					default:
						System.out.println("Error");
						break;
			}
			System.out.println("El saldo actual es " + cuenta.getSaldo());
		} else {
			System.out.println("Fin del Programa");
		}
		
		} while (!operacion.equalsIgnoreCase("fin"));
		
		System.out.println("Esto es una prueba");
		System.out.println("Modificaciones desde el remoto");

		sc.close();	
	}
}
