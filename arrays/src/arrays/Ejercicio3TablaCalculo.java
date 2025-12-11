package arrays;

import java.util.Scanner;

public class Ejercicio3TablaCalculo {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce número de filas: ");
        int filas = teclado.nextInt();

        System.out.print("Introduce número de columnas: ");
        int columnas = teclado.nextInt();

        int[][] tabla = new int[filas][columnas];

        // RELLENAR TABLA
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                tabla[i][j] = 10 * i + j;
            }
        }

        // MOSTRAR TABLA
        System.out.println("\nContenido de la tabla:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(tabla[i][j] + " ");
            }
            System.out.println();
        }

        teclado.close();
    }
}
