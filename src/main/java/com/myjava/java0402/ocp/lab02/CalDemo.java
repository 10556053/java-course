/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myjava.java0402.ocp.lab02;

import java.math.BigDecimal;

/**
 *
 * @author student
 */
public class CalDemo {
    public static void main(String[] args){
        int x = 1+1+1;
        System.out.println(x == 3);
        
        double y = 0.1+0.1+0.1;
        System.out.println(y);//只能算出近似值，舊系統\
        System.out.println(y == 0.3);
        
        BigDecimal b1 = new BigDecimal("0.1");
        BigDecimal b2 = new BigDecimal("0.1");
        BigDecimal b3 = new BigDecimal("0.1");
        
        BigDecimal b4 = b1.add(b2).add(b3);
        System.out.println(b4);
        System.out.println(b4.doubleValue() == 0.3);
        
    }
}
