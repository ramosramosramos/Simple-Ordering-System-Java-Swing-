package AuthenticationServices;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Verify {

    static Connection conn = Configuration.JavaConnection.getConnection();
    static PreparedStatement pst;

    public static void login(String useranme, String password, JLabel error) {
        String hashPassword = Tools.Password.hashPassword(password);
        try {

            pst = conn.prepareStatement("Select username,password from users where username=? and password =?");
            pst.setString(1, useranme);
            pst.setString(2, hashPassword);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Login successfully");

            } else {
                error.setText("Invalid Credentials");
            }

        } catch (SQLException | HeadlessException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void register(String name, String username, String password) {
        String hashPaswword = Tools.Password.hashPassword(password);
        try {
           
            
            pst = conn.prepareStatement("Insert into users(name,username,password) values(?,?,?)");
            pst.setString(1, name);
            pst.setString(2, username);
            pst.setString(3, hashPaswword);
            pst.executeUpdate();
        } catch (SQLException | HeadlessException e) {
            System.err.println(e.getMessage());
        }
    }
    
       public static Boolean isExistUsername(String username){
           try {
                 PreparedStatement check_username = conn.prepareStatement("Select username from users where username = ?");
             check_username.setString(1, username);
             ResultSet exists = check_username.executeQuery();
             if(exists.next()){
                 JOptionPane.showMessageDialog(null, "Your username is already exist,please try other username");
                 return true;
             }else{
                 return false;
             }
           } catch (SQLException | HeadlessException e) {
               System.out.println(e.getMessage());
           }
           
        return null;
        
    }

}
