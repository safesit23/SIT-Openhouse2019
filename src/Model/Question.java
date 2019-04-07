/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Comparator;

/**
 *
 * @author jatawatsafe
 */
public class Question implements Comparable<Question>{
    private String question;
    private String[] choice;
    private int key;
    public static Compare1 compare1 = new Compare1();
    public static Compare2 compare2 = new Compare2();
    
    static class Compare1 implements Comparator<Question>{
        @Override
        public int compare(Question o1, Question o2) {
            return o1.question.hashCode() - o2.question.hashCode();
        }
        
    }
    
    static class Compare2 implements Comparator<Question>{
        @Override
        public int compare(Question o1, Question o2) {
            return o1.question.compareTo(o2.choice[3]);
        }
        
    }

    public Question(String question, String[] choice, int key) {
        this.question = question;
        this.choice = choice;
        this.key = key-1;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String[] getChoice() {
        return choice;
    }

    public void setChoice(String[] choice) {
        this.choice = choice;
    }

    public int getKey() {
        return key+1;
    }

    public void setKey(int key) {
        this.key = key-1;
    }
    
    public boolean check(int ans){
        if((ans-1)==key){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public int compareTo(Question o) {
        return choice[0].compareTo(o.choice[1]);
    }
    
}
