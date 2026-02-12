/*

  Hacer un programa que lea un valor N,
  entero y positivo y que calcule e
  imprima su factorial.
  Por ejemplo, si lee el 5!,
  su factorial es el producto
  de 1*2*3*4*5. El factorial de 0 es 1.

***/


import javax.swing.*;

public class Factorial {
    public static void main(String[] args) {
        long fact = 1;
        int n = 0;

        // Solicitar a n y lo vamos a validar
        n = Integer.parseInt(JOptionPane.
                showInputDialog("Introduce el valor de n"));

        // Validar que si n es negativo, termina el programa
        // con un mensaje, pero es positivo o cero entonces
        // se calcula el factorial del número asignado a n

        if(n>=0){
            // Aquí se calcula el factorial
            for (int i = 1; i <=n ; i++) {
                 fact*=i;  //fact = fact * i;
            }
            JOptionPane.showMessageDialog(null,
                    "El factorial !("+n+") = " + fact);
        }else{
            // Aquí se manda un mensaje de que n no es valida
            // y el programa termina
            JOptionPane.showMessageDialog(null,
                                         "El valor de n no es valido");
        }
    }
}
