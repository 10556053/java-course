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
public class HashSetDemo2 {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        Pen pen2 = new Pen();
        
        Paper paper1 = new Paper();
        Paper paper2 = new Paper();
        
        MyCoin coin1 = new MyCoin(1);
        MyCoin coin5 = new MyCoin(5);
        MyCoin coin10 = new MyCoin(10);
        //object代表麼都可以放
        HashSet<Object> hs =new HashSet<> ();
        hs.add(paper1);hs.add(paper2);hs.add(pen1);hs.add(pen2);hs.add(coin1);hs.add(coin5);hs.add(coin10);
        
        //也可以設一個專門放一樣物品的
        HashSet<MyCoin> hs2 =new HashSet<> ();
        hs2.add(coin5); hs2.add(coin10);hs2.add(coin1);

        runViaJava7(hs);
        runViaJava8(hs);
       
    }

    private static void runViaJava7(HashSet hs) {
        //java7的寫法
        int sum = 0;
        Iterator it = hs.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if(next instanceof MyCoin){
                sum+=((MyCoin)next).getMoney();
                
            } 
            
        }
        System.out.println(sum);
    }

    private static void runViaJava8(HashSet<Object> hs) {
        int sum = hs.stream()
                .filter(e->(e instanceof MyCoin))
                .map(e->(MyCoin)e)
                .mapToInt( e->e.getMoney() )
                //如果中途想看輸出如何，可以用peek
                //.peek(e->System.out.println(e))
                .sum();
        
        System.out.println(sum);
        
    }
}
