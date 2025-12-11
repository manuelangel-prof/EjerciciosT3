package arrays;

public class Ejercicio1TablaFija {

    public static void main(String[] args) {

        int[][] num = new int[3][6];

        // Asignación de valores según tabla del boletín
        num[0][0] = 0;
        num[0][1] = 30;
        num[0][2] = 2;
        num[0][3] = 0;
        num[0][4] = 0;
        num[0][5] = 5;

        num[1][0] = 75;
        num[1][1] = 0;
        num[1][2] = 0;
        num[1][3] = 0;
        num[1][4] = 0;
        num[1][5] = 0;

        num[2][0] = 0;
        num[2][1] = 0;
        num[2][2] = -2;
        num[2][3] = 9;
        num[2][4] = 0;
        num[2][5] = 11;

        // Mostrar la tabla
        for (int fila = 0; fila < 3; fila++) {
            for (int columna = 0; columna < 6; columna++) {
                System.out.print(num[fila][columna] + " ");
            }
            System.out.println();
        }
    }
}

