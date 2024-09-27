/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author User
 */
public class CreateTable {

    public static void UsersTable(Connection conn) {
        try {
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

        } catch (Exception e) {
            System.err.println(e);
        }
    }
    public static void OrdersTable(Connection conn) {
        try {
            PreparedStatement create_user = conn.prepareStatement("Create table if not exists orders("
                    + "id int primary key auto_increment,"
                    + "product varchar(255),"
                    + "quantity int not null,"
                    + "price int not null,"
                    + "total decimal(10,2) AS (quantity * price) STORED)");
            create_user.executeUpdate();
            System.out.println("Table orders configuration is success");

        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
