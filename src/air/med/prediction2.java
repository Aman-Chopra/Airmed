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
public class prediction2 extends javax.swing.JFrame {

    /**
     * Creates new form prediction2
     */
    public prediction2() {
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

        bookapp = new javax.swing.JLabel();
        chat = new javax.swing.JLabel();
        Profile = new javax.swing.JLabel();
        Logout = new javax.swing.JLabel();
        Close = new javax.swing.JLabel();
        Minimize = new javax.swing.JLabel();
        Home = new javax.swing.JLabel();
        percentage = new javax.swing.JLabel();
        Disease = new javax.swing.JLabel();
        BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bookapp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bookapp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookappMouseClicked(evt);
            }
        });
        getContentPane().add(bookapp, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 270, 20));

        chat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        chat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chatMouseClicked(evt);
            }
        });
        getContentPane().add(chat, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 100, 280, 20));

        Profile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Profile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProfileMouseClicked(evt);
            }
        });
        getContentPane().add(Profile, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 100, 110, 20));

        Logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutMouseClicked(evt);
            }
        });
        getContentPane().add(Logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 190, 80, 20));

        Close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseMouseClicked(evt);
            }
        });
        getContentPane().add(Close, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 10, 30, 40));

        Minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MinimizeMouseClicked(evt);
            }
        });
        getContentPane().add(Minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 10, 30, 40));

        Home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeMouseClicked(evt);
            }
        });
        getContentPane().add(Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 70, 20));

        percentage.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(percentage, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 450, 160, 30));

        Disease.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(Disease, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 340, 200, 30));

        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/air/med/PREDICTION2.jpg"))); // NOI18N
        getContentPane().add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1500, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseClicked
Home ob = new Home();
this.setVisible(false);
ob.setVisible(true);          // TODO add your handling code here:
    }//GEN-LAST:event_HomeMouseClicked

    private void MinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizeMouseClicked
this.setState(this.ICONIFIED);          // TODO add your handling code here:
    }//GEN-LAST:event_MinimizeMouseClicked

    private void CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseMouseClicked
System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_CloseMouseClicked

    private void LogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMouseClicked
patientlogin ob = new patientlogin();
this.setVisible(false);
ob.setVisible(true);             // TODO add your handling code here:
    }//GEN-LAST:event_LogoutMouseClicked

    private void ProfileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProfileMouseClicked
userprofile ob = new userprofile();
this.setVisible(false);
ob.setVisible(true);         // TODO add your handling code here:
    }//GEN-LAST:event_ProfileMouseClicked

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

    private void bookappMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookappMouseClicked
appointment1 ob = new appointment1();
this.setVisible(false);
ob.setVisible(true);             // TODO add your handling code here:
    }//GEN-LAST:event_bookappMouseClicked

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
            java.util.logging.Logger.getLogger(prediction2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(prediction2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(prediction2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(prediction2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new prediction2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JLabel Close;
    public javax.swing.JLabel Disease;
    private javax.swing.JLabel Home;
    private javax.swing.JLabel Logout;
    private javax.swing.JLabel Minimize;
    private javax.swing.JLabel Profile;
    private javax.swing.JLabel bookapp;
    private javax.swing.JLabel chat;
    public javax.swing.JLabel percentage;
    // End of variables declaration//GEN-END:variables
}
