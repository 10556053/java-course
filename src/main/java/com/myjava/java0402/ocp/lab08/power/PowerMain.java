/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myjava.java0402.ocp.lab08.power;

import com.myjava.java0402.ocp.lab08.power.interfaces.Price;
import java.util.Arrays;

/**
 *
 * @author student
 */
public class PowerMain {
    public static void main(String[] args) {
        Price[] p ={new Bmw(),new Computer(),new Phone(),new ToyCar()} ;
        
        //取出價錢總和
        int sum = Arrays.asList(p).stream().mapToInt(Price::getPrice).sum();
        System.out.println(sum);
        
        //取出最高價錢
        int maxP = Arrays.asList(p).stream().mapToInt(Price::getPrice).max().getAsInt();
        System.out.println(maxP);
    }
}
