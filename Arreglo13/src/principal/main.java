package principal;

public class main {
    public static void main(String[] args) {
        int[] numeros = new int[100];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;
        }

        System.out.println("Números pares:");
        for (int num : numeros) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }

        System.out.println("Números impares:");
        for (int num : numeros) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }
    }
}