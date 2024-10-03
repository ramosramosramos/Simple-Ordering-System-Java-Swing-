package Pages;

import com.formdev.flatlaf.FlatDarculaLaf;

import com.formdev.flatlaf.themes.FlatMacLightLaf;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public final class Order extends javax.swing.JFrame {

    String account;

    public Order(String account) {
        initComponents();
//        if(account.isEmpty()){
//            JOptionPane.showMessageDialog(null, "You are not authorized ,please log in your account first");
//              System.exit(0);
//            
//        }
        this.account = account;
        glassPane();
        updateTheme();

        index();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        trash_panel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        trash_table = new javax.swing.JTable();
        label = new javax.swing.JLabel();
        tableOrders_popMenu = new javax.swing.JPopupMenu();
        remove_product = new javax.swing.JMenuItem();
        background = new javax.swing.JPanel();
        back_ground_1 = new javax.swing.JPanel();
        form_holder = new javax.swing.JPanel();
        form_holder_1 = new javax.swing.JPanel();
        labels = new javax.swing.JPanel();
        top_labels = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        grand_total_label = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cash_label = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        balance_label = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        add_product_button = new javax.swing.JButton();
        apyment_button = new javax.swing.JButton();
        clear_button = new javax.swing.JButton();
        clear_button1 = new javax.swing.JButton();
        fields = new javax.swing.JPanel();
        product_panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        product_field = new javax.swing.JTextField();
        quantity_panel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        quantity_field = new javax.swing.JSpinner();
        price_panel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        price_field = new javax.swing.JTextField();
        total_panel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        total_field = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        modeButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        tables_panel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table =  new Components.CustomizeTable();

        trash_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        trash_table.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(trash_table);

        trash_panel.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 710, 450));
        trash_panel.add(label, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 550, 810, 20));

        remove_product.setText("Remove Product");
        remove_product.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remove_productActionPerformed(evt);
            }
        });
        tableOrders_popMenu.add(remove_product);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Orders");
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        background.setLayout(new java.awt.GridLayout(1, 3000));

        back_ground_1.setPreferredSize(new java.awt.Dimension(1000, 600));
        back_ground_1.setLayout(new javax.swing.BoxLayout(back_ground_1, javax.swing.BoxLayout.PAGE_AXIS));

        form_holder.setLayout(new java.awt.GridLayout(2, 50000, 10, 40));

        form_holder_1.setLayout(new java.awt.GridLayout(1, 300, 50, 30));

        labels.setLayout(new java.awt.GridLayout(2, 300, 0, 40));

        top_labels.setLayout(new java.awt.GridLayout(3, 0, 10, 2));

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Grand Total :");
        top_labels.add(jLabel5);

        grand_total_label.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        top_labels.add(grand_total_label);

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Cash amount:");
        top_labels.add(jLabel7);

        cash_label.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        top_labels.add(cash_label);

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Balance:");
        top_labels.add(jLabel9);

        balance_label.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        top_labels.add(balance_label);

        labels.add(top_labels);

        jPanel2.setLayout(new java.awt.GridLayout(4, 0));

        add_product_button.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        add_product_button.setText("Summarize order");
        add_product_button.setPreferredSize(new java.awt.Dimension(240, 40));
        add_product_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_product_buttonActionPerformed(evt);
            }
        });
        jPanel2.add(add_product_button);

        apyment_button.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        apyment_button.setText("Add payment");
        apyment_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apyment_buttonActionPerformed(evt);
            }
        });
        jPanel2.add(apyment_button);

        clear_button.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        clear_button.setText("Cancel order");
        clear_button.setPreferredSize(new java.awt.Dimension(240, 40));
        clear_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear_buttonActionPerformed(evt);
            }
        });
        jPanel2.add(clear_button);

        clear_button1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        clear_button1.setText("New order (It will clear all the fields)");
        clear_button1.setPreferredSize(new java.awt.Dimension(240, 40));
        clear_button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clear_button1ActionPerformed(evt);
            }
        });
        jPanel2.add(clear_button1);

        labels.add(jPanel2);

        form_holder_1.add(labels);

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

        quantity_panel.setLayout(new java.awt.GridLayout(2, 0));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Quantity");
        quantity_panel.add(jLabel2);

        quantity_field.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        quantity_field.setModel(new javax.swing.SpinnerNumberModel(1, 1, 99999, 1));
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
        quantity_panel.add(quantity_field);

        fields.add(quantity_panel);

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

        modeButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        modeButton.setText("Light Mode");
        modeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modeButtonActionPerformed(evt);
            }
        });
        jPanel1.add(modeButton);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Trash");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);

        form_holder_1.add(jPanel1);

        form_holder.add(form_holder_1);

        tables_panel.setLayout(new java.awt.GridLayout(1, 0));

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
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tableMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        tables_panel.add(jScrollPane1);

        form_holder.add(tables_panel);

        back_ground_1.add(form_holder);

        background.add(back_ground_1);

        getContentPane().add(background, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(1053, 654));
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
        payementIndex();
    }//GEN-LAST:event_clear_buttonActionPerformed

    private void clear_button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clear_button1ActionPerformed
        clearFields(true);
    }//GEN-LAST:event_clear_button1ActionPerformed

    private void apyment_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apyment_buttonActionPerformed
        onGlass();

        new Pages.Payment(this, table, account).setVisible(true);


    }//GEN-LAST:event_apyment_buttonActionPerformed

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        payementIndex();
    }//GEN-LAST:event_formWindowGainedFocus

    private void modeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modeButtonActionPerformed
        if (Themes.Mode.getMode() == false) {
            Services.Orders.updateTheme("darkmode");
        } else {
            Services.Orders.updateTheme("lightmode");
        }
        this.dispose();
        String[] args = {};
        main(args);


    }//GEN-LAST:event_modeButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      Services.Orders.updateTrash(trash_table);
        JOptionPane.showMessageDialog(null, trash_panel, "Trash", JOptionPane.DEFAULT_OPTION);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void tableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMousePressed
   if(SwingUtilities.isRightMouseButton(evt)){
       tableOrders_popMenu.show(table, evt.getX(), evt.getY());
   }
    }//GEN-LAST:event_tableMousePressed

    private void remove_productActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remove_productActionPerformed
        try {
            String id = table.getValueAt(table.getSelectedRow(),0).toString();
            Services.Orders.destroy(id);
            index();
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_remove_productActionPerformed

    void listenTotal() {

        try {

            if (price_field.getText().trim().isEmpty()) {
                total_field.setText("");
            }
            if ("0".equals(quantity_field.getValue().toString())) {
                total_field.setText("");
                return;
            }
            if (price_field.getText().trim().isEmpty()) {
                return;
            }
            if (Long.valueOf(price_field.getText().trim()) >= 999999999) {
                price_field.setText("");
                total_field.setText("");
                return;
            }

            String quantityField = quantity_field.getValue().toString().trim();
            String priceField = price_field.getText().trim();
            long quantityValue = Long.valueOf(quantityField);
            long priceValue = Long.valueOf(priceField);
            if (quantityValue > 0 && priceValue > 0) {
                long totaValue = priceValue * quantityValue;
                total_field.setText(String.valueOf(totaValue));
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }

    void index() {
        Services.Orders.update(table);
        payementIndex();
    }

    void payementIndex() {
        Services.Payments.index(grand_total_label, cash_label, balance_label);
    }

    void store() {

        String product = product_field.getText();
        String quantity = quantity_field.getValue().toString();
        String price = price_field.getText();
        if (product.isEmpty() || quantity.isEmpty() || price.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please fill all the fields");
            return;
        }
        Services.Orders.store(product, quantity, price);
        index();
        payementIndex();
        clearFields(false);

    }

    void clearFields(boolean isAsk) {

        if (isAsk) {
            int ask = JOptionPane.showConfirmDialog(null, "Do you want to clear all fields?");
            if (ask == JOptionPane.YES_OPTION) {
                product_field.setText("");
                quantity_field.setValue(0);
                price_field.setText("");
            }
            return;
        }
        product_field.setText("");
        quantity_field.setValue(0);
        price_field.setText("");
    }

    public static void main(String args[]) {

        boolean isDarkMode = Themes.Mode.getMode();

        if (isDarkMode) {
            FlatDarculaLaf.setup();
        } else {
            FlatMacLightLaf.setup();
        }

        java.awt.EventQueue.invokeLater(() -> {
            new Order("").setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_product_button;
    private javax.swing.JButton apyment_button;
    private javax.swing.JPanel back_ground_1;
    private javax.swing.JPanel background;
    private javax.swing.JLabel balance_label;
    private javax.swing.JLabel cash_label;
    private javax.swing.JButton clear_button;
    private javax.swing.JButton clear_button1;
    private javax.swing.JPanel fields;
    private javax.swing.JPanel form_holder;
    private javax.swing.JPanel form_holder_1;
    private javax.swing.JLabel grand_total_label;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel label;
    private javax.swing.JPanel labels;
    private javax.swing.JButton modeButton;
    private javax.swing.JTextField price_field;
    private javax.swing.JPanel price_panel;
    private javax.swing.JTextField product_field;
    private javax.swing.JPanel product_panel;
    private javax.swing.JSpinner quantity_field;
    private javax.swing.JPanel quantity_panel;
    private javax.swing.JMenuItem remove_product;
    private javax.swing.JTable table;
    private javax.swing.JPopupMenu tableOrders_popMenu;
    private javax.swing.JPanel tables_panel;
    private javax.swing.JPanel top_labels;
    private javax.swing.JTextField total_field;
    private javax.swing.JPanel total_panel;
    private javax.swing.JPanel trash_panel;
    private javax.swing.JTable trash_table;
    // End of variables declaration//GEN-END:variables
   void glassPane() {
        rootPane.setGlassPane(new JComponent() {

            @Override
            protected void paintComponent(Graphics g) {

                g.setColor(new Color(0, 0, 0, (int) 200));
                g.fillRect(0, 0, getWidth(), getHeight());

            }

        });

    }

    public void onGlass() {
        rootPane.getGlassPane().setVisible(true);
    }

    void updateTheme() {
        if (Themes.Mode.getMode() == false) {
            modeButton.setText("Turn on dark mode");
        } else {
            modeButton.setText("Turn on light mode");
        }
    }

}
