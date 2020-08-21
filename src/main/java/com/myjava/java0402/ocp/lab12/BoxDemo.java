/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myjava.java0402.ocp.lab12;

/**
 *
 * @author student
 */
public class BoxDemo {
    public static void main(String[] args) {
        Pen pen  = new Pen();
        pen.setColor("red");
        Paper paper  = new Paper();
        paper.setSize("2b");
        
        
        //寄居蟹的殼，只是一個容器
        //泛行可以將不同種類的東西放在一個陣列裡面
        Box<Pen> b1 = new Box<>();
        b1.set(pen);
        
        Box<Paper> b2 = new Box<>();
        b2.set(paper);
        
        
        Box[] b = {b1,b2};
        for (Box box:b){
            if (box.get()instanceof Paper){
                System.out.println(((Paper)box.get()).getSize());
            }else if (box.get()instanceof Pen){
                System.out.println(((Pen)box.get()).getColor());
            }
        }
    }
}
