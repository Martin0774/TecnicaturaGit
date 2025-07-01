package JAVA;
import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1, num2, resultado;

        System.out.print("Digite dos números: ");
        num1 = scanner.nextDouble();
        num2 = scanner.nextDouble();

        if (num1 == num2) {
            resultado = num1 * num2;
        } else if (num1 > num2) {
            resultado = num1 - num2;
        } else {
            resultado = num1 + num2;
        }

        System.out.println("El resultado es: " + resultado);

        scanner.close();
    }
}