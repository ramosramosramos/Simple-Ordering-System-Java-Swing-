/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Components;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author User
 */
public class CustomTextField extends JTextField{

    public CustomTextField(String path) {
        JLabel label = new  JLabel(new ImageIcon(getClass().getResource(path)));
        this.setLayout(new BorderLayout());
        setCaretColor(new Color(0,0,102));
        setBackground(new Color(204,204,204));
        setForeground(new Color(51,51,51));
        add(label,BorderLayout.EAST);
    }
    
    
}
