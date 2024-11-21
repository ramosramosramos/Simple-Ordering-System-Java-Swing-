package Pages.Auth;

import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.themes.FlatMacLightLaf;

public class Register extends javax.swing.JFrame {

    public Register() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        form = new javax.swing.JPanel();
        container = new javax.swing.JPanel();
        create_account_button = new javax.swing.JButton();
        username_field = new Components.CustomTextField("/Images/user.png");
        jlabel2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        password_error_label = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        login_button = new javax.swing.JButton();
        password_field = new Components.CustomPasswordField();
        username_error_label = new javax.swing.JLabel();
        name_field = new Components.CustomTextField("/Images/user.png");
        name_error_label = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        password_confirmation_field = new Components.CustomPasswordField();
        jlabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        password_confirmation_error_label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Register - Ordering System");

        form.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 50, 50));

        container.setPreferredSize(new java.awt.Dimension(400, 600));
        container.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        create_account_button.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        create_account_button.setText("Proceed to login");
        create_account_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        create_account_button.setDoubleBuffered(true);
        create_account_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                create_account_buttonActionPerformed(evt);
            }
        });
        container.add(create_account_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 530, 380, 40));

        username_field.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        username_field.setPreferredSize(null);
        username_field.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                username_fieldFocusGained(evt);
            }
        });
        username_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                username_fieldActionPerformed(evt);
            }
        });
        container.add(username_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 380, 40));

        jlabel2.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jlabel2.setText("Password");
        container.add(jlabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 70, 20));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setText("*");
        container.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 30, 20));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel3.setText("Username");
        container.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 60, 20));

        password_error_label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        password_error_label.setForeground(new java.awt.Color(255, 51, 51));
        container.add(password_error_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 380, 30));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Register");
        container.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 40));

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 51, 51));
        jLabel5.setText("*");
        container.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 30, 20));

        login_button.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        login_button.setText("Create");
        login_button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        login_button.setDoubleBuffered(true);
        login_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_buttonActionPerformed(evt);
            }
        });
        container.add(login_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 450, 380, 40));

        password_field.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        password_field.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                password_fieldFocusGained(evt);
            }
        });
        password_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                password_fieldActionPerformed(evt);
            }
        });
        container.add(password_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 380, 40));

        username_error_label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        username_error_label.setForeground(new java.awt.Color(255, 51, 51));
        container.add(username_error_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 380, 30));

        name_field.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        name_field.setPreferredSize(null);
        name_field.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                name_fieldFocusGained(evt);
            }
        });
        name_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name_fieldActionPerformed(evt);
            }
        });
        container.add(name_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 380, 40));

        name_error_label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        name_error_label.setForeground(new java.awt.Color(255, 51, 51));
        container.add(name_error_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 380, 30));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel4.setText("Name");
        container.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 40, 20));

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 51, 51));
        jLabel6.setText("*");
        container.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 30, 20));

        password_confirmation_field.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        password_confirmation_field.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                password_confirmation_fieldFocusGained(evt);
            }
        });
        password_confirmation_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                password_confirmation_fieldActionPerformed(evt);
            }
        });
        container.add(password_confirmation_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 380, 40));

        jlabel3.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jlabel3.setText("Password confirmation");
        container.add(jlabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 140, 20));

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 51, 51));
        jLabel7.setText("*");
        container.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 30, 20));

        password_confirmation_error_label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        password_confirmation_error_label.setForeground(new java.awt.Color(255, 51, 51));
        container.add(password_confirmation_error_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 380, 30));

        form.add(container);

        getContentPane().add(form, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(741, 698));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void create_account_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_create_account_buttonActionPerformed
        new Login().setVisible(true);
        this.dispose();

    }//GEN-LAST:event_create_account_buttonActionPerformed

    private void username_fieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_username_fieldFocusGained
        username_error_label.setText("");
    }//GEN-LAST:event_username_fieldFocusGained

    private void username_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_username_fieldActionPerformed
        register();
    }//GEN-LAST:event_username_fieldActionPerformed

    private void login_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_buttonActionPerformed
        register();
    }//GEN-LAST:event_login_buttonActionPerformed

    private void password_fieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_password_fieldFocusGained
        password_error_label.setText("");
    }//GEN-LAST:event_password_fieldFocusGained

    private void password_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_password_fieldActionPerformed
        register();
    }//GEN-LAST:event_password_fieldActionPerformed

    private void name_fieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_name_fieldFocusGained
        name_error_label.setText("");
    }//GEN-LAST:event_name_fieldFocusGained

    private void name_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name_fieldActionPerformed
        register();
    }//GEN-LAST:event_name_fieldActionPerformed

    private void password_confirmation_fieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_password_confirmation_fieldFocusGained
        password_confirmation_error_label.setText("");
    }//GEN-LAST:event_password_confirmation_fieldFocusGained

    private void password_confirmation_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_password_confirmation_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_password_confirmation_fieldActionPerformed

    void register() {
        String name = name_field.getText().trim();
        String username = username_field.getText().trim();
        String password = new String(password_field.getPassword()).trim();
        String password_confirmation = new String(password_confirmation_field.getPassword()).trim();
        if (name.isEmpty() && username.isEmpty() && password.isEmpty() && password_confirmation.isEmpty()) {
            name_error_label.setText("Name field is empty");
            username_error_label.setText("Username field is empty");
            password_error_label.setText("Password field is empty");
            password_confirmation_error_label.setText("Password comfirmation field is empty");
            return;
        }

        if (name.isEmpty()) {
            name_error_label.setText("Name field is empty");
            return;
        }
        if (username.isEmpty()) {
            username_error_label.setText("Username field is empty");
            return;

        }
        if (password.isEmpty()) {
            password_error_label.setText("Paswword field is empty");
            return;
        }
        if (password_confirmation.isEmpty()) {
            password_confirmation_error_label.setText("Paswword confirmation  field is empty");
            return;
        }
        if (!password.equals(password_confirmation)) {
            password_confirmation_error_label.setText("Paswword does not match");
            return;
        }

        boolean isExist = AuthenticationServices.Verify.isExistUsername(username);
        if (isExist) {
            username_field.requestFocus();
            return;
        }
        AuthenticationServices.Verify.register(name, username, password);
        new Pages.Index(username).setVisible(true);
        this.dispose();
    }

    public static void main(String args[]) {
        boolean isDarkMode = Themes.Mode.getMode();

        if (isDarkMode) {
            FlatDarculaLaf.setup();
        } else {
            FlatMacLightLaf.setup();
        }

        java.awt.EventQueue.invokeLater(() -> {
            new Register().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel container;
    private javax.swing.JButton create_account_button;
    private javax.swing.JPanel form;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jlabel2;
    private javax.swing.JLabel jlabel3;
    private javax.swing.JButton login_button;
    private javax.swing.JLabel name_error_label;
    private javax.swing.JTextField name_field;
    private javax.swing.JLabel password_confirmation_error_label;
    private javax.swing.JPasswordField password_confirmation_field;
    private javax.swing.JLabel password_error_label;
    private javax.swing.JPasswordField password_field;
    private javax.swing.JLabel username_error_label;
    private javax.swing.JTextField username_field;
    // End of variables declaration//GEN-END:variables
}
