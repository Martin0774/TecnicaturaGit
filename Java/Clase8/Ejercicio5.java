package Clase8;

public class Ejercicio5 {
    public static void main(String[] args) {
        var x=5;
        var y =10;
        var z=++x + y--;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);

        var solucionAritmetica = 4+5*6/3;
        System.out.println("solucionAritmetica = " + solucionAritmetica);
        solucionAritmetica = (4+5)*6/3;
        System.out.println("solucionAritmetica = " + solucionAritmetica);

    }
}
