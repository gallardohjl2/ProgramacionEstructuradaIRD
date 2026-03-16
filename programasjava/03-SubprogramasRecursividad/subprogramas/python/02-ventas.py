'''
 * Crear un programa que
 * solicite el nombre del cliente,
 * pedir la cantidad de productos comprados,
 * pedir el precio de cada producto
 * calcule el total
  Aplique un descuento
  10% si el total > 1000
  5% si el total > 500
  Mostrar el total final
 
 Debe:
 
 Validar que cantidades y precios
 sean positivos
 Repetir hasta que los datos sean correctos
 usar métodos.

 '''
 
def iniciar():
   nombre = solicitar_nombre_cliente()
   cantidad = solicitar_nombre_cliente('Ingresa la cantidad de Productos')

def imprimir (nombre, total, total_con_descuento):
    pass         

def solicitar_nombre_cliente ():

   while True:
      nombre = input('Ingresa el Nombre: \n').strip()

      if nombre: # Valida si la cadena esta vacia con un false
         if validar_tamanio_cadena(nombre):   
            if not contiene_numeros(nombre):
               return nombre
            else:
               print('El nombre no puede contener números')           
         else:
            print('El nombre excede el tamaño')
      else:
         print('Esta Vacio')

def validar_tamanio_cadena (nombre):
    if len(nombre) > 0 and len(nombre)<=10:
      return True
    else:
      return False
   
def contiene_numeros ( nombre ):
   for caracter in nombre:
      if caracter.isdigit():
         return True
   return False

def solicitar_cantidad_productos ( mensaje ):
   while True:
      try:
         numero = int(input(mensaje))
         return True
      except ValueError:
         print ('El valor debe ser un número')   

# Invocación de funciones   
iniciar()

