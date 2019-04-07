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
        Random rd = new Random();
        //random set
        int randomSet = rd.nextInt(2)+1;
        System.out.println("Set : "+randomSet);
        if (randomSet==1) {
            allQuestion = initQuestionSet1();
        } else {
            allQuestion = initQuestionSet2();
        }
        //random sort
        int num = rd.nextInt(4) + 1;
        System.out.println("Sort : "+num);
        switch (num) {
            case 2:
                Collections.sort(allQuestion);
                break;
            case 3:
                Collections.sort(allQuestion, Question.compare1);
                break;
            case 4:
                Collections.sort(allQuestion, Question.compare2);
                break;
            default:
                break;
        }
        //set question
        this.totalQ = allQuestion.size();
        this.count = 1;
    }
    
    private LinkedList<Question> initQuestionSet1(){
        String q;
        String[] c;
        int key;
        Question question;
        LinkedList<Question> set1 = new LinkedList();
        //Q1
        q = "Which of the following is hardware?";
        c = new String[]{"Monitor","Program","Operating System","Microsoft Office"};
        key = 1;
        question = new Question(q, c, key);
        set1.add(question);
        //Q2
        q = "Which of the following is software?";
        c = new String[]{"Keyboard","Microsoft Word","Speakers","Mouse"};
        key = 2;
        question = new Question(q, c, key);
        set1.add(question);
        //Q3
        q = "What does RAM stand for?";
        c = new String[]{"Review Admittance Monitor","Review Admittance Memory","Random Access Memory","Random Access Monitor"};
        key = 3;
        question = new Question(q, c, key);
        set1.add(question);
        //Q4
        q = "Number of bit used by the IPv6 address";
        c = new String[]{"32 bit","64 bit","128 bit","256 bit"};
        key = 3;
        question = new Question(q, c, key);
        set1.add(question);
        //Q5
        q = "Firewall in computer is used for ?";
        c = new String[]{"Security","Data Transmission","Authentication"," Monitoring"};
        key = 1;
        question = new Question(q, c, key);
        set1.add(question);
        //Q6
        q = "Which protocol is used to send e-mail ?";
        c = new String[]{"HTTP","POP3","SSH","SMTP"};
        key = 4;
        question = new Question(q, c, key);
        set1.add(question);
        //Q7
        q = "Who invented Java?";
        c = new String[]{"Shakunthala Devi","James A Gosling","J.M. Coetzee","Grace Murry Hopper"};
        key = 2;
        question = new Question(q, c, key);
        set1.add(question);
        //Q8
        q = "How many layers in Network OSI Model ?";
        c = new String[]{"7 Layer","6 Layer","5 Layer","4 Layer"};
        key = 1;
        question = new Question(q, c, key);
        set1.add(question);
        //Q9
        q = "'Linux' is an example of";
        c = new String[]{"Software","Application","Operating System","Browser"};
        key = 3;
        question = new Question(q, c, key);
        set1.add(question);
        //Q10
        q = "Which company first developed the Java programming language ?";
        c = new String[]{"Microsoft","Sun Microsystems","IBM","Google"};
        key = 2;
        question = new Question(q, c, key);
        set1.add(question);
        
        return set1;
    }
    
    private LinkedList<Question> initQuestionSet2(){
        String q;
        String[] c;
        int key;
        Question question;
        LinkedList<Question> set2 = new LinkedList();
        
        //Q1
        q = "What technology is used to record cryptocurrency transactions?";
        c = new String[]{"Digital wallet","Mining","Blockchain","Token"};
        key = 3;
        question = new Question(q, c, key);
        set2.add(question);
        
        //Q2
        q = "Why is Big Data important?";
        c = new String[]{"Because of it is structured","Because of it analyzed to reveal patterns and trends","Because of its complexity","Because of its size"};
        key = 2;
        question = new Question(q, c, key);
        set2.add(question);
        
        //Q3
        q = "What does acronym FOSS stand for?";
        c = new String[]{"Free and Open-Source Software","Full Option Sensor System","Follow-On Support Service","Fiber Optics Science System"};
        key = 1;
        question = new Question(q, c, key);
        set2.add(question);
        
        //Q4
        q = "What technology is used to make telephone calls over the Internet?";
        c = new String[]{"Bluetooth","Ethernet","NFC","VoIP"};
        key = 4;
        question = new Question(q, c, key);
        set2.add(question);
        
        //Q5
        q = "Which tech buzzword is closely related to Artificial Intelligence (AI)?";
        c = new String[]{"Virtual reality","Machine learning","Cryptocurrency","Microservices"};
        key = 2;
        question = new Question(q, c, key);
        set2.add(question);
        
        //Q6
        q = "What is SQL?";
        c = new String[]{"Structured Query Language","Structured Quanlity Language","Subordinate Query Language","Subordinate Quality Language"};
        key = 1;
        question = new Question(q, c, key);
        set2.add(question);
        
        //Q7
        q = "Who invented the World Wide Web?";
        c = new String[]{"Al Gore","Mark Zuckerberg","Vince Cerfe","Tim Berners-Lee"};
        key = 4;
        question = new Question(q, c, key);
        set2.add(question);
        
        //Q8
        q = "What does the acronym URL stand for?";
        c = new String[]{"Unified Reference Link","Unit Return Location","Universal Resource Location","Universal Resource Locator"};
        key = 4;
        question = new Question(q, c, key);
        set2.add(question);
        
        //Q9
        q = "In web design, what does the acronym CSS stand for?";
        c = new String[]{"Concentric Styling System","Cascaded Sheet Styling","Cascading Style Sheets","Central Style Sheets"};
        key = 3;
        question = new Question(q, c, key);
        set2.add(question);
        
        //Q10
        q = "In what year was the @ symbol picked for use in e-mail addresses?";
        c = new String[]{"1953","1984","1969","1972"};
        key = 4;
        question = new Question(q, c, key);
        set2.add(question);
        
        return set2;
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
