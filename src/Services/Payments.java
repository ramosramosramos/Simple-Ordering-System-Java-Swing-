package Services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JLabel;

public class Payments {

    static Connection conn = Configuration.JavaConnection.getConnection();
    static PreparedStatement pst;
    static ResultSet rs;

    public static void index(JLabel grandTotal_label, JLabel cash_label, JLabel balance_label) {
    
        try {

            pst = conn.prepareStatement("Select sum(cash) as 'cash' from payments");
            rs = pst.executeQuery();
            PreparedStatement getGrandTotal = conn.prepareStatement("Select sum(total) as 'grand_total' from orders");
            ResultSet rsGrandTotal = getGrandTotal.executeQuery();
            while (rs.next() && rsGrandTotal.next()) {
                if (rs.getInt("cash") != 0) {
                    double balance = rs.getDouble("cash") - rsGrandTotal.getDouble("grand_total");
                    balance_label.setText(String.valueOf(balance));
                }

                cash_label.setText(rs.getString("cash"));
                grandTotal_label.setText(rsGrandTotal.getString("grand_total"));

            }
     

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }

    public static void store(String cash) {
        try {
            pst = conn.prepareStatement("Insert into payments(cash) values(?)");
            pst.setString(1, cash);
            pst.executeUpdate();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
