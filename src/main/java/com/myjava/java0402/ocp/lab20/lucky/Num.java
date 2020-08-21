/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myjava.java0402.ocp.lab20.lucky;

import java.util.Random;

/**
 *
 * @author student
 */
public class Num extends Thread{

    public Num(String string) {
        super(string);
    }

    @Override
    public void run() {
        String tName = Thread.currentThread().getName();
        int count = 0;
        while (true){
            count++;
            int n = new Random().nextInt(1000);
            if (n == 777){
                System.out.printf("娶了%s 次才娶到777",count);
                break;
            }
        }
    }
    
    
    
}
