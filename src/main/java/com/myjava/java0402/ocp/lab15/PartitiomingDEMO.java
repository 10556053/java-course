/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myjava.java0402.ocp.lab15;

import java.util.List;
import java.util.Map;
import static java.util.stream.Collectors.partitioningBy;
import java.util.stream.Stream;

/**
 *
 * @author student
 */
public class PartitiomingDEMO {
    public static void main(String[] args) {
        String[] ids = {"A111111111","B2222222222","C99999999","D565656556","E44812156131"};
        System.out.println(
                Stream.of(ids).collect(partitioningBy(id->id.charAt(1)=='1'))
        );
        
        Map<Boolean,List<String>> map1 = Stream.of(ids).collect(partitioningBy(id->id.charAt(1)=='1'));
        System.out.println(map1);
        
    }
    
    
}
