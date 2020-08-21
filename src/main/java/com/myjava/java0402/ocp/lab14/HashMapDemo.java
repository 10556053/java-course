/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myjava.java0402.ocp.lab14;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

/**
 *
 * @author student
 */
public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> exam = new HashMap<>(); 
        exam.put("國文",54);
        exam.put("數學",69);
        exam.put("英文",88);
        exam.put("理化",99);
        
        System.out.println(exam);
        System.out.println(exam.keySet());
        
        Set<String> keys = exam.keySet();
        for (String k :keys){
            System.out.printf("key = %s value = %d\n",k,exam.get(k));
        }
        
        exam.entrySet().stream().forEach(e->System.out.println(e));
        //Map.Entry會給你一組資料，("國文",54)
        //用Entry e.getKey,e.getValue獲取職或鍵
        exam.entrySet().stream().forEach(Entry::getKey);
        
        exam.entrySet().stream().forEach(e->System.out.println(e.getValue()));
        exam.entrySet().stream().forEach(Entry::getValue);
                
        //computeIfPresent
        //k:鍵:任意型別
        //v,值
        //(k,v)->v+10 這個欄位是一個BIT function
        exam.computeIfPresent("數學", (k,v)->{
            System.err.println("k值為"+k+"v值為"+v);
            return v+10;
        });
        
        System.out.println(exam);
        
        
        //computeIfAbsent
        exam.computeIfAbsent("體育", k->70);
        System.out.println(exam);
        
        
        //用forEach
        System.out.println("用foreach");
        exam.forEach((k,v)->System.out.printf("k值為"+k+"v值為"+v+"\n"));
        
    }
}
