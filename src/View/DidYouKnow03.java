/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author jatawatsafe
 */
public class DidYouKnow03 extends javax.swing.JFrame {
    private String playName;
    private int score;
    
    /**
     * Creates new form TemplateJFrame
     */
    public DidYouKnow03() {
        initComponents();
    }
    
    public DidYouKnow03(String playName, int score) {
        this.playName = playName;
        this.score = score;
        initComponents();
        this.name.setText(playName);
        this.point.setText(this.score+" point");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        home = new javax.swing.JLabel();
        sitlogo = new javax.swing.JLabel();
        buttonPlayAgain = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        point = new javax.swing.JLabel();
        game4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("IT OPENHOUSE 2019");
        setMinimumSize(new java.awt.Dimension(846, 602));
        setName("IT OPENHOUSE 2019"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(846, 602));

        kGradientPanel1.setkEndColor(new java.awt.Color(238, 156, 167));
        kGradientPanel1.setkGradientFocus(90);
        kGradientPanel1.setkStartColor(new java.awt.Color(255, 221, 225));
        kGradientPanel1.setMaximumSize(new java.awt.Dimension(846, 602));
        kGradientPanel1.setMinimumSize(new java.awt.Dimension(846, 602));
        kGradientPanel1.setPreferredSize(new java.awt.Dimension(846, 602));

        home.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        home.setForeground(new java.awt.Color(255, 255, 255));
        home.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/images/Group.png"))); // NOI18N
        home.setText("WIP CAMP #11");
        home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeMouseClicked(evt);
            }
        });

        sitlogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/images/111.png"))); // NOI18N

        buttonPlayAgain.setBackground(new java.awt.Color(119, 0, 23));
        buttonPlayAgain.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonPlayAgain.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonPlayAgain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonPlayAgainMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonPlayAgainjpanel4exitedCheckButton(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonPlayAgainjpanel4enterCheckButton(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("PLAY AGAIN");

        javax.swing.GroupLayout buttonPlayAgainLayout = new javax.swing.GroupLayout(buttonPlayAgain);
        buttonPlayAgain.setLayout(buttonPlayAgainLayout);
        buttonPlayAgainLayout.setHorizontalGroup(
            buttonPlayAgainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonPlayAgainLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        buttonPlayAgainLayout.setVerticalGroup(
            buttonPlayAgainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonPlayAgainLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addContainerGap())
        );

        name.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name.setText("NAME");

        point.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        point.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        point.setText("point");

        game4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/images/game4.png"))); // NOI18N
        game4.setText("   ");

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(buttonPlayAgain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(331, 331, 331))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(sitlogo)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(542, 542, 542))))
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(196, 196, 196)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(game4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(point, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(game4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(point, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(buttonPlayAgain, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96)
                .addComponent(sitlogo)
                .addContainerGap())
        );

        getContentPane().add(kGradientPanel1, java.awt.BorderLayout.PAGE_START);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
        new HomePage().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_homeMouseClicked

    private void buttonPlayAgainMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonPlayAgainMouseClicked
        new DidYouKnow02(this.playName).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_buttonPlayAgainMouseClicked

    private void buttonPlayAgainjpanel4exitedCheckButton(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonPlayAgainjpanel4exitedCheckButton
        // TODO add your handling code here:
        resetButtonColor(buttonPlayAgain);
    }//GEN-LAST:event_buttonPlayAgainjpanel4exitedCheckButton

    private void buttonPlayAgainjpanel4enterCheckButton(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonPlayAgainjpanel4enterCheckButton
        // TODO add your handling code here:
        setButtonColor(buttonPlayAgain);
    }//GEN-LAST:event_buttonPlayAgainjpanel4enterCheckButton

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
            java.util.logging.Logger.getLogger(DidYouKnow03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DidYouKnow03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DidYouKnow03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DidYouKnow03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DidYouKnow03().setVisible(true);
            }
        });
    }
    
    public void setButtonColor(JPanel panel) {
        panel.setBackground(new java.awt.Color(214, 81, 107));
    }

    public void resetButtonColor(JPanel panel) {
        panel.setBackground(new java.awt.Color(119,0,23));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel buttonPlayAgain;
    private javax.swing.JLabel game4;
    private javax.swing.JLabel home;
    private javax.swing.JLabel jLabel6;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel name;
    private javax.swing.JLabel point;
    private javax.swing.JLabel sitlogo;
    // End of variables declaration//GEN-END:variables
}
