/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myjava.java0402.ocp.lab15;

import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.toSet;
import java.util.stream.Stream;

/**
 *
 * @author student
 */
public class Groupings3 {
    public static void main(String[] args) {
        String[] fruits = {"apple", "apple", "banana", "watermelon", "apple",
            "orange", "watermelon", "banana", "coconut"};

        // map1: {orange=1, banana=2, apple=3, watermelon=2, coconut=1}
        // map2: {1=[orange, coconut], 2=[banana, watermelon], 3=[apple]}
        System.out.println("map1: " +
                Stream.of(fruits)
                        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                        .entrySet()
        );
        System.out.println("map2: " +
                Stream.of(fruits)
                        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                        .entrySet()
                        .stream()
                        .collect(Collectors.groupingBy(Entry::getValue, Collectors.mapping(Entry::getKey, toSet())))
        );

    }
}
