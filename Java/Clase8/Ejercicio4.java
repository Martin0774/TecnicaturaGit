package Clase8;

public class Ejercicio4 {
    public static void main(String[] args) {
        var resultadoT = (5>4) ? "Verdadero" : "Falso";
        System.out.println("resultadoT = " + resultadoT);
        
        var numeroT=7;
        resultadoT=(numeroT % 2==0) ? "es par" : "Es impar";
        System.out.println("resultadoT = " + resultadoT);
    }
}
