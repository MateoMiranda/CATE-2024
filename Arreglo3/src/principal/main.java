package principal;

public class main {
	    public static void main(String[] args) {
	        int[] numeros = new int[50];

	        for (int i = 0, num = 2; i < numeros.length; i++, num += 2) {
	            numeros[i] = num;
	        }

	        System.out.println("Arreglo con números pares entre 1 y 100:");
	        for (int i = 0; i < numeros.length; i++) {
	            System.out.println("Índice " + i + ": " + numeros[i]);
	        }
	    }
	}