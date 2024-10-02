package principal;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una cadena de texto: ");
        String cadena = scanner.nextLine();

        String cadenaInvertida = new StringBuilder(cadena).reverse().toString();
        System.out.println("Cadena invertida: " + cadenaInvertida);
    }
}