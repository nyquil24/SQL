package org.example;

import java.sql.*;

public class ExamplePrepareStat {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/classicmodels";
        final String USER = "root";
        final String PASS = "connection";
        Connection conn = DriverManager.getConnection(url, USER , PASS);
        String SelectSQL = "select * from employees where employeeNumber = ?";
        PreparedStatement mystmt = conn.prepareStatement(SelectSQL);
        mystmt.setInt(1, 1002);
        ResultSet result = mystmt.executeQuery();
            while(((ResultSet) result).next()){
                String name = result.getString("firstName");
                String email = result.getString("email");
                System.out.println(name + " | " + email);
            }
    }
}
