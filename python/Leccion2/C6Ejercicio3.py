"""
Ejercicio 3: Intercambiar el valor de dos variables.
Por ejemplo:
a = 10  a = 5
b = 5  b = 10
"""
# Definir los valores iniciales de las variables
a = 10
b = 5

# Mostrar los valores antes del intercambio
print("Antes del intercambio:")
print("a =", a)
print("b =", b)

# Intercambiar valores
temp = a
a = b
b = temp

# Mostrar los valores después del intercambio
print("\nDespués del intercambio:")
print(f"a = {a}")
print(f"b = {b}")