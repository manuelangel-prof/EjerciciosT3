package arrays;

import java.util.Scanner;

/**
 * Ejercicio 3:
 * Pide número de filas y columnas, crea una tabla bidimensional
 * y la rellena con el valor 10 * i + j en la posición [i][j].
 */
public class ejercicio3 {

    public static void main(String[] args) {

        try (Scanner teclado = new Scanner(System.in)) {
            int numeroFilas = pedirEnteroPositivo(teclado, "Introduce el número de filas: ");
            int numeroColumnas = pedirEnteroPositivo(teclado, "Introduce el número de columnas: ");

            int[][] tabla = new int[numeroFilas][numeroColumnas];

            rellenarTabla(tabla);
            mostrarTabla(tabla);
        }
    }

    /**
     * Pide un número entero positivo por teclado.
     */
    private static int pedirEnteroPositivo(Scanner teclado, String mensaje) {
        int numero;

        do {
            System.out.print(mensaje);
            numero = teclado.nextInt();
        } while (numero <= 0);

        return numero;
    }

    /**
     * Rellena la tabla con el valor 10 * i + j.
     */
    private static void rellenarTabla(int[][] tabla) {
        for (int indiceFila = 0; indiceFila < tabla.length; indiceFila++) {
            for (int indiceColumna = 0; indiceColumna < tabla[indiceFila].length; indiceColumna++) {
                tabla[indiceFila][indiceColumna] = 10 * indiceFila + indiceColumna;
            }
        }
    }

    /**
     * Muestra la tabla por consola.
     */
    private static void mostrarTabla(int[][] tabla) {
        System.out.println("\nContenido de la tabla:");
        for (int indiceFila = 0; indiceFila < tabla.length; indiceFila++) {
            for (int indiceColumna = 0; indiceColumna < tabla[indiceFila].length; indiceColumna++) {
                System.out.printf("%5d", tabla[indiceFila][indiceColumna]);
            }
            System.out.println();
        }
    }
}
