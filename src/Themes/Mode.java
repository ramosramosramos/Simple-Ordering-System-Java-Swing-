/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Themes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author User
 */
public class Mode {

    static Connection conn = Configuration.JavaConnection.getConnection();

    public static Boolean getMode() {

        try (PreparedStatement pst = conn.prepareStatement("Select mode from themes where id = ?")) {
            pst.setInt(1, 1);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
               return rs.getString("mode").equals("darkmode");
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return null;

    }
}
