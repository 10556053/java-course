/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myjava.java0402.ocp.lab13;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author student
 */
public class TWSE {
    public static void main(String[] args) throws MalformedURLException, IOException {
        String urlString = "src\\main\\java\\com\\myjava\\java0402\\ocp\\lab13\\BWIBBU_d.csv";
        File file = new File(urlString);
        
        String csvString = new Scanner(file).useDelimiter("\\A").next();
        System.out.println(csvString);
        List<Stock> list = new ArrayList<>();
        String[] rows = csvString.split("\n");
        for (String r:rows){
            if (r.trim().split(",").length==7 &&! r.trim().contains("證券代號")){
                String data  = r.trim().replace("\"","");
                String[] da  =data.trim().split(",");
                
                Stock stock = new Stock();
                
                stock.證券代號 = da[0].trim();
                stock.證券名稱 = da[1].trim();
                stock.殖利率 = da[2].trim();
                stock.股利年度 = da[3].trim();
                stock.本益比 = da[4].trim();
                stock.股價淨值比 = da[5].trim();
                stock.財報年季 = da[6].trim();
                list.add(stock);
                
            }
            
        }
        System.out.println(list);
        
        list.stream()
                .filter(stock -> !stock.本益比.equals("-") && Double.parseDouble(stock.本益比) < 10)
                .filter(stock -> !stock.殖利率.equals("-") && Double.parseDouble(stock.殖利率) > 7)
                .filter(stock -> !stock.股價淨值比.equals("-") && Double.parseDouble(stock.股價淨值比) < 1)
                .forEach(System.out::println);
    }
}
