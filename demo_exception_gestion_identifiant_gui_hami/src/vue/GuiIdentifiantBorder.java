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
import java.sql.Timestamp;
import javax.swing.*;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import modele.Usager;
import utils.IntrusionException;

public class GuiIdentifiantBorder extends JFrame {

    private JLabel labelIdentifier;
    private JLabel labelMotDePass;
    private JTextField champIdentifier;
    private JPasswordField champMotDePass;
    private JButton boutonIdentifier;
    private JButton boutonQuitter;
    private JLabel img;
    private JPanel contenuOuest, contenuBas, contenuCentre;



    public GuiIdentifiantBorder() {
        initComposants();
        initPanels();
    }

    public void run() {  
        // Ajoute un Listener au bouton convertir
        boutonIdentifier.addActionListener(new IdentifierListener());

        // Ajoute un Listener au bouton quitter
        boutonQuitter.addActionListener(new QuitterListener());

    }

    // initialisation des composants sur le frame
    private void initComposants() {  // boutons
        boutonIdentifier = new JButton("Identifier");
        boutonQuitter = new JButton("Quitter");
        // Creer labels
        labelIdentifier = new JLabel("Identifier:");
        labelMotDePass = new JLabel("Mot de pass:");
        // Creer TExt fields
        champIdentifier = new JTextField(20);
        champMotDePass = new JPasswordField(20);
        // rendre champCelsius non editable
        //champMotDePass.setEditable(false);
        // image
        img = new JLabel(new ImageIcon(getClass().getResource("/images/wizard.jpg")));

    }

    // Initialisation des Panels
    private void initPanels() {  // Mettre les boutons dans un panel au SOUTH
        contenuBas = new JPanel();
        FlowLayout bMgr = new FlowLayout();

        contenuBas.setLayout(bMgr);
        contenuBas.add(boutonIdentifier);
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

        row1.add(labelIdentifier);
        row1.add(champIdentifier);
        JPanel row2 = new JPanel(new FlowLayout());

        row2.add(labelMotDePass);
        row2.add(champMotDePass);
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
        
//        User user = new User(champIdentifier.getText(), champMotDePass.getText());
//        boolean resultat = (user.getIdentifiant().equals("flouflou") && user.getMotPasse().equals("admin1234"));

    // ********************************************************************
    // Represente un listener pour le boutton identifier (action) et capte les events.
    // ********************************************************************
    private class IdentifierListener implements ActionListener {
        
        

        
        @Override
        public void actionPerformed(ActionEvent event){
            boolean resultat;
            Usager user = new Usager();
            user.setIdentifiant(champIdentifier.getText());
            user.setMotPasse(champMotDePass.getText());
            
//            Usager user = new Usager(champIdentifier.getText(), champMotDePass.getText());
            resultat = (user.getIdentifiant().equals("flouflou") && user.getMotPasse().equals("admin1234"));
            try{
                if (resultat){
                    JOptionPane.showMessageDialog(null, "Bienvenue sur le systeme", "Connexion autorisée", 
                            JOptionPane.INFORMATION_MESSAGE);
                    }
                else{
                    JOptionPane.showMessageDialog(null, "Intrusion Système", "Connexion non autorisée", 
                            JOptionPane.ERROR_MESSAGE);
                    //Obtenir le nom de la machine et autres infos
                    String machine = Utilitaire.getInfosMachine();
                    Timestamp stamp =new Timestamp(System.currentTimeMillis());
                    throw new IntrusionException(user, machine, stamp );
                    }    
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

            @Override
            public void actionPerformed(ActionEvent event) {
                System.exit(0);

            }
    }

}
