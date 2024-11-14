import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class PruebaTemporizador2 {

    public static void main(String[] args) {

        Reloj reloj = new Reloj( );
        reloj.enMarcha(3000, true);
        JOptionPane.showMessageDialog(null, "pulsar aceptar para salir");
        System.exit(0);
    }
}
class Reloj{
    /*
    private int intervalo;
    private boolean sonido;

    public Reloj(int intervalo, boolean sonido) {
        this.intervalo = intervalo;
        this.sonido = sonido;
    }
    */
    public void enMarcha(int intervalo, final boolean sonido){

        class DameHora2 implements ActionListener {


            @Override
            public void actionPerformed(ActionEvent e) {
                Date hora = new Date();
                System.out.println(hora);
                if (sonido) {
                    Toolkit.getDefaultToolkit().beep();
                }
            }
        }
        ActionListener oyente = new DameHora2();
        Timer temporizador = new Timer(intervalo, oyente);
        temporizador.start();
    }
    /*
    private class DameHora2 implements ActionListener {


        @Override
        public void actionPerformed(ActionEvent e) {
            Date hora = new Date();
            System.out.println(hora);
            if (sonido) {
                Toolkit.getDefaultToolkit().beep();
            }
        }
    }
    */
    // termino nuestro programa.
}