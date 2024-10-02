package principal;

public class main {
    public static void main(String[] args) {
        int[] numeros = {-2, 5, 8, -9, 10, 15, -4};
        int sumaPositivos = 0;
        int sumaNegativos = 0;

        for (int num : numeros) {
            if (num > 0) {
                sumaPositivos += num;
            } else {
                sumaNegativos += num;
            }
        }

        System.out.println("La suma de los elementos positivos es: " + sumaPositivos);
        System.out.println("La suma de los elementos negativos es: " + sumaNegativos);
    }
}