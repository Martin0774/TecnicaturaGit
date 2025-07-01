//Programa para convertir un número total de horas en semanas, 
//días y horas equivalentes.
package Ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, introduce el numero total de horas: ");
        int totalHoras = scanner.nextInt();

        final int HORAS_POR_DIA = 24;
        final int DIAS_POR_SEMANA = 7;
        final int HORAS_POR_SEMANA = HORAS_POR_DIA * DIAS_POR_SEMANA;

        int semanas = totalHoras / HORAS_POR_SEMANA;

        int horasRestantes = totalHoras % HORAS_POR_SEMANA;

        int dias = horasRestantes / HORAS_POR_DIA;

        int horas = horasRestantes % HORAS_POR_DIA;

        System.out.println("\nEl equivalente para " + totalHoras + " horas es:");
        System.out.println(semanas + " semanas, " + dias + " dias y " + horas + " horas.");
    }
}
