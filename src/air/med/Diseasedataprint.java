/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package air.med;

/**
 *
 * @author win-8
 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class Diseasedataprint {//display the database with black

    private static final int STATUS_COL = 6;

    private static JTable getTable(String a) throws SQLException {
        /*final String[] cols = {"col 1", "status", "col 3"};
        final String[][] data = {
                {"data", "active", "data"},
                {"data", "inactive", "data"},
                {"data", "inactive", "data"},
                {"data", "active", "data"}
        };*/
        Connection con = null;
   Statement st = null;
   ResultSet rs = null;
   String s;
   
//connect your app to mysql database
  
       //boolean autoReconnect;
        //boolean useSSL = false;
       con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airmed?useSSL=false","root","aman");
      
      // jdbc:mysql://localhost:3306/Peoples?autoReconnect=true&useSSL=false;
       st = con.createStatement();
       String str = a.toLowerCase();
       String tb = "airmed."+str;
       rs = st.executeQuery("select * from "+tb+"");
       ResultSetMetaData rsmt = rs.getMetaData();
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
        DefaultTableModel model = new DefaultTableModel(data, column);
        return new JTable(model) {
            @Override
            public Dimension getPreferredScrollableViewportSize() {
                return new Dimension(350, 150);
            }
        };
    }

    private static JTable getNewRenderedTable(final JTable table) {
        table.setDefaultRenderer(Object.class, new DefaultTableCellRenderer(){
            @Override
            public Component getTableCellRendererComponent(JTable table,
                    Object value, boolean isSelected, boolean hasFocus, int row, int col) {
                super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, col);
                String status = (String)table.getModel().getValueAt(row, STATUS_COL);
                Color white = new Color(255, 255, 255);
                table.getTableHeader().setBackground(white);
                table.setGridColor(Color.blue);
        table.getTableHeader().setForeground(Color.RED);
                if ("1".equals(status)||(" 1".equals(status))||(" 1 ".equals(status))||("1 ".equals(status))) {
                    setBackground(Color.BLACK);
                    setForeground(Color.WHITE);
                } else {
                    setBackground(table.getBackground());
                    setForeground(table.getForeground());
                }       
                return this;
            }   
        });
        return table;
    }

    public static void main(final String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            public void run() {
                try {
                 final JFrame frame = new JFrame();
        frame.setSize(500,120);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle(args[0]);
        JPanel panel = new JPanel();
        Color ivory = new Color(255, 255, 208);
        Color white = new Color(255, 255, 255);
        Color black = new Color(0, 0, 0);
        frame.setBackground(black);
        String a = args[0];
        JScrollPane jsp;
                    jsp = new JScrollPane(getNewRenderedTable(getTable(args[0])));
//table.setOpaque(true);
        jsp.getViewport().setBackground(white);
        panel.setLayout(new BorderLayout());
        panel.add(jsp,BorderLayout.CENTER);
        panel.setBackground(new Color(0,0,0));
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
        buttonPanel.setBackground(black);
        JButton clickmeButton = new JButton("Go Back");
        buttonPanel.add(clickmeButton);
        panel.add(buttonPanel,BorderLayout.SOUTH);
        //JOptionPane.showMessageDialog(null, new JScrollPane(getNewRenderedTable(())));
         //JOptionPane.showMessageDialog(null, new JScrollPane(getTable()));   
        //clickmeButton.addActionListener(this); 
        clickmeButton.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e)
    {
      frame.setVisible(false);
      Diseasedata ob = new Diseasedata();
      ob.setVisible(true);  
    }

            //To change body of generated methods, choose Tools | Templates.
           
       });
        frame.setContentPane(panel);
        
        frame.setVisible(true);
        frame.setExtendedState(frame.getExtendedState() | JFrame.MAXIMIZED_BOTH);
               
               
                } catch (SQLException ex) {
                    Logger.getLogger(Diseasedataprint.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
}