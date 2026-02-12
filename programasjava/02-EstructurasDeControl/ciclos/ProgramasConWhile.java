import javax.swing.*;


/*
* 1) Una compañía de seguros tiene contratados a n vendedores.
*  Cada uno hace tres ventas a la semana. Su política de pagos
* es que un vendedor recibe un sueldo base y un 10% extra por
*  comisiones de sus ventas. El gerente de su compañía desea
* saber cuánto dinero obtendrá en la semana cada vendedor por
* concepto de comisiones por las tres ventas realizadas,
* y cuanto tomando en cuenta su sueldo base y sus comisiones.
 *
* */
public class ProgramaConWhile {
    public static void main(String[] args) {
        String opcion = "", salida="";
        final double PORCENTAJE = 0.10;
        boolean sentinel = true;
        int  numVendedores = 0;
        double sueldoBase=0.0, vt1=0.0, vt2=0.0,
                vt3=0.0,subtotal = 0.0, total=0.0,
                comision = 0.0;


        do{
            opcion = JOptionPane.showInputDialog(null,
                    crearMenu());

            switch(opcion.toUpperCase()){
                case "1":
                case "A":
                   numVendedores = Integer.parseInt
                           (JOptionPane.showInputDialog("Número de Vendedores"));
                   if(numVendedores>0){
                     sueldoBase = Double.parseDouble(
                             JOptionPane.showInputDialog("Sueldo Base"));
                     if(sueldoBase>0){
                        salida = "===== NOMINA =====\n";
                        int i = 1;
                        while(i<=numVendedores){
                            vt1 = Double.parseDouble(
                                    JOptionPane.showInputDialog("Introduce la venta 1 " +
                                                                "del Vendedor " + i));
                            vt2 = Double.parseDouble(
                                    JOptionPane.showInputDialog("Introduce la venta 2 " +
                                            "del Vendedor " + i));
                            vt3 = Double.parseDouble(
                                    JOptionPane.showInputDialog("Introduce la venta 3 " +
                                            "del Vendedor " + i));

                            if(vt1<=0.0 || vt2<=0.0 || vt3<=0.0){
                                continue;
                            }

                            comision = (vt1 + vt2 + vt3)*PORCENTAJE;

                            subtotal = sueldoBase + comision;
                            total+= subtotal;
                            salida+= "\nVendedor " + i +
                                     "\nComisión: $" + comision +
                                     "\nTotal: $" + subtotal + "\n\n";
                            i++;
                        } // Cierra ciclo
                         salida+= "Total a Pagar: $" + total;
                        JOptionPane.showMessageDialog(null, salida);
                     }else{
                         JOptionPane.showMessageDialog(null,
                                 "Sueldo base no valido");
                     }
                   }else{
                       JOptionPane.showMessageDialog(null,
                               "El número de empleados no " +
                               "puede ser cero ni negativo");
                   }

                   break;

                case "2":
                case "B":
                    JOptionPane.showMessageDialog(null,
                            "Opción 2");
                    break;

                case "3":
                case "C":
                    JOptionPane.showMessageDialog(null,
                            "Opción 3");
                    break;

                case "4":
                case "S":
                    JOptionPane.showMessageDialog(null,
                            "Salir");
                    sentinel = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null,
                            "Opción no valida");

            }
        }while(sentinel);
    }

    public static String crearMenu(){
        return"===== MENU GENERAL =====\n" +
                "1/A)Promedio de Calificaciones\n" +
                "2/B)Opción 2\n" +
                "3/C)Opción 3\n" +
                "4/S)Salir\n" +
                "Elegir Opción: ";
    }
}