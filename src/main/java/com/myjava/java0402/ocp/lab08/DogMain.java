/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myjava.java0402.ocp.lab08;

/**
 *
 * @author student
 */
public class DogMain {
    public static void main(String[] args) {
        Chihuahua chihuahua = new Chihuahua();
        Shiba shiba = new Shiba();
        
        
        print(shiba);
        print(chihuahua);
        
    }
    
    public static void print(Dog d){
        d.eat();
        d.skill();
    }
}
