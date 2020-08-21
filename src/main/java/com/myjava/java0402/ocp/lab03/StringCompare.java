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
public class StringCompare {
    public static void main(String[] args) {
        char[] chars = {'j','a','v','a'};
        String s1 = new String("java");
        String s2 = new String (chars);
        String s3 = "java";
        String s4 = "java";
        
        System.out.printf("%s %s %s %s \n",s1,s2,s3,s4);
        
        System.out.println(s1==s2);//是否指向同一個實體(比較stack的內容)
        System.out.println(s1.equals(s2));//有分大小寫的比較
        System.out.println(s3 == s4);//是否指向同一個實體(比較stack的內容)
        System.out.println(s3.equals(s4));
        System.out.println(s3.equalsIgnoreCase(s4));//不分大小寫
        
        System.out.println(s2==s4);
        System.out.println(s2.equals(s4));
    }
}
