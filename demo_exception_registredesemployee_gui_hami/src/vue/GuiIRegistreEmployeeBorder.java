package vue;

/**
 * @(#)GuiIRegistreEmployeeBorder.java
 *
 *
 * @author Hamidreza Kaveii
 * @version 1.00 2018/02/10
 */
import utils.EmployeDejaPresentException;
import java.awt.*;
import java.awt.event.*;
import java.sql.Timestamp;
import javax.swing.*;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import modele.Employe;
import modele.ListEmploye;

public class GuiIRegistreEmployeeBorder extends JFrame {

    private JLabel labelNom;
    private JLabel labelPrenom;
    private JLabel labelAge;
    private JTextField champNom;
    private JTextField champPrenom;
    private JTextField champAge;
    private JButton boutonAjouter;
    private JButton boutonQuitter;
    private JLabel img;
    private JPanel contenuOuest, contenuBas, contenuCentre;
    private Employe emp;
    private ListEmploye registre;

    public GuiIRegistreEmployeeBorder(ListEmploye registre) {
        this.registre = registre;
        initComposants();
        initPanels();
    }

    public void run() {
        // Ajoute un Listener au bouton ajouter
        boutonAjouter.addActionListener(new IdentifierListener());

        // Ajoute un Listener au bouton quitter
        boutonQuitter.addActionListener(new QuitterListener());

        //Ajouter un Listener au JTextField
        champNom.addActionListener(new IdentifierListener());
        champPrenom.addActionListener(new IdentifierListener());
        champAge.addActionListener(new IdentifierListener());

    }

    // initialisation des composants sur le frame
    private void initComposants() {
        // boutons
        boutonAjouter = new JButton("Ajouter");
        boutonQuitter = new JButton("Quitter");
        // Creer labels
        labelNom = new JLabel("Nom: ");
        labelPrenom = new JLabel("Prenom: ");
        labelAge = new JLabel("Age: ");
        // setter tooltip texte
        labelNom.setToolTipText("Nom de employe");
        labelPrenom.setToolTipText("Prenom de employe");
        labelAge.setToolTipText("Age de employe");
//        //setter position de Jlabel
//        labelNom.setHorizontalTextPosition(SwingConstants.LEFT);
//        labelPrenom.setHorizontalTextPosition(SwingConstants.LEFT);
//        labelAge.setHorizontalTextPosition(SwingConstants.LEFT);
//        
//        labelNom.setVerticalTextPosition(SwingConstants.CENTER);
//        labelPrenom.setVerticalTextPosition(SwingConstants.CENTER);
//        labelAge.setVerticalTextPosition(SwingConstants.CENTER);
        // Creer Text fields
        champNom = new JTextField(20);
        champPrenom = new JTextField(20);
        champAge = new JTextField(20);
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
        contenuBas.add(boutonAjouter);
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

        row1.add(labelNom);
        row1.add(champNom);
        JPanel row2 = new JPanel(new FlowLayout());

        row2.add(labelPrenom);
        row2.add(champPrenom);

        JPanel row3 = new JPanel(new FlowLayout());

        row3.add(labelAge);
        row3.add(champAge);

        contenuCentre.add(row1);
        contenuCentre.add(row2);
        contenuCentre.add(row3);

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
    // Represente un listener pour le boutton ajouter (action) et capte les events.
    // ********************************************************************
    private class IdentifierListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            try {
                Employe emp = new Employe();
                emp.setNom(champNom.getText());
                emp.setPrenom(champPrenom.getText());
                emp.setAge(Integer.parseInt(champAge.getText()));
                registre.ajouterEmploye(emp);
                JOptionPane.showMessageDialog(null, "Employe ajoutè avec succès!", "Insertion", JOptionPane.INFORMATION_MESSAGE);

            } catch (EmployeDejaPresentException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage() + "\n" + ex.getIndividu().getNom() + " " + ex.getIndividu().getPrenom(),
                        "Errour de saisie", JOptionPane.ERROR_MESSAGE);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Paramètre invalide et / ou champ vide!",
                        "Errour de saisie", JOptionPane.ERROR_MESSAGE);
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

//Ajouter action pour un JTextField 
//champNom.addActionListener(new MyListener());
//private class TextFieldHandler implements ActionListener{
//    
//    @Override
//    public void actionPerformed(ActionEvent event){
//        String string="";
//        if(event.getSource()== champNom)
//        string = String.format("champNom: %s\"",event.getActionCommand());
//        JOptionPane.showMessageDialog(null, string);
//        
//    }
//}

