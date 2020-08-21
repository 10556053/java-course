/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myjava.java0402.ocp.lab16;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author student
 */
public class InputNumberException {
    public static void main(String[] args) {
        System.out.println("請輸入數字");
        Scanner scanner =new Scanner(System.in);
        try {
            int num = scanner.nextInt();
            System.out.println("您輸入的是"+num);
        } catch (InputMismatchException e) {
            System.out.println("錯誤訊息"+e);
            System.out.println("充新輸入");
            main(null);
        }
        
    }
}
