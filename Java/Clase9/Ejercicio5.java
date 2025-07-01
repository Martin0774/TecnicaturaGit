/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author marti
 */

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float nota1, nota2, nota3, suma;

        System.out.println("Ingrese la primera nota:");
        nota1 = Float.parseFloat(teclado.nextLine());

        System.out.println("Ingrese la segunda nota:");
        nota2 = Float.parseFloat(teclado.nextLine());

        System.out.println("Ingrese la tercera nota:");
        nota3 = Float.parseFloat(teclado.nextLine());

        suma = nota1 + nota2 + nota3;
        System.out.println("La suma es: " + suma);
    }
}
