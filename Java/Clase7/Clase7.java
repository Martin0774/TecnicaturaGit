/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author marti
 */
public class Clase7 {
    public static void main(String[] args) {
        // Clase 7 - Operadores en Java parte 1
        /* //Operadores aritmeticos
        int num1 = 5, num2 = 4;
        var solucion = num1 + num2;
        System.out.println("solucion de la suma = " + solucion);
        
       solucion = num1 - num2;
        System.out.println("solucion de la resta = " + solucion);
    
        solucion = num1 * num2;
        System.out.println("solucion de la multiplicacion = " + solucion);
        
        solucion = num1/num2;
        System.out.println("solucion de la divison = " + solucion);
        
        var solucion2 = 3.4 / num2;
        System.out.println("resultado de la division = " + solucion2);
        
        solucion = num1 % num2; //Guarda el residuo de ka division
        System.out.println("solucion = " + solucion); // 5/4
        
        if (num1 % 2 == 0)
            System.out.println("Es un numero Par");
        else
            System.out.println("Es un numero Impar"); */
        
        //Operadores de asignacion
        int varNum1 = 1;
        int varNum2 = 4;
        var varNum3 = varNum1 + 6 - varNum2;
        System.out.println("VarNum3: " + varNum3);
       
        varNum1 += 1;
        System.out.println("VarNum1: " + varNum1);
        varNum2 -= 2;
        System.out.println("VarNum2: " + varNum2);
        varNum1 *= 5;
        System.out.println("VarNum1: " + varNum1);
        varNum3 /= 4;
        System.out.println("VarNum3: " + varNum3);
        varNum1 %= 6;
        System.out.println("VarNum1: " + varNum1);
         
    }
}
