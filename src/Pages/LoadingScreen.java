package Pages;

import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import java.sql.Connection;

public class LoadingScreen extends javax.swing.JFrame {
    Connection conn = null;
    public LoadingScreen() {
        initComponents();
        conn = Configuration.JavaConnection.getConnection();
          Services.CreateTable.UsersTable(conn);
            Services.CreateTable.OrdersTable(conn);
            Services.CreateTable.PaymentsTable(conn);
        new Thread(() -> {
            try {
                for (int i = 0; i <= 100; i++) {
                    final int currentProgress = i;

                    loading.setText("Loading... " + currentProgress + "%");

                    Thread.sleep(20);
                }

                loading.setText("Loading complete!");
                Thread.sleep(1000);
                 new Pages.Auth.Login().setVisible(true);
                this.dispose();
            } catch (InterruptedException e) {
                System.err.println(e);
            }
        }).start();
        
     
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        loading = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loading.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        loading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        background.add(loading, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 560, 50));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel2.setText("Configuring files please wait...");
        background.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 270, 50));

        getContentPane().add(background, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(573, 253));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
           boolean isDarkMode = Themes.Mode.getMode();

        if (isDarkMode) {
            FlatDarculaLaf.setup();
        } else {
            FlatMacLightLaf.setup();
        }

        java.awt.EventQueue.invokeLater(() -> {
            new LoadingScreen().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel loading;
    // End of variables declaration//GEN-END:variables
}
