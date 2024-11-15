import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class PruebaTemporizador3 {

    public static void main(String[] args) {

        int intervalo = 3000;
        ActionListener oyente = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                System.out.println("Esta el la hora: " +new Date());

                Toolkit.getDefaultToolkit().beep();

            }
        };
        new Timer(intervalo,oyente).start();
        JOptionPane.showMessageDialog(null,"pulsa  aceptar para salir");
        System.exit(0);

    }
}
