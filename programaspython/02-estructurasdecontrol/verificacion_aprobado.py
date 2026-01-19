
# Solicitud de calificaciones

calif1 = float(input("Introduce la calificación 1\n"))
calif2 = float(input("Introduce la calificación 2\n"))
calif3 = float(input("Introduce la calificación 3\n"))

promedio = (calif1 + calif2 + calif3) / 3

if promedio >= 7.0:
    if promedio>=7.1 and promedio<=7.5:
        print('Aprobado Bajo')
    elif promedio>=7.6 and promedio<=8.7:
        print('Aprobado Media')
    else:
        print('Aprobado Alto')
else:
    print('No Aprobado')

