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
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] palabras = new String[5];

        System.out.println("Por favor, ingrese 5 palabras de minimo 3 y hasta 5 caracteres:");
        for (int i = 0; i < palabras.length; i++) {
            System.out.print("Palabra " + (i + 1) + ": ");
            palabras[i] = scanner.nextLine();
            while (palabras[i].length() < 3 || palabras[i].length() > 5) {
                System.out.println("La palabra debe tener minimo 3 y hasta 5 caracteres. Intente nuevamente.");
                System.out.print("Palabra " + (i + 1) + ": ");
                palabras[i] = scanner.nextLine();
            }
        }

        char[][] sopaLetras = construirSopaLetras(palabras);
        System.out.println("Sopa de letras creada:");
        mostrarSopaLetras(sopaLetras);
        
    }
    
    public static char[][] construirSopaLetras(String[] palabras) {
        char[][] sopaLetras = new char[20][20];

        for (int i = 0; i < sopaLetras.length; i++) {
            for (int j = 0; j < sopaLetras[0].length; j++) {
                sopaLetras[i][j] = (char) (Math.random() * 10 + '0');
            }
        }

        for (String palabra : palabras) {
            boolean ubicada = false;
            while (!ubicada) {
                int filaInicial = (int) (Math.random() * 20);// 0: horizontal
                int columnaInicial = (int) (Math.random() * 20);// 1: vertical
                int direccion = (int) (Math.random() * 3); //2: diagonal


                if (direccion == 0) {
                    if (columnaInicial + palabra.length() <= 20) {
                        // Ubicar palabra horizontalmente
                        for (int i = 0; i < palabra.length(); i++) {
                            sopaLetras[filaInicial][columnaInicial + i] = palabra.charAt(i);
                        }
                        ubicada = true;
                    }
                } else if (direccion == 1) {
                    if (filaInicial + palabra.length() <= 20) {
                        // Ubicar palabra verticalmente
                        for (int i = 0; i < palabra.length(); i++) {
                            sopaLetras[filaInicial + i][columnaInicial] = palabra.charAt(i);
                        }
                        ubicada = true;
                    }
                } else {
                    if (filaInicial + palabra.length() <= 20 && columnaInicial + palabra.length() <= 20) {
                        // Ubicar palabra en diagonal
                        for (int i = 0; i < palabra.length(); i++) {
                            sopaLetras[filaInicial + i][columnaInicial + i] = palabra.charAt(i);
                        }
                        ubicada = true;
                    }
                }
            }
        }

        return sopaLetras;
    }

    public static void mostrarSopaLetras(char[][] sopaLetras) {
        for (int i = 0; i < sopaLetras.length; i++) {
            for (int j = 0; j < sopaLetras[0].length; j++) {
                System.out.print(sopaLetras[i][j] + " ");
            }
            System.out.println();
        }
    }
}


