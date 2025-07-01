"""
Calcular el factorial de un numero mayor o igual a 0
"""
factorial = 1
num = int(input("Ingrese un numero "))
if num >= 0:
    i = 1
    while i <= num:
        factorial = factorial * i
        i = i + 1
    print(f"El factorial es: {factorial}")
else:
    print("El numero que ingrese debe ser mayor o igual a 0")
