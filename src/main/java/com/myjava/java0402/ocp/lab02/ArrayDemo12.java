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
public class ArrayDemo12 {
    public static void main(String[] args) {
        int[] score = {100,90,80};
        for (int s= 0;s<score.length;s++){
            System.out.print(score[s]+"\t");
        }
        System.out.println("");
        
        for (int x = (score.length-1);x>=0;x--){
            System.out.print(score[x]+"\t");
        }
        System.out.println("");
        int pos1 = 0;
        int pos2 = 1;
        
        int pos1Value =score[pos1];
        int pos2Value = score[pos2];
        
        score[pos1]= pos2Value;
        score[pos2]= pos1Value;
        
        for(int q:score){
            System.out.println(q);
        }
                
    }
}
