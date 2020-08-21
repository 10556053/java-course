/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myjava.java0402.ocp.lab17.user.service;

/**
 *
 * @author student
 */
import com.myjava.java0402.ocp.lab17.user.dao.UserDAO;
import com.myjava.java0402.ocp.lab17.user.exception.UserLoginFailException;
import com.myjava.java0402.ocp.lab17.user.po.Users;
import java.util.Base64;
import java.util.stream.Stream;
//service端請求的任務 //要跟dao要資源
public class UserServices {
    UserDAO dao = new UserDAO();
    public boolean login(String username,String password) throws UserLoginFailException{
        Users[] users = dao.query();
        if (users ==null){
            return  false;
        }
        boolean check= Stream.of(users)
                .anyMatch(u->u.getUsername().equals(username)&&decodeBase64(u.getPassword()).equals(password));
        
        
        if (check){
            return true;
        }else{
            //使用者樹入錯誤得使用者名稱或密碼
            UserLoginFailException e = new UserLoginFailException();
            throw e;
        }
    }
    private String decodeBase64(String base64String){
        byte[] base64bytes = Base64.getDecoder().decode(base64String);
        String ans = null;
        try {
            ans = new String(base64bytes, "UTF-8");
        } catch (Exception e) {
            System.out.println("編碼失敗");
        }
        return ans;
    }
}
