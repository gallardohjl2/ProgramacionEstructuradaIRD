'''
En una fabrica de computadoras
 se planea ofrecer a los clientes
 un descuento que dependera del número
 de computadoras que compre.
 Si las computadoras son menos
 de cinco se les dara un 10%
 de descuento sobre el total
 de la compra; si el numero de
 computadoras es mayor o igual
 a cinco pero menos de diez
 se le otorga el 20% de
 descuento; y son 10 o más se
 les da un 40%. El precio
 de cada computadora es variable.

 '''

# Solicitar los valores

num_computadoras = int(input('Introduce el número de computadoras:'))
precio = int(input('\nIntroduce el precio de las computadoras:'))

# Calculo de total

total = num_computadoras * precio

# Validaciones

if num_computadoras < 5:
    descuento = total * 0.10
    subtotal = total - descuento
    porcentaje = '10%'
elif num_computadoras >= 5 and num_computadoras <10:
    descuento = total * 0.20
    subtotal = total - descuento
    porcentaje = '20%'
else:
    descuento = total * 0.40
    subtotal = total - descuento
    porcentaje = '40%'


salida = f'''
===== TICKET ===== 
Subtotal: $  {subtotal} 
Descuento: $ {descuento * 100} 
% Descuento: {porcentaje}  
Total:  {total}
'''
print( salida )   

