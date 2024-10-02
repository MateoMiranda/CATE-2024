package principal;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una palabra: ");
        String cadena = scanner.nextLine();

        boolean esPalindromo = esPalindromo(cadena);

        if (esPalindromo) {
            System.out.println("La cadena es un palíndromo.");
        } else {
            System.out.println("La cadena no es un palíndromo.");
        }
    }

    public static boolean esPalindromo(String cadena) {
        String cadenaLimpia = cadena.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int longitud = cadenaLimpia.length();
        for (int i = 0; i < longitud / 2; i++) {
            if (cadenaLimpia.charAt(i) != cadenaLimpia.charAt(longitud - i - 1)) {
                return false;
            }
        }
        return true;
    }
}