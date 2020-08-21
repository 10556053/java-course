/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myjava.java0402.ocp.lab06;

/**
 *
 * @author student
 */
public class MachineDemo {
    public static void main(String[] args) {
        Machine m  = new Machine();
        System.out.println("--------------我是機器-----------");
        System.out.println(m.name);
        m.power();
        m.playMachine();
        
        
       System.out.println("--------------我是phone--------------");
        Phone p = new Phone();
        System.out.println(p.name);
        p.power();//細體字代表繼承自父類
        //override??
        p.playMachine();//來自父類的方法
        p.play();//粗體字代表是自己的方法
        //只能子類別繼承父類別(phone繼承machine)
        //不能父類繼承子類(machine不能繼承phone)
        System.out.println("--------------我是pc--------------");
        PC pc1 = new PC();
        String name =pc1.PCname;
        System.out.println(name);
        pc1.power();
        pc1.play();
        
    }
}
