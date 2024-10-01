package principal;

public class main {

	public static void main(String[] args) {
		int[] numeros = new int[11];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = 4 + i;
        }

        System.out.println("Los números entre 4 y 14 son:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Índice " + i + ": " + numeros[i]);
        }

	}

}