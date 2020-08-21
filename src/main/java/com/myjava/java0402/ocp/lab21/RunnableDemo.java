/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myjava.java0402.ocp.lab21;

import java.util.Date;
import java.util.Random;

/**
 *
 * @author student
 */
public class RunnableDemo {
    public static void main(String[] args) {
         Runnable r1 = () -> {System.out.println(new Date());};
         Runnable r2 = () -> {System.out.println(new Random().nextInt(100));};
         
         Thread t = new Thread(r2);
         t.start();
         
    }
}
