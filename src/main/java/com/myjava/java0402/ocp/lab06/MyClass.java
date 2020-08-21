/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myjava.java0402.ocp.lab06;

/**
 *
 * @author student
 */
public class MyClass {
    int x = 10;
    static int y = 20;
    
    void add(){
        x++;
    }
    
    static void print(){
        System.out.println("y="+y);
        //System.out.println("x="+x);//non static var x cannot berefferenced from a static context
    }
}
