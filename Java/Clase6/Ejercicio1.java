/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author marti
 */

import java.util.Scanner;

public class Ejercicio1 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Mostrar mensaje
        System.out.println("Ingrese los siguientes datos del libro:");

        // Ingresar nombre del libro
        System.out.print("Digite el nombre del libro:");
        String nombre = scanner.nextLine();

        // Ingresar ID del libro
        System.out.print("Digite el ID del libro:");
        int id = scanner.nextInt();

        // Ingresar precio del libro
        System.out.print("Digite el precio del libro:");
        double precio = scanner.nextDouble();

        // Ingresar si el envio es gratuito
        System.out.print("¿El envio es gratuito? (true/false):");
        boolean envioGratuito = scanner.nextBoolean();

        // Mostrar los datos ingresados
        System.out.println("\nDatos del libro:");
        System.out.println("Nombre: " + nombre);
        System.out.println("ID: " + id);
        System.out.println("Precio: $" + precio);
        System.out.println("Envio Gratuito?: " + envioGratuito);

        scanner.close();
    }
}
