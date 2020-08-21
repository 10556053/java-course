/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myjava.java0402.ocp.lab03;

/**
 *
 * @author student
 */
public class PrimeNumberArray {
    public static void main(String[] args) {
        int[] nums ={47,45,17,23,98};
        
        for (int i:nums){
            if(isPrime(i)==true){
                System.out.println(i);
            }
        }
    }
    public static boolean isPrime(int i){
        
        for(int j = 2;j<=i/2; j++){
            //如果有數字能整除
            if (i%j==0){
                return false;//回傳false()不是植樹
            }
        }
        
        return true;//是植樹
    }
}
