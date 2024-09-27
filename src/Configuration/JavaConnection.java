
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

            PreparedStatement create_user = conn.prepareStatement("Create table if not exists users("
                    + "id int primary key auto_increment,"
                    + "name varchar(255),"
                    + "username varchar(255) unique,"
                    + "password varchar(255),"
                    + "role varchar(50) default 'seller',"
                    + "created_at   timestamp default current_timestamp"
                    + ")");
            create_user.executeUpdate();
            System.out.println("Table users configuration is success");

            return conn;
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println(e);
        }
        return null;

    }
}
