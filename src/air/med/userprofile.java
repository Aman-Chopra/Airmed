/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package air.med;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author win-8
 */
public class userprofile extends javax.swing.JFrame {

    /**
     * Creates new form userprofile
     */
    public userprofile() {
        initComponents();
        jLabel1.setText(patientlogin.naam);
        jLabel2.setText(patientlogin.username);
        jLabel3.setText(patientlogin.Email);
        jLabel4.setText(patientlogin.City);
        jLabel5.setText(patientlogin.State);
        jLabel6.setText(patientlogin.Pin);
        jLabel7.setText(patientlogin.Phone);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Home = new javax.swing.JLabel();
        bookapp = new javax.swing.JLabel();
        Logout = new javax.swing.JLabel();
        predict = new javax.swing.JLabel();
        chat = new javax.swing.JLabel();
        Minimize = new javax.swing.JLabel();
        Close = new javax.swing.JLabel();
        Database = new javax.swing.JLabel();
        BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 300, 220, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 354, 240, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 404, 220, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 474, 220, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 524, 220, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 584, 230, 20));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 644, 220, 20));

        Home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeMouseClicked(evt);
            }
        });
        getContentPane().add(Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 70, 20));

        bookapp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bookapp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookappMouseClicked(evt);
            }
        });
        getContentPane().add(bookapp, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 260, 20));

        Logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutMouseClicked(evt);
            }
        });
        getContentPane().add(Logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 180, 70, 20));

        predict.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        predict.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                predictMouseClicked(evt);
            }
        });
        getContentPane().add(predict, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 100, 230, 20));

        chat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chatMouseClicked(evt);
            }
        });
        getContentPane().add(chat, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 100, 270, 20));

        Minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MinimizeMouseClicked(evt);
            }
        });
        getContentPane().add(Minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 10, 40, 40));

        Close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseMouseClicked(evt);
            }
        });
        getContentPane().add(Close, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 10, 30, 40));

        Database.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Database.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DatabaseMouseClicked(evt);
            }
        });
        Database.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                DatabaseKeyPressed(evt);
            }
        });
        getContentPane().add(Database, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 630, 90, 90));

        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/air/med/userprofile.jpg"))); // NOI18N
        getContentPane().add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1500, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseClicked
Home ob = new Home();
this.setVisible(false);
ob.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_HomeMouseClicked

    private void bookappMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookappMouseClicked
appointment1 ob = new appointment1();
this.setVisible(false);
ob.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_bookappMouseClicked

    private void predictMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_predictMouseClicked
prediction1 ob = new prediction1();
this.setVisible(false);
ob.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_predictMouseClicked

    private void chatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chatMouseClicked
try{
        userchat ob = new userchat();
this.setVisible(false);
ob.setVisible(true);  
}
catch(Exception e)
{}// TODO add your handling code here:
    }//GEN-LAST:event_chatMouseClicked

    private void LogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMouseClicked
patientlogin ob = new patientlogin();
this.setVisible(false);
ob.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_LogoutMouseClicked

    private void CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseMouseClicked
System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_CloseMouseClicked

    private void MinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizeMouseClicked
this.setState(this.ICONIFIED);        // TODO add your handling code here:
    }//GEN-LAST:event_MinimizeMouseClicked

    private void DatabaseKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DatabaseKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_DatabaseKeyPressed

    private void DatabaseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DatabaseMouseClicked
   String a = patientlogin.username;
   a = "pat"+a;
   String ar[] = {a};
   
   /*Connection con = null;
   Statement st = null;
   ResultSet rs = null;
   String s;

//connect your app to mysql database
   try{
       con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airmed?useSSL=false","root","aman");
       st = con.createStatement();
       String tb = args[0];
       rs = st.executeQuery("select * from "+tb+"");
   }*/
   
   
   
   
   
   
   
   
   
   
   showuser.main(ar);
// TODO add your handling code here:
    }//GEN-LAST:event_DatabaseMouseClicked

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
            java.util.logging.Logger.getLogger(userprofile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(userprofile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(userprofile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(userprofile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new userprofile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JLabel Close;
    private javax.swing.JLabel Database;
    private javax.swing.JLabel Home;
    private javax.swing.JLabel Logout;
    private javax.swing.JLabel Minimize;
    private javax.swing.JLabel bookapp;
    private javax.swing.JLabel chat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel predict;
    // End of variables declaration//GEN-END:variables
}
