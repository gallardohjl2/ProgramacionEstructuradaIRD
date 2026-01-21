
'''
Calcular el sueldo de un empleado
    * solicitar el Nombre, horas trabajadas,
    * y cuota por hora.
    *
    * El sueldo se calcula de la siguiente
    * forma: si el número de horas trabajadas
    * es mayor que 40, el excedente de 40
    * se paga al doble de la cuota por hora.
    * En caso de no ser mayor que 40 se paga la cuota
    * normal por hora.
    *
    * Se debe mostrar el nombre del empleado,
    * horas trabajadas, horas extras y el sueldo

'''

# Entrada de Datos
nombre = input('Introduce el nombre:\n')
horas_traba = int(input("Introduce las horas trabajadas: \n"))
cuota_por_hora = float(input('Introduce la cuota por hora: \n'))

# Estructuras de control multiples para desición 

horas_extra = 0
sueldo = 0.0

if horas_traba > 40 :
    horas_extra = horas_traba - 40
    sueldo = sueldo * cuota_por_hora + cuota_por_hora * 2
elif horas_traba > 0:
    sueldo = horas_traba * cuota_por_hora
else:
    print("Horas Trabajadas no válidas") 

salida = f"""
======= Nomina =======
Nombre: {nombre} 
Horas Trabajadas: {horas_traba}
Horas Extra: { horas_extra }
Sueldo: { sueldo }
"""
         
print(salida)       



