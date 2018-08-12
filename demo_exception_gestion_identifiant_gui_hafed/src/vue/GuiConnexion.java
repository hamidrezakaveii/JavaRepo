package vue;

/**
 * @(#)GuiConnexion.java
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
import modele.Usager;
import utils.IntrusionException;

public class GuiConnexion extends JFrame {

    private JLabel labelIdentifiant;
    private JLabel labelMotPasse;
    private JTextField champIdentifiant;
   // private JTextField champMotPasse;
    private JPasswordField champMotPasse;
    private JButton boutonConnexion;
    private JButton boutonQuitter;
    private JLabel img;
    private JPanel contenuOuest, contenuBas, contenuCentre;
    private Utilitaire util;

    public GuiConnexion(Utilitaire util) {
        this.util = util;
        initComposants();//instancier les composants
        initPanels();//placer les composants
    }

    public void run() {  //iniWidgets() dans les systeme android
        // Ajoute un Listener au bouton convertir
        boutonConnexion.addActionListener(new ConnexionListener());

        // Ajoute un Listener au bouton quitter
        boutonQuitter.addActionListener(new QuitterListener());

    }

    // initialisation des composants sur le frame
    private void initComposants() {  // boutons
        boutonConnexion = new JButton("Connecter");
        boutonQuitter = new JButton("Quitter");
        // Creer labels
        labelIdentifiant = new JLabel("Identifiant:");
        labelMotPasse = new JLabel("Mot de passe:");
        // Creer TExt fields
        champIdentifiant = new JTextField(20);
        champMotPasse = new JPasswordField(20);

        // image
        img = new JLabel(new ImageIcon(getClass().getResource("/images/wizard.jpg")));

    }

    // Initialisation des Panels
    private void initPanels() {  // Mettre les boutons dans un panel au SOUTH
        contenuBas = new JPanel();
        FlowLayout bMgr = new FlowLayout();

        contenuBas.setLayout(bMgr);
        contenuBas.add(boutonConnexion);
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

        row1.add(labelIdentifiant);
        row1.add(champIdentifiant);
        JPanel row2 = new JPanel(new FlowLayout());

        row2.add(labelMotPasse);
        row2.add(champMotPasse);
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
    private class ConnexionListener implements ActionListener {
        // -----------------------------------------------------------------
        // Incremente le compteur quand le bouton est cliqué.
        // -----------------------------------------------------------------

        public void actionPerformed(ActionEvent event) {
            String ident = champIdentifiant.getText();
            String motPasse = champMotPasse.getText();
            Usager usager = new Usager(motPasse, ident);
            boolean resultat = Utilitaire.verifierInfos(usager);

            //Approche avec exception
            try {
                Utilitaire.traiterLogin(resultat, usager);
            } catch (IntrusionException ex) {
                JOptionPane.showMessageDialog(null, "Intrusion Système" + ex.toString(), "Connexion non autorisée",
                        JOptionPane.ERROR_MESSAGE);
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
