/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia1;

import java.util.Scanner;

/**
 *
 * @author max
 */
public class Guia1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
 ////        EJERCICIO 8 DIA 4
Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el tamaño del lado del cuadrado:");
        int tam = sc.nextInt();

        // primera fila 
        for (int i = 0; i < tam; i++) {
            System.out.print("* ");
        }
        System.out.println();
                   
        // medio
        for (int i = 0; i < tam - 2; i++) {
            System.out.print("* ");

            for (int j = 0; j < tam - 2; j++) {
                System.out.print("  ");
            }

            System.out.println("*");
        }

        // última fila del 
        for (int i = 0; i < tam; i++) {
            System.out.print("* ");
        }
        System.out.println();

        
    }
}
  