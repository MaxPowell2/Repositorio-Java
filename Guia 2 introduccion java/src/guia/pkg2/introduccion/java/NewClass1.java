/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg2.introduccion.java;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Max
 */
public class NewClass1 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del vector: ");
        int n = sc.nextInt();
        int[] vector = new int[n];
        int[] contador = new int[6];

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el elemento " + (i + 1) + " del vector: ");
            vector[i] = sc.nextInt();
            int digitos = (int) Math.log10(Math.abs(vector[i])) + 1;
            if (digitos > 5) {
                digitos = 5;
            }
            contador[digitos]++;
        }

        System.out.println("El vector ingresado es: " + Arrays.toString(vector));
        for (int i = 1; i <= 5; i++) {
            System.out.println("Cantidad de números con " + i + " dígitos: " + contador[i]);
        }
    }
}

