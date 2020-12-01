package visual;

import javax.swing.JOptionPane;

/**
 *
 * @author Rodrigo <toyama.rodrigo@gmail.com>
 */
public class menu extends javax.swing.JFrame {

    public menu() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    String levelOption;
    public static int levelMovements;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelTitle = new javax.swing.JLabel();
        lblLevel = new javax.swing.JLabel();
        btnEasy = new javax.swing.JButton();
        btnInfo = new javax.swing.JButton();
        btnMedium = new javax.swing.JButton();
        btnHard = new javax.swing.JButton();
        btnImpossible = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelTitle.setFont(new java.awt.Font("Bebas Neue", 0, 24)); // NOI18N
        labelTitle.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelTitle.setText("Difficulty");
        getContentPane().add(labelTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 90, -1));

        lblLevel.setFont(new java.awt.Font("Bebas Neue", 0, 36)); // NOI18N
        lblLevel.setText("MEMOPOKER");
        getContentPane().add(lblLevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 150, -1));

        btnEasy.setBackground(new java.awt.Color(204, 255, 204));
        btnEasy.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        btnEasy.setText("Easy");
        btnEasy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEasyActionPerformed(evt);
            }
        });
        getContentPane().add(btnEasy, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 100, 30));

        btnInfo.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        btnInfo.setText("Info");
        btnInfo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoActionPerformed(evt);
            }
        });
        getContentPane().add(btnInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 100, 30));

        btnMedium.setBackground(new java.awt.Color(255, 255, 204));
        btnMedium.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        btnMedium.setText("Medium");
        btnMedium.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMediumActionPerformed(evt);
            }
        });
        getContentPane().add(btnMedium, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 100, 30));

        btnHard.setBackground(new java.awt.Color(255, 204, 153));
        btnHard.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        btnHard.setText("Hard");
        btnHard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHardActionPerformed(evt);
            }
        });
        getContentPane().add(btnHard, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 100, 30));

        btnImpossible.setBackground(new java.awt.Color(255, 102, 102));
        btnImpossible.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        btnImpossible.setText("Impossible");
        btnImpossible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImpossibleActionPerformed(evt);
            }
        });
        getContentPane().add(btnImpossible, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 100, 30));

        btnExit.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 430, 70, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pokerBackground.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnHardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHardActionPerformed
        levelOption = JOptionPane.showInputDialog("¿Jugar en dificultad dificil? (30 movimientos) Y / N").toLowerCase();

        switch (levelOption) {
            case "y":
            case "yes":
            case "si":
                levelMovements = 30;
                System.out.println("levelMovements: " + levelMovements);
                game game = new game();
                game.setVisible(true);
                this.dispose();
                break;
            case "n":
            case "no":
                menu menu = new menu();
                menu.setVisible(true);
                this.dispose();
                break;
            default:
                JOptionPane.showMessageDialog(null, levelOption + ", no es una opcion correcta");
                break;
        }
    }//GEN-LAST:event_btnHardActionPerformed

    private void btnMediumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMediumActionPerformed
        levelOption = JOptionPane.showInputDialog("¿Jugar en dificultad normal? (40 movimientos) Y / N").toLowerCase();

        switch (levelOption) {
            case "y":
            case "yes":
            case "si":
                levelMovements = 40;
                System.out.println("levelMovements: " + levelMovements);
                game game = new game();
                game.setVisible(true);
                this.dispose();
                break;
            case "n":
            case "no":
                menu menu = new menu();
                menu.setVisible(true);
                this.dispose();
                break;
            default:
                JOptionPane.showMessageDialog(null, levelOption + ", no es una opcion correcta");
                break;
        }
    }//GEN-LAST:event_btnMediumActionPerformed

    private void btnInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoActionPerformed
        info info = new info();
        info.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnInfoActionPerformed

    private void btnEasyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEasyActionPerformed

        levelOption = JOptionPane.showInputDialog("¿Jugar en dificultad facíl? (50 movimientos) Y / N").toLowerCase();

        switch (levelOption) {
            case "y":
            case "yes":
            case "si":
                levelMovements = 50;
                System.out.println("levelMovements: " + levelMovements);
                game game = new game();
                game.setVisible(true);
                this.dispose();
                break;

            case "n":
            case "no":
                menu menu = new menu();
                menu.setVisible(true);
                this.dispose();
                break;
            default:
                JOptionPane.showMessageDialog(null, levelOption + ", no es una opcion correcta");
                break;
        }
    }//GEN-LAST:event_btnEasyActionPerformed

    private void btnImpossibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImpossibleActionPerformed

        levelOption = JOptionPane.showInputDialog("¿Jugar en dificultad Imposible? (14 movimientos) Y / N").toLowerCase();

        switch (levelOption) {
            case "y":
            case "yes":
            case "si":
                levelMovements = 14;
                System.out.println("levelMovements: " + levelMovements);
                game game = new game();
                game.setVisible(true);
                this.dispose();
                break;

            case "n":
            case "no":
                menu menu = new menu();
                menu.setVisible(true);
                this.dispose();
                break;
            default:
                JOptionPane.showMessageDialog(null, levelOption + ", no es una opcion correcta");
                break;
        }
    }//GEN-LAST:event_btnImpossibleActionPerformed

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
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEasy;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnHard;
    private javax.swing.JButton btnImpossible;
    private javax.swing.JButton btnInfo;
    private javax.swing.JButton btnMedium;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JLabel lblLevel;
    // End of variables declaration//GEN-END:variables
}
