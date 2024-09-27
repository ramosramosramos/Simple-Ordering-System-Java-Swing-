package Pages;

import com.formdev.flatlaf.FlatDarculaLaf;


public class Order extends javax.swing.JFrame {

    String product;
    int price;
    int quantity;
    int total;

    public Order(String account) {
        initComponents();
      

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        back_ground_1 = new javax.swing.JPanel();
        form_holder = new javax.swing.JPanel();
        form_holder_1 = new javax.swing.JPanel();
        labels = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        fields = new javax.swing.JPanel();
        product_field = new javax.swing.JTextField();
        quantity_field = new javax.swing.JSpinner();
        price_field = new javax.swing.JTextField();
        total_field = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        buttons = new javax.swing.JPanel();
        clear_button = new javax.swing.JButton();
        add_product_button = new javax.swing.JButton();
        table_holder = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setLayout(new java.awt.GridBagLayout());

        back_ground_1.setPreferredSize(new java.awt.Dimension(1000, 600));
        back_ground_1.setLayout(new java.awt.GridLayout(1, 0, 20, 0));

        form_holder.setLayout(new java.awt.GridLayout(2, 0));

        form_holder_1.setLayout(new java.awt.GridLayout(1, 0, 10, 0));

        labels.setLayout(new java.awt.GridLayout(4, 0, 0, 40));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Product");
        labels.add(jLabel1);

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Quantity");
        labels.add(jLabel2);

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Price");
        labels.add(jLabel3);

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Total");
        labels.add(jLabel4);

        form_holder_1.add(labels);

        fields.setLayout(new java.awt.GridLayout(4, 0, 0, 40));

        product_field.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        product_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                product_fieldActionPerformed(evt);
            }
        });
        fields.add(product_field);

        quantity_field.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        quantity_field.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
        quantity_field.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        quantity_field.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                quantity_fieldStateChanged(evt);
            }
        });
        quantity_field.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                quantity_fieldKeyTyped(evt);
            }
        });
        fields.add(quantity_field);

        price_field.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        price_field.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                price_fieldKeyReleased(evt);
            }
        });
        fields.add(price_field);

        total_field.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        total_field.setName(""); // NOI18N
        total_field.setRequestFocusEnabled(false);
        fields.add(total_field);

        form_holder_1.add(fields);

        form_holder.add(form_holder_1);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttons.setLayout(new java.awt.GridLayout(1, 0, 10, 0));

        clear_button.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        clear_button.setText("Clear");
        buttons.add(clear_button);

        add_product_button.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        add_product_button.setText("Add");
        buttons.add(add_product_button);

        jPanel4.add(buttons, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 490, 50));

        form_holder.add(jPanel4);

        back_ground_1.add(form_holder);

        table_holder.setLayout(new java.awt.BorderLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        table_holder.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        back_ground_1.add(table_holder);

        background.add(back_ground_1, new java.awt.GridBagConstraints());

        getContentPane().add(background, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(1033, 654));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void product_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_product_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_product_fieldActionPerformed

    private void quantity_fieldStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_quantity_fieldStateChanged
        listenTotal();
    }//GEN-LAST:event_quantity_fieldStateChanged

    private void quantity_fieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantity_fieldKeyTyped
        listenTotal();        // TODO add your handling code here:
    }//GEN-LAST:event_quantity_fieldKeyTyped

    private void price_fieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_price_fieldKeyReleased
        listenTotal();
    }//GEN-LAST:event_price_fieldKeyReleased

    void listenTotal() {
        if ("0".equals(quantity_field.getValue().toString())) {
             total_field.setText("");
            return;
        }
        if (price_field.getText().trim().isEmpty()) {
            return;
        }
        String quantityField = quantity_field.getValue().toString();
        String priceField = price_field.getText();
        int quantityValue = Integer.valueOf(quantityField);
        int priceValue = Integer.valueOf(priceField);
        if (quantityValue > 0 && priceValue > 0) {
            int totaValue = priceValue * quantityValue;
            total_field.setText(String.valueOf(totaValue));
        }
     
    }

    public static void main(String args[]) {
        FlatDarculaLaf.setup();
        java.awt.EventQueue.invokeLater(() -> {
            new Order("").setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_product_button;
    private javax.swing.JPanel back_ground_1;
    private javax.swing.JPanel background;
    private javax.swing.JPanel buttons;
    private javax.swing.JButton clear_button;
    private javax.swing.JPanel fields;
    private javax.swing.JPanel form_holder;
    private javax.swing.JPanel form_holder_1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel labels;
    private javax.swing.JTextField price_field;
    private javax.swing.JTextField product_field;
    private javax.swing.JSpinner quantity_field;
    private javax.swing.JPanel table_holder;
    private javax.swing.JTextField total_field;
    // End of variables declaration//GEN-END:variables
}
