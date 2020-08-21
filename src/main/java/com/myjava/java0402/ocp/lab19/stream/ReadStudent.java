/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myjava.java0402.ocp.lab19.stream;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import static java.util.stream.Collectors.toList;

/**
 *
 * @author student
 */
public class ReadStudent {
    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");
             Statement statement = conn.createStatement();
             ResultSet rs = statement.executeQuery("SELECT id, name, age FROM Student")) {
            
            List<Student> list = StreamHelper.stream(rs)
                    .map(r -> new Student(r.get("ID", Integer.class), r.get("AGE", Integer.class), r.getString("NAME")))
                    .collect(toList());
            
            System.out.println(list);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
