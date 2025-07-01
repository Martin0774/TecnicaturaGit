//Programa para calcular la calificación final ponderada de un estudiante.
package Ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("--- CALCULO DE CALIFICACION FINAL ---");

        System.out.print("Digite la calificacion de participacion (0-10): ");
        double participacion = scanner.nextDouble();

        System.out.print("Digite la calificacion del primer examen parcial (0-10): ");
        double primerParcial = scanner.nextDouble();

        System.out.print("Digite la calificacion del segundo examen parcial (0-10): ");
        double segundoParcial = scanner.nextDouble();

        System.out.print("Digite la calificacion del examen final (0-10): ");
        double examenFinal = scanner.nextDouble();

        // Definimos las ponderaciones como constantes para mayor claridad
        final double PONDERACION_PARTICIPACION = 0.10; // 10%
        final double PONDERACION_PARCIALES = 0.25;     // 25%
        final double PONDERACION_FINAL = 0.40;         // 40%

        // Calculamos el aporte de cada aspecto a la calificación final
        double notaParticipacion = participacion * PONDERACION_PARTICIPACION;
        double notaPrimerParcial = primerParcial * PONDERACION_PARCIALES;
        double notaSegundoParcial = segundoParcial * PONDERACION_PARCIALES;
        double notaExamenFinal = examenFinal * PONDERACION_FINAL;

        // Sumamos todos los aportes para obtener la calificación final
        double calificacionFinal = notaParticipacion + notaPrimerParcial + notaSegundoParcial + notaExamenFinal;

        // Imprimimos el resultado final, formateado a 2 decimales
        System.out.println("\n-----------------------------------------");
        System.out.printf("La calificacion final del estudiante es: %.2f\n", calificacionFinal);
        System.out.println("-----------------------------------------");
    }
}
