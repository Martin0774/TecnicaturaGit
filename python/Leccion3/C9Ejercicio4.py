"""
Supongo que se tiene un conjunto de calificaciones de un grupo de 10 alumnos
Realizar un algoritmo para calcular la calificación promedio y la calificación
mas baja de todo el grupo.
"""
suma = 0
calificacion_baja = 10

for i in range (10):
    calificacion = float(input(f"Digite la calificacion: "))
    suma += calificacion
    if calificacion < calificacion_baja:
        calificacion_baja = calificacion

calificacion_promedio = suma / 10

print(f"La calificacion promedio es: {calificacion_promedio}")
print(f"La calificacion mas baja es: {calificacion_baja}")