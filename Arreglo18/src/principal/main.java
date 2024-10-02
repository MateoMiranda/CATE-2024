package principal;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] original = new int[10];
        int[] copia = new int[5];

        for (int i = 0; i < original.length; i++) {
            System.out.print("Ingrese el número en la posición " + i + ": ");
            original[i] = scanner.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            copia[i] = original[5 + i];
        }

        System.out.println("Arreglo copiado (últimas 5 posiciones):");
        for (int i = 0; i < copia.length; i++) {
            System.out.println("Índice " + i + ": " + copia[i]);
        }
    }
}