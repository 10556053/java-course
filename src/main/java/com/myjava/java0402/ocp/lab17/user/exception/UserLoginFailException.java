/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myjava.java0402.ocp.lab17.user.exception;

/**
 *
 * @author student
 */
public class UserLoginFailException extends UserException {

    public UserLoginFailException() {
    }
    
    public void wtf(){
        System.out.println("錯了拉蠢，重新登入");
    }
    
}
