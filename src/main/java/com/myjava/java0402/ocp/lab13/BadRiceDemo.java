/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myjava.java0402.ocp.lab13;

import com.google.gson.Gson;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author student
 */
public class BadRiceDemo {
    public static void main(String[] args) throws MalformedURLException, IOException {
       
        // 1. 抓取資料源
        List<BadRice> list = new LinkedList<>();
        File file = new File("src\\main\\java\\com\\myjava\\java0402\\ocp\\lab13\\urls.txt");
        String urls  = new Scanner(file).useDelimiter("\\A").next();
        
        for (String url:urls.split("\n")){
            addData( url.trim(),list );
        }
        
       
        
        
        
        list.stream()
                .filter(Bad->Bad.品名.contains("台農"))
                
                .forEach(Bad->System.err.printf("%s ,%s \n",Bad.品名,Bad.不合格原因));
        
        
        
    }

    private static void addData(String urlpath ,List mylist) throws MalformedURLException, IOException {
        // 1. 抓取資料源
        
        
        // 2. 將 json 透過 Gson 轉成 BadRice[]
        BadRice[] badRice = new Gson().fromJson(urlpath, BadRice[].class);
        // 將 rices 加入到 list 容器
        Collections.addAll(mylist, badRice);
    }
    
    
}
