package principal;

import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la dimensión del vector: ");
        int dimension = scanner.nextInt();

        int[] numeros = new int[dimension];
        int negativos = 0, positivos = 0, ceros = 0;

        for (int i = 0; i < dimension; i++) {
            System.out.print("Ingrese el número en la posición " + i + ": ");
            numeros[i] = scanner.nextInt();
            if (numeros[i] < 0) {
                negativos++;
            } else if (numeros[i] > 0) {
                positivos++;
            } else {
                ceros++;
            }
        }

        Arrays.sort(numeros);

        int valorMaximo = numeros[numeros.length - 1];
        int valorMinimo = numeros[0];
        
        System.out.println("Vector ordenado:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Índice " + i + ": " + numeros[i]);
        }
        
        System.out.println("Valor máximo: " + valorMaximo);
        System.out.println("Valor mínimo: " + valorMinimo);

        System.out.println("Cantidad de números negativos: " + negativos);
        System.out.println("Cantidad de números positivos: " + positivos);
        System.out.println("Cantidad de ceros: " + ceros);
    }
}