package arrays;

/**
 * Ejercicio 4:
 * Crea una tabla de 10x10 donde cada fila contiene
 * la tabla de multiplicar del número de fila (1 a 10).
 */
public class ejercicio4 {

    private static final int TAMANIO = 10;

    public static void main(String[] args) {

        int[][] tablas = new int[TAMANIO][TAMANIO];

        rellenarTablasMultiplicar(tablas);
        mostrarTablas(tablas);
    }

    /**
     * Rellena la matriz con las tablas de multiplicar del 1 al 10.
     */
    private static void rellenarTablasMultiplicar(int[][] tablas) {
        for (int indiceFila = 0; indiceFila < TAMANIO; indiceFila++) {
            int numeroBase = indiceFila + 1; // tablas del 1 al 10
            for (int indiceColumna = 0; indiceColumna < TAMANIO; indiceColumna++) {
                int factor = indiceColumna + 1;
                tablas[indiceFila][indiceColumna] = numeroBase * factor;
            }
        }
    }

    /**
     * Muestra la matriz por pantalla.
     */
    private static void mostrarTablas(int[][] tablas) {
        System.out.println("Tablas de multiplicar del 1 al 10:");

        for (int indiceFila = 0; indiceFila < TAMANIO; indiceFila++) {
            for (int indiceColumna = 0; indiceColumna < TAMANIO; indiceColumna++) {
                System.out.printf("%4d", tablas[indiceFila][indiceColumna]);
            }
            System.out.println();
        }
    }
}
