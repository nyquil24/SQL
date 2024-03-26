package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
    String dburl = "jdbc:mysql://localhost:3306/classicmodels";
    String user = "root";
    String password = "connection";
    try{
        Class.forName("com.mysql.cj.jdbc.Driver"); //optional
        Connection connection = DriverManager.getConnection(dburl, user, password);
    }
    catch(SQLException e){
        e.printStackTrace();
    } catch (ClassNotFoundException e) {
        throw new RuntimeException(e);
    }
    }
}