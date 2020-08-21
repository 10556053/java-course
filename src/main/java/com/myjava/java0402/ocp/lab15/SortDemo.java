/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myjava.java0402.ocp.lab15;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 *
 * @author student
 */
public class SortDemo {
    public static void main(String[] args) {
        Integer[] nums = new  Integer[10];
        
        IntStream.range(0, 10).forEach(i->nums[i] = new Random().nextInt(100));
        Stream.of(nums).forEach(num->System.out.println(num+" "));
        System.out.println("");
        
        //排序java7
        Arrays.sort(nums, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                    return o1-o2;
                }

            }
        );
        Stream.of(nums).forEach(num->System.out.println(num+""));
        System.out.println("");
        
        // 排序 Java 8
        Arrays.sort(nums, (o1, o2) -> o1 - o2);
        Stream.of(nums).forEach(num -> System.out.print(num + " "));
        System.out.println();
        
        Arrays.sort(nums, (o1, o2) -> o2 - o1);
        Stream.of(nums).forEach(num -> System.out.print(num + " "));
        System.out.println();
        
        
        
    }
}
