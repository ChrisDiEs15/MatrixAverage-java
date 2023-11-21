/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matrixaverage;

import java.util.Scanner;

/**
 *
 * @author Chris
 */
public class MatrixAverage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tamano = new Scanner(System.in);
        Scanner opcion = new Scanner(System.in);

        System.out.println("Programa que promedia los numeros de fila o columna de una matriz");
        System.out.println("Inserte el numero de filas de la matriz");
        int filas = tamano.nextInt();
        System.out.println("Inserte el numero de columnas");
        int columnas = tamano.nextInt();

        /*create the matrix*/
        int[][] resultMatrix = matrixCreator(filas, columnas);

        System.out.println("Cual promedio desea calcular");
        System.out.println("1.- Promedio por filas");
        System.out.println("2.- Promedio por columnas");
        int opcionElegida = opcion.nextInt();

        /*func to show the average*/
        averageMatrix(resultMatrix, opcionElegida);

    }

    public static int[][] matrixCreator(int fila, int columna) {
        Scanner datosMatrix = new Scanner(System.in);

        int[][] matrixCreator = new int[fila][columna];
        for (int k = 0; k < fila; k++) {
            for (int l = 0; l < columna; l++) {
                System.out.println("Ingrese el dato de la fila " + k + " de la columna " + l);
                int nDato = datosMatrix.nextInt();
                matrixCreator[k][l] = nDato;
            }
        }

        return matrixCreator;
    }

    public static void averageMatrix(int[][] matrix, int opcion) {

        switch (opcion) {
            case 1 -> {
                System.out.println("Se calculara el promedio de las filas de la matrix");
                for (int i = 0; i < matrix.length; i++) {
                    int sum = 0;
                    for (int j = 0; j < matrix[i].length; j++) {
                        sum += matrix[i][j];
                    }
                    double average = (double) sum / matrix[i].length;
                    System.out.println("Promedio de la fila " + i + ": " + average);
                }
            }
            case 2 -> {
                System.out.println("Se calculara el promedio de las columnas");
                for (int j = 0; j < matrix[0].length; j++) {
                    int sum = 0;
                    for (int[] matrix1 : matrix) {
                        sum += matrix1[j];
                    }
                    double average = (double) sum / matrix.length;
                    System.out.println("Promedio de la columna " + j + ": " + average);
                }
            }
            default -> System.out.println("Opcion no valida");
        }
    }

}
