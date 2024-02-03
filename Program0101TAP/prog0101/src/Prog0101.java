import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Prog0101 {
    public static void main(String[] args) throws Exception {
        JFrame miVentana = new JFrame("Prueba de Manejo de Eventos ");// Para crear la ventana
        miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Para poder cerrar ventana

        // Agregar panel Personalizado a la ventana
        MiPanel miPanel = new MiPanel();
        miVentana.add(miPanel);

        // Establecer tamaño y visibilidad
        miVentana.setSize(600, 400); // tamaño
        miVentana.setVisible(true); // Visibilidad
    }
}

// Panel Personalizado
class MiPanel extends JPanel {

    // Contructor para inizializar los componentes
    public MiPanel() {
        // Oyente de evento
        MiOyente miOyente = new MiOyente();
        MiOyente2 miOyente2 = new MiOyente2();
        MiOyente3 miOyente3 = new MiOyente3();

        // Fuente de evetos
        JButton botonOk = new JButton("4PUCH3L3 4QU1 KRN4L ");
        JButton botonOk2 = new JButton("0M3J0R 4QU1 P3RR0 ");
        JButton botonOk3 = new JButton("TU 54B3S L0 QU3 H4C35 BR0 ");

        // Registrar evento de oyente
        botonOk.addActionListener(miOyente);
        botonOk.addActionListener(miOyente2);
        botonOk.addActionListener(miOyente3);

        botonOk2.addActionListener(miOyente);
        botonOk3.addActionListener(miOyente);

        // Agregar Botn
        add(botonOk);
        add(botonOk2);
        add(botonOk3);
    }

    // Clase interna para oyente de eventos
    class MiOyente implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String cual = e.getActionCommand();

            // Mostrar mensaje en la pantalla
            JOptionPane.showMessageDialog(null, "Nooooo, haz activado una BOMBAAAA!!!!!!" + cual);
        }

    }

    class MiOyente2 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String cual = e.getActionCommand();
            JOptionPane.showMessageDialog(null, "Muy bu3n4 d351c10n" + cual);
        }

    }

    class MiOyente3 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String cual = e.getActionCommand();
            JOptionPane.showMessageDialog(null, "N000000 N1 M3RG4S N0 P4S0 N4D4 xD " + cual);
        }

    }
}
