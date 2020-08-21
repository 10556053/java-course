/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myjava.java0402.ocp.lab22;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author student
 */

class Cookies{
    private boolean isEmpty = true;
    public synchronized void put(int n){
        //如果不是空的
        if(!isEmpty){
            try {
                //就進入等待
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Cookies.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        //如果空的
        System.out.printf("主人放地%s塊餅乾\n",n);
        isEmpty = false;
        //告示可以吃了
        notify();
    }
    public synchronized void eat(int n){
        //如果是空的
        if(isEmpty){
            try {
                //進入等待
                wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Cookies.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        //如果不是空的
        System.out.printf("狗狗吃地%s塊餅乾\n",n);
        isEmpty = true;
        //告示可以放餅乾了
        notify();
    }
}
public class DogAndMaster {
       public static void main(String[] args) {
        Cookies cookies = new Cookies();
        Runnable put = ()->{
            for (int i =1;i<=10;i++){
                cookies.put(i);
            }
        };
        
        Runnable eat = ()->{
            for (int i =1;i<=10;i++){
                cookies.eat(i);
            }
        };
        
        new Thread(put,"主人").start();
        new Thread(eat,"狗狗").start();
    }
}
