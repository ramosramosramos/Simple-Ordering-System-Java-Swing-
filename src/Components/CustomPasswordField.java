/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Components;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import javax.swing.JPasswordField;

/**
 *
 * @author User
 */
public class CustomPasswordField extends JPasswordField {

    String path;
    boolean isShow = false;
    JLabel label;

    public CustomPasswordField() {
        path = "/Images/hide.png";

        label = new JLabel(new ImageIcon(getClass().getResource(path)));
        label.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        this.setLayout(new BorderLayout());
        setCaretColor(new Color(0, 0, 102));
        setBackground(new Color(204, 204, 204));
        setForeground(new Color(51, 51, 51));
        add(label, BorderLayout.EAST);
        label.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                isShow = !isShow;
                if (isShow) {

                    label.setIcon(new ImageIcon(getClass().getResource("/Images/show.png")));
                    setEchoChar((char) 0);
                } else {

                    label.setIcon(new ImageIcon(getClass().getResource("/Images/hide.png")));
                    setEchoChar('•');

                }
                label.repaint();
                label.revalidate();
                
            }

        });

        

    }


}
