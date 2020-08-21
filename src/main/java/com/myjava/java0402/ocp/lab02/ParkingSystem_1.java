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
public class ParkingSystem_1 {
    public static void main(String[] args) {
        int parking = 0b101010;
        int no = 5;
        System.out.println("no="+no);
        
        no =(int)Math.pow(2,no);
        
        System.out.println(no);//2的2次方
        
        int check = parking & no;
        
        System.out.println(check > 0 ? "可移車" : "不可移車");
        
        if(check >0){
            parking-=no;
            System.out.println("車位狀態"+Integer.toBinaryString(parking));
        }
        
    }
}
