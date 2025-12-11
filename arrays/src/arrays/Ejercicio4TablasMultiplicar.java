package arrays;

public class Ejercicio4TablasMultiplicar {

    public static void main(String[] args) {

        int[][] tablas = new int[10][10];

        // RELLENAR
        for (int fila = 0; fila < 10; fila++) {
            int numero = fila + 1;

            for (int col = 0; col < 10; col++) {
                int factor = col + 1;
                tablas[fila][col] = numero * factor;
            }
        }

        // MOSTRAR
        for (int fila = 0; fila < 10; fila++) {
            for (int col = 0; col < 10; col++) {
                System.out.print(tablas[fila][col] + " ");
            }
            System.out.println();
        }
    }
}
