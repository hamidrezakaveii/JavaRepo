package control;


    /**
     * @param args the command line arguments
     */
    // Fig. 12.20: RadioButtonTest.java
    // Testing RadioButtonFrame.
    import javax.swing.JFrame ;
import vue.RadioButtonFrame;

    public class AppCtr {

        public static void main(String[] args) {
            RadioButtonFrame radioButtonFrame = new RadioButtonFrame();
            radioButtonFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            radioButtonFrame.setSize(300, 100);
            radioButtonFrame.setVisible(true);
        }
    } // end class RadioButtonTest
