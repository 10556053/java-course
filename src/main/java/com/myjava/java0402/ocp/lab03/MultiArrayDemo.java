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
public class MultiArrayDemo {
    public static void main(String[] args) {
       int [][] scores = {{100,80,90},{60,70,52}};
        System.out.println(scores);
        
        //for loop
        for(int i = 0; i<=scores.length;i++){
            int[] x = scores[i];
            System.out.println(x);
            for(int k =0;k<scores.length;k++){
                System.out.println(scores[i][k]);
            }
         }
        
        //for/in(each)
        
        for(int[]x:scores){
            System.out.println(x);
            for(int i:x){
                System.out.println(i);
            }
        }
    }
    
}
