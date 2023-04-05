/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3;

import java.util.Scanner;

/**
 *
 * @author Max
 */
public class Guia3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner opc = new Scanner(System.in);
        //importamos scarner de opciones 
        Scanner leer = new Scanner(System.in);
        //importamos scaner de frase
        double resultado = 0;
        //inicializamos una variable double 
        System.out.println("Ingrese el primer numero");
        int num1 = leer.nextInt();
        //pedimos ingresar primer numero y lo leemos
        System.out.println("Ingrese el segundo numero");
        int num2 = leer.nextInt();
        //pedimos ingresar segundo numero y lo leemos
        System.out.println("¿Que operacion quiere hacer? (suma,resta,multiplicacion o division?");
          String operacion = opc.nextLine();
          //pedimos ingresar la opcion y leemos opciones 

        switch (operacion) {
            //iniciamos bucle segun 

            case "suma":
                resultado = num1 + num2;
                System.out.println("La suma de " + num1 + " + " + num2 + " es igual a " + resultado);
                break;
                //devolvemos resultado de suma
            case "resta":
                resultado = (num1 - num2);
                System.out.println("La resta de " + num1 + " - " + num2 + " es igual a " + resultado);
                break;
                //devolvemos resultado de resta
            case "multiplicacion":
                resultado = (num1 * num2);
                System.out.println("La multiplicacion de " + num1 + " * " + num2 + " es igual a " + resultado);
                break;
                //devolvemos resultado de multiplicacion
            case "division":
                resultado = (num1 / num2);
                System.out.println("La division de " + num1 + " / " + num2 + " es igual a " + resultado);
                break;
                //devolvemos resultado de division
            default:
                System.out.println("La opcion no es valida");
                //en caso de no ingresar una opcion correcta
        }
        

    }

}
    
        
