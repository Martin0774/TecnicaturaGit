/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author marti
 */
import java.util.Scanner;

public class Clase3 {
    public static void main(String[] args) {
        // Clase 3: Variables en Java parte 2
        // Var - inferencia de tipos en Java
        var miVariableEntera = 10;
        var miVariableCadena = "Seguimos estudiando";
        System.out.println("miVariableEntera = " + miVariableEntera);
        System.out.println("miVariableCadena = " + miVariableCadena);
        // soutv + Tab

        // Reglas para definir una variable en Java
        var usuario = "Osvaldo";
        var titulo = "Ingeniero";
        var union = titulo + " " + usuario;
        System.out.println("union = " + union);

        var a = 8;
        var b = 4;
        System.out.println(usuario + (a + b));

        // Ejercicio: Caracteres Especiales con Java
        var nombre = "Natalia";
        System.out.println("\nNueva linea: \n" + nombre); // Diagonal inversa y letra n para hacer un salto de linea
        System.out.println("Tabulador: \t" + nombre); // Tabulador un espacio para centrar
        System.out.println("\t\t.:MENU:.");
        System.out.println("Retroceso: \b\b" + nombre); // Caracter de retroceso
        System.out.println("Comillas Simples: \'" + nombre + "\'");
        System.out.println("Comillas Dobles: \"" + nombre + "\"");

        // Clase Scanner
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite su nombre: ");
        var usuario2 = entrada.nextLine();
        System.out.println("usuario2 = " + usuario2);
        System.out.println("Escriba el titulo: ");
        var titulo2 = entrada.nextLine();
        System.out.println("Resultado: " + titulo2 + " " + usuario2);
    }
}
