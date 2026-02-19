import javax.swing.*;

public class Metodos2 {

    public static void saludar (){
        JOptionPane.showMessageDialog
                (null, "Hola");
    }

    public static void saludar (String nombre){
        JOptionPane.showMessageDialog(null,
                "Hola " + nombre);
    }

    public static int sumar (int a, int b ){
        int suma = a + b;
        return suma;
    }

    public static boolean autenticar(String usuario, String pass){
        String user = "GALLARDO";
        String password = "P@ssw0rd";

        if(usuario.toUpperCase().equals(user) && password.equals(pass)){
           return true;
        }else{
            return false;
        }
    }
}
