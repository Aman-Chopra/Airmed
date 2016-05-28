/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package air.med;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author win-8
 */
public class amebiasis {
    public static double pamebiasis = 1;
    
    public static void main(String args[]) throws SQLException
    {
        String a = "amebiasis";
        int len = args.length;
        Connection conn = null;
     Statement statement = null;
     ResultSet resultSet = null;
     int i = 0;
     int ar[] = new int[7];
     for(int t = 0 ;t<7;t++)
         ar[t]=0;
     int flag = 0;
     //String disease[] = {"aids","amebiasis","cholera","dengue","ebola","malaria","smallpox","swinwflu","tuberculosis","typhoid"};
     //double probability[] = new double[10];
      
      
     try
    {
        Class.forName("com.mysql.jdbc.Driver"); 
        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/airmed?useSSL=false","root","aman");
        //statement = conn.createStatement();
        //resultSet = statement.executeQuery("select * from login.log");
    
        //String queryCheck = "SELECT * from login.log WHERE username = '" + disease[i] + "'";
Statement st = conn.createStatement();
//ResultSet rs = st.executeQuery("SELECT * from airmed."+disease[i]+";"); 
ResultSet rs = st.executeQuery("SELECT * from airmed."+a); 
 ResultSetMetaData metadata = rs.getMetaData();
	    int columnCount = metadata.getColumnCount();
            ArrayList<String> columns = new ArrayList<String>();
             String symp[] = new String[6];
	    for (i = 1; i < columnCount; i++) {
		String columnName = metadata.getColumnName(i);
                symp[i-1] = columnName;
                //System.out.println(symp[i-1]);
                //System.out.println(columnName);
		columns.add(columnName);
                
	    }
            int j = 0;
            int count = 0;
           
            double countrows = 0;
            double countdis = 0;
            double discount = 0;
            double pdis = 0;
            double psymp = 0;
            double countsymp = 0;
            outer :   for(i=0;i<args.length;i++)
            {
                for(j=0;j<symp.length;j++)
                {
                   if(symp[j].equals(args[i])) 
                   {
                       count++;
                       Statement stmt1 = conn.createStatement();
                        ResultSet rs1 = stmt1.executeQuery("SELECT COUNT(*) AS total FROM "+a);
                       while(rs1.next()){
                        countrows = rs1.getInt("total");
                            }
                        ResultSet rs3 = stmt1.executeQuery("SELECT COUNT(*) AS total FROM "+a+" where "+a+"=1");
    while(rs3.next()){
    countdis = rs3.getInt("total");
    }
    //System.out.println(countrows);
     //System.out.println(countdis);
    pdis = countdis/countrows;
    pamebiasis = pdis;
    //System.out.println(prob);
    break outer;
                   
    /*ResultSet rs4 = stmt1.executeQuery("SELECT COUNT(*) AS total FROM aids where symp[j]=1");
    while(rs4.next()){
    countdsymp = rs4.getInt("total");
    }*/
    
                   }
                }
            }
            double countdsymp = 0;
            double countcond = 0;
            double pcond = 0;
            double phew = 0;
            if(count==0)
            {
                pamebiasis = 0;
                //probability[i] = prob;
                
                       
            }
            else
            {
          for(i=0;i<args.length;i++)
            {
                for(j=0;j<symp.length;j++)
                {
                   if(symp[j].equals(args[i])) 
                   {
                        flag = 1;
                       ar[j] = 1;
                       Statement stmt1 = conn.createStatement();
                       //System.out.println(symp[j]);
                       
                       ResultSet rs4 = stmt1.executeQuery("SELECT COUNT(*) AS total FROM "+a+" where "+symp[j]+"=1");
    //ResultSet rs4 = stmt1.executeQuery("SELECT COUNT(*) AS total FROM aids where Sweating=1");
                       while(rs4.next()){
    countdsymp = rs4.getInt("total");
    }
                    //System.out.println(countdsymp);
                  psymp = countdsymp/countrows;
                  //System.out.println(psymp);
                  ResultSet rs5 = stmt1.executeQuery("SELECT COUNT(*) AS total FROM "+a+" where "+symp[j]+" =1 and "+a+" = 1;");
    while(rs5.next()){
    countcond = rs5.getInt("total");
    }               //System.out.println(countcond);
                  pcond = countcond/countrows;
                  phew = pcond/psymp;
                  pamebiasis*=phew;
                   }
                }
            }
                   }
            
           //System.out.println(pamebiasis);
            
    }
     catch(Exception e)
    {
        System.out.println(e);
    }
     if(flag==1)
             {
                 Statement stmt1 = conn.createStatement();
                 if(pamebiasis>0.3)
                 ar[6] = 1;
              String insert = "INSERT INTO airmed.amebiasis VALUES('"+ar[0]+"','"+ar[1]+"','"+ar[2]+"','"+ar[3]+"','"+ar[4]+"','"+ar[5]+"','"+ar[6]+"');";
stmt1.executeUpdate(insert);
             }
      
    
        
    }
    
}
