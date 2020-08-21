/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myjava.java0402.ocp.lab02;

import java.util.Random;

/**
 *
 * @author student
 */
public class PokerDemo {
    
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    
    public static void main(String[] args) {
        String[] porker ={
            "A","2","3","4","5","6","7","8","9","10","J","Q","K",
            "A","2","3","4","5","6","7","8","9","10","J","Q","K",
            "A","2","3","4","5","6","7","8","9","10","J","Q","K",
            "A","2","3","4","5","6","7","8","9","10","J","Q","K"
        }; 
        print(porker);
        shuffel(porker,1000);
        double sum = getScore(0, porker)+getScore(1, porker)+getScore(2, porker);
            System.out.println(sum);
    }
    
    public static void print(String[] poker){
        for (String p : poker){
            String color = p.equals("J") || p.equals("Q") || p.equals("K") ?ANSI_RED : ANSI_BLACK ;
            System.out.print(color+p+"");
        }
        System.out.println("");
    }
    
    public static void shuffel(String[] poker, int count) {
        Random r = new Random();
        for (int i = 0; i < count; i++) {
            int pos1 = r.nextInt(poker.length);
            int pos2 = r.nextInt(poker.length);

            String pos1Value = poker[pos1];
            String pos2Value = poker[pos2];

            poker[pos1] = pos2Value;
            poker[pos2] = pos1Value;
            
      
        }
        for(String i :poker){
            System.out.print(i);
        }
        System.out.println("");
    }
    
    public static double getScore( int pos,String[] poker) {
        String pokerValue = poker[pos];
        switch(pokerValue){
            case "A":
                return 1;
            case "J":
            case "Q":
            case "K":
                return 0.5;
            default://除了A,J,Q,K以外的,剩下數字
                return  Integer.parseInt(pokerValue);
        }
    }
}
