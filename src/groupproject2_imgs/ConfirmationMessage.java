package groupproject2_imgs;


import java.awt.Color;
import java.awt.Cursor;
import java.awt.Frame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author prathibha
 */
public class ConfirmationMessage extends javax.swing.JFrame {

    /**
     * Creates new form ConfirmationMessage
     */
    
    int xmouse;
    int ymouse;
    int x=12;
    
    public ConfirmationMessage(String message,String messageType) {
        initComponents();
        
        message(message,messageType);
    }
    
    public int returnv(){
        System.out.println("inside-" + x);
        return x;
    }
    public void message(String m,String mt){
        message.setText(m);
        messagetype.setText(mt);
    }
    
    public int returnvalue(){
        return x;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        messagetype = new javax.swing.JLabel();
        message = new javax.swing.JLabel();
        lblClose = new javax.swing.JLabel();
        lblminimize = new javax.swing.JLabel();
        btnok = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setSize(new java.awt.Dimension(500, 150));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        messagetype.setFont(new java.awt.Font("Avenir Next", 0, 24)); // NOI18N
        messagetype.setForeground(new java.awt.Color(255, 255, 255));
        messagetype.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        messagetype.setText("Warning");
        getContentPane().add(messagetype, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 27, 380, 30));

        message.setFont(new java.awt.Font("Avenir", 0, 16)); // NOI18N
        message.setForeground(new java.awt.Color(255, 255, 255));
        message.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        message.setText("Image already selected..!!!");
        getContentPane().add(message, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 70, 410, 30));

        lblClose.setFont(new java.awt.Font("Avenir Next", 1, 18)); // NOI18N
        lblClose.setText("X");
        lblClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblCloseMousePressed(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCloseMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCloseMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCloseMouseEntered(evt);
            }
        });
        getContentPane().add(lblClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 5, 17, 20));

        lblminimize.setFont(new java.awt.Font("Helvetica", 1, 24)); // NOI18N
        lblminimize.setText("-");
        lblminimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblminimizeMousePressed(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblminimizeMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblminimizeMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblminimizeMouseEntered(evt);
            }
        });
        getContentPane().add(lblminimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 5, 17, 20));

        btnok.setFont(new java.awt.Font("Avenir", 0, 14)); // NOI18N
        btnok.setText("OK");
        btnok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnokActionPerformed(evt);
            }
        });
        getContentPane().add(btnok, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, -1, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/groupproject2_imgs/images/messageSmall.png"))); // NOI18N
        background.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                backgroundMouseDragged(evt);
            }
        });
        background.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                backgroundMousePressed(evt);
            }
        });
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 150));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblCloseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMousePressed
        // TODO add your handling code here:
        lblClose.setForeground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_lblCloseMousePressed

    private void lblCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseClicked
        // TODO add your handling code here:
        lblClose.setForeground(Color.LIGHT_GRAY);
        this.dispose();
    }//GEN-LAST:event_lblCloseMouseClicked

    private void lblCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseExited
        // TODO add your handling code here:
        setCursor(Cursor.DEFAULT_CURSOR);
        lblClose.setForeground(Color.black);
    }//GEN-LAST:event_lblCloseMouseExited

    private void lblCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseEntered
        // TODO add your handling code here:
        setCursor(Cursor.HAND_CURSOR);
        lblClose.setForeground(Color.white);
    }//GEN-LAST:event_lblCloseMouseEntered

    private void lblminimizeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblminimizeMousePressed
        // TODO add your handling code here:
        lblminimize.setForeground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_lblminimizeMousePressed

    private void lblminimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblminimizeMouseClicked
        // TODO add your handling code here:
        lblminimize.setForeground(Color.LIGHT_GRAY);
        setState(Frame.ICONIFIED);
    }//GEN-LAST:event_lblminimizeMouseClicked

    private void lblminimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblminimizeMouseExited
        // TODO add your handling code here:
        setCursor(Cursor.DEFAULT_CURSOR);
        lblminimize.setForeground(Color.black);
    }//GEN-LAST:event_lblminimizeMouseExited

    private void lblminimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblminimizeMouseEntered
        // TODO add your handling code here:
        setCursor(Cursor.HAND_CURSOR);
        lblminimize.setForeground(Color.white);
    }//GEN-LAST:event_lblminimizeMouseEntered

    private void backgroundMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backgroundMouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xmouse, y-ymouse);
    }//GEN-LAST:event_backgroundMouseDragged

    private void backgroundMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backgroundMousePressed
        // TODO add your handling code here:
        xmouse = evt.getX();
        ymouse = evt.getY();
    }//GEN-LAST:event_backgroundMousePressed

    private void btnokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnokActionPerformed
        // TODO add your handling code here:
        
        this.dispose();
        
    }//GEN-LAST:event_btnokActionPerformed

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
            java.util.logging.Logger.getLogger(ConfirmationMessage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConfirmationMessage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConfirmationMessage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConfirmationMessage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new ConfirmationMessage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton btnok;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblminimize;
    private javax.swing.JLabel message;
    private javax.swing.JLabel messagetype;
    // End of variables declaration//GEN-END:variables
}