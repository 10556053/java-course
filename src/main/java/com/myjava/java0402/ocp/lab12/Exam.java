/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myjava.java0402.ocp.lab12;

/**
 *
 * @author student
 */
public class Exam implements Comparable<Exam>{
    public static int sortFlag;
    private String subject;
    private Integer score ;

    public Exam(String subject, Integer score) {
        this.subject = subject;
        this.score = score;
    }

    public Exam() {
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }
    
    @Override
    public int compareTo(Exam o) {
        return  score-o.getScore()*sortFlag ;
    }

    @Override
    public String toString() {
        return "Exam{" + "subject=" + subject + ", score=" + score + '}';
    }
    
    
    
}
