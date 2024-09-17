package principal;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el radio del círculo (como un entero): ");
        int radio = scanner.nextInt();

        double PI = 3.14159;

        double diametro = 2 * radio;
        double circunferencia = 2 * PI * radio;
        double area = PI * radio * radio;

        System.out.println("Diámetro: " + diametro);
        System.out.println("Circunferencia: " + circunferencia);
        System.out.println("Área: " + area);

    }
}
