package principal;

public class main {
    public static void main(String[] args) {
        int[] primos = new int[25];
        int indice = 0;

        for (int i = 2; i <= 100; i++) {
            if (esPrimo(i)) {
                primos[indice++] = i;
            }
        }

        System.out.println("Números primos entre 1 y 100:");
        for (int i = 0; i < indice; i++) {
            System.out.println("Índice " + i + ": " + primos[i]);
        }
    }

    public static boolean esPrimo(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}