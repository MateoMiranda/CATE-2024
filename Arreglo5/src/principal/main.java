package principal;

public class main {
    public static void main(String[] args) {
        int[] original = new int[5];

        for (int i = 0; i < original.length; i++) {
            original[i] = i + 1;
        }

        int[] copia = new int[original.length];
        for (int i = 0; i < original.length; i++) {
            copia[i] = original[i];
        }

        System.out.println("Arreglo original:");
        for (int i = 0; i < original.length; i++) {
            System.out.println("Índice " + i + ": " + original[i]);
        }

        System.out.println("Copia del arreglo:");
        for (int i = 0; i < copia.length; i++) {
            System.out.println("Índice " + i + ": " + copia[i]);
        }
    }
}