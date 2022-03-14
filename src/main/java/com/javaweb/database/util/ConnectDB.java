package com.javaweb.database.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {
    private static Connection con;

    public static Connection connect() {
        try {
            String url = "jdbc:mysql://localhost:3306/javaweb";
            String user = "root";
            String password = "";

            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException e) {
            //  e.printStackTrace();
        } catch (SQLException e) {
            //e.printStackTrace();
        }
        return con;
    }
}
