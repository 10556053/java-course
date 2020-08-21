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
public class StringBiulderDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("java").append("python").append("minecraft");
        String s ="javapythonminecraft";
        System.out.println(sb);//相等於sb.toString()
        System.out.println(s);
        System.out.println(sb.equals(s));//此時的sb是StringBuilder物件
        System.out.println(sb.toString().equals(s));//此時的sb是String
    }
}
