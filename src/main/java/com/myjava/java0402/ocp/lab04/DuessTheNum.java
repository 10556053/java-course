/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myjava.java0402.ocp.lab04;

import java.util.Scanner;

/**
 *
 * @author student
 */
public class DuessTheNum {
    public static void main(String[] args) {
        int ans = 26;
        
        int minNum = 0;
        int maxNum = 100;
        
        do{
            Scanner scanner = new Scanner(System.in);
            System.out.println("請輸入猜的數字");
            int myNum= scanner.nextInt();
            
            if (myNum==ans){
                System.out.println("好狗運");
                break;
            }else if (myNum>ans){
                
                maxNum = myNum;
                System.out.println("答案介於" +minNum+"和"+maxNum+"之間");
                continue;
            }else if (myNum<ans){
                minNum = myNum;
                System.out.println("答案介於" +minNum+"和"+maxNum+"之間");
                continue;
            }
            
            
            
        }while (true);
        
    }
}
