/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myjava.java0402.ocp.lab05;
import java.io.Console;
/**
 *
 * @author student
 */
public class ConsoleTest {
    public static void main(String[] args) {
        
        Console cs = System.console();
        System.out.println("請輸入密碼");
        
        String s1 = cs.readLine();
        System.out.println("你輸入的密碼為"+s1);
        
        System.out.println("請輸入密碼");
        char[] s2 = cs.readPassword();
        System.out.println("您輸入的密碼是"+new String(s2));
    }
}
