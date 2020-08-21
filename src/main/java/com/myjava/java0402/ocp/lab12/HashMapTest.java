/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myjava.java0402.ocp.lab12;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author student
 */
public class HashMapTest {

    public static void main(String[] args) {
        HashMap<String, Integer> hashMap1 = new HashMap<>(); //基礎班
        hashMap1.put("張三", 20);
        hashMap1.put("李四", 22);

        HashMap<String, Integer> hashMap2 = new HashMap<>(); //就業班
        hashMap2.put("王五", 21);
        hashMap2.put("趙六", 23);

        HashMap<String, HashMap<String, Integer>> hashMap3 = new HashMap<>();//班級類別
        hashMap3.put("1班", hashMap1);
        hashMap3.put("2班", hashMap2);

        //第一個HashMap 轉換成set 裡面包著hashmap 
        Set<Map.Entry<String, HashMap<String, Integer>>> entries = hashMap3.entrySet();
        
        //先進入外層的map<String,HashMap> 有一個mapEntry物件來尋訪
        for (Map.Entry<String, HashMap<String, Integer>> mapEntry : entries) {
            //得到外層map的key值  也就是"1班"
            String key = mapEntry.getKey();
            System.out.println(key);
            //得到外層map的value值  也就是"hashMap1","hashMap2"
            HashMap<String, Integer> value = mapEntry.getValue();
            
            //第二個HashMap 轉換成set 裡面包著<String ,Integer>
            Set<Map.Entry<String, Integer>> entries1 = value.entrySet();
            for (Map.Entry<String, Integer> entry : entries1) {
                //得到內層map的key值  也就是"張三"
                String key1 = entry.getKey();
                //得到內層map的value值  也就是 20
                Integer value1 = entry.getValue();
                System.out.println("\t" + key1 + " " + value1);
            }
            
        }
    }
}
