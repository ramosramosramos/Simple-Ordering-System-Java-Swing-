package Services;

import java.awt.HeadlessException;
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;

public class Orders {

    static Connection conn = Configuration.JavaConnection.getConnection();
    static PreparedStatement pst;
    static ResultSet rs;
    static SimpleDateFormat format = new SimpleDateFormat("mm,MM,yyy");

    static String date;

  

    public static void update(JTable table) {
        try {
            pst = conn.prepareStatement("Select id as 'Product ID', "
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

    public static void updateTrash(JTable table) {
        try {
            pst = conn.prepareStatement("Select id as 'Product ID',"
                    + " product as 'Product',"
                    + "quantity as 'Qauntity',"
                    + "price as 'Price',"
                    + " total as 'Total'"
                    + " from orders where deleted_at != 'null' ");
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
 date = format.format(new Date());
        int ask = JOptionPane.showConfirmDialog(null, "Are you want to delete all orders?");

        if (ask == JOptionPane.YES_OPTION) {
            try {
                pst = conn.prepareStatement("Update orders set deleted_at =?");
                pst.setString(1, date);
                pst.executeUpdate();

                PreparedStatement delete_trash = conn.prepareStatement("Truncate table payments");
                delete_trash.executeUpdate();
            } catch (SQLException | HeadlessException e) {
                System.err.println(e);
            }
        }

    }

    public static void updateTheme(String name) {
        try {
            pst = conn.prepareStatement("Update themes set mode =? where id = ?");
            pst.setString(1, name);
            pst.setInt(2, 1);
            pst.executeUpdate();

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }

    public static void destroy(String id) {
         date = format.format(new Date());
        try {
          
            pst = conn.prepareStatement("Update  orders set deleted_at = ? where id =? ");
            pst.setString(1, date);
            pst.setString(2, id);
            pst.executeUpdate();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }
    public static void restore(String id) {
         
        try {
          
            pst = conn.prepareStatement("Update  orders set deleted_at = ? where id =? ");
            pst.setString(1, "null");
            pst.setString(2, id);
            pst.executeUpdate();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }

}
