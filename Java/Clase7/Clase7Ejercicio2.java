import java.util.Scanner;

public class Clase7Ejercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese las horas trabajadas en la semana: ");
        double horas = input.nextDouble();

        System.out.print("Ingrese el salario por hora: ");
        double salarioHora = input.nextDouble();

        double salarioSemanal = horas * salarioHora;

        System.out.println("El salario semanal es: $" + salarioSemanal);

        input.close();
    }
}
