/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myjava.java0402.ocp.lab21;

/**
 *
 * @author student
 */
public class RunnableRriority {
    public static void main(String[] args) {
        Runnable r1 = ()->{System.out.println("鎂鎂");};
        Runnable r2 = ()->{System.out.println("鎂鎂2號");};
        
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        
        t1.setPriority(1);
        //權限越高越大
        t2.setPriority(10);
        
        
        t1.start();
        t2.start();
        
    }
}
