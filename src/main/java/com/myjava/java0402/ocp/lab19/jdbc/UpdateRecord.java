/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myjava.java0402.ocp.lab19.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author student
 */
public class UpdateRecord {
    public static void main(String[] args) {
        String sql = "UPDATE Student SET age = 19 WHERE id = 1";
        String url = "jdbc:derby://localhost:1527/sample";
        String username = "app";
        String password = "app";
        try(Connection conn = DriverManager.getConnection(url, username, password);
            Statement stmt = conn.createStatement();) {
            int count = stmt.executeUpdate(sql);
            System.out.println("修改資料列 : " + count);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}
