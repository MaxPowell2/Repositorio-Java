/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaintro1;

import java.util.Scanner;

/**
 *
 * @author max
 */
public class HolaMundo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       Scanner leer = new Scanner(System.in);
       String nombre;
       System.out.println("Cual es tu nombre");
       nombre = leer.next();
       System.out.println(" Hola mundo! " + nombre + " esta programando en java : D ");
    }
    
}
