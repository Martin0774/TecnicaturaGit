package Clase8;

public class Ejercicio2 {
    public static void main(String[] args) {

        //Operadores de igualdad y Relaciones
        var aNum=5;
        var bNum=9;
        var cNum = (aNum == bNum);
        System.out.println("cNum = " + cNum);

        var dNum = aNum != bNum;
        System.out.println("dNum = " + dNum);

        var cadenaA = "Hello";
        var cadenaB = "Hello";
        var cVar = cadenaA == cadenaB;
        System.out.println("cVar = " + cVar);
        
        var fVar = cadenaA.equals(cadenaB);
        System.out.println("fVar = " + fVar);

        var gVar = aNum>=bNum; // > >= <= < == !=
        System.out.println("gVar = " + gVar);

        if(aNum % 2 ==0) {
            System.out.println("El numero es par");
        } else{
                System.out.println("El numero es impar");
            }
        var edad = 30;
        var adulto = 18;
        if (edad >= adulto){
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }
    }


}
