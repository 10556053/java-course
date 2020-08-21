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
public class for_loop_demo {
    public static void main(String[] args) {
        int[] nums = {5,6,7,8};
    
        for (int i = 0 ; i<nums.length ;i++){
            System.out.println(nums[i]);
        }
        System.out.println("----------------------------");
        for(int i :nums){
            System.out.println(i);
        }
        System.out.println("----------------------------");
        System.out.println("----------java 8----------");
        
        Arrays.stream(nums).forEach(x->System.out.println(x));
        System.out.println("----------------------------");
        Arrays.stream(nums).forEach(System.out::print);
    }
    
}
