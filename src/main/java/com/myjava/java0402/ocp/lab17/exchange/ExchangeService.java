/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myjava.java0402.ocp.lab17.exchange;

import com.google.gson.Gson;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.stream.Stream;
import yahoofinance.Stock;
import yahoofinance.YahooFinance;

/**
 *
 * @author student
 */
public class ExchangeService {
    public Exchange[] query(){
        
        String json = null;
        try {
            File file = new File("src\\main\\java\\com\\myjava\\java0402\\ocp\\lab17\\exchange\\ex.json");
            json = new Scanner(file).useDelimiter("//A").next();
        } catch (FileNotFoundException  e) {
            System.out.println("檔案404");
            return null;
        }
        return new Gson().fromJson(json, Exchange[].class);
        
    }
    public Double totalBalance() {
        Exchange[] exchanges = query();
        return Stream.of(exchanges).mapToDouble(e -> e.getBalance()).sum();
    }
    
    public Double exchangeToNTD(Exchange e) {
        Stock stock = null;
        try {
            stock = YahooFinance.get(e.getType() + "TWD=x");
        } catch (IOException ex) {
            System.out.println("無此商品或網路錯誤");
            return 0.0;
        }
        double price = stock.getQuote().getPrice().doubleValue();
        System.out.printf("1元 %s 對台幣 = %.2f\n", e.getType(), price);
        return e.getBalance() * price;
    }

    
}   
