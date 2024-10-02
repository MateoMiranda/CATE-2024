package principal;

public class main {
    public static void main(String[] args) {
        int[] numeros = new int[34];

        for (int i = 0, num = 0; i < numeros.length; i++, num += 3) {
            numeros[i] = num;
        }

        System.out.println("Arreglo con números divisibles por 3 entre 0 y 100:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Índice " + i + ": " + numeros[i]);
        }
    }
}