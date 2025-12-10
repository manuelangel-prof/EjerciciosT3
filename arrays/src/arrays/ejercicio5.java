package arrays;

import java.util.Random;

/**
 * Ejercicio 5:
 * Genera 20 números aleatorios entre 100 y 999, los almacena en
 * una tabla de 4 filas x 5 columnas y muestra:
 * - La tabla con las sumas parciales de cada fila.
 * - Las sumas parciales de cada columna.
 * - La suma total en la esquina inferior derecha.
 */
public class ejercicio5 {

    private static final int NUM_FILAS = 4;
    private static final int NUM_COLUMNAS = 5;

    private static final int LIMITE_INFERIOR = 100;
    private static final int LIMITE_SUPERIOR = 999;

    public static void main(String[] args) {

        int[][] numeros = new int[NUM_FILAS][NUM_COLUMNAS];

        rellenarConAleatorios(numeros);
        mostrarTablaConSumas(numeros);
    }

    /**
     * Rellena la tabla con números enteros aleatorios entre LIMITE_INFERIOR y LIMITE_SUPERIOR.
     */
    private static void rellenarConAleatorios(int[][] numeros) {
        Random generador = new Random();
        int rango = LIMITE_SUPERIOR - LIMITE_INFERIOR + 1;

        for (int indiceFila = 0; indiceFila < NUM_FILAS; indiceFila++) {
            for (int indiceColumna = 0; indiceColumna < NUM_COLUMNAS; indiceColumna++) {
                numeros[indiceFila][indiceColumna] = generador.nextInt(rango) + LIMITE_INFERIOR;
            }
        }
    }

    /**
     * Muestra la tabla con sumas parciales de filas y columnas,
     * y la suma total en la esquina inferior derecha.
     */
    private static void mostrarTablaConSumas(int[][] numeros) {

        int[] sumaColumnas = new int[NUM_COLUMNAS];
        int sumaTotal = 0;

        System.out.println("Tabla con sumas parciales (tipo hoja de cálculo):\n");

        // Recorremos filas y calculamos sumas de filas y columnas
        for (int indiceFila = 0; indiceFila < NUM_FILAS; indiceFila++) {
            int sumaFila = 0;

            for (int indiceColumna = 0; indiceColumna < NUM_COLUMNAS; indiceColumna++) {
                int valor = numeros[indiceFila][indiceColumna];

                System.out.printf("%7d", valor);

                sumaFila = sumaFila + valor;
                sumaColumnas[indiceColumna] = sumaColumnas[indiceColumna] + valor;
            }

            // Mostrar suma de la fila al final
            System.out.printf(" |%7d%n", sumaFila);

            sumaTotal = sumaTotal + sumaFila;
        }

        // Mostrar línea separadora
        for (int i = 0; i < NUM_COLUMNAS + 1; i++) {
            System.out.print("---------");
        }
        System.out.println();

        // Mostrar sumas de las columnas
        for (int indiceColumna = 0; indiceColumna < NUM_COLUMNAS; indiceColumna++) {
            System.out.printf("%7d", sumaColumnas[indiceColumna]);
        }

        // Mostrar suma total en la esquina inferior derecha
        System.out.printf(" |%7d%n", sumaTotal);
    }
}
