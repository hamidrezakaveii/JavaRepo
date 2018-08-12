package vue;

/**
 * @(#)GuiSimple.java
 *
 *
 * @author HB
 * @version 1.00 2017/8/19
 */
import utils.Utilitaire;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;

public class GuiThermoBorder extends JFrame {

    private JLabel labelFahrenheit;
    private JLabel labelCelcius;
    private JTextField champFahrenheit;
    private JTextField champCelcius;
    private JButton boutonCalculer;
    private JButton boutonQuitter;
    private JLabel img;
    private JPanel contenuOuest, contenuBas, contenuCentre;
    private Utilitaire util;

    public GuiThermoBorder(Utilitaire util) {
        this.util = util;
        initComposants();
        initPanels();
    }

    public void run() {  // Ajoute un Listener au bouton convertir
        boutonCalculer.addActionListener(new ConvertirListener());

        // Ajoute un Listener au bouton quitter
        boutonQuitter.addActionListener(new QuitterListener());

    }

    // initialisation des composants sur le frame
    private void initComposants() {  // boutons
        boutonCalculer = new JButton("Convertir");
        boutonQuitter = new JButton("Quitter");
        // Creer labels
        labelFahrenheit = new JLabel("Fahrenheit:");
        labelCelcius = new JLabel("Celsius:");
        // Creer TExt fields
        champFahrenheit = new JTextField(20);
        champCelcius = new JTextField(20);
        // rendre champCelsius non editable
        champCelcius.setEditable(false);
        // image
        img = new JLabel(new ImageIcon(getClass().getResource("/images/wizard.jpg")));

    }

    // Initialisation des Panels
    private void initPanels() {  // Mettre les boutons dans un panel au SOUTH
        contenuBas = new JPanel();
        FlowLayout bMgr = new FlowLayout();

        contenuBas.setLayout(bMgr);
        contenuBas.add(boutonCalculer);
        contenuBas.add(boutonQuitter);
        // Faire la partie au centre
        // Creer un panel au centre
        contenuCentre = new JPanel();

        // Ajouter un border pour ce panel
        Border brd = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
        // Setter un layout manager pour ce panel
        FlowLayout gMgr = new FlowLayout();

        gMgr.setAlignment(FlowLayout.RIGHT);
        contenuCentre.setLayout(gMgr);
        contenuCentre.setBorder(brd);
        // Mettre les 4 au centre
        JPanel row1 = new JPanel(new FlowLayout());

        row1.add(labelFahrenheit);
        row1.add(champFahrenheit);
        JPanel row2 = new JPanel(new FlowLayout());

        row2.add(labelCelcius);
        row2.add(champCelcius);
        contenuCentre.add(row1);
        contenuCentre.add(row2);
        JPanel panel = new JPanel(new BorderLayout());

        panel.add(contenuCentre, BorderLayout.CENTER);
        // Mettre image sur border West
        contenuOuest = new JPanel(new FlowLayout());
        contenuOuest.add(img);

        // Mettre les composants sur un Panel BorderLayout
        this.add(panel, BorderLayout.CENTER);
        this.add(contenuBas, BorderLayout.SOUTH);
        this.add(contenuOuest, BorderLayout.WEST);
    }

    // ********************************************************************
    // Represente un listener pour le boutton convertir (action) et capte les events.
    // ********************************************************************
    private class ConvertirListener implements ActionListener {
        // -----------------------------------------------------------------
        // Incremente le compteur quand le bouton est cliqué.
        // -----------------------------------------------------------------

        public void actionPerformed(ActionEvent event) {
            double fahrenheit, celcius;
            try {
                fahrenheit = Double.parseDouble(champFahrenheit.getText());
                // 	celcius = util.convertirTemperature(fahrenheit);
                celcius = Utilitaire.convertirTemperature(fahrenheit);
                // celcius = (fahrenheit - 32) / 2.0;
                champCelcius.setText(Double.toString(celcius));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,
                        "La temperature doit etre en numerique !", "Erreur de saisie",
                        JOptionPane.ERROR_MESSAGE);
                requestFocusInWindow();
            }

        }

    }

    // ********************************************************************
    // Represente un listener pour le boutton quitter (action) et capte les events.
    // ********************************************************************
    private class QuitterListener implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            System.exit(0);

        }
    }

}
