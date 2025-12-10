package arrays;

import java.util.Scanner;

/**
 * Ejercicio 2:
 * Pide las notas de 4 alumnos y 5 asignaturas,
 * muestra la tabla de notas y la nota mínima, máxima y media de cada alumno.
 */
public class ejercicio2 {

    private static final int NUM_ALUMNOS = 4;
    private static final int NUM_ASIGNATURAS = 5;

    public static void main(String[] args) {

        double[][] notas = new double[NUM_ALUMNOS][NUM_ASIGNATURAS];

        try (Scanner teclado = new Scanner(System.in)) {

            rellenarNotas(teclado, notas);

            System.out.println("\nTabla de notas:");
            mostrarTablaNotas(notas);

            System.out.println("\nResumen por alumno:");
            mostrarResumenPorAlumno(notas);
        }
    }

    /**
     * Pide las notas por teclado para cada alumno y cada asignatura.
     */
    private static void rellenarNotas(Scanner teclado, double[][] notas) {
        for (int indiceAlumno = 0; indiceAlumno < NUM_ALUMNOS; indiceAlumno++) {
            System.out.println("Introduce las notas del Alumno " + (indiceAlumno + 1) + ":");

            for (int indiceAsignatura = 0; indiceAsignatura < NUM_ASIGNATURAS; indiceAsignatura++) {
                System.out.print("  Asignatura " + (indiceAsignatura + 1) + ": ");
                notas[indiceAlumno][indiceAsignatura] = teclado.nextDouble();
            }
        }
    }

    /**
     * Muestra la tabla de notas con los alumnos en filas y asignaturas en columnas.
     */
    private static void mostrarTablaNotas(double[][] notas) {

        // Cabecera de columnas
        System.out.printf("%10s", " ");
        for (int indiceAsignatura = 0; indiceAsignatura < NUM_ASIGNATURAS; indiceAsignatura++) {
            System.out.printf("%12s", "Asig " + (indiceAsignatura + 1));
        }
        System.out.println();

        // Filas con las notas
        for (int indiceAlumno = 0; indiceAlumno < NUM_ALUMNOS; indiceAlumno++) {
            System.out.printf("%10s", "Alumno " + (indiceAlumno + 1));

            for (int indiceAsignatura = 0; indiceAsignatura < NUM_ASIGNATURAS; indiceAsignatura++) {
                System.out.printf("%12.2f", notas[indiceAlumno][indiceAsignatura]);
            }
            System.out.println();
        }
    }

    /**
     * Calcula y muestra la nota mínima, máxima y media de cada alumno.
     */
    private static void mostrarResumenPorAlumno(double[][] notas) {
        for (int indiceAlumno = 0; indiceAlumno < NUM_ALUMNOS; indiceAlumno++) {
            double notaMinima = Double.MAX_VALUE;
            double notaMaxima = Double.MIN_VALUE;
            double sumaNotas = 0;

            for (int indiceAsignatura = 0; indiceAsignatura < NUM_ASIGNATURAS; indiceAsignatura++) {
                double notaActual = notas[indiceAlumno][indiceAsignatura];

                if (notaActual < notaMinima) {
                    notaMinima = notaActual;
                }
                if (notaActual > notaMaxima) {
                    notaMaxima = notaActual;
                }

                sumaNotas = sumaNotas + notaActual;
            }

            double notaMedia = sumaNotas / NUM_ASIGNATURAS;

            System.out.println("Alumno " + (indiceAlumno + 1) + ":");
            System.out.println("  Nota mínima: " + notaMinima);
            System.out.println("  Nota máxima: " + notaMaxima);
            System.out.println("  Nota media : " + notaMedia);
        }
    }
}