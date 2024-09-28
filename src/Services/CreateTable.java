package Services;

import java.sql.*;

public class CreateTable {

    public static void UsersTable(Connection conn) {
        try {
            PreparedStatement create_user = conn.prepareStatement("Create table if not exists users("
                    + "id int primary key auto_increment,"
                    + "name varchar(255),"
                    + "username varchar(255) unique,"
                    + "password varchar(255),"
                    + "role varchar(50) default 'seller',"
                    + "created_at timestamp default current_timestamp"
                    + ")");
            create_user.executeUpdate();
            System.out.println("Table users configuration is success");

        } catch (Exception e) {
            System.err.println(e+"users");
        }
    }

    public static void OrdersTable(Connection conn) {
        try {
            PreparedStatement create_user = conn.prepareStatement("Create table if not exists orders("
                    + "id int primary key auto_increment,"
                    + "product varchar(255),"
                    + "quantity int not null,"
                    + "price int not null,"
                    + "total decimal(10,2) AS (quantity * price) STORED,"
                    + "deleted_at varchar(255) default 'null')");
            create_user.executeUpdate();
            System.out.println("Table orders configuration is success");
        } catch (Exception e) {
            System.err.println(e.getMessage()+"orders");
        }
    }

    public static void PaymentsTable(Connection conn) {
        try {
            PreparedStatement create_payments = conn.prepareStatement("Create table if not exists payments("
                    + "id int primary key auto_increment,"
                    + "cash int not null)");
            create_payments.executeUpdate();
            System.out.println("Table payments configuration is success");

        } catch (Exception e) {
            System.err.println(e.getMessage()+"payments");
        }
    }
    
    
    public static void Themestable(Connection conn){
              try {
            PreparedStatement create_payments = conn.prepareStatement("Create table if not exists themes("
                    + "id int primary key auto_increment,"
                    + "mode varchar(20) default 'darkmode')");
            create_payments.executeUpdate();
            
            System.out.println("Table themes configuration is success");
            
            PreparedStatement insertMode = conn.prepareStatement("Insert into themes(mode) values(?)");
            insertMode.setString(1, "darkmode");
            insertMode.executeUpdate();

        } catch (Exception e) {
            System.err.println(e.getMessage()+"themes");
        }
    }
}
