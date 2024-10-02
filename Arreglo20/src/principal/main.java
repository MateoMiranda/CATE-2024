package principal;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de empleados: ");
        int n = scanner.nextInt();
        String[] nombres = new String[n];
        double[] sueldos = new double[n];

        for (int i = 0; i < n; i++) {
            scanner.nextLine();
            System.out.print("Ingrese el nombre del empleado " + (i + 1) + ": ");
            nombres[i] = scanner.nextLine();
            System.out.print("Ingrese el sueldo del empleado " + (i + 1) + ": ");
            sueldos[i] = scanner.nextDouble();
        }

        double mayorSueldo = sueldos[0];
        int indiceMayor = 0;
        for (int i = 1; i < n; i++) {
            if (sueldos[i] > mayorSueldo) {
                mayorSueldo = sueldos[i];
                indiceMayor = i;
            }
        }

        System.out.println("El empleado con el mayor sueldo es " + nombres[indiceMayor] + " con un sueldo de " + mayorSueldo);
    }
}