/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myjava.java0402.ocp.lab20;

/**
 *
 * @author student
 */
public class RaceHelper extends Thread{

    public RaceHelper(String string) {
        super(string);
    }
    
    @Override
    public void run() {
        job(); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
    public void job(){
        String tName = Thread.currentThread().getName();
        for (int i = 0;i<100;i++){
            System.out.printf("%s跑了 %d步\n",tName,i);
        }
        System.out.printf("%s到達終點\n",tName);
    }
}
