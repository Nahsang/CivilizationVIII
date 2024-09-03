package com.GroupProject.utill;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectorBuilder {

    public static Connection getConnection() {
        Connection conn = null;

        final String DB_NAME = "CivilizationVI";
        final String DB_URL = "jdbc:mysql://localhost:3306/"+DB_NAME;
        final String DB_USERNAME = "root";
        final String DB_PASSWORD = "Thehoe117@";

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
        }catch(ClassNotFoundException | SQLException e){
            System.out.println(e.getMessage());
        }
        return conn;
    }
}