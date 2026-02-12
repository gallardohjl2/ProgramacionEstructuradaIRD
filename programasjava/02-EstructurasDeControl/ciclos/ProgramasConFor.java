/*
*
* 1) Calcular el promedio de un alumno que tiene n
* calificaciones en la materia de
* programación.

*
 * */


import javax.swing.*;

public class ProgramasConFor {
    public static void main(String[] args) {
        String menu="", opcion = "";
        boolean sentinel = true;
        int n=0;
        double prom = 0.0, calif=0.0;

        menu = "===== MENU GENERAL =====\n" +
                "1/A)Promedio de Calificaciones\n" +
                "2/B)Opción 2\n" +
                "3/C)Opción 3\n" +
                "4/S)Salir\n" +
                "Elegir Opción: ";
        do{
            opcion = JOptionPane.showInputDialog(null, menu);

            switch(opcion.toUpperCase()){
                case "1":
                case "A":
                    n = Integer.parseInt
                            (JOptionPane.showInputDialog
                                    ("Introduce el número de Calificaciones"));
                    if(n>0){
                        prom = 0.0;
                        for (int i = 1; i <=n ; i++) {
                            calif = Double.parseDouble
                                    (JOptionPane.showInputDialog
                                            ("Introduce la calificación " + i));
                            if(calif>=0.0 && calif<=10.0){
                                prom+=calif; // prom = prom + calif;
                            }else{
                                JOptionPane.showMessageDialog(null,
                                        "Calificación fuera de Rango");
                                i--; // i = i - 1
                            }
                        }
                        prom/=n; // prom = prom / n;
                        JOptionPane.showMessageDialog(null,
                                "El promedio es: " + prom);
                    }else{
                        JOptionPane.showMessageDialog(null,
                                "El número de calificaciones no puede ser cero o negativo");
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
}