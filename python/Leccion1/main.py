""" #Ejercicio 1: tipo de datos: califica tu dia
print("Hola Mundo desde Python")

#Clase 3: Ejercicio 1: califica tu dia
print("¿como estuvo tu dia del 1 al 10?)")
calificacionDia = input("Digite su respuesta: ")

print("la calificacion de tu dia es de:",calificacionDia)

#Clase 3: Ejercicio 2: libro y autor
titulo = input("Escribe el titulo de un libro: ")
autor = input("Ahora escribe cual es su autor: ")

print(titulo,"fue escrito por",autor)

alto = int(input("Escriba la altura del rectangulo: "))
ancho = int(input("Escribe el ancho del rectangulo: "))

area = alto * ancho
perimetro = (alto + ancho) * 2
print("El area del rectangulo es:",area)
print("El perimetro del rectangulo es:",perimetro)

#Clase 4: Ejercicio 1: Numero par o impar
a = int(input("Digite un número: "))
print(f"El resultado de la division es: {a % 2}")
if a % 2 == 0:
    print(f"El residuo de a es: {a} es un número PAR")
else:
    print(f"El valor de a es: {a} es uun número IMPAR")

#Clase 4: Ejercicio 2: Determina si es mayor de edad

edadAdulto = 18
edadPersona = int(input("Digite su edad: "))
if edadPersona >= edadAdulto:
    print(f"Su edad es: {edadPersona} años, usted es mayor de edad")
else:
    print(f"Su edad es: {edadPersona} años, usted es menor de edad")

#Clase 5: Ejercicio: Rango de edad
edad = int(input("Digite su edad: "))
#veinte = edad >= 20 and edad < 30
#print (veinte)
#treinta = edad >= 30 and edad < 40
#print(treinta)
#Sintaxis simplificada del operador and
# if veinte or treinta:
if (20 <= edad < 30) or (30 <= edad < 40):
    print ("Estas dentro del rango de los (20'0) a (30'0) años")
#   if veinte or treinta:
#       print("Estas dentro del rango de los (20'0) años")
#   elif treinta:
#       print("Estas dentro del rango de los (30'0) años")
#   else:
#       print("No estas dentro del rango")

#Clase 5: Ejercicio: El mayor de 2 números
numero1 = int(input("Digite el valor para el numero1: "))
numero2 = int(input("Digite el valor para el numero2: "))

if numero1 > numero2:
    print("El numero1 es mayor")
else:
    print("El numero2 es mayor")

#Clase 5: Ejercicio: Tienda de libros
print("Digite los siguientes datos del libro")
nombre = input("Digite el nombra del libro: ")
id= int(input("Digite el ID del libro: "))
precio = float(input("Digite el precio del libro: "))
envioGratuito = input("Indicar si el envio es gratuito (True/False): ")
if envioGratuito == "true":
    envioGratuito = True
elif envioGratuito == "false":
    envioGratuito = False
else:
    envioGratuito = "El valor es incorrecto, debe escribir True/False"
print (f"
        Nombre: {nombre}
        Id: {id}
        Precio: {precio}
        Envio Gratuito?: {envioGratuito}
")

#Clase 5: Ejercicio: Valor dentro de un rango
valor = int(input("Digite un numero dentro del rango 0 al 5: "))
valorMinimo = 0
valorMaximo = 5
dentroRango = valor >= valorMinimo and valor <= valorMaximo
if dentroRango:
    print(f"El valor {valor} esta dentro del rango")
else:
    print(f"El valor {valor} no esta dentro del rango")

"""