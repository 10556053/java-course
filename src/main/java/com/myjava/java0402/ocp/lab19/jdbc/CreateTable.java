package com.myjava.java0402.ocp.lab19.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author student
 */
public class CreateTable {
    public static void main(String[] args) {
        String sql = "CREATE TABLE Student (\n"
                + "    id INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),\n"
                + "    age INTEGER NOT NULL,\n"
                + "    name VARCHAR(20) NOT NULL\n"
                + ")";
        
        String url = "jdbc:derby://localhost:1527/sample";
        String username = "app";
        String password = "app";
        try(Connection conn = DriverManager.getConnection(url, username, password);
            Statement stmt = conn.createStatement();) {
            int count = stmt.executeUpdate(sql);
            System.out.println("建立 Table : " + count);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
            
}
