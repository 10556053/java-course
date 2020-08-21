/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myjava.java0402.ocp.lab19.resultSet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author student
 */
public class CreateRecord {
    public static void main(String[] args) {
        String sql = "INSERT INTO Student(age, name) VALUES(18, 'Helen')";
        String url = "jdbc:derby://localhost:1527/sample";
        String username = "app";
        String password = "app";
        try(Connection conn = DriverManager.getConnection(url, username, password);
            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stmt.executeQuery("SELECT * FROM Student");) {
            
            rs.moveToInsertRow();
            rs.updateInt("age", 10);
            rs.updateString("name", "pcschool");
            rs.insertRow();
            System.out.println("新增完成");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
