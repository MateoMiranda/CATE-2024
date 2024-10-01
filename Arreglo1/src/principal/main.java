package principal;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[10];

        System.out.print("Ingrese 10 números enteros: ");
        String entrada = scanner.nextLine();

        String[] partes = entrada.split("[ ,]+");

        if (partes.length != 10) {
            System.out.println("ERROR: Debe ingresar exactamente 10 números.");
            return;
        }

        for (int i = 0; i < 10; i++) {
            numeros[i] = Integer.parseInt(partes[i]);
        }

        System.out.println("Datos del vector:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Número en la posición " + i + ": " + numeros[i]);
        }
    }
}
