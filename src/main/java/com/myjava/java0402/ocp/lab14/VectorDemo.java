/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myjava.java0402.ocp.lab14;

import java.util.Vector;

/**
 *
 * @author student
 */
public class VectorDemo {
    public static void main(String[] args) {
        //vector增長係數1，用到完才部屬
        //增長係數0.7:用到70趴就開始超賢部署
        
        //先給他650，多了一次加5
        Vector<Integer> v = new Vector<>(650,5);
        //假設1~9，vector會給10
        //10~19，vector給20
        //20，vector給40
        
        //不夠用了財曾長
        for (int i =0;i<=650;i++){
            v.add(i);
        }
        System.out.printf("capacity%d\n , size:%d\n",v.capacity(), v.size());
    }
}
