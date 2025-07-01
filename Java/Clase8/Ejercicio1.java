package Clase8;

public class Ejercicio1 {
    public static void main(String[] args) {

        //Operadores Unarios: Cambio de signo
        var varA = 7;
        var varB = -varA;
        System.out.println("varA = " + varA);
        System.out.println("varB = " + varB);

        //Operador de Negación
        var varC = true; // literal de tipo boolean
        var varD = !varC; // Invierte el valor
        System.out.println("varD = " + varC);
        System.out.println("varD = " + varD);

        var varE =9; // se va a modificar su valor
        var varF = ++varE; // SImbolo antes de la variable
        // Primero se increlenta  la variable y despues se usa su valor
        System.out.println("varE = " + varE); //Se incrementa en la unidad
        System.out.println("varF = " + varF); //Va a sumar uno

        // Postincremento
        var varG =3;
        var varH = varG++; // Primero el valor de la variable, luego el incremento
        System.out.println("varH = " + varG);
        System.out.println("varH = " + varH);

        // Operadores Unarios de decremento: Predecremento
        var varI =4;
        var varJ =--varI;
        System.out.println("varI = " + varI); //la variable ya esta en decremento
        System.out.println("varJ = " + varJ);

        //Postdecremento
        var varK=8;
        var varL= varK--;
        System.out.println("varK = " + varK);
        System.out.println("varL = " + varL);
    }
}
