package control;

/**
 * @(#)AppCtr.java
 *
 *
 * @author HB
 * @version 1.00 2017/8/19
 */




import vue.GuiThermoBorder;
import utils.Utilitaire;
import javax.swing.JFrame;


public class AppCtr
{

   public AppCtr()
   {}

   public static void main(String[] args)
   {  int  width = 500, height = 300;
      // initialiser frame
      Utilitaire objU = new Utilitaire();
      GuiThermoBorder objGui = new GuiThermoBorder(objU);
      
      // Note: on n'utilise pas de thread pour le moment.
      objGui.run();
      // indiquer le titre du frame
      objGui.setTitle("Convertisseur temperature Ameliore");
      // Donner une taille de la frame pour  affichage
      objGui.setSize(width, height);
      // Afficher la frame et donc le Panel
      objGui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      objGui.setLocationRelativeTo(null);
      objGui.setResizable(false);
      objGui.setVisible(true);

   }

}
