/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vue;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author HAMIDREZA
 */
public class CheckBoxFrame extends JFrame {

    private JTextField textField;
    private JCheckBox boldJCheckBox;
    private JCheckBox italicJCheckBox;

    public CheckBoxFrame() {
        super("JTextBox Test");
        setLayout(new FlowLayout());

        //set up JTextField and set its font
        textField = new JTextField("Whatch the font style change ", 20);
        textField.setFont(new Font("Serif", Font.PLAIN, 14));
        add(textField);

        boldJCheckBox = new JCheckBox("Bold");
        italicJCheckBox = new JCheckBox("Italic");
        add(boldJCheckBox);
        add(italicJCheckBox);

        // register listeners for JCheckBoxes
        CheckBoxHandler handler = new CheckBoxHandler();
        boldJCheckBox.addItemListener(handler);
        italicJCheckBox.addItemListener(handler);

    }

    private class CheckBoxHandler implements ItemListener {

        Font font = null;

        @Override
        public void itemStateChanged(ItemEvent event) {
            if (boldJCheckBox.isSelected() && italicJCheckBox.isSelected()) {
                font = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
            } else if (boldJCheckBox.isSelected()) {
                font = new Font("Serif", Font.BOLD, 14);
            } else if (italicJCheckBox.isSelected()) {
                font = new Font("Serif", Font.ITALIC, 14);
            } else {
                font = new Font("Serif", Font.PLAIN, 14);
            }
            textField.setFont(font);
        }
    }

}
