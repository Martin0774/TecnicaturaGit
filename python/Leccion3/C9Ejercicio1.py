"""
Diseñar un programa que ingresando un año, nos devuelva por consola si es un año bisiesto o no,
repetir la acción hasta que el usuario lo decida
"""
continuar = True
while continuar:
    año = int(input("Ingrese el año: "))
    añobis = (año % 4 == 0 and año % 100 != 0) or año % 400 == 0
    if añobis:
        print("Si es un año bisiesto")
    else:
        print("Este no es un año bisiesto")
    respuesta = input("Desea continuar? ")
    continuar = respuesta == "si"
