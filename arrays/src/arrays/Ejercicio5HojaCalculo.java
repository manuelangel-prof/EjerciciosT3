package arrays;

import java.util.Random;

public class Ejercicio5HojaCalculo {

    public static void main(String[] args) {

        int[][] numeros = new int[4][5];
        int[] sumaColumnas = new int[5];

        Random generador = new Random();

        // RELLENAR ARRAY
        for (int fila = 0; fila < 4; fila++) {
            for (int col = 0; col < 5; col++) {
                numeros[fila][col] = generador.nextInt(900) + 100; // 100-999
            }
        }

        int sumaTotal = 0;

        // MOSTRAR ARRAY Y SUMAS DE FILA
        for (int fila = 0; fila < 4; fila++) {

            int sumaFila = 0;

            for (int col = 0; col < 5; col++) {
                int valor = numeros[fila][col];

                System.out.print(valor + " ");

                sumaFila = sumaFila + valor;
                sumaColumnas[col] = sumaColumnas[col] + valor;
            }

            System.out.println("| " + sumaFila);
            sumaTotal = sumaTotal + sumaFila;
        }

        // LÍNEA SEPARADORA
        System.out.println("-------------------------------");

        // MOSTRAR SUMAS DE COLUMNA
        for (int col = 0; col < 5; col++) {
            System.out.print(sumaColumnas[col] + " ");
        }

        // SUMA TOTAL
        System.out.println("| " + sumaTotal);
    }
}
