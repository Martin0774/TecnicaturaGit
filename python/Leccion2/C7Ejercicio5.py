"""
Ejercicio 5: Sistema de Calificaciones
El objetivo del programa sera crear un sistema de calificaciones
de la siguiente manera:
    Le pedimos al usuario que ingrese un valor del 0 al 10.
    Luego, si ingreso 9 o 10, imprimimos A
    Entre 8 y menor a 9, imprimimos B
    Entre 7 y menor a 8, imprimimos C
    Entre 6 y menor a 7, imprimimos D
    Entre 0 y menor a 6, imprimimos F
    De lo contrario, el valor ingresado es incorrecto
"""
# Pedir un valor al usuario
calificacion = int(input("Ingrese un valor del 0 al 10: "))

if 9 <= calificacion <= 10:
    print("La calificacion sera A, ¡felicidades!")
elif 8 <= calificacion < 9:
    print("La calificacion sera B, ¡sigue asi!")
elif 7 <= calificacion < 8:
    print("La calificacion sera C, ¡lo justo y necesario!")
elif 6 <= calificacion < 7:
    print("La calificacion sera D, ¡hay que esforzarse un poco mas!")
elif 0 <= calificacion < 6:
    print("La calificacion sera F, nunca es tarde para mejorar.")
else:
    print("El valor ingresado no es valido. Intente nuevamente utilizando numeros del 0 al 10.")