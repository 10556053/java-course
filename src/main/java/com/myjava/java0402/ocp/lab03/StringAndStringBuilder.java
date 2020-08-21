/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myjava.java0402.ocp.lab03;

/**
 *
 * @author student
 */
public class StringAndStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("java");
        add(sb);
        System.out.println(sb);
        
        String s = "java";
        add(s);
        System.out.println(s);
                
    }
    public static String add(String s2) {
        s2 =s2.concat("9");
        return s2;
    }
    public static void add(StringBuilder sb2) {
        sb2.append("8");
    }
}
