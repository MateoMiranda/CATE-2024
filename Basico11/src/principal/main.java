package principal;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tiempo de la llamada en minutos: ");
        int tiempoLlamada = scanner.nextInt();

        double costoTotal;

        if (tiempoLlamada <= 5) {
            costoTotal = 5.0; 
        } else {
            int minutosAdicionales = tiempoLlamada - 5;
            costoTotal = 5.0 + (minutosAdicionales * 0.5);
        }

        System.out.printf("El monto a pagar por la llamada es: " + costoTotal + " pesos");
    }
}

