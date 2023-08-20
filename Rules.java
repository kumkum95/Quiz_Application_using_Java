package quiz.application;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Rules extends JFrame implements ActionListener{
    String name;
    JButton b1,b2;
    
    Rules(String name){
        this.name=name;
        setLayout(null);
        
        JLabel j1=new JLabel("Welcome " + name + " to Simple Minds");
        j1.setBounds(50,35,700,30);
        j1.setFont(new Font("Viner Hand ITC",Font.BOLD,28));
        j1.setForeground(Color.BLUE);
        add(j1);
        
        JLabel j2=new JLabel();
        j2.setBounds(20,90,700,350);
        j2.setFont(new Font("Tahoma",Font.PLAIN,16));
        j2.setText(
            "<html>"+
                   "1.The quiz consists of [number of questions] questions divided into [number of rounds] rounds.\n"+"<Br><Br>"+
                    "2.Read each question carefully and select the correct answer or input your response, depending on the question format.\n" +"<Br><Br>"+
                    "3.You'll have a limited time (usually [time limit]) to answer each question.\n"+"<Br><Br>"+
                    "4.Correct answers earn you points based on the quiz's scoring system.\n"+"<Br><Br>"+
                    "5.The quiz has an overall time limit of [total quiz duration].\n"+"<Br><Br>" +
                    "6.Keep an eye on the timer for each question and the overall quiz time."+"<Br><Br>"+
                    "7.Remember, the main goal is to have fun, challenge yourself, and enjoy the quiz experience!\n"+"<Br><Br>" +
                    "8.Thank you for participating in Simple Minds. Good luck!!"+
            "<html>"
        );
        add(j2);
        
        b1=new JButton("Back");
        b1.setBounds(250,500,100,30);
        b1.setBackground(Color.BLUE);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);
        
        b2=new JButton("Start");
        b2.setBounds(400,500,100,30);
        b2.setBackground(Color.BLUE);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);
        
        setSize(800,650);
        setLocation(350,100);
        setVisible(true);
        getContentPane().setBackground(Color.WHITE);
        
}
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
            setVisible(false);
            new Login();
        }else if(ae.getSource()==b2){
            setVisible(false);
            new Quiz(name);
        }
    }
    public static void main(String[] args){
        new Rules("User");
    }
}
