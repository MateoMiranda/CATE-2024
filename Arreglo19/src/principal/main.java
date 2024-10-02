package principal;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de alumnos: ");
        int n = scanner.nextInt();
        double[] notas = new double[n];
        double suma = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese la nota del alumno " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
            suma += notas[i];
        }

        double promedio = suma / n;
        System.out.println("El promedio de la clase es: " + promedio);

        System.out.println("Alumnos con notas por encima del promedio:");
        for (int i = 0; i < n; i++) {
            if (notas[i] > promedio) {
                System.out.println("Alumno " + (i + 1) + ": " + notas[i]);
            }
        }
    }
}