/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg4.arreglos;

import java.util.Scanner;

/**
 *
 * @author Max
 */
public class Extras5 {
       public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Obtener el tamaño de la matriz del usuario
        System.out.print("Ingrese el número de filas de la matriz: ");
        int N = scanner.nextInt();
        System.out.print("Ingrese el número de columnas de la matriz: ");
        int M = scanner.nextInt();

        // Generar la matriz y mostrarla en pantalla
        int[][] matriz = generarMatriz(N, M);
        System.out.println("Matriz generada:");
        mostrarMatriz(matriz);

        // Calcular y mostrar la suma de los elementos de la matriz
        int suma = sumaMatriz(matriz);
        System.out.println("La suma de los elementos de la matriz es: " + suma);
    }

    // Metodo para generar una matriz de tamanio NxM con valores aleatorios
    public static int[][] generarMatriz(int N, int M) {
        int[][] matriz = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matriz[i][j] = (int) (Math.random() * 10) + 1; // Generar valores aleatorios entre 1 y 10
            }
        }
        return matriz;
    }

    // Metodo para mostrar una matriz en pantalla
    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Método para calcular la suma de los elementos de una matriz
    public static int sumaMatriz(int[][] matriz) {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                suma += matriz[i][j];
            }
        }
        return suma;
    }
}
    

