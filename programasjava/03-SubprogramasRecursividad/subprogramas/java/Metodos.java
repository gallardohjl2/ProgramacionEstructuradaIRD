import javax.swing.*;


public class Metodos {
    public static void main(String[] args) {
        // Declaración de variables
        int num1 = 0, num2 = 0, suma=0;
        saludar();
        num1 = solicitarNumeros();
        num2 = solicitarNumeros();

        suma = sumar(num1, num2);


    }

    public static void saludar(){
        JOptionPane.showMessageDialog(null,
                "Bienvenido a las funciones en Java");
    }

    public static int solicitarNumeros (){
        return Integer.parseInt(
                JOptionPane.showInputDialog
                        ("Introduce el número"));
    }

    public static int sumar (int a, int b){
        return a + b;
    }
}