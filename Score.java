package quiz.application;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener{
    
    Score(String name,int score){
        setLayout(null);
        
        setBounds(400,150,750,550);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/3.jpg"));
        Image i2=i1.getImage().getScaledInstance(400,250,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(20,200,400,250);
        add(image);
        
        JLabel heading = new JLabel("ThankYou "+name+" for playing Simple Minds!! ");
        heading.setBounds(45, 30, 700, 30);
        heading.setFont(new Font("Tahoma", Font.PLAIN, 26));
        add(heading);
        
        JLabel lblscore = new JLabel("Your score is "+score);
        lblscore.setBounds(480, 200, 300, 30);
        lblscore.setFont(new Font("Tahoma", Font.PLAIN, 22));
        add(lblscore);
        
        JButton submit = new JButton("Play Again");
        submit.setBounds(500, 270, 100, 30);
        submit.setBackground(Color.BLUE);
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        add(submit);
        
        setVisible(true);
        getContentPane().setBackground(Color.WHITE);
        
    }
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Login();
    }
    public static void main(String args[]){
        new Score("user",0);
    }
}
