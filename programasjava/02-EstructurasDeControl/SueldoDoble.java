import javax.swing.JOptionPane;

public class SueldoDoble {
    /*
     * Calcular el sueldo de un empleado
     * solicitar el Nombre, horas trabajadas,
     * y cuota por hora.
     *
     * El sueldo se calcula de la siguiente
     * forma: si el número de horas trabajadas
     * es mayor que 40, el excedente de 40
     * se paga al doble de la cuota por hora.
     * En caso de no ser mayor que 40 se paga la cuota
     * normal por hora.
     *
     * Se debe mostrar el nombre del empleado,
     * horas trabajadas, horas extras y el sueldo
     * */

    public static void main(String[] args) {
        // Declaración de variables
        String nombre = "";
        String salida="";
        String resp = "";
        int horasTraba = 0, horasExt = 0;
        double cuotaPorHora = 0.0, sueldo=0.0;

        // Entradas
        nombre = JOptionPane.showInputDialog("Introduce el nombre");
        horasTraba = Integer.parseInt(JOptionPane.showInputDialog
                ("Introduce las horas trabajadas"));
        cuotaPorHora = Double.parseDouble
                (JOptionPane.showInputDialog("Introduce la cuota por hora"));

        if(horasTraba > 40){
            horasExt = horasTraba - 40;
            sueldo = sueldo * cuotaPorHora + cuotaPorHora * 2 * horasExt;
        }else if(horasTraba > 0){
            sueldo = horasTraba * cuotaPorHora;
        }else{
            JOptionPane.showMessageDialog(null,
                    "Horas trabajadas no válidas");
        }

        salida = "======= Nomina =====" +
                 "\nNombre: " + nombre +
                 "\nHoras Trabajadas: " + horasTraba +
                 "\nHoras Extra: " + horasExt + 
                 "\nSueldo: " + sueldo;
        
        JOptionPane.showMessageDialog(null, salida);

    }
}