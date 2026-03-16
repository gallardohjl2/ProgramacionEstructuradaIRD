'''
Solicita un número entero positivo 
y muestra su tabla de multiplicar del 1 al 10. 
Si el número no es válido, vuelve a solicitarlo.
'''

def solicitarValor ():
    sentinel = True
    
    while sentinel:

        valor = input('Ingresar un número \n')

        if valor.isdigit():
            valor = int(valor)
            if valor>0:
                sentinel = False
            else: 
                print(valor, 'No puede ser 0 o negativo')
        else:
            print(valor, 'No es entero')

    return valor

def calcularTabla (valor):
    salida=''
    for i in range(1,11):
        salida+=f'{valor} * {i} = {valor * i} \n'
    
    return salida

numeroTabla = solicitarValor()
salida = calcularTabla(numeroTabla)
print(salida)