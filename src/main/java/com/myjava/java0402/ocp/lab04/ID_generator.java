/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myjava.java0402.ocp.lab04;

import java.util.Random;

/**
 *
 * @author student
 */
public class ID_generator {
    public static void main(String[] args) {
        
        while(true){
            String id = getId();
            System.out.print(id + " ");
            boolean idCheck = check(id);
            System.out.println(idCheck);
            if(idCheck == true){
                break;
            } 
        }
        
        
    }
    
    public static String getId(){
        //先給身分證號第一個字母
        String id = "A";
        //再來定義身分證號下一個字母:性別
        id += new Random().nextInt(2) + 1;
        for (int i = 0; i<8;i++){
            id+=new Random().nextInt(10);
            
        }
        return id;
    }
    
    public static boolean check( String id){
        String userID = id;
        
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
        
        int sum = 0;
        for(int i = 0;i<idnums.length; i++){
            sum+=idnums[i]*checklist[i];
            
        }
        
        System.out.println(sum);
        
        return sum % 10 == 0 ? true : false;
    }
}
