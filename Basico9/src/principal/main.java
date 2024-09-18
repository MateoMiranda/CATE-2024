package principal;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = -1;

        while (n < 0) {
            System.out.print("Introduzca un número entero: ");
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                if (n < 0) {
                    System.out.println("ERROR: Numero no valido");
                }
            } else {
                System.out.println("ERROR: Numero no valido");
                scanner.next();
            }
        }

        long factorial = calcularFactorial(n);
        System.out.println("El factorial de " + n + " es: " + factorial);
    }

    public static long calcularFactorial(int n) {
        long resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }
}


