package Services;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;

public class Orders {

    static Connection conn = Configuration.JavaConnection.getConnection();
    static PreparedStatement pst;
    static ResultSet rs;

    public static void update(JTable table) {
        try {
            pst = conn.prepareStatement("Select"
                    + " product as 'Product',"
                    + "quantity as 'Qauntity',"
                    + "price as 'Price',"
                    + " total as 'Total'"
                    + " from orders where deleted_at = 'null' ");
            rs = pst.executeQuery();
            table.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }

    public static void store(String product, String quantity, String price) {
        try {
            pst = conn.prepareStatement("Insert into orders(product,quantity,price) values(?,?,?)");
            pst.setString(1, product);
            pst.setString(2, quantity);
            pst.setString(3, price);
            pst.executeUpdate();

        } catch (Exception e) {
            System.err.println(e);
        }

    }

    public static void destroyAll() {
        int ask = JOptionPane.showConfirmDialog(null, "Are you want to delete all orders?");

        if (ask == JOptionPane.YES_OPTION) {
            try {
                pst = conn.prepareStatement("Truncate table orders");
                pst.executeUpdate();

            } catch (SQLException | HeadlessException e) {
                System.err.println(e);
            }
        }

    }
    
    
    public static void  updateTheme(String name){
        try {   
            pst = conn.prepareStatement("Update themes set mode =? where id = ?");
            pst.setString(1, name);
            pst.setInt(2, 1);
            pst.executeUpdate();
            
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        
    }
    

}
