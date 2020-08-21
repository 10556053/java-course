/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myjava.java0402.ocp.lab13;

import java.util.Stack;

/**
 *
 * @author student
 */
public class StackDemo {
    public static void main(String[] args) {
       Stack<Integer> stack = new Stack<>();
       stack.push(500);
       stack.push(50);
       stack.push(340);
       
        System.out.println(stack);
        
        while (stack.size()>0) {
            int i = stack.pop();
            System.out.printf("%d ,stack剩餘%s\n",i,stack);
        }
     }
}
