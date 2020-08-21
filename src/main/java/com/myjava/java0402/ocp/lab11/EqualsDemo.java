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
public class EqualsDemo {
    public static void main(String[] args) {
        Pen p1 = new Pen("Red",20);
        Pen p2 = new Pen("YE;;OW", 50);
        
        System.out.println(p1);
        System.out.println(p2);
        
        Pen redpen1 = new Pen("red", 10);
        Pen redpen2 = new Pen("red", 10);
        
        
        //雙==代表用記憶體位址判斷
        System.out.println(redpen1==redpen2);
        System.out.println(redpen1.equals(redpen2));
        
        Pen redpen3 = new Pen("red", 10);
        Pen redpen4 = new Pen("red", 3);
        
        
        //用記憶體位址判斷
        System.out.println(redpen3==redpen4);
        //被我們自定義的equals擋掉了
        System.out.println(redpen3.equals(redpen4));
        
        
        Pen r5 =new Pen("rose",10);
        Pen r6 = new Pen("rose",10);
        
        System.out.println(r5.hashCode());
        System.out.println(r6.hashCode());
    }
}
