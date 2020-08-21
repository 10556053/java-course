/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myjava.java0402.ocp.lab10;

/**
 *
 * @author student
 */
class Outer{
    //已經分配好記憶體
    static int sx = 9;
    
    int int2 = 10;

    
    // static 內部類別
    static class SInner{
        static void print(){
            System.out.println("Inner static class"+sx);
            //int2 無法被呼叫
        }
    }
    // 一般內部類別    
    class Inner{
        void print(){
            System.out.println("Inner class"+sx+int2);
            //一般內部類別可呼叫int2 ,SInner ,
            SInner.print();
        }
    }
}
public class StaticInnerClassDemo {
    public static void main(String[] args) {
        Outer.Inner in = new Outer().new Inner();
        in.print();
        
        //Outer不用括號
        Outer.SInner sin = new Outer.SInner();
        sin.print();
                
    }
}
