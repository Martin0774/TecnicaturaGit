"""
Leer 10 numeros e imprimir cuantos son positivos, cuantos negativos y cuantos neutros.
"""
conteo_positivos = 0
conteo_negativos = 0
conteo_neutros = 0

for i in range(10):
    num = int(input("Ingrese un numero: "))
    if num == 0:
        conteo_neutros = conteo_neutros + 1
    elif num > 0:
        conteo_positivos = conteo_positivos + 1
    elif num < 0:
        conteo_negativos = conteo_negativos + 1
    else:
        print("Debe ingresar un numero entero")
print(f"La cantidad de positivos es: {conteo_positivos}")
print(f"La cantidad de negativos es: {conteo_negativos}")
print(f"La cantidad de neutros es: {conteo_neutros}")
