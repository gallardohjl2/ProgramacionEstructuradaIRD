import javax.swing.JOptionPane;
public class VerificacionAprobado {
    public static void main(String[] args) {
        
        // Declaración de variables
        double promedio=0.0, calif1=0.0,
                calif2=0.0, calif3=0.0;

        // Solicitar las calificaciones y calcular el promedio
        calif1 = Double.parseDouble
                (JOptionPane.showInputDialog("Introduce la calif 1"));
        calif2 = Double.parseDouble
                (JOptionPane.showInputDialog("Introduce la calif 2"));
        calif3 = Double.parseDouble
                (JOptionPane.showInputDialog("Introduce la calif 3"));

        promedio = (calif1 + calif2 + calif3)/3;

        if(promedio >= 7.0){
            JOptionPane.showMessageDialog(null,
                    "Aprobado");
        }
    }
}