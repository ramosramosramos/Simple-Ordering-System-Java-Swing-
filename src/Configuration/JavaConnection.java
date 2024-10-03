
package Configuration;


import java.sql.*;

public class JavaConnection {

    public static Connection getConnection() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/catering_db", "root", "");
  
            Services.CreateTable.Themestable(conn);
            return conn;
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println(e);
        }
        return null;

    }
}
