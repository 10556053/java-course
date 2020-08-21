/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myjava.java0402.ocp.lab17;

import java.util.Base64;

/**
 *
 * @author student
 */
public class Base64Demo {
    public static void main(String[] args) throws Exception {
        //將數字轉為Base64
        String base64String = Base64.getUrlEncoder().encodeToString("0000".getBytes("utf-8"));
        System.out.println(base64String);
        //將Base64轉為數字
        byte[] decode64 = Base64.getDecoder().decode(base64String);
        String ans = new String(decode64, "UTF-8");
        System.out.println(ans);
    }
}
