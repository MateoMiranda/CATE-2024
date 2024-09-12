package principal;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        boolean esNumeroValido = false;
        
        while (!esNumeroValido) {
            System.out.print("Ingrese un número entero de 5 dígitos: ");
            String entrada = scanner.nextLine();
            
            try {
                numero = 0;
                
                if (entrada.length() == 5) {
                    esNumeroValido = true;
                    
                    for(int x=0; x<5; x++){
                    	numero += Character.getNumericValue(entrada.charAt(x));
                    }
                    
                    System.out.println("La suma de los dígitos es: " + numero);
                } else {
                    System.out.println("ERROR: El número debe tener exactamente 5 dígitos.");
                }
            } catch (NumberFormatException e) {
                System.out.println("ERROR: La entrada no es un número válido.");
            }
        }
        
        scanner.close();
    }
}
