
package bank.management.sys;
import javax.swing.*;
import java.awt.*;
import java.sql.*;



public class MiniStatement extends JFrame
{
    MiniStatement(String pinnumber)
    {
    setTitle("Mini Statement");
        
    setLayout(null);
    JTextArea mini = new JTextArea();
    JScrollPane scrollPane = new JScrollPane(mini);
    scrollPane.setBounds(20, 140, 350, 200);
    add(scrollPane);
    mini.setBounds(20, 140, 350, 200);
    
    JLabel bank = new JLabel("Indian Bank");
    bank.setBounds(150, 20, 100, 20);
    add(bank);

    JLabel card = new JLabel();
    card.setBounds(20, 80, 300, 20);
    add(card);
    
    JLabel balance = new JLabel();
    balance.setBounds(20, 400, 300, 20);
    add(balance);
    
    try
    {
    Conn conn = new Conn();
    ResultSet rs = conn.s.executeQuery("Select * from login where pin = '"+pinnumber+"'");
    while(rs.next())
      {
          card.setText("Card Number: " + rs.getString("cardnumber").substring(0, 4)+ "xxxxxxxx" + rs.getString("cardnumber").substring(0, 4));
    }
    }
    
    catch(Exception e)
     {
    System.out.println(e);
    }
    
    try
    {
    Conn conn = new Conn();
    int bal = 0;
    ResultSet rs = conn.s.executeQuery("select * from bank where pin = '"+pinnumber+"'");
    StringBuilder statement = new StringBuilder();

    
    
       while(rs.next())
       {

              statement.append(rs.getString("date"))
                 .append("    ")
                 .append(rs.getString("type"))
                 .append("    ")
                 .append(rs.getString("amount"))
                 .append("\n\n");
              
              
           if(rs.getString("type").equals("Deposit"))
           {
           bal += Integer.parseInt(rs.getString("amount"));
           }
             else
           {
           bal -= Integer.parseInt(rs.getString("amount"));
           }
       }
       
      
       mini.setText(statement.toString());
       
       
       balance.setText("Your current account balance is Rs" + bal);
       }
    
       catch (Exception e)
       {
       System.out.print(e);
       }
    
        setSize(400,600);
        setLocation(20, 20);
        getContentPane().setBackground(Color.WHITE);
       setVisible(true);                
     }
    
    
    public static void main(String args[])
    {
     new  MiniStatement("");

     }
    
}



 
            
