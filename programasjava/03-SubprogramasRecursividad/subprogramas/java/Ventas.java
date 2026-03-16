import javax.swing.*;

/**
 * Crear un programa que
 * solicite el nombre del cliente,
 * pedir la cantidad de productos comprados,
 * pedir el precio de cada producto
 * calcule el total
 * Aplique un descuento
 *  * 10% si el total > 1000
 *  * 5% si el total > 500
 * Mostrar el total final
 *
 * Debe:
 *
 * Validar que cantidades y precios
 * sean positivos
 * Repetir hasta que los datos sean correctos
 * usar métodos
 *
 * */

public class Ventas {

    public static void iniciar(){
       String nombre = solicitarNombreCliente();
       int cantidad = validarEnteroPositivo
               ("Ingresa la cantidad de Productos");
       double total = calcularTotal(cantidad);
       double totalConDescuento = aplicarDescuento(total);
       imprimir(nombre, total, totalConDescuento);
    }

    private static void imprimir
            (String nombre,
             double total,
             double totalConDecuento){
        JOptionPane.showMessageDialog(null,
                "Ciente: " + nombre +
                        "\nTotal sin Descuento: "
                        + totalConDecuento +
                        "\nTotal: " + total);
    }


    private static String solicitarNombreCliente (){

        String nombre = "";
        while(true){
            nombre = JOptionPane.showInputDialog
                    ("Ingresa el nombre");
            if(nombre != null){
                nombre = nombre.trim().toUpperCase();
                if(!nombre.equals("")){
                    if(nombre.length() > 0 && nombre.length()<=10){
                        if(validarNumerosNombre(nombre)){
                            JOptionPane.showMessageDialog(null,
                                    "El nombre no puede contener números");
                        }else{
                            return nombre;
                        }
                    }
                }else{
                    JOptionPane.showMessageDialog(
                            null,
                            "El nombre no puede estar vacio");
                }
            }else{
                JOptionPane.showMessageDialog(null,
                        "El nombre no puede ser nulo");
            }

        }

    }

    private static boolean validarNumerosNombre (String nombre){
        for (int i = 0; i < nombre.length(); i++) {
            if(Character.isDigit(nombre.charAt(i))){
                return true;
            }
        }

        return false;
    }
    private static int validarEnteroPositivo(String mensaje){
        int numero = 0;
        while(true){
            try {
                numero = Integer.parseInt(
                        JOptionPane.showInputDialog(mensaje));
                if(numero > 0){
                    return numero;
                }else{
                    JOptionPane.showMessageDialog(null,
                            "Debe ser mayor a cero");
                }

            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null,
                        "Dato invalido");
            }
        }
    }

    private static double validarDoublePositivo (String mensaje){
        double numero = 0.0;
        while(true){
            try {
                numero = Double.parseDouble(JOptionPane.showInputDialog(mensaje));
                if(numero>0) {
                    return numero;
                }
                else {
                    JOptionPane.showMessageDialog(null,
                            "Debe ser mayor a cero");
                }

            }catch (NumberFormatException ex){
                JOptionPane.showMessageDialog(null,
                        "Dato Inválido: " + ex.getMessage());
            }
        }
    }

    private static double calcularTotal (int cantidad){
        double total = 0.0;
        double precio = 0.0;
        for (int i = 1; i <=cantidad; i++) {
            precio = validarDoublePositivo
                    ("Precio del producto " + i + ":");
            total+=precio;
        }
        return total;
    }
    private static double aplicarDescuento (double total){

        if(total > 1000){
            return total * 0.90;
        }else if (total> 500){
            return total * 0.9;
        }else {
            return total;
        }
    }
}