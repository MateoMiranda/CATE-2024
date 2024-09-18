package principal;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor del préstamo: ");
        double prestamo = scanner.nextDouble();

        System.out.print("Ingrese el porcentaje de interés del prestamo: ");
        double interes = scanner.nextDouble();

        System.out.print("Ingrese el valor que desea abonar por mes: ");
        double abono = scanner.nextDouble();

        double tasaInteresMensual = (interes / 100) / 12;

        int meses = 0;
        double saldoRestante = prestamo;

        while (saldoRestante > 0) {
            saldoRestante = saldoRestante * (1 + tasaInteresMensual) - abono;
            meses++;
        }

        int anios = meses / 12;
        int mesesRestantes = meses % 12;

        System.out.println("Para pagar el prestamo se tardará: " + anios + " años y " + mesesRestantes + " meses");
    }
}

