/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myjava.java0402.ocp.lab07;

/**
 *
 * @author student
 */
public class Zoo {
    public static void main(String[] args) {
        Cat cat = new Cat("貓貓");
        System.out.println(cat.getName());
        
        Dog dog = new Dog("狗狗");
        Dog dog2 = new Dog("狗狗2");
        System.out.println(dog.getName());
        
        Tiger tiger = new Tiger("森發");
        System.out.println(tiger.getName());
        tiger.shout();
        tiger.hunt(dog2.getName());
        
        
    }
    
}
