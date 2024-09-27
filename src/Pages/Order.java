package Pages;

import com.formdev.flatlaf.FlatDarculaLaf;

public final class Order extends javax.swing.JFrame {

    public Order(String account) {
        initComponents();
        index();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        back_ground_1 = new javax.swing.JPanel();
        form_holder = new javax.swing.JPanel();
        form_holder_1 = new javax.swing.JPanel();
        fields = new javax.swing.JPanel();
        product_panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        product_field = new javax.swing.JTextField();
        uantity_panel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        quantity_field = new javax.swing.JSpinner();
        price_panel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        price_field = new javax.swing.JTextField();
        total_panel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        total_field = new javax.swing.JTextField();
        labels = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        add_product_button = new javax.swing.JButton();
        clear_button1 = new javax.swing.JButton();
        clear_button = new javax.swing.JButton();
        buttons = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table =  new Components.CustomizeTable();
        table_holder = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Orders");

        background.setLayout(new java.awt.GridBagLayout());

        back_ground_1.setPreferredSize(new java.awt.Dimension(1000, 600));
        back_ground_1.setLayout(new javax.swing.BoxLayout(back_ground_1, javax.swing.BoxLayout.PAGE_AXIS));

        form_holder.setLayout(new java.awt.GridLayout(2, 0, 0, 40));

        form_holder_1.setLayout(new java.awt.GridLayout(1, 0, 10, 0));

        fields.setLayout(new java.awt.GridLayout(4, 10, 10, 1));

        product_panel.setLayout(new java.awt.GridLayout(2, 0));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Product");
        product_panel.add(jLabel1);

        product_field.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        product_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                product_fieldActionPerformed(evt);
            }
        });
        product_panel.add(product_field);

        fields.add(product_panel);

        uantity_panel.setLayout(new java.awt.GridLayout(2, 0));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Quantity");
        uantity_panel.add(jLabel2);

        quantity_field.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        quantity_field.setModel(new javax.swing.SpinnerNumberModel(0, 0, 99999, 1));
        quantity_field.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        quantity_field.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                quantity_fieldStateChanged(evt);
            }
        });
        quantity_field.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                quantity_fieldFocusGained(evt);
            }
        });
        quantity_field.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                quantity_fieldInputMethodTextChanged(evt);
            }
        });
        quantity_field.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                quantity_fieldKeyTyped(evt);
            }
        });
        uantity_panel.add(quantity_field);

        fields.add(uantity_panel);

        price_panel.setLayout(new java.awt.GridLayout(2, 0));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Price");
        price_panel.add(jLabel3);

        price_field.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        price_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                price_fieldActionPerformed(evt);
            }
        });
        price_field.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                price_fieldKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                price_fieldKeyTyped(evt);
            }
        });
        price_panel.add(price_field);

        fields.add(price_panel);

        total_panel.setLayout(new java.awt.GridLayout(2, 0));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Total");
        total_panel.add(jLabel4);

        total_field.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        total_field.setName(""); // NOI18N
        total_field.setRequestFocusEnabled(false);
        total_panel.add(total_field);

        fields.add(total_panel);

        form_holder_1.add(fields);

        labels.setLayout(new java.awt.GridLayout(4, 0, 0, 40));
        labels.add(jPanel1);

        add_product_button.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        add_product_button.setText("Summarize");
        add_product_button.setPreferredSize(new java.awt.Dimension(240, 40));
        add_product_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_product_buttonActionPerformed(evt);
            }
        });
        labels.add(add_product_button);

        clear_button1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        clear_button1.setText("Clear fields");
        clear_button1.setPreferredSize(new java.awt.Dimension(240, 40));
        labels.add(clear_button1);

        clear_button.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        clear_button.setText("Clear table");
        clear_button.setPreferredSize(new java.awt.Dimension(240, 40));
        clear_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear_buttonActionPerformed(evt);
            }
        });
        labels.add(clear_button);

        form_holder_1.add(labels);

        form_holder.add(form_holder_1);

        buttons.setLayout(new java.awt.GridLayout(1, 0));

        table.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(table);

        buttons.add(jScrollPane1);

        form_holder.add(buttons);

        back_ground_1.add(form_holder);

        table_holder.setLayout(new java.awt.BorderLayout());
        back_ground_1.add(table_holder);

        background.add(back_ground_1, new java.awt.GridBagConstraints());

        getContentPane().add(background, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(1033, 654));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void product_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_product_fieldActionPerformed
        store();
    }//GEN-LAST:event_product_fieldActionPerformed

    private void quantity_fieldStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_quantity_fieldStateChanged
        listenTotal();
    }//GEN-LAST:event_quantity_fieldStateChanged

    private void quantity_fieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantity_fieldKeyTyped


    }//GEN-LAST:event_quantity_fieldKeyTyped

    private void price_fieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_price_fieldKeyReleased
        listenTotal();

    }//GEN-LAST:event_price_fieldKeyReleased

    private void add_product_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_product_buttonActionPerformed
        store();
    }//GEN-LAST:event_add_product_buttonActionPerformed

    private void price_fieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_price_fieldKeyTyped
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }//GEN-LAST:event_price_fieldKeyTyped

    private void quantity_fieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_quantity_fieldFocusGained
        listenTotal();
    }//GEN-LAST:event_quantity_fieldFocusGained

    private void quantity_fieldInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_quantity_fieldInputMethodTextChanged
        listenTotal();
    }//GEN-LAST:event_quantity_fieldInputMethodTextChanged

    private void price_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_price_fieldActionPerformed
        store();
    }//GEN-LAST:event_price_fieldActionPerformed

    private void clear_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_buttonActionPerformed
   Services.Orders.destroyAll();
   index();
    }//GEN-LAST:event_clear_buttonActionPerformed

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

    void index() {
        Services.Orders.update(table);
    }

    void store() {

        String product = product_field.getText();
        String quantity = quantity_field.getValue().toString();
        String price = price_field.getText();
        if (product.isEmpty() || quantity.isEmpty() || price.isEmpty()) {
            return;
        }
        Services.Orders.store(product, quantity, price);
        index();
        clearFields();

    }

    void clearFields() {
        product_field.setText("");
        quantity_field.setValue(0);
        price_field.setText("");
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
    private javax.swing.JButton clear_button1;
    private javax.swing.JPanel fields;
    private javax.swing.JPanel form_holder;
    private javax.swing.JPanel form_holder_1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel labels;
    private javax.swing.JTextField price_field;
    private javax.swing.JPanel price_panel;
    private javax.swing.JTextField product_field;
    private javax.swing.JPanel product_panel;
    private javax.swing.JSpinner quantity_field;
    private javax.swing.JTable table;
    private javax.swing.JPanel table_holder;
    private javax.swing.JTextField total_field;
    private javax.swing.JPanel total_panel;
    private javax.swing.JPanel uantity_panel;
    // End of variables declaration//GEN-END:variables
}
