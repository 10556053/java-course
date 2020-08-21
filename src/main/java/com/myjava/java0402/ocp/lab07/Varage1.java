/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myjava.java0402.ocp.lab07;

import java.util.stream.IntStream;

/**
 *
 * @author student
 */
public class Varage1 {
    public static void main(String[] args) {
        
        System.out.println(add(10,20));
        
    }
    //省略號是最後沒條件了才使用
    public static int add(int... nums) {
        return  IntStream.of(nums).sum();
    }
    // 會先找精準滿足的
    public static int multiply(int x,int y) {
        return  x*y;
    }
    
}
