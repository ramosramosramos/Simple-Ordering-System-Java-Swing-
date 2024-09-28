package Pages;

import com.formdev.flatlaf.FlatDarculaLaf;
import javax.swing.JFrame;
import javax.swing.JTable;

public class Payment extends javax.swing.JFrame {

    private final JFrame frame;
    JTable table;
    String account;

    public Payment(JFrame frame, JTable table, String account) {
        initComponents();
        this.frame = frame;
        this.table = table;
        this.account = account;

        frame.setEnabled(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        cash_field = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jButton1.setText("x");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        background.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 50, 30));

        cash_field.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        cash_field.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cash_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cash_fieldActionPerformed(evt);
            }
        });
        cash_field.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cash_fieldKeyTyped(evt);
            }
        });
        background.add(cash_field, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 310, 40));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel1.setText("Cash amount :");
        background.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 210, 40));

        jButton2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton2.setText("Summarize");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        background.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 310, 50));

        getContentPane().add(background, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(508, 247));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        goBackToFrame();


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
storeCash();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cash_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cash_fieldActionPerformed
storeCash();

    }//GEN-LAST:event_cash_fieldActionPerformed

    private void cash_fieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cash_fieldKeyTyped
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_cash_fieldKeyTyped

    public static void main(String args[]) {
        FlatDarculaLaf.setup();
        java.awt.EventQueue.invokeLater(() -> {
            new Payment(new JFrame(), new JTable(), "").setVisible(true);
        });
    }

    void goBackToFrame() {
        frame.setEnabled(true);
        frame.getGlassPane().setVisible(false);

        this.dispose();
    }

    void storeCash() {
     Order update = new Order(account);
       update.index();
       update.payementIndex();
        Services.Payments.store(cash_field.getText().trim());
        goBackToFrame();
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JTextField cash_field;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
