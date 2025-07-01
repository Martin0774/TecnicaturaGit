"""
Dadas las horas trabajadas de 5 personas y la tarifa de pago
calcular el salario y la sumatoria de todos los salarios
"""
i = 1
suma = 0
while i <= 5:
    print(f"Salario del empleado {i}: ")
    horas = int(input("Ingrese las horas trabajadas: "))
    tarifa = int(input("Ingrese la tarifa por hora"))
    salario = horas * tarifa
    print(f"El salario de este empleado es: ${salario}")
    suma = suma+salario
    i = i + 1
    print("")
print(f"La suma de todos los salarios es: {suma}")
