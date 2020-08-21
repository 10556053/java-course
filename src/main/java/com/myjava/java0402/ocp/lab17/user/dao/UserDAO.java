/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myjava.java0402.ocp.lab17.user.dao;

/**
 *
 * @author student
 */
import com.google.gson.Gson;
import com.myjava.java0402.ocp.lab17.user.po.Users;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
//把使用者資料從資料庫抓出來
public class UserDAO {
    public Users[] query(){
        File file = new File("src\\main\\java\\com\\myjava\\java0402\\ocp\\lab17\\user\\db\\users.json");
        String json = null;
        try {
            
            json = new Scanner(file).useDelimiter("//A").next();
        } catch (FileNotFoundException ex) {
            System.out.println("檔案位址錯誤");
            return  null;
        }
        Users[]user = new Gson().fromJson(json, Users[].class);
        return user;
    } 
}
