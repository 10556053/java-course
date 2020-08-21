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
public class Varage {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9};
        System.out.println(add(nums));
        
        
        System.out.println(add(1,2,3,65,87));
        System.out.println(add(9,2,23,65,99));
        System.out.println(add(1,87,3,65,45));
        
    }
    // ...是省略號，不管今天傳一個 多個值 或是陣列，都可以
    public static int add(int... nums) {
        return  IntStream.of(nums).sum();
    }
    
}
