import javax.swing.JOptionPane;

public class Menu {
    public static void main(String[] args) {
        String menu="", opcion = "";
        boolean sentinel = true;

        menu = "===== MENU GENERAL =====\n" +
               "1/A)Opción 1\n" +
               "2/B)Opción 2\n" +
               "3/C)Opción 3\n" +
               "4/S)Salir\n" +
               "Elegir Opción: ";
do{
        opcion = JOptionPane.showInputDialog(null, menu);

        switch(opcion.toUpperCase()){
            case "1":
            case "A":
                JOptionPane.showMessageDialog(null,
                        "Opción 1");
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
