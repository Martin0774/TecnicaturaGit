"""
Ejercicio 3: calcular estacion del año
pedir al usuario que ingrese un mes del año, el valor debe ser entre 1 y 12
luego le decimos en que estacion del año esta
"""
from enum import nonmember

mes = int(input("Ingrese en que mes del año se encuentra"))
estacion = None

if mes == 1 or mes == 2 or mes == 3:
    estacion = "Verano"
elif mes == 4 or mes == 5 or mes == 6:
    estacion = "Otoño"
elif mes == 7 or mes == 8 or mes == 9:
    estacion = "Invierno"
elif mes == 10 or mes == 11 or mes == 12:
    estacion = "Primavera"
else:
    "Error, su respuesta no coincide con ningún mes"
print(f"Siendo el mes {mes} se encuentra en la estacion: {estacion}")

