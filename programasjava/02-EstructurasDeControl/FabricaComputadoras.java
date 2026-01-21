/*
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
 */

import javax.swing.*;

public class FabricaComputadoras {
    public static void main(String[] args) {
        // Declaración de variables
        int numeroComp=0;
        double precio=0.0, total=0.0, descuento=0.0,
                subtotal=0.0;
        String porcentaje = "";

        // Solicitar valores
        numeroComp = Integer.parseInt(JOptionPane.
                showInputDialog("Introduce el número de computadores"));
        precio = Double.parseDouble
                (JOptionPane.showInputDialog("Precio de la computadora"));

        total = precio * numeroComp;

        if(numeroComp < 5){
            descuento = total * 0.10;
            subtotal = total - descuento;
            total = subtotal - descuento;
            porcentaje = "10%";

        }else if(numeroComp>=5 && numeroComp<10){
           descuento = total * 0.20;
           subtotal= total - descuento;
           total = subtotal -descuento;
           porcentaje = "20%";
        }else{
            descuento = total * 0.40;
            subtotal= total - descuento;
            total = subtotal -descuento;
            porcentaje = "40%";
        }
        
    String salida = "===== TICKET =====" +
                    "\nSubtotal: $" + subtotal +
                    "\nDescuento: $" + (descuento * 100) +
                    "\n% Descuento: " + porcentaje  +
                    "\nTotal: " + total;
        JOptionPane.showMessageDialog(null, salida);
                         

    }
}
