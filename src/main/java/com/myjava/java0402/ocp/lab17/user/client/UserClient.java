/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myjava.java0402.ocp.lab17.user.client;

import com.myjava.java0402.ocp.lab17.user.exception.UserLoginFailException;
import java.util.Scanner;

/**
 *
 * @author student
 */
//前端
import com.myjava.java0402.ocp.lab17.user.service.UserServices;
import java.util.InputMismatchException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class UserClient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.println("輸入name");
        String username = sc.next();
        System.out.println("輸入password");
        String password = sc.next();
        
        UserServices services = new UserServices();
        boolean check = services.login(username, password);
        System.out.println(check?"登入成功?":"登入失敗");
        
        } catch (InputMismatchException e) {
            //在該輸入數字時輸入字串等等...
            System.out.println("輸入無效");
        } catch (UserLoginFailException ex) {
            //參見UserLoginFailException.java的定義
            //在UserServices.java被使用
            //始於錯誤的使用者名字密碼
            ex.wtf();
        }
    }
}
