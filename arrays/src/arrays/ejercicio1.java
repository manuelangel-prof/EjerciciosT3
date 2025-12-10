package arrays;

/**
 * Ejercicio 1:
 * Define un array de 3 filas x 6 columnas, asigna valores fijos
 * y muestra su contenido en forma de tabla.
 */
public class ejercicio1 {

    private static final int NUM_FILAS = 3;
    private static final int NUM_COLUMNAS = 6;

    public static void main(String[] args) {

        int[][] numeros = new int[NUM_FILAS][NUM_COLUMNAS];

        // Asignación de valores (podría hacerse directamente en la declaración)
        numeros[0][0] = 0;
        numeros[0][1] = 30;
        numeros[0][2] = 2;
        numeros[0][3] = 0;
        numeros[0][4] = 0;
        numeros[0][5] = 5;

        numeros[1][0] = 75;
        numeros[1][1] = 0;
        numeros[1][2] = 0;
        numeros[1][3] = 0;
        numeros[1][4] = 0;
        numeros[1][5] = 0;

        numeros[2][0] = 0;
        numeros[2][1] = 0;
        numeros[2][2] = -2;
        numeros[2][3] = 9;
        numeros[2][4] = 0;
        numeros[2][5] = 11;

        for (int indiceFila = 0; indiceFila < numeros.length; indiceFila++) {
            for (int indiceColumna = 0; indiceColumna < numeros[indiceFila].length; indiceColumna++) {
                System.out.printf("%5d", numeros[indiceFila][indiceColumna]);
            }
            System.out.println();
        }
    }
}
    

