/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package air.med;

import static air.med.doctorsiup.usr;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author win-8
 */
public class appointment1 extends javax.swing.JFrame {
public static String a = "";
    /**
     * Creates new form appointment1
     */
    public appointment1() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        database = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Submit = new javax.swing.JLabel();
        Home = new javax.swing.JLabel();
        pd = new javax.swing.JLabel();
        profile = new javax.swing.JLabel();
        chat = new javax.swing.JLabel();
        Close = new javax.swing.JLabel();
        Minimize = new javax.swing.JLabel();
        Logout = new javax.swing.JLabel();
        BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 570, 280, 30));

        database.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        database.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                databaseMouseClicked(evt);
            }
        });
        getContentPane().add(database, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 410, 570, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Select Doctor ID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(514, 564, 190, 40));

        Submit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Submit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SubmitMouseClicked(evt);
            }
        });
        getContentPane().add(Submit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 680, 70, 80));

        Home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeMouseClicked(evt);
            }
        });
        getContentPane().add(Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 70, 20));

        pd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pdMouseClicked(evt);
            }
        });
        getContentPane().add(pd, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 100, 220, 20));

        profile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        profile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profileMouseClicked(evt);
            }
        });
        getContentPane().add(profile, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 100, 110, 20));

        chat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chatMouseClicked(evt);
            }
        });
        getContentPane().add(chat, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 100, 270, 20));

        Close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseMouseClicked(evt);
            }
        });
        getContentPane().add(Close, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 10, 30, 40));

        Minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MinimizeMouseClicked(evt);
            }
        });
        getContentPane().add(Minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 10, 30, 40));

        Logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutMouseClicked(evt);
            }
        });
        getContentPane().add(Logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 190, 70, 20));

        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/air/med/appointment1.jpg"))); // NOI18N
        getContentPane().add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1500, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void databaseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_databaseMouseClicked
String ar[] = {"doctordetails"};
showdata.main(ar);
// TODO add your handling code here:
    }//GEN-LAST:event_databaseMouseClicked

    private void SubmitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubmitMouseClicked
a = jTextField1.getText();
if(a.length()==0)
{
    JOptionPane.showMessageDialog(this, "Necessary fields are empty");
                return;
}
if(a.length()>45)
{
    JOptionPane.showMessageDialog(this, "Invalid ID!");
                return;
}
int counter = 0;
Connection con = null;
 try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airmed?useSSL=false","root", "aman");
            Statement stmt = con.createStatement();
            Statement stmt1 = con.createStatement();
            String stm = "SELECT COUNT(*) AS total from airmed.doctordetails WHERE doc_ID = '" + a + "'";
            ResultSet rs1 = stmt.executeQuery(stm);
    while(rs1.next()){
    counter = rs1.getInt("total");
    }
    if(counter==0)
    {
        JOptionPane.showMessageDialog(this, "This Doctor ID is not found!");
        jTextField1.setText("");
        return;
    }
 }
 catch (SQLException ex) {
            Logger.getLogger(patientlogin.class.getName()).log(Level.SEVERE, null, ex);
        } 
 appointment2 ob = new appointment2();
 this.setVisible(false);
 ob.setVisible(true);
    // TODO add your handling code here:
    }//GEN-LAST:event_SubmitMouseClicked

    private void HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseClicked
Home ob = new Home();
this.setVisible(false);
ob.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_HomeMouseClicked

    private void pdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pdMouseClicked
prediction1 ob = new prediction1();
this.setVisible(false);
ob.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_pdMouseClicked

    private void chatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chatMouseClicked
try{
        userchat ob = new userchat();
this.setVisible(false);
ob.setVisible(true); 
}
catch(Exception e)
{
}// TODO add your handling code here:
    }//GEN-LAST:event_chatMouseClicked

    private void profileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileMouseClicked
userprofile ob = new userprofile();
this.setVisible(false);
ob.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_profileMouseClicked

    private void LogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMouseClicked
patientlogin ob = new patientlogin();
this.setVisible(false);
ob.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_LogoutMouseClicked

    private void CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseMouseClicked
 System.exit(0);         // TODO add your handling code here:
    }//GEN-LAST:event_CloseMouseClicked

    private void MinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizeMouseClicked
   this.setState(this.ICONIFIED);    // TODO add your handling code here:
    }//GEN-LAST:event_MinimizeMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(appointment1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(appointment1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(appointment1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(appointment1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new appointment1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JLabel Close;
    private javax.swing.JLabel Home;
    private javax.swing.JLabel Logout;
    private javax.swing.JLabel Minimize;
    private javax.swing.JLabel Submit;
    private javax.swing.JLabel chat;
    private javax.swing.JLabel database;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel pd;
    private javax.swing.JLabel profile;
    // End of variables declaration//GEN-END:variables
}
