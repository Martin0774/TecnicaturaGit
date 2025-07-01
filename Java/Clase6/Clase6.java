/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author marti
 */
import java.util.Scanner;

public class Clase6 {
    // Clase 6 - Tipos primitivos en Java parte 3
        //Tipos primitivos tipo booleanos
        /*var varBool = false;
        System.out.println("varBool = " + varBool);
        
        if(varBool){ //Se puede poner directamente la variable
            System.out.println("La bandera es verde");
        }
        
        else{
            System.out.println("La bandera es roja");
        }
        
        //Algoritmo: Es mayor de edad?
        var edad = 18; //Literal tener presente la inferencia de tipos
        //var adulto = edad >= 18; //Esta es una expresion booleana
        if (edad >= 18){
            System.out.println("Eres mayor de edad");
        }
        else{
            System.out.println("Eres menor de edad");
        }*/
        
        //Conversion de tipos primitivos
        /*var edad = Integer.parseInt("20"); //Recibe el tipo string para poder convertirlo a entero
        System.out.println("edad = " + (edad + 1)); //Va a sumar
         */
        /*var edad = Integer.parseInt("20");
        System.out.println("edad = " + (edad + 1)); //Va a concatenar en vez de sumar
        var valorPI = Double.parseDouble("3.1416");
        System.out.println("valorPI = " + valorPI);*/
        
        //Pedir un valor
        var entrada = new Scanner(System.in);
        /*System.out.println("Digite su edad: ");
         System.out.println("Digite su edad: ");
         edad = Integer.parseInt(entrada.nextLine());
         System.out.println("entrada = " + edad);*/

        //Conversion de tipos primitivos en Java parte 2
        var edadTexto = String.valueOf(10);
        System.out.println("edadTexto = " + edadTexto);

        var fraseChar = "programadores".charAt(4);
        System.out.println("fraseChar = " + fraseChar);

        System.out.println("Digite un caracter: ");
        fraseChar = entrada.nextLine().charAt(0); // No convierte a enteros, ya que recupera cadenas
        System.out.println("fraseChar = " + fraseChar);
    }
}
