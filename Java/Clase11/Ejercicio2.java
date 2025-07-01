package JAVA;
import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        double compra,descuento,precio_final;

        System.out.println("Digite la cantidad a pagar");
        compra=scanner.nextDouble();

        if(compra>100){
            descuento=compra * 0.2;
        } else {
            descuento = 0;
        }
        precio_final = compra - descuento;

        System.out.println("El precio a pagar es: "+precio_final);

        scanner.close();
    }
}