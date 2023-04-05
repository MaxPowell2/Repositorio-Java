/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg4.arreglos;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Max
 */
public class Ejercicio5 {
       public static void main(String[] args) {
      int n = 4; // Tamaño de la matriz
        int[][] matriz = generarMatrizAleatoria(n); // Generar matriz aleatoria
        boolean esAntisimetrica = true;

        // Mostrar la matriz original
        System.out.println("Matriz original:");
        for (int i = 0; i < matriz.length; i++) {
            System.out.println(Arrays.toString(matriz[i]));
        }

        // Comprobar si la matriz es antisimétrica
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < i; j++) {
                if (matriz[i][j] != -matriz[j][i]) {
                    esAntisimetrica = false;
                    break;
                }
            }
            if (!esAntisimetrica) {
                break;
            }
        }

        // Mostrar el resultado
        if (esAntisimetrica) {
            System.out.println("La matriz es antisimétrica");
        } else {
            System.out.println("La matriz no es antisimétrica");
        }
    }

    // Generar una matriz aleatoria de tamaño n x n
    public static int[][] generarMatrizAleatoria(int n) {
        int[][] matriz = new int[n][n];
        Random rnd = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = rnd.nextInt(101) - 50; // Generar número aleatorio entre -50 y 50
            }
        }
        return matriz;
    }
}

