/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package air.med;

import java.awt.BorderLayout;
import static java.awt.Color.black;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.sql.*;
import java.util.Vector;

public class doctordata{// normal database display
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
       String tb = args[0];
       rs = st.executeQuery("select * from "+tb+"");
       //rs = st.executeQuery("select * from doctordetails");
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
        buttonPanel.setBackground(black);
        JButton clickmeButton = new JButton("Click Me");
        buttonPanel.add(clickmeButton);
        panel.add(buttonPanel,BorderLayout.SOUTH);
        
        
        //JOptionPane.showMessageDialog(null, new JScrollPane(getNewRenderedTable(())));
         //JOptionPane.showMessageDialog(null, new JScrollPane(getTable()));   
        //clickmeButton.addActionListener(this); 
        clickmeButton.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e)
    {
      frame.setVisible(false);
      Notification ob = new Notification();
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