/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myjava.java0402.ocp.lab12;

import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author student
 */
public class HashSetDemo {
    public static void main(String[] args) {
        //新建一個Pen物件
        Pen p = new Pen();
        p.setColor("綠");
        //新建一個Paper物件
        Paper paper = new Paper();
        paper.setSize("2b");
        
        HashSet hs = new HashSet();
        hs.add(p);
        hs.add(paper);
        
        //走訪器用完就停止了
        //不會重新回到最開始
        Iterator it = hs.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof Paper){
                it.remove();
            }
            System.out.println(hs);
            
        }
    }
}
