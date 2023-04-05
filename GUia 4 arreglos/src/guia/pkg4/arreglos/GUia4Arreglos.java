/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg4.arreglos;

import java.util.Arrays;

/**
 *
 * @author Max
 */
public class GUia4Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        int[][] matriz = new int[4][4];

        // Rellenar la matriz con valores aleatorios
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
            }
        }

        // Mostrar la matriz original
        System.out.println("Matriz original:");
        for (int i = 0; i < matriz.length; i++) {
            System.out.println(Arrays.toString(matriz[i]));
        }

        // Calcular la traspuesta de la matriz
        int[][] traspuesta = new int[matriz[0].length][matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                traspuesta[j][i] = matriz[i][j];
            }
        }

        // Mostrar la matriz traspuesta
        System.out.println("Matriz traspuesta:");
        for (int i = 0; i < traspuesta.length; i++) {
            System.out.println(Arrays.toString(traspuesta[i]));
        }
    }
}
    
    

