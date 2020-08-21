/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myjava.java0402.ocp.lab06;

import java.util.IntSummaryStatistics;
import java.util.stream.Stream;

/**
 *
 * @author student
 */
public class DrinkDemo {
    public static void main(String[] args) {
        Drink d = new Drink("芭樂汁", 60, 600);
        Drink d2 = new Drink("蘋果汁", 80, 150); 
        Drink d3 = new Drink("milk");
        d3.price = 100;
        d3.stock = 50;
        d.sell(60);
        d2.sell(80);
        System.out.println(d.toString());
        System.out.println(d2);
        System.out.println(d3);
        
        //總庫存成本
        IntSummaryStatistics stat= Stream.of(d,d2,d3)
                .mapToInt(s->s.price*s.stock)
                .summaryStatistics();
        
        System.out.println(stat.getAverage());
        System.out.println(stat.getCount());
        System.out.println(stat.getSum());
    }
    
    
    
    
}
