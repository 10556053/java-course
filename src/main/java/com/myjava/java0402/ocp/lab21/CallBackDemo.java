/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myjava.java0402.ocp.lab21;

import java.util.Random;

/**
 *
 * @author student
 */

interface Box{
    void setValue (int value);
}

//Runnable實作 run()
class Student implements Runnable{
    Box box;

    public Student(Box box) {
        this.box = box;
    }
    //延遲2秒便在Box中放入value
    @Override
    public void run() {
        while(true){
            int value = new Random().nextInt(101);
            box.setValue(value);
            try {
                Thread.sleep(2000);

            } catch (Exception e) {
            }
        }
        
        
    }
    
}
public class CallBackDemo {
    public static void main(String[] args) {
        //callback主執行續呼叫子執行續
        //在等待子執行續的同時主執行續可以做其他事
        //子執行續好了再傳回值
        //callback
        //box一放入value，就會觸發
        Box box = (value)->{
            System.out.println("我得到"+value);    
        };
        
        Student stu = new Student(box);
        Thread t = new Thread(stu);
        t.start();
        
        //box一放入value，就會觸發
        Box box2 = (value)->{
            System.out.println("他得到"+value);    
        };
        Student stu2 = new Student(box2);
        Thread t2 = new Thread(stu2);
        t2.start();
    }
}
