/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package air.med;

import static air.med.Patientsignup.usr;
import java.awt.BorderLayout;
import static java.awt.Color.black;
import static java.awt.Color.white;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.sql.*;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

public class formedicines{
public static int rate = 0;
public static int quantity = 0;
public static int id = 0;// normal database display
public static void main(String[] args){
   Connection con = null;
   Statement st = null;
   ResultSet rs = null;
   String s;

//connect your app to mysql database
   try{
       con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airmed?useSSL=false","root","aman");
       st = con.createStatement();
       //args[0] = "doctordetails";
       //String tb = args[0];
       //rs = st.executeQuery("select * from "+tb+"");
       rs = st.executeQuery("select * from medicines");
       ResultSetMetaData rsmt = rs.getMetaData();
       //System.out.println("Hi");
       int c = rsmt.getColumnCount();
       Vector column = new Vector(c);
       for(int i = 1; i <= c; i++)
       {
           column.add(rsmt.getColumnName(i));
       }
       Vector data = new Vector();
       Vector row = new Vector();
       while(rs.next())
       {
           row = new Vector(c);
           for(int i = 1; i <= c; i++){
               row.add(rs.getString(i));
           }
           data.add(row);
       }
       JTextField textField;
       JFrame frame = new JFrame();
       frame.setSize(500,120);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(frame.getExtendedState() | JFrame.MAXIMIZED_BOTH);
        JPanel panel = new JPanel();
        JTable table = new JTable(data,column);
        JScrollPane jsp = new JScrollPane(table);
        panel.setLayout(new BorderLayout());
        
       /* textField = new JTextField(8);
        //textField.setBounds(5, 5, 280, 50); // to get height, set large font
        textField.setFont(textField.getFont().deriveFont(50f));
        panel.add(textField);*/
        
        
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
        buttonPanel.setBackground(white);
        JLabel label = new JLabel("Item#");
        buttonPanel.add(label);
        textField = new JTextField(15);
        buttonPanel.add(textField);
        JLabel label2 = new JLabel("Quantity");
        buttonPanel.add(label2);
        JTextField textField2 = new JTextField(15);
        buttonPanel.add(textField2);
        JButton clickmeButton = new JButton("Proceed");
        buttonPanel.add(clickmeButton);
        panel.add(buttonPanel,BorderLayout.SOUTH);
        
        
        //JOptionPane.showMessageDialog(null, new JScrollPane(getNewRenderedTable(())));
         //JOptionPane.showMessageDialog(null, new JScrollPane(getTable()));   
        //clickmeButton.addActionListener(this); 
        clickmeButton.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e)
    {
        if(textField.getText().length()==0||textField2.getText().length()==0)
        {
            JOptionPane.showMessageDialog(frame, "Necessary fields are empty");
            return;
        }
        for(int i = 0;i<textField.getText().length();i++)
         {
             if(Character.isDigit(textField.getText().charAt(i))==false)
             {
             JOptionPane.showMessageDialog(frame, "ID should be a numerical value");
             textField.setText("");
             textField2.setText("");
             
             return;
         }
         }
        for(int i = 0;i<textField2.getText().length();i++)
         {
             if(Character.isDigit(textField2.getText().charAt(i))==false)
             {
             JOptionPane.showMessageDialog(frame, "Quantity should be a numerical value");
             textField.setText("");
             textField2.setText("");
             return;
         }
         }
        int a = Integer.parseInt(textField.getText());
        int b = Integer.parseInt(textField2.getText());
        String ab = textField.getText();
        if(a<1||a>10)
        {
            JOptionPane.showMessageDialog(frame, "Not a valid Item Id");
            return;
        }
         try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airmed?useSSL=false","root", "aman");
            Statement stmt = con.createStatement();
            Statement stmt1 = con.createStatement();
            String stm = "SELECT Quantity from airmed.medicines WHERE ID = '" + ab + "'";
            ResultSet rs1 = stmt.executeQuery(stm);
            String counter="";
    while(rs1.next()){
    counter = rs1.getString("Quantity");
    }
    int count = Integer.parseInt(counter);
    if(b<=0||b>count)
    {
        JOptionPane.showMessageDialog(frame, "Enter valid quantity");
        textField2.setText("");
        return;
    }
    int ans = count - b;
    String p = Integer.toString(ans);
    //System.out.println(p);
    String stm2 = "SELECT Rate from airmed.medicines WHERE ID = '" + ab + "'";
            ResultSet rs2 = stmt.executeQuery(stm2);
            String counter2="";
    while(rs2.next()){
    counter2 = rs2.getString("Rate");
    }
    String s="update medicines set Quantity='"+p+"' where ID='"+ab+"';";
    stmt.executeUpdate(s);
    int rat = Integer.parseInt(counter2);
    quantity = b;
    rate = rat * quantity;
    id = Integer.parseInt(ab);
    
         }
         catch (SQLException ex) {
            Logger.getLogger(patientlogin.class.getName()).log(Level.SEVERE, null, ex);
        }   
//count query to check if it exists
      frame.setVisible(false);
      Medical2 ob = new Medical2();
      ob.setVisible(true);  
    }

            //To change body of generated methods, choose Tools | Templates.

           
           
       });
        
        
        
        
        
        
        panel.add(jsp,BorderLayout.CENTER);
        frame.setContentPane(panel);
        frame.setVisible(true);
               
               
   }catch(Exception e){
       System.out.println(e);
       //JOptionPane.showMessageDialog(null, "No values to show from the database");
   }finally{
       try{
       st.close();
       rs.close();
       con.close();
       }catch(Exception e){
           //JOptionPane.showMessageDialog(null, "ERROR CLOSE");
       }
   }
      
  }
}

//Read more at http://1bestcsharp.blogspot.com/2015/01/java-mysql-how-to-bind-jtable-from-mysql-database-in-netbeans.html#Gsry3xciOUrJHSpC.99