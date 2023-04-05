/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg2.introduccion.java;

import java.util.Scanner;

/**
 *
 * @author Max
 */
public class Guia2IntroduccionJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
              Scanner scanner = new Scanner(System.in);
              //scanner lee cualquier linea
        boolean seguirPrograma = true; 
        //para que while se ejecute en bucle

        while (seguirPrograma) {
            System.out.print("Ingresa el nombre de la persona: ");
            // pide nombre de la persona
            String nombre = scanner.nextLine();
            // lee nombre de la persona
            System.out.print("Ingresa la edad de " + nombre + ": ");
            // pide eddad de la persona
            int edad = scanner.nextInt();
            scanner.nextLine(); 

           System.out.println(nombre + " tiene " + edad + " anios y es " + Mayor(edad));

            System.out.print("¿Quieres seguir mostrando personas? (Si/No): ");
            String respuesta = scanner.nextLine();

            if (respuesta.equalsIgnoreCase("No")) {
                seguirPrograma = false;
            }
        }

        System.out.println("Salio del programa.");
    }

    public static String Mayor(int edad) {
        if (edad >= 18) {
            return "mayor de edad";
        } else {
            return "menor de edad";
        }
    }
}
