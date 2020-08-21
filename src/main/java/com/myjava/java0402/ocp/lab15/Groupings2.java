/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myjava.java0402.ocp.lab15;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author student
 */
public class Groupings2 {
    public static void main(String[] args) {
        String[] fruits = {"apple", "apple", "banana", "watermelon", "apple", 
                           "orange", "watermelon", "banana", "coconut"};
        Map<String, Long> map1 = Stream.of(fruits)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("map1: " + map1);
        map1 = Stream.of(fruits)
                .collect(Collectors.groupingBy(fruit->fruit, Collectors.counting()));
        System.out.println("map1: " + map1);
        map1 = Stream.of(fruits)
                .collect(Collectors.groupingBy(String::toString, Collectors.counting()));
        System.out.println("map1: " + map1);
    }
}
