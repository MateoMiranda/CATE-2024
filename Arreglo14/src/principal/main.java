package principal;

import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la dimensión del vector: ");
        int dimension = scanner.nextInt();

        int[] numeros = new int[dimension];

        for (int i = 0; i < dimension; i++) {
            System.out.print("Ingrese el número en la posición " + i + ": ");
            numeros[i] = scanner.nextInt();
        }

        Arrays.sort(numeros);

        System.out.println("Vector ordenado:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Índice " + i + ": " + numeros[i]);
        }
    }
}