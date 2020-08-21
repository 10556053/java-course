/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myjava.java0402.ocp.lab17;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author student
 */
public class CalcDiv {
    public static void main(String[] args) {
        int x =10;
        int[] y  = {2,5,0};
        Scanner sc = new Scanner(System.in);
        System.out.println("選分母 ->0，得2，->1，得2，->2，得2，");
        
        try {
            int index = sc.nextInt();
            int ans = x / y[index];
            System.out.printf("%d / %d = %d", x, y[index], ans);
        } catch (ArithmeticException e) {
            System.out.println("數學錯誤");
            
        }catch(ArrayIndexOutOfBoundsException b){
            System.out.println("陣列錯誤");
        }catch(InputMismatchException m){
            System.out.println("型態錯誤");
        }catch(Exception u){
            u.printStackTrace();
        }
        
    }
            
}
