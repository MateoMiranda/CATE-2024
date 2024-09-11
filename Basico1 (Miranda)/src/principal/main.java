package principal;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese su peso en kg");
		int pesoTierra = scanner.nextInt();
		
		double pesoLuna = pesoTierra*0.17;
		
		
		System.out.println("Su peso en la tierra es de = " + pesoTierra + "kg");
		System.out.println("Su peso en la Luna es de = " + pesoLuna + "kg");
	}

}
