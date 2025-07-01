"""
Ejercicio 4: Etapas de Vida
Haremos un programa que cuando el usuario ingrese su edad le diga,
o imprima la etapa de su vida en una breve oracion.
"""
# Pedir la edad al usuario
edad = int(input("Por favor, ingresa tu edad: "))

# Definir las etapas de vida
etapa = None

if 0 <= edad < 10:
    etapa = "La infancia es increible y bella"
elif 10 <= edad < 20:
   etapa = "Tienes muchos cambios, mucho que estudiar"
elif 20 <= edad < 30:
    etapa = "Amor y comienza el trabajo"
elif 30 <= edad < 40:
    etapa = "Consolidacion profesional, personal y familiar" # Ejemplo agregado
elif 40 <= edad < 50:
    etapa = "Madurez, reflexion y nuevos desafios" # Ejemplo agregado
elif edad >= 60:
    etapa = "¡La vida es bella!" # Ejemplo agregado
else:
    etapa = "No hay mensaje para esta etapa, aun queda mucho por vivir."
print(f"Tienes {edad} años. {etapa}")