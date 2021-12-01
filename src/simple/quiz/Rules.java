package simple.quiz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener{
   
    JButton b1,b2;
    String username;
    
    Rules(String username)
    {
      setBounds(200,100,800,550);
      getContentPane().setBackground(Color.WHITE);
      setLayout(null);
      
      
      JLabel l1=new JLabel("Welcome "+ username +"  to Simple Quiz");
      l1.setForeground(new Color(30,144,255));
      l1.setFont(new Font("Viner Hand ITC",Font.BOLD,29));
      l1.setBounds(50,50,700,50);
      add(l1);
      
       JLabel l2=new JLabel("");
       l2.setFont(new Font("Tahoma",Font.PLAIN,16));
       l2.setBounds(20,90,600,300);
       l2.setText(
                  "<html>"+
                          "1. Only team entries are eligible, and team shall consist of three persons."+"<br></br>"+
                          "2. The decision of the quiz-master will be final and will not be subjected to any change." +"<br></br>"+                       
                          "3. The participants shall not be allowed to use mobile or other electronic instruments." +"<br></br>" +                       
                           "4. The questions shall be in the form of multiple choice, True / False statement, Specificanswer question etc."+"<br><br>"+ 
                           "5. Audience/Supporters shall not give any hints or clues to the competitors." + "<br></br>"+
                           "6. Replacement of any participant of a team is not allowed after registration."+" <br></br>"+          
                          "<html>"
                          );
       add(l2);
       
       b1=new JButton("Back");
       b1.setBounds(150,400,100,30);
       b1.setBackground(new Color(30,144,255));
       b1.setForeground(Color.WHITE);
       b1.addActionListener(this);
       add(b1);
       
       b2=new JButton("Start");
       b2.setBounds(350,400,100,30);
       b2.setBackground(new Color(30,144,255));
       b2.setForeground(Color.WHITE);
       b2.addActionListener(this);
       add(b2);
       
      setVisible(true);
}
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b1)
        {
            this.setVisible(false);
            new SimpleQuiz().setVisible(true);
        }
        else if(ae.getSource()==b2)
        {
              this.setVisible(false);
            new Quiz(username).setVisible(true);
        }
    }
public static void main(String[] args)
{
    new Rules(" ");
}

  
}