
# Función que no retorna valor y no recibe parametros
def saludar():
    print("Hola Funciones")

# Función que recibe parametros pero no retorna valores
def saludar2( nombre ):
    print('Hola', nombre)

# Función con retorno
def sumar(a, b):
    return a + b

# Función con parametros por posición
def multi (x,y,z):
    return x * y + z

# función con multiples valores de retorno
def operaciones( a, b ):
    suma = a + b
    resta = a - b
    return suma, resta

# Función con valor por defecto
def saludar2(nombre = 'Invitado'):
    print("Hola 'Ing.'", nombre)

# Función con parametros arbitrarios
def sumar_todos (*numeros):
    return sum(numeros)

saludar()
saludar2('Perro')
suma = sumar(10,2)
print(suma)
print(sumar(56,5))
print(multi(10,9, 50))

# Parametros por nombre
m = multi(10,z=23, y=15)

s,m2 = operaciones(10, 2)
print (f'La suma es: {s} y la resta es: {m2}')
saludar2()
saludar2('Carlos')
print(sumar_todos(2,3,4,5,6))
