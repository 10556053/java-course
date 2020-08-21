/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myjava.java0402.ocp.lab11;

import java.util.HashSet;

/**
 *
 * @author student
 */
public class SetDemo {
    public static void main(String[] args) {
        
        //為了限定set裡面的物品種類
        //加上<String> ,稱為泛行,如次h不能add(int)
        HashSet<String> h = new HashSet<>();
        h.add("英文");
        h.add("國文");
        //h.add(1000);
        h.add("數學");
        System.out.println(h);
                
        
        HashSet<Pen> h2 = new   HashSet<>();
        h2.add(new Pen("黃色", 65));
        h2.add(new Pen("黃色", 65));
        h2.add(new Pen("綠色", 95));
        h2.add(new Pen("綠色", 65));
        
        System.out.println(h2);
        
        //java8寫法
        //用一句柿子抓取所有的資料
        h2.forEach(pen->System.out.println(pen.getColor()));
    }
}
