package principal;

public class main {

    public static void main(String[] args) {
        long poblacionActual = 7309784505L;
        long crecimientoAnual = 24807909L;

        System.out.println("Población Mundial: " + poblacionActual);
        for (int i = 1; i <= 5; i++) {
            long poblacionFutura = poblacionActual + (crecimientoAnual * i);
            System.out.println( "Luego de " + i + " años: " + poblacionFutura);
        }
    }
}

