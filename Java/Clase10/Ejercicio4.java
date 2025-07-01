// Sistema de calificaciones del ejercicio 3, utilizando la sentencia de control switch
package condicionalejercicio_4;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Ingrese un numero del 0 al 10: ");
        int calificacion = Integer.parseInt(entrada.nextLine());
        String resultado;
        switch (calificacion){
            case 9: case 10:
                resultado = "A";
                break;
            case 8:
                resultado = "B";
                break;
            case 7:
                resultado = "C";
                break;
            case 6:
                resultado = "D";
                break;
            case 5: case 4: case 3: case 2: case 1: case 0:
                resultado = "F";
                break;
            default:
                resultado = "Fuera de rango";
                break;
        }
        System.out.println("resultado = " + resultado);
    }

}
