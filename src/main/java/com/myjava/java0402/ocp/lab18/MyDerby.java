/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myjava.java0402.ocp.lab18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author student
 */
public class MyDerby {
    public static void main(String[] args) {
        //取得資料資訊
        String url="jdbc:derby://localhost:1527/sample";
        String user = "app";
        String password = "app";
        
        String sql = "SELECT * FROM product";
        
        try(Connection conn = DriverManager.getConnection(url,user,password);) {//資料庫連線
            Statement stmt = conn.createStatement();
            ResultSet re = stmt.executeQuery(sql);
            
            while(re.next()){
                int id = re.getInt("PRODUCT_ID");
                double cost =re.getDouble("PURCHASE_COST");
                int quantity = re.getInt("QUANTITY_ON_HAND");
                
                String des = re.getString("DESCRIPTION");
                
                
                System.out.printf("產品id為:%d ，產品成本為:%d ，產品持倉量為:%d 產品描述: %s \n",id,cost,quantity,des);
            }
            
            System.out.println(!conn.isClosed());
        } catch (Exception e) {
            System.out.println("error");
        }
        
    }
}
