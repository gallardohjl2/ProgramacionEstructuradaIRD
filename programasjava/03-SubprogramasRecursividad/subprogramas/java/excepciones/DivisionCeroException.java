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