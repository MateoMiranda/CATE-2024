package principal;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor en pesos: ");
        int monto = scanner.nextInt();

        int[] billetes = {2000, 1000, 500, 200, 100};
        int[] monedas = {5, 2, 1};

        System.out.println("Cantidad mínima de billetes y monedas para " + monto + " pesos:");
        
        for (int billete : billetes) {
            int cantidadBilletes = monto / billete;
            if (cantidadBilletes > 0) {
                System.out.println(cantidadBilletes + " billetes de " + billete + " pesos");
                monto %= billete;
            }
        }

        for (int moneda : monedas) {
            int cantidadMonedas = monto / moneda;
            if (cantidadMonedas > 0) {
                System.out.println(cantidadMonedas + " monedas de " + moneda + " pesos");
                monto %= moneda;
            }
        }
    }
}

