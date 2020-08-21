/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myjava.java0402.ocp.lab04;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author student
 */
public class ROC_Id_checker {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入身分證");
        
        String userID= scanner.nextLine();
        
        int[] checklist={1,9,8,7,6,5,4,3,2,1,1};
        int[] idnums = new int[11];
        
        for (int i = 0;i<userID.length();i++){
            switch(userID.charAt(i)){
                case 'A':
                    idnums[0] = 1;idnums[1] = 0;
                    break;
                case 'M':
                    idnums[0] = 2;idnums[1] = 1;
                    break;    
                default://0~9
                    idnums[i+1] = userID.charAt(i) -48 ;//char的1 =49, char的2 =50, 所以要剪掉48
                    
            }
            
        }
        Arrays.stream(idnums).forEach(System.out::print);
        System.out.println();
        
        //計算 idnums * checklist
        int sum = 0;
        for(int i = 0;i<idnums.length; i++){
            sum+=idnums[i]*checklist[i];
            
        }
        
        System.out.println(sum);
        
        System.out.println(sum % 10 == 0 ? "合法" : "不合法");
        
        
    }
}
