package Panels;


public class summarize_panel extends javax.swing.JPanel {

    public summarize_panel(String grandtotal,String cash,String balance) {
        initComponents();
        grandtotal_label.setText(grandtotal);
        cash_label.setText(cash);
        balance_label.setText(balance);
 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cash_label = new javax.swing.JLabel();
        grandtotal_label = new javax.swing.JLabel();
        balance_label = new javax.swing.JLabel();
        total_label = new javax.swing.JLabel();
        total_label1 = new javax.swing.JLabel();
        total_label2 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createMatteBorder(2, 0, 0, 0, new java.awt.Color(204, 204, 204)));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cash_label.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        cash_label.setText("cash");
        add(cash_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 360, 30));

        grandtotal_label.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        grandtotal_label.setText("GrandTotal");
        add(grandtotal_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 320, 30));

        balance_label.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        balance_label.setText("balance");
        add(balance_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 340, 30));

        total_label.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        total_label.setText("Balance:");
        add(total_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 80, 30));

        total_label1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        total_label1.setText("Cash:");
        add(total_label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 30, 30));

        total_label2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        total_label2.setText("Grand Total:");
        add(total_label2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 80, 30));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel balance_label;
    private javax.swing.JLabel cash_label;
    private javax.swing.JLabel grandtotal_label;
    private javax.swing.JLabel total_label;
    private javax.swing.JLabel total_label1;
    private javax.swing.JLabel total_label2;
    // End of variables declaration//GEN-END:variables
}
