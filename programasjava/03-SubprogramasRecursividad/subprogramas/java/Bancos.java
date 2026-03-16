import javax.swing.*;

public class Banco {
    private static double saldo = 0.0;

    public static void iniciar(){
        menu();
    }

    private static void menu(){
        String menu = "", opcion = "";
        boolean salir = true;
        double monto = 0.0;

        menu = "==== MENU ====\n" +
               "1)Consultar Saldo\n" +
               "2)Depositar\n" +
               "3)Retirar\n" +
               "4)Salir\n" +
               "Elegir Opción: ";

        while(salir){
          opcion = JOptionPane.showInputDialog(menu).toUpperCase();

          switch (opcion){
              case "1":
              case "C":
                  JOptionPane.showMessageDialog(null, "Tu saldo es: " +
                          consultarSaldo());
                  break;
              case "2":
              case "D":
                  // Depositar
                  JOptionPane.showMessageDialog(null,
                          "El deposito se realizó correctamente, tu nuevo saldo es: " +
                                  depositar(solicitarMonto()));
                  break;
              case "3":
              case "R":
                  // Retirar
                  monto = solicitarMonto();
                  if(validarFondos(monto)){
                      JOptionPane.showMessageDialog
                              (null,
                                      "El retiro se realizo correctamente, tu nuevo saldo es: " +
                                      retirar(monto));
                  }else{
                      JOptionPane.showMessageDialog(null,
                              "No tienes saldo suficiente");
                  }
                  break;
              case "4":
              case "S":
                  // Caso Salir
                  salir = false;
                  break;
              default:
                  JOptionPane.showMessageDialog(null,
                          "Elegir una opción valida");



          }

        }
    }// Cierra el método menu

    private static double consultarSaldo(){
        return saldo;
    }

    private static boolean esPositivo(double monto){
        return (monto>0.0)?true:false;
    }

    private static double solicitarMonto (){
        double monto = 0.0;

        while(true){

            try{
              monto = Double.parseDouble(JOptionPane.
                      showInputDialog("Introduce el monto"));
              if(esPositivo(monto)){
                  break;
              }else{
                  JOptionPane.showMessageDialog(null,
                          "El monto debe ser positivo");
              }
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null,
                        "El monto debe ser un número");
            }
        }

        return monto;
    }

    private static double depositar(double monto){
        saldo+=monto;
        return saldo;
    }

    private static boolean validarFondos (double monto){
        return (saldo>=monto)?true:false;
    }
    private static double retirar (double monto){
        saldo-=monto;
        return saldo;
    }

}