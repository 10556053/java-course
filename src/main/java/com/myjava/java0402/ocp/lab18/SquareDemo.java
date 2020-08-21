/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myjava.java0402.ocp.lab18;

/**
 *
 * @author student
 */
public class SquareDemo {
    public static void main(String[] args) {
        Square sq = new Square();
        
        int  s1 = sq.getAngle(23, 45);
        int  s2 = sq.getArea(33, 99, 44);
        
        System.out.println(s1);
        System.out.println(s2);
        
        sq=null ;
        System.gc();
    }
}
