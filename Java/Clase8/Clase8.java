/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author marti
 */
import java.util.Scanner;

public class Clase8 {
    public static void main(String[] args) {
    // Clase 8: Operadores unarios
        //Cambio de signo (Positivo o negativo)
        var varA = 7;
        var varB = -varA;
        System.out.println("varA:" + varA);
        System.out.println("varB:" + varB);

        //Operador de negacion (True a false o viceversa)
        var varC = true;
        var varD = !varC;
        System.out.println("varC:" + varC);
        System.out.println("varD:" + varD);

        //Operador de incremento : Preincremento
        var varE = 9;
        var varF = ++varE;
        System.out.println("varE: " + varE);
        System.out.println("varF: " + varF);

        //Operador de incremento : Postincremento
        var varG = 3;
        var varH = varG++;
        System.out.println("varG: " + varG);
        System.out.println("varH: " + varH);

        //Operadores unarios de decremento 
        var varI = 4;
        var varJ = --varI;
        System.out.println("varI: " + varI);

        //Post decremento
        var varK = 8;
        var varL = varK--;
        System.out.println("varK: " + varK);
        System.out.println("varL: " + varL);

        //Operadores de igualdad y relacionales
        var aNum = 5;
        var bNum = 6;
        var cNum = (aNum == bNum);
        System.out.println("cNum:" + cNum);
        var dNum = aNum != bNum;
        System.out.println("dNum: " + dNum);

        var cadenaA = "Hello";
        var cadenaB = "Bye Bye";
        var cVar = cadenaA == cadenaB;
        System.out.println("cVar:" + cVar);

        var fVar = cadenaA.equals(cadenaB);
        System.out.println("fVar:" + fVar);

        //Operadores relacionales
        var gVar = aNum >= bNum;
        System.out.println("gVar:" + gVar);

        if (bNum % 2 == 0) {
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar");
        }
        
        var edad = 15;
        var adulto = 18;
        if (edad >= 18) {
            System.out.println("Es mayor de edad");
        }
        else {
            System.out.println("Es menor de edad");
        }
        
        // Operadores condicionales
        var valorA = 7;
        var valorMinimo = 0; //Rango del 0 al 10
        var valorMaximo = 10;
        var respuesta = valorA >= 0 && valorA <= 10;
        if (respuesta) {
            System.out.println("Esta dentro del rango");
        }
        else {
            System.out.println("Esta fuera del rango");
        }
        
       // Ejercicio vacaciones de un padre
       var vacaciones = false;
       var diaLibre = false;
       if (vacaciones || diaLibre) {
           System.out.println("Puede asistir al juego de su hijo");
       }
       else {
           System.out.println("No puede asistir al juego de su hijo");
       }
       
       // Operador ternario
       var resultadoT = (5 > 8) ? "Verdadero" : "Falso";
        System.out.println("resultadoT = " + resultadoT);
        var numeroT = 4;
        resultadoT = (numeroT % 2 == 0) ? "Es par" : "Es impar";
        System.out.println("resultadoT = " + resultadoT);
        
        // Prioridad de los operadores
        var x = 5;
        var y = 10;
        var z = ++x + y--; // Preincremento y posdecremento
        System.out.println("x = " + x); //6
        System.out.println("y = " + y); //9
        System.out.println("z = " + z); //10
        var solucionAritmetica = 4 + 5 * 6 / 3; //4 + ((5 * 6) / 3) = 30
        
    }
}
