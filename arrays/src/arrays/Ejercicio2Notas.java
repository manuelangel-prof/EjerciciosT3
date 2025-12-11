package arrays;

import java.util.Scanner;

public class Ejercicio2Notas {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double[][] notas = new double[4][5];

        // INTRODUCIR NOTAS
        for (int alumno = 0; alumno < 4; alumno++) {
            System.out.println("Introduce las notas del Alumno " + (alumno + 1));

            for (int asignatura = 0; asignatura < 5; asignatura++) {
                System.out.print("Asignatura " + (asignatura + 1) + ": ");
                notas[alumno][asignatura] = teclado.nextDouble();
            }
        }

        System.out.println("\nTabla de notas:");

        // MOSTRAR TABLA
        for (int alumno = 0; alumno < 4; alumno++) {
            System.out.print("Alumno " + (alumno + 1) + ": ");

            for (int asignatura = 0; asignatura < 5; asignatura++) {
                System.out.print(notas[alumno][asignatura] + " ");
            }
            System.out.println();
        }

        System.out.println("\nResumen por alumno:");

        // MIN, MAX, MEDIA
        for (int alumno = 0; alumno < 4; alumno++) {

            double notaMinima = notas[alumno][0];
            double notaMaxima = notas[alumno][0];
            double suma = 0;

            for (int asignatura = 0; asignatura < 5; asignatura++) {
                double actual = notas[alumno][asignatura];

                if (actual < notaMinima) {
                    notaMinima = actual;
                }
                if (actual > notaMaxima) {
                    notaMaxima = actual;
                }

                suma = suma + actual;
            }

            double media = suma / 5;

            System.out.println("Alumno " + (alumno + 1));
            System.out.println("Mínima: " + notaMinima);
            System.out.println("Máxima: " + notaMaxima);
            System.out.println("Media : " + media);
        }

        teclado.close();
    }
}
