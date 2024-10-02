package principal;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int[] vector = new int[20];
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nSeleccione una opción:");
            System.out.println("1. Consultar");
            System.out.println("2. Asignar");
            System.out.println("3. Modificar");
            System.out.println("4. Eliminar");
            System.out.println("5. Salir");
            System.out.print("Opción: ");
            int option = scanner.nextInt();

            if (option == 5) {
                break;
            }

            System.out.print("Posición (0-19): ");
            int position = scanner.nextInt();

            if (position < 0 || position > 19) {
                System.out.println("Posición inválida.");
                continue;
            }

            switch (option) {
                case 1:
                    System.out.println("Valor en la posición " + position + ": " + vector[position]);
                    break;
                case 2:
                    System.out.print("Valor a asignar: ");
                    vector[position] = scanner.nextInt();
                    System.out.println("Valor asignado correctamente.");
                    break;
                case 3:
                    System.out.print("Nuevo valor: ");
                    int newValue = scanner.nextInt();
                    vector[position] = newValue;
                    System.out.println("Valor modificado correctamente.");
                    break;
                case 4:
                    vector[position] = 0;
                    System.out.println("Valor eliminado correctamente.");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        }

        scanner.close();
    }
}