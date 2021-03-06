/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package air.med;

import static air.med.patientlogin.username;
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
public class Medical2 extends javax.swing.JFrame {

    /**
     * Creates new form Medical2
     */
    public Medical2() {
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

        jComboBox1 = new javax.swing.JComboBox<>();
        jCheckBox1 = new javax.swing.JCheckBox();
        cart = new javax.swing.JLabel();
        Password = new javax.swing.JLabel();
        passfield = new javax.swing.JPasswordField();
        Pay = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Profile = new javax.swing.JLabel();
        chat = new javax.swing.JLabel();
        Home = new javax.swing.JLabel();
        Close = new javax.swing.JLabel();
        bookapp = new javax.swing.JLabel();
        Predict = new javax.swing.JLabel();
        Minimize = new javax.swing.JLabel();
        Logout = new javax.swing.JLabel();
        BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Netbanking\t", "Credit_Card", "Cash on Delivery" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 340, 200, -1));
        getContentPane().add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 590, -1, -1));

        cart.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cartMouseClicked(evt);
            }
        });
        getContentPane().add(cart, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 170, 180, 80));

        Password.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Password.setText("PASSWORD");
        getContentPane().add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 440, -1, 30));

        passfield.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(passfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 440, 210, -1));

        Pay.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Pay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PayMouseClicked(evt);
            }
        });
        getContentPane().add(Pay, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 660, 170, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 255));
        jLabel1.setText("Terms");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 590, -1, -1));

        Profile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Profile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProfileMouseClicked(evt);
            }
        });
        getContentPane().add(Profile, new org.netbeans.lib.awtextra.AbsoluteConstraints(1210, 100, 110, 20));

        chat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chatMouseClicked(evt);
            }
        });
        getContentPane().add(chat, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 100, 270, 20));

        Home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeMouseClicked(evt);
            }
        });
        getContentPane().add(Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 80, 20));

        Close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseMouseClicked(evt);
            }
        });
        getContentPane().add(Close, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 10, 30, 40));

        bookapp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bookapp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookappMouseClicked(evt);
            }
        });
        getContentPane().add(bookapp, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 260, 20));

        Predict.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Predict.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PredictMouseClicked(evt);
            }
        });
        getContentPane().add(Predict, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 100, 230, 20));

        Minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MinimizeMouseClicked(evt);
            }
        });
        getContentPane().add(Minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 10, 30, 40));

        Logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutMouseClicked(evt);
            }
        });
        getContentPane().add(Logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 200, 80, 20));

        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/air/med/MEDSTORE2.jpg"))); // NOI18N
        getContentPane().add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1500, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cartMouseClicked
JOptionPane.showMessageDialog(this, "ID = "+formedicines.id+"\nQuantity = "+formedicines.quantity+"\nTotal Cost = "+formedicines.rate);        // TODO add your handling code here:
    }//GEN-LAST:event_cartMouseClicked

    private void PayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PayMouseClicked

  //not checked
        if(!(jCheckBox1.isSelected()))  
{
    JOptionPane.showMessageDialog(this, "Please accept the terms and conditions");
    return;
}
char[] password = passfield.getPassword();
      String pass = new String(password);
if(pass.length()==0)
{
    JOptionPane.showMessageDialog(this, "Empty password field");
         return;
}
String mode = jComboBox1.getSelectedItem().toString();

try{
 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/airmed?useSSL=false","root", "aman");
            Statement stmt = con.createStatement();
            
            
            
            
            


ResultSet rs = stmt.executeQuery("Select Password from plogin where User_id = '"+patientlogin.username+"';");
            while(rs.next())
            {
               String dp = AESCrypt.decrypt(rs.getString("Password"));
               if(dp.equals(pass))
               {
                  JOptionPane.showMessageDialog(this, "Congratulations! Your order is being successfully received\n Mode of payment is "+mode);
                  Userfrontpage ob = new Userfrontpage();
                  this.setVisible(false);
                  ob.setVisible(true);
                  
                  
                  return; 
               }
               
               }
            JOptionPane.showMessageDialog(this, "Incorrect password...\nPlease re-enter");
                    return;
}
catch (SQLException ex) {
            Logger.getLogger(patientlogin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(Medical2.class.getName()).log(Level.SEVERE, null, ex);
        } 

                  
                  




// TODO add your handling code here:
    }//GEN-LAST:event_PayMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
       JOptionPane.showMessageDialog(this, "The cliche terms and conditions..."); 
return;// TODO add your handling code here:
    }//GEN-LAST:event_jLabel1MouseClicked

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

    private void PredictMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PredictMouseClicked
prediction1 ob = new prediction1();
this.setVisible(false);
ob.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_PredictMouseClicked

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

    private void ProfileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProfileMouseClicked
userprofile ob = new userprofile();
this.setVisible(false);
ob.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_ProfileMouseClicked

    private void LogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMouseClicked
patientlogin ob = new patientlogin();
this.setVisible(false);
ob.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_LogoutMouseClicked

    private void MinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizeMouseClicked
this.setState(this.ICONIFIED);        // TODO add your handling code here:
    }//GEN-LAST:event_MinimizeMouseClicked

    private void CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseMouseClicked
System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_CloseMouseClicked

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
            java.util.logging.Logger.getLogger(Medical2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Medical2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Medical2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Medical2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Medical2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JLabel Close;
    private javax.swing.JLabel Home;
    private javax.swing.JLabel Logout;
    private javax.swing.JLabel Minimize;
    private javax.swing.JLabel Password;
    private javax.swing.JLabel Pay;
    private javax.swing.JLabel Predict;
    private javax.swing.JLabel Profile;
    private javax.swing.JLabel bookapp;
    private javax.swing.JLabel cart;
    private javax.swing.JLabel chat;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField passfield;
    // End of variables declaration//GEN-END:variables
}
