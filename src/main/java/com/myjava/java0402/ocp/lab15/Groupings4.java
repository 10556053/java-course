/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myjava.java0402.ocp.lab15;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.toMap;
import static java.util.stream.Collectors.toSet;
import java.util.stream.Stream;

/**
 *
 * @author student
 */
public class Groupings4 {
    public static void main(String[] args) {
        String[] namString = {"Tom","John","Helen","Jane","May"};
        
       
                
         System.out.println("map1: " +
                Stream.of(namString)
                        .collect(toMap(String::toString, String::length))
                        .entrySet()
        );
        
        
        System.out.println("map2: " +
                Stream.of(namString)
                        .collect(toMap(String::toString, String::length))
                        .entrySet()
                        .stream()
                        .collect(Collectors.groupingBy(Map.Entry::getValue, Collectors.mapping(Map.Entry::getKey, toSet())))
        );
    }
}
