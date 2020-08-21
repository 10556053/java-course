/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myjava.java0402.ocp.lab22;

/**
 *
 * @author student
 */
public class Put {
    //syncronized就像一把鎖(lock)，在前一個人完事出來之前，別人都不能存取
    synchronized void put(){
        String name = Thread.currentThread().getName();
        System.out.printf("%s進入到put() \n",name);
        while (true); 
    }
    void print(){
        String name = Thread.currentThread().getName();
        System.out.printf("%s進入到put() \n",name);
        
    }
    public static void main(String[] args) {
        Put p = new Put();
        Runnable r= ()->p.print();
        Runnable r2= ()->p.print();
        
        new Thread(r,"john").start();
        //r2永遠進不去 因為r1占著茅坑不拉屎
        new Thread(r2,"jager").start();
    }
}
