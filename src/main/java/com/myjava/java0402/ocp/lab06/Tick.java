/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myjava.java0402.ocp.lab06;

import java.util.Date;

/**
 *
 * @author student
 */
public class Tick {
    String name;
    int n;
    static int stock;
    
    static{//static 成員初始區段
        stock = 100;
    }
    
    {//建構子初始化區段
        n = new Date().getTime()%2 ==0 ?2:1;
    }
    
    public Tick(){
        name = "no name";
    }
    public Tick(String name){
        this();name = name;
    }

    @Override
    public String toString() {
        return "Tick{" + "name=" + name + ", n=" + n + '}';
    }
    
}
