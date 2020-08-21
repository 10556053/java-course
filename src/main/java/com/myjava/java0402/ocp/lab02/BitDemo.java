/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myjava.java0402.ocp.lab02;

/**
 *
 * @author student
 */
public class BitDemo {
    public static void main(String[] args) {
        int x = 13;
        System.out.println(Integer.toBinaryString(x));//將數字轉成二進制的string
        int z = -14;
        System.out.println(Integer.toBinaryString(z));//將數字轉成二進制的string
        
        int y = 0b1101;//0代表正數, b = binary 
        System.out.println(y);//將二進制轉成int
    }
    
}
