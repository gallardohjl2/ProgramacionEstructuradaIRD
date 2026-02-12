menu = '''
       ===== MENU GENERAL ===== +
        1/A)Opción 1 +
        2/B)Opción 2 +
        3/C)Opción 3 +
        4/S)Salir +
        Elegir Opción:
        '''

sentinela = True

while(sentinela):
    
    opcion = input(menu).upper()

    if opcion == "1" or opcion == 'A':
        print('Opción 1')
    elif opcion == "2" or opcion == 'B':
        print('Opción 2')
    elif opcion == "3" or opcion == 'C':
        print('Opción 3')
    elif opcion == "4" or opcion == 'S':
        print('Salir')
        sentinela = False
    else:
        print('Opción no valida')

print("El programa ha terminado")


