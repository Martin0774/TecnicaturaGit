// Programa que calcula el cuadrado de una suma (a+b)^2
// utilizando la clase Math y la fórmula del trinomio cuadrado perfecto.
package Ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, ingrese el valor de a: ");

        double a = scanner.nextDouble();

        System.out.print("Por favor, ingrese el valor de b: ");
        double b = scanner.nextDouble();

        // --- CÁLCULO USANDO LA FÓRMULA: a^2 + b^2 + 2*a*b ---
        // Calculamos a al cuadrado usando Math.pow(base, exponente)
        double aCuadrado = Math.pow(a, 2);

        // Calculamos b al cuadrado
        double bCuadrado = Math.pow(b, 2);

        // Calculamos el término 2*a*b
        double dosAB = 2 * a * b;

        // Sumamos todos los términos para obtener el resultado final
        double resultado = aCuadrado + bCuadrado + dosAB;

        // Imprimir el resultado de una manera clara
        System.out.println("\n--- Calculando el cuadrado de la suma ---");
        System.out.println("Formula: (a+b)^2 = a^2 + b^2 + 2*a*b");
        // System.out.printf se usa para formatear el texto y los números
        // %.2f significa que mostrará el número con solo 2 decimales
        System.out.printf("Para a = %.2f y b = %.2f\n", a, b);
        System.out.printf("El resultado de (%f + %f)^2 es: %f\n", a, b, resultado);
    }
}
