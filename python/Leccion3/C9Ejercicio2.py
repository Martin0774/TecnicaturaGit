"""
Calcular la suma de "n" primeros números
"""
cantidad = int(input("Cuantos numeros desea sumar? "))
suma = 0
for i in range(cantidad):
    suma = suma + 1
print(f"la suma es: {suma}")