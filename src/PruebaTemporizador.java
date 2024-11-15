import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class PruebaTemporizador {

    public static void main(String[] args) {

        DameHora oyente = new DameHora();
        Timer temporizador = new Timer(5000, oyente);
        temporizador.start();
        JOptionPane.showMessageDialog(null,"aceptar para salir");
        System.exit(0);
        
    }
}

class DameHora implements ActionListener {


    @Override
    public void actionPerformed(ActionEvent e) {

        Date hora = new Date();
        System.out.println("esta es la hora "+hora);
        Toolkit.getDefaultToolkit().beep();
    }
}
