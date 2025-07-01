/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author marti
 */
public class Clase4 {
    public static void main(String[] args) {
        
        // --- Tipos Primitivos Enteros ---

        /* Este es el que se utiliza para varias líneas de comentarios, 
        se lo llama: comentario de múltiples líneas
        */
        
        // Tipo: byte
        byte numEnteroByte = 127;
        System.out.println(numEnteroByte);
        System.out.println("Valor minimo del Byte: " + Byte.MIN_VALUE);
        System.out.println("Valor maximo del Byte: " + Byte.MAX_VALUE);

        // Tipo: short
        short numEnteroShort = 32767;
        System.out.println("numEnteroShort = " + numEnteroShort);
        System.out.println("Valor minimo del Short: " + Short.MIN_VALUE);
        System.out.println("Valor maximo del Short: " + Short.MAX_VALUE);

        // Tipo: int
        int numEnteroInt = 2147483647;
        System.out.println("numEnteroInt = " + numEnteroInt);
        System.out.println("Valor minimo del int: " + Integer.MIN_VALUE);
        System.out.println("Valor maximo del int: " + Integer.MAX_VALUE);

        // Tipo: long
        long numEnteroLong = 10; // Opcionalmente: 10L para indicar que es long
        System.out.println("numEnteroLong = " + numEnteroLong);
        System.out.println("Valor minimo del long: " + Long.MIN_VALUE);
        System.out.println("Valor maximo del long: " + Long.MAX_VALUE);

        // --- Tipos Primitivos Flotantes (con punto decimal) ---
        
        // Tipo: float
        float numFloat = 3.4028235E38F; // Se añade 'F' al final para indicar que es float
        System.out.println("numFloat = " + numFloat);
        System.out.println("El valor minimo de float: " + Float.MIN_VALUE);
        System.out.println("El valor maximo de float: " + Float.MAX_VALUE);

        // Tipo: double
        double numDouble = 1.7976931348623157E308; // Opcionalmente se puede añadir 'D' al final
        System.out.println("numDouble = " + numDouble);
        System.out.println("El valor minimo de double: " + Double.MIN_VALUE);
        System.out.println("El valor maximo de double: " + Double.MAX_VALUE);
    }
}
