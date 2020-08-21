/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myjava.java0402.ocp.lab05;

import java.util.Arrays;

/**
 *
 * @author student
 */
public class Car {
    Wheel wheel;
    Tire[] tires;
    Engine engine;
    
    public void print(){
        System.out.println("方向盤:"+wheel);
        System.out.println("引擎:"+engine);
        for(Tire t: tires){
            System.out.println(t);
        }
    }
    
    public int totprice(){
        int pWheel = wheel.price;
        int pEngine = engine.price;
        //int pTire = 0;
        
        //java7的作法
        /*for(Tire t: tires){
            pTire+=t.price;
        }*/
        
        //java8的作法，變成stream
        //給每個串流的物件一個t的代號並且得到他的price
        int pTire= Arrays.stream(tires).mapToInt(t->t.price).sum();
        
        int tot = pEngine+pTire+pWheel;
        return tot;
    }
    
    @Override
    public String toString() {
        return "Car{" + "wheel=" + wheel + ", tires=" + tires + ", engine=" + engine + '}';
    }
    
    
}
