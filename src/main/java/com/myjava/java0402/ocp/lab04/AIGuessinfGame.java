/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myjava.java0402.ocp.lab04;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author student
 */
public class AIGuessinfGame {
    public static void main(String[] args) {
        //int ans = new Random().nextInt(99)+1;
        int ans = 55;
        int minNum = 0;
        int maxNum = 100;
        
        do{
            
            //user猜
            Scanner scanner = new Scanner(System.in);
            System.out.println("請輸入猜的數字");
            int myNum= scanner.nextInt();
            
            if (myNum==ans){
                System.out.println("好狗運");
                break;
            }else if (myNum>ans){
                if(myNum>maxNum){
                    myNum = maxNum;
                }else{
                    maxNum = myNum;
                }
                
                System.out.println("答案介於" +minNum+"和"+maxNum+"之間");
                
            }else if (myNum<ans){
                if(myNum<minNum){
                    myNum = minNum;
                }else{
                    minNum = myNum;
                }
                System.out.println("答案介於" +minNum+"和"+maxNum+"之間");
                
            }
            
            //pc猜
            myNum =minNum + 1+ new Random().nextInt(maxNum - minNum - 1);//假設 (user猜的) minNum是45,電腦會從45開始，加上 ((100-45-1) = 54) 0~54 中間任一數
            
            System.out.printf("pc 猜: %d\n", myNum);
            if (myNum==ans){
                System.out.println("pc好狗運");
                break;
            }else if (myNum>ans){
                if(myNum>maxNum){
                    myNum = maxNum;
                }else{
                    maxNum = myNum;
                }
                
                System.out.println("答案介於" +minNum+"和"+maxNum+"之間");
                
            }else if (myNum<ans){
                if(myNum<minNum){
                    myNum = minNum;
                }else{
                    minNum = myNum;
                }
                System.out.println("答案介於" +minNum+"和"+maxNum+"之間");
                
            }
            
            
            
           
            
            
        }while (true);
        
    }
}
