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
public class Docprofile extends javax.swing.JFrame {

    /**
     * Creates new form Docprofile
     */
    public Docprofile() {
        initComponents();
        jLabel1.setText(doctorone.naam);
        jLabel2.setText(doctorone.docname);
        jLabel3.setText(doctorone.specialization);
        jLabel4.setText(doctorone.City);
        jLabel5.setText(doctorone.State);
        jLabel6.setText(doctorone.Pin);
        jLabel7.setText(doctorone.Phone);
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
        Change = new javax.swing.JLabel();
        Home = new javax.swing.JLabel();
        Minimize = new javax.swing.JLabel();
        disease = new javax.swing.JLabel();
        Logout = new javax.swing.JLabel();
        mtp = new javax.swing.JLabel();
        Notification = new javax.swing.JLabel();
        Close = new javax.swing.JLabel();
        BG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 290, 220, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 350, 240, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 410, 230, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 470, 230, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 530, 240, 20));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 590, 240, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 640, 250, 30));

        Change.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Change.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChangeMouseClicked(evt);
            }
        });
        getContentPane().add(Change, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 630, 50, 60));

        Home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeMouseClicked(evt);
            }
        });
        getContentPane().add(Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 70, 20));

        Minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MinimizeMouseClicked(evt);
            }
        });
        getContentPane().add(Minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 10, 30, 40));

        disease.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        disease.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                diseaseMouseClicked(evt);
            }
        });
        getContentPane().add(disease, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 100, 250, 20));

        Logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutMouseClicked(evt);
            }
        });
        getContentPane().add(Logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 180, 80, 20));

        mtp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mtp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mtpMouseClicked(evt);
            }
        });
        getContentPane().add(mtp, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 90, 290, 30));

        Notification.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Notification.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NotificationMouseClicked(evt);
            }
        });
        getContentPane().add(Notification, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 190, 20));

        Close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseMouseClicked(evt);
            }
        });
        getContentPane().add(Close, new org.netbeans.lib.awtextra.AbsoluteConstraints(1300, 10, 30, 40));

        BG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/air/med/DOC-PROFILE.jpg"))); // NOI18N
        getContentPane().add(BG, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1500, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizeMouseClicked
this.setState(this.ICONIFIED);        // TODO add your handling code here:
    }//GEN-LAST:event_MinimizeMouseClicked

    private void CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseMouseClicked
System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_CloseMouseClicked

    private void HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseClicked
Home ob = new Home();
this.setVisible(false);
ob.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_HomeMouseClicked

    private void LogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMouseClicked
doctorone ob = new doctorone();
this.setVisible(false);
ob.setVisible(true);         // TODO add your handling code here:
    }//GEN-LAST:event_LogoutMouseClicked

    private void diseaseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_diseaseMouseClicked
Diseasedata ob = new Diseasedata();
this.setVisible(false);
ob.setVisible(true);         // TODO add your handling code here:
    }//GEN-LAST:event_diseaseMouseClicked

    private void NotificationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NotificationMouseClicked
Notification ob = new Notification();
this.setVisible(false);
ob.setVisible(true);         // TODO add your handling code here:
    }//GEN-LAST:event_NotificationMouseClicked

    private void mtpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mtpMouseClicked
Docmessage ob = new Docmessage();
this.setVisible(false);
ob.setVisible(true);         // TODO add your handling code here:
    }//GEN-LAST:event_mtpMouseClicked

    private void ChangeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChangeMouseClicked
Docnewno ob = new Docnewno();
this.setVisible(false);
ob.setVisible(true);         // TODO add your handling code here:
    }//GEN-LAST:event_ChangeMouseClicked

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
            java.util.logging.Logger.getLogger(Docprofile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Docprofile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Docprofile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Docprofile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Docprofile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BG;
    private javax.swing.JLabel Change;
    private javax.swing.JLabel Close;
    private javax.swing.JLabel Home;
    private javax.swing.JLabel Logout;
    private javax.swing.JLabel Minimize;
    private javax.swing.JLabel Notification;
    private javax.swing.JLabel disease;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel mtp;
    // End of variables declaration//GEN-END:variables
}