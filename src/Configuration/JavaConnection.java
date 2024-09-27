
package Configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author User
 */
public class JavaConnection {

    public static Connection getConnection() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/catering_db", "root", "");
            Services.CreateTable.UsersTable(conn);
            Services.CreateTable.OrdersTable(conn);
            return conn;
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println(e);
        }
        return null;

    }
}
