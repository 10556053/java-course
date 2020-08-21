/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myjava.java0402.ocp.lab04;

import java.util.Arrays;

/**
 *
 * @author student
 */
public class ForEachDemo {
    public static void main(String[] args) {
        int[][] nums ={{10,20},{30,40}};
        int sum = 0;
        for(int [] n : nums){
            for(int i :n){
                sum+=i;
            }
        }
        
        System.out.println(sum);
        
        int sum2 = Arrays.stream(nums)
                .flatMapToInt(num->Arrays.stream(num))
                .sum()
                ;
        System.out.println(sum2);
        
    }
}
