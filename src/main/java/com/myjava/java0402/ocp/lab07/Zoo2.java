/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myjava.java0402.ocp.lab07;

import java.util.Random;

/**
 *
 * @author student
 */
public class Zoo2 {
    public static void main(String[] args) {
        Dog dogg = new Dog("狗溝");
        Tiger tiger = new Tiger("虎");
        
        //print(dogg);
        print(dogg);
        print(tiger);
        
        Animal a = getAnimal();
        print(a);
    }
    
    public static void print(Animal animal){
        //傳入一個Animal類跌，能得到Animal底下的方法:getName(),shout()
        //但無法呼叫Tiger類的 hunt()
        System.out.println("我是 "+animal.getName());
        animal.shout();
        
        //倘若想呼叫Tiger的方法hunt()
        //必須強制轉型
        if(animal instanceof Tiger){
            ((Tiger)animal).hunt("狗狗");
        }
    }
    
    public static Animal getAnimal(){
        int n = new Random().nextInt(4);
        
        switch(n){
            case 0:
                return  new Dog("狼犬");
                
            case 1:
                return new Cat("貓");
            case 2:
                return new Tiger("虎");
            case 3:
                return new Tiger("虎2");    
        }
        return new Animal();
    }
}
