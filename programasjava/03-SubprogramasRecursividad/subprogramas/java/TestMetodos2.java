import javax.swing.*;


public class TestMetodos2 {
    public static void main(String[] args) {
//        Metodos2.saludar();
//        Metodos2.saludar("Pepito");
//        int x = Metodos2.sumar(10,9);
//        JOptionPane.showMessageDialog(null, x);
//        JOptionPane.showMessageDialog(null,
//                Metodos2.sumar(2,5));

        if(Metodos2.autenticar("Gallardo", "Pxssw0rd")){
            JOptionPane.showMessageDialog(null, "Benvenido al Sistema");
        }else{
            JOptionPane.showMessageDialog(null, "Bye");
        }
    }


}