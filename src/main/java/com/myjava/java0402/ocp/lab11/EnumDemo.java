/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myjava.java0402.ocp.lab11;

/**
 *
 * @author student
 */
enum Sex{
    男生,女生
    
}
public class EnumDemo {
    public static void main(String[] args) {
        checkSex(Sex.男生);
        //讓錯誤在撰寫時就被抱錯
        //用enum來避免傳入錯誤的職
        checkSex(Sex.女生);
    }
    
    public static void checkSex(Sex s){
        switch (s){
            case 男生:
                System.out.println("玩槍");
                break;
            case 女生:
                System.out.println("娃娃玩");
                break;
        }
    }
}
