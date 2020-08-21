/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myjava.java0402.ocp.lab05;

/**
 *
 * @author student
 */
public class CarSystem {
    public static void main(String[] args) {
        Wheel wheel = new Wheel();
        wheel.name = "f1 wheel";
        wheel.price = 6000;
        
        Tire t1 = new Tire();
        t1.name = "米其林";t1.price = 1000;
        
        Tire t2 = new Tire();
        t2.name = "米其林";t2.price = 1000;
        
        Tire t3 = new Tire();
        t3.name = "米其林";t3.price = 1000;
        
        Tire t4 = new Tire();
        t4.name = "米其林";t4.price = 1000;
        
        Engine engine = new Engine();
        engine.power = 1000000; engine.price=500000;
        
        //開始建造Car
        Car car = new Car();
        car.wheel = wheel;
        car.engine = engine;
        car.tires =new Tire[]{t1,t2,t3,t4};
        //System.out.println(car);
        
        car.print();
        System.out.println("總價格為"+car.totprice());
        
        
    }
}
