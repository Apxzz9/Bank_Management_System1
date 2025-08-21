

package bank.management.sys;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class SignupTwo extends JFrame implements ActionListener{
    
    
        JTextField panTextField, aadharTextField, emailTextField;
        JButton next;
        JRadioButton syes, sno, eyes, eno;
        JComboBox religion, category, income, occupation, education;
        String formno;
    
    SignupTwo(String formno)
           
    {
        

       
        this.formno = formno;
        setLayout(null);
        
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
        
     
        
        JLabel formnoLabel = new JLabel("APPLICATION FORM NO." + formno);
        formnoLabel.setFont(new Font("Raleway", Font.BOLD, 38));
        formnoLabel.setBounds(140 , 20, 600, 40);
        add(formnoLabel);
         
         
        JLabel additionalDetails = new JLabel("Page 2: Additional Details");
        additionalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        additionalDetails.setBounds(290 , 80, 400, 30);
        add(additionalDetails);
        
           JLabel name = new JLabel("Religion");
        name.setFont(new Font("Raleway", Font.BOLD, 22));
        name.setBounds(100 , 140, 100, 30);
        add(name);
        
        String valReligion[] = {"Hindu", "Muslim", "Sikh", "JComboBox", "Other"};
        
         religion = new JComboBox(valReligion);
        religion.setBounds(300, 140, 400, 30);
        religion.setBackground(Color.WHITE);
        add(religion);
        
        
       
        
        JLabel fname = new JLabel("Category:");
        fname.setFont(new Font("Raleway", Font.BOLD, 22));
        fname.setBounds(100 , 190, 200, 30);
        add(fname);
        
        
         String valcategory[] = {"General", "OBC", "SC", "ST", "Other"};
        category = new JComboBox(valcategory);
        category.setBounds(300, 190, 400, 30);
        category.setBackground(Color.WHITE);
        add(category);
        
        
        
          JLabel dob = new JLabel("Income:");
        dob.setFont(new Font("Raleway", Font.BOLD, 22));
        dob.setBounds(100 , 240, 200, 30);
        add(dob);
        
        
        
         String incomecategory[] = {"Null", "<1,50,000", "<2,50,000", "<5,00,000", "Upto 10,00,000"};
        income = new JComboBox(incomecategory);
        income.setBounds(300, 240, 400, 30);
        income.setBackground(Color.WHITE);
        add(income);
       
            
        
          JLabel gender = new JLabel("Educational:");
        gender.setFont(new Font("Raleway", Font.BOLD, 22));
        gender.setBounds(100 , 290, 200, 30);
        add(gender);
        
         
        
        
     
        
          JLabel email = new JLabel("Qualification:");
        email.setFont(new Font("Raleway", Font.BOLD, 22));
        email.setBounds(100 , 350, 200, 30);
        add(email);
        
        
        
        emailTextField = new JTextField();
emailTextField.setFont(new Font("Raleway", Font.BOLD, 14));
emailTextField.setBounds(300, 350, 400, 30);
add(emailTextField);
         
         String educationValues[] = {"Non-Graduation", "Graduation", "Post-Graduation", "Doctorate", "Other"};
        education = new JComboBox(educationValues);
        education.setBounds(300, 315, 400, 30);
        education.setBackground(Color.WHITE);
        add(education);
        
         
        
          JLabel marital = new JLabel("Occupation:");
          marital.setFont(new Font("Raleway", Font.BOLD, 14));
          marital.setBounds(100, 390, 200, 30);
          add(marital);
          
              
         String occupationValues[] = {"Salaried", "Self-employed", "Bussiness", "Student", "Retired", "Others"};
        occupation = new JComboBox(occupationValues);
        occupation.setBounds(300, 390, 400, 30);
        occupation.setBackground(Color.WHITE);
        add(occupation);
        
          
          
        
        
          JLabel pan_number = new JLabel("PAN Number:");
        pan_number.setFont(new Font("Raleway", Font.BOLD, 22));
        pan_number.setBounds(100 , 440, 200, 30);
        add(pan_number);
        
             panTextField = new JTextField();
        panTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        panTextField.setBounds(300, 440, 400, 30);
        add(panTextField);
        
        
        
          JLabel aadhar_no = new JLabel("Aadhar Number:");
        aadhar_no.setFont(new Font("Raleway", Font.BOLD, 22));
        aadhar_no.setBounds(100 , 490, 200, 30);
        add(aadhar_no);
        
        
            aadharTextField = new JTextField();
        aadharTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        aadharTextField.setBounds(300, 490, 400, 30);
        add(aadharTextField);
        
        
          JLabel seniorcitizen = new JLabel("Senior Citizen:");
        seniorcitizen.setFont(new Font("Raleway", Font.BOLD, 22));
        seniorcitizen.setBounds(100 , 540, 200, 30);
        add(seniorcitizen);
        
        
        
                   syes = new JRadioButton("Yes");
            syes.setBounds(300, 540, 100, 30);
            syes.setBackground(Color.WHITE);
            add(syes);
       
             sno = new JRadioButton("NO");
            sno.setBounds(450, 540, 150, 30);
            sno.setBackground(Color.WHITE);
            add(sno);
            
            
         
            ButtonGroup seniorcitizengroup = new ButtonGroup();
            seniorcitizengroup.add(syes);
            seniorcitizengroup.add(sno);
            
        
        
        
        
        
        
          JLabel pincode = new JLabel("Existing Account:");
        pincode.setFont(new Font("Raleway", Font.BOLD, 22));
        pincode.setBounds(100 , 590, 200, 30);
        add(pincode);
        
        

        
                   eyes = new JRadioButton("Yes");
            eyes.setBounds(300, 590, 100, 30);
            eyes.setBackground(Color.WHITE);
            add(eyes);
       
             eno = new JRadioButton("NO");
            eno.setBounds(450, 590, 150, 30);
            eno.setBackground(Color.WHITE);
            add(eno);
            
            
         
            ButtonGroup pincodegroup = new ButtonGroup();
            pincodegroup.add(eyes);
            pincodegroup.add(eno);
            
        
         next = new JButton("Next");
next.setBackground(Color.BLACK);
next.setForeground(Color.WHITE);
next.setFont(new Font("Raleway", Font.BOLD, 14));
next.setBounds(620, 660, 80, 30);
next.addActionListener(this);
add(next);
        
        
        getContentPane().setBackground(Color.WHITE);
     setSize(850 , 800);
     setLocation(350 , 10);
     setVisible(true);
    
    }
    
    
    public void actionPerformed(java.awt.event.ActionEvent ae){
    String formno = this.formno;
    String sreligion = (String) religion.getSelectedItem();
    String scategory = (String) category.getSelectedItem();
    String sincome = (String) income.getSelectedItem();
    String seducation = (String) education.getSelectedItem();
    String soccupation = (String) occupation.getSelectedItem();
            String seniorcitizen = null;
    
    if(syes.isSelected()){
    seniorcitizen = "Yes";
    }
    else if (sno.isSelected()){
    
        seniorcitizen = "No";
        
    }
    
    String email = emailTextField.getText();
    String existingaccount = null;
    
    if(eyes.isSelected())
    {
        existingaccount = "Yes";
    }
    else if(eno.isSelected())
    {
    existingaccount = "No";
    }
   
    
    String span = panTextField.getText();
    String saadhar = aadharTextField.getText();
  
            
            try{
                Conn c = new Conn();
                String query = "insert into signuptwo values ('"+formno+"', '"+sreligion+"', '"+scategory+"', '"+sincome+"', '"+seducation+"', '"+soccupation+"', '"+span+"', '"+saadhar+"', '"+seniorcitizen+"', '"+existingaccount+"')"; 
                c.s.executeUpdate(query);
                
                
                setVisible(false);
                new SignupThree(formno).setVisible(true);
                
            }//signup3 object
            
            catch(Exception e){
            System.out.println(e);
            }
            
            
    }
    
    
    
    
    
    
    public static void main(String args[]){
          new SignupTwo("");
    }
    
}
