/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;

/**
 *
 * @author jatawatsafe
 */
public class AllQuestion {
    private LinkedList<Question> allQuestion = new LinkedList();
    private int count;
    private int totalQ;

    public AllQuestion() {
        //if has many set
        allQuestion = initQuestionSet1();
        Random rd = new Random();
        int num = rd.nextInt(4) + 1;
        if(num==2){
            Collections.sort(allQuestion);
        }
        if(num==3){
            Collections.sort(allQuestion, Question.compare1);
        }
        if(num==4){
            Collections.sort(allQuestion, Question.compare1);
        }
        this.totalQ = allQuestion.size();
        this.count = 1;
    }
    
    private LinkedList<Question> initQuestionSet1(){
        //Q1
        String q1 = "Which of the following is hardware?";
        String [] c1 = {"Monitor","Program","Operating System","Microsoft Office"};
        int key1 = 1;
        Question question1 = new Question(q1, c1, key1);
        //Q2
        String q2 = "Which of the following is software?";
        String [] c2 = {"Keyboard","Microsoft Word","Speakers","Mouse"};
        int key2 = 2;
        Question question2 = new Question(q2, c2, key2);
        //Q3
        String q3 = "What does RAM stand for?";
        String [] c3 = {"Review Admittance Monitor","Review Admittance Memory","Random Access Memory","Random Access Monitor"};
        int key3 = 3;
        Question question3 = new Question(q3, c3, key3);
        //Q4
        String q4 = "Number of bit used by the IPv6 address";
        String [] c4 = {"32 bit","64 bit","128 bit","256 bit"};
        int key4 = 3;
        Question question4 = new Question(q4, c4, key4);
        //Q5
        String q5 = "Firewall in computer is used for ?";
        String [] c5 = {"Security","Data Transmission","Authentication"," Monitoring"};
        int key5 = 1;
        Question question5 = new Question(q5, c5, key5);
        //ADD QUESTION
        LinkedList<Question> set1 = new LinkedList();
        set1.add(question1);
        set1.add(question2);
        set1.add(question3);
        set1.add(question4);
        set1.add(question5);
        return set1;
    }
    
    public Question playQ(){
        return allQuestion.get(count-1);
    }
    
    public void nextQ(){
        this.count++;
    }
    
    public boolean isLastQuestion(){
        return count==totalQ;
    }

    public int getCount() {
        return count;
    }

    public int getTotalQ() {
        return totalQ;
    }
    
    
}
