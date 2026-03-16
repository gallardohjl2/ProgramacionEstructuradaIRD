# Excepciones en Java

## 1. ¿Qué es una Excepción?
>Una excepción es un error que ocurre durante la ejecución del programa y que interrumpe el flujo normal

**Ejemplos Comunes:**

- Dividir entre 0
- Convertir "Hola" a número
- Acceder a una posición inexistente de un arreglo

## Estructura básica

```java
try{
    // Código que puede generar error
}catch( TipoDeExcepcion e){
    // Código que maneja el error
}finally{
    // Opcional: Siempre se ejecuta
}
```

## Tipos de Excepciones
- Checked (Obligatorias)
Java obliga a manejarlas. Ejemplo:

    1. IOException
    2. SQLException 

- UnChecked (RuntimeException)

Noe s obligatorio manejarlas. Ejemplos:

    1. ArithmeticException
    2. NullPointerException
    3. NumberFormatException

## Ejemplo 1: División entre cero

```java
import javax.swing.*;

public class DivisionCeroException {
    public static void main(String[] args) {
        int n1, n2, r;

        try{
            n1 = Integer.parseInt
                    (JOptionPane.showInputDialog
                            ("Introduce el número 1"));
            n2 = Integer.parseInt
                    (JOptionPane.showInputDialog
                            ("Introduce el número 2"));

            r = n1/n2;

            System.out.println("El valor es " + r);
        }catch(ArithmeticException e){
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Fin del Programa");

    }
}
```







