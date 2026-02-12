
fact = 1
n = int(input('Introduce el valor de n: \n'))

if n>=0:
    for i in range(1,n+1,1):
        fact*=i
    print(f'El factorial de !({n}) es: {fact}')
else:
    print(f'El valor de n no es valido')