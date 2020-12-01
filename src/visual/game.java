package visual;

import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author Rodrigo <toyama.rodrigo@gmail.com>
 */
public class game extends javax.swing.JFrame {

    public game() {
        initComponents();
        this.setLocationRelativeTo(null);
        btnCard1.setEnabled(false);
        btnCard2.setEnabled(false);
        btnCard3.setEnabled(false);
        btnCard4.setEnabled(false);
        btnCard5.setEnabled(false);
        btnCard6.setEnabled(false);
        btnCard7.setEnabled(false);
        btnCard8.setEnabled(false);
        btnCard9.setEnabled(false);
        btnCard10.setEnabled(false);
        btnCard11.setEnabled(false);
        btnCard12.setEnabled(false);
        btnCard13.setEnabled(false);
        btnCard14.setEnabled(false);
        btnCard15.setEnabled(false);
        btnCard16.setEnabled(false);
        btnCard17.setEnabled(false);
        btnCard18.setEnabled(false);
        btnCard19.setEnabled(false);
        btnCard20.setEnabled(false);
        btnCard21.setEnabled(false);
        btnCard22.setEnabled(false);
        btnCard23.setEnabled(false);
        btnCard24.setEnabled(false);
    }

    boolean revealCard1 = false;
    boolean revealCard2 = false;

    Random random = new Random();
    int[] cards = new int[24];
    int i, j, cardCounter = 0, counterTries = 0;

    JButton[] buttons = new JButton[2];
    ImageIcon image1, image2;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnInfo = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        labelCounter = new javax.swing.JLabel();
        labelMaxMoves = new javax.swing.JLabel();
        btnStart = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        lblCounter = new javax.swing.JLabel();
        lblMaxMoves = new javax.swing.JLabel();
        btnCard1 = new javax.swing.JButton();
        btnCard2 = new javax.swing.JButton();
        btnCard3 = new javax.swing.JButton();
        btnCard4 = new javax.swing.JButton();
        btnCard5 = new javax.swing.JButton();
        btnCard6 = new javax.swing.JButton();
        btnCard7 = new javax.swing.JButton();
        btnCard8 = new javax.swing.JButton();
        btnCard9 = new javax.swing.JButton();
        btnCard10 = new javax.swing.JButton();
        btnCard11 = new javax.swing.JButton();
        btnCard12 = new javax.swing.JButton();
        btnCard13 = new javax.swing.JButton();
        btnCard14 = new javax.swing.JButton();
        btnCard15 = new javax.swing.JButton();
        btnCard16 = new javax.swing.JButton();
        btnCard17 = new javax.swing.JButton();
        btnCard18 = new javax.swing.JButton();
        btnCard19 = new javax.swing.JButton();
        btnCard20 = new javax.swing.JButton();
        btnCard21 = new javax.swing.JButton();
        btnCard22 = new javax.swing.JButton();
        btnCard23 = new javax.swing.JButton();
        btnCard24 = new javax.swing.JButton();
        lblGameBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(867, 112, -1, 517));

        btnInfo.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        btnInfo.setText("Info");
        btnInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoActionPerformed(evt);
            }
        });

        btnReset.setBackground(new java.awt.Color(255, 255, 153));
        btnReset.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        labelCounter.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        labelCounter.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelCounter.setText("Counter");

        labelMaxMoves.setFont(new java.awt.Font("Bebas Neue", 0, 20)); // NOI18N
        labelMaxMoves.setText("Max Moves");

        btnStart.setBackground(new java.awt.Color(153, 255, 153));
        btnStart.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        btnStart.setText("Start");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(255, 153, 153));
        btnExit.setFont(new java.awt.Font("Bebas Neue", 0, 18)); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        lblCounter.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lblMaxMoves.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(btnInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(labelCounter, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblMaxMoves, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblCounter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelMaxMoves)
                        .addComponent(btnStart, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                        .addComponent(btnReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(labelCounter)
                .addGap(9, 9, 9)
                .addComponent(lblCounter, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelMaxMoves)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMaxMoves, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 196, Short.MAX_VALUE)
                .addComponent(btnStart, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInfo)
                    .addComponent(btnExit))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, 607));

        btnCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/backcard.png"))); // NOI18N
        btnCard1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCard1MouseExited(evt);
            }
        });
        btnCard1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCard1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCard1, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 16, 95, -1));

        btnCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/backcard.png"))); // NOI18N
        btnCard2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCard2MouseExited(evt);
            }
        });
        btnCard2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCard2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCard2, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 16, 95, -1));

        btnCard3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/backcard.png"))); // NOI18N
        btnCard3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCard3MouseExited(evt);
            }
        });
        btnCard3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCard3ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCard3, new org.netbeans.lib.awtextra.AbsoluteConstraints(429, 16, 95, -1));

        btnCard4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/backcard.png"))); // NOI18N
        btnCard4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCard4MouseExited(evt);
            }
        });
        btnCard4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCard4ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCard4, new org.netbeans.lib.awtextra.AbsoluteConstraints(542, 16, 95, -1));

        btnCard5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/backcard.png"))); // NOI18N
        btnCard5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCard5MouseExited(evt);
            }
        });
        btnCard5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCard5ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCard5, new org.netbeans.lib.awtextra.AbsoluteConstraints(768, 16, 95, -1));

        btnCard6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/backcard.png"))); // NOI18N
        btnCard6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCard6MouseExited(evt);
            }
        });
        btnCard6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCard6ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCard6, new org.netbeans.lib.awtextra.AbsoluteConstraints(655, 16, 95, -1));

        btnCard7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/backcard.png"))); // NOI18N
        btnCard7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCard7MouseExited(evt);
            }
        });
        btnCard7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCard7ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCard7, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 171, 95, -1));

        btnCard8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/backcard.png"))); // NOI18N
        btnCard8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCard8MouseExited(evt);
            }
        });
        btnCard8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCard8ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCard8, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 171, 95, -1));

        btnCard9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/backcard.png"))); // NOI18N
        btnCard9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCard9MouseExited(evt);
            }
        });
        btnCard9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCard9ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCard9, new org.netbeans.lib.awtextra.AbsoluteConstraints(429, 171, 95, -1));

        btnCard10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/backcard.png"))); // NOI18N
        btnCard10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCard10MouseExited(evt);
            }
        });
        btnCard10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCard10ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCard10, new org.netbeans.lib.awtextra.AbsoluteConstraints(542, 171, 95, -1));

        btnCard11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/backcard.png"))); // NOI18N
        btnCard11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCard11MouseExited(evt);
            }
        });
        btnCard11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCard11ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCard11, new org.netbeans.lib.awtextra.AbsoluteConstraints(655, 171, 95, -1));

        btnCard12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/backcard.png"))); // NOI18N
        btnCard12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCard12MouseExited(evt);
            }
        });
        btnCard12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCard12ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCard12, new org.netbeans.lib.awtextra.AbsoluteConstraints(768, 171, 95, -1));

        btnCard13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/backcard.png"))); // NOI18N
        btnCard13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCard13MouseExited(evt);
            }
        });
        btnCard13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCard13ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCard13, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 326, 95, -1));

        btnCard14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/backcard.png"))); // NOI18N
        btnCard14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCard14MouseExited(evt);
            }
        });
        btnCard14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCard14ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCard14, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 326, 95, -1));

        btnCard15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/backcard.png"))); // NOI18N
        btnCard15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCard15MouseExited(evt);
            }
        });
        btnCard15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCard15ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCard15, new org.netbeans.lib.awtextra.AbsoluteConstraints(429, 326, 95, -1));

        btnCard16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/backcard.png"))); // NOI18N
        btnCard16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCard16MouseExited(evt);
            }
        });
        btnCard16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCard16ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCard16, new org.netbeans.lib.awtextra.AbsoluteConstraints(542, 326, 95, -1));

        btnCard17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/backcard.png"))); // NOI18N
        btnCard17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCard17MouseExited(evt);
            }
        });
        btnCard17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCard17ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCard17, new org.netbeans.lib.awtextra.AbsoluteConstraints(655, 326, 95, -1));

        btnCard18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/backcard.png"))); // NOI18N
        btnCard18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCard18MouseExited(evt);
            }
        });
        btnCard18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCard18ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCard18, new org.netbeans.lib.awtextra.AbsoluteConstraints(768, 326, 95, -1));

        btnCard19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/backcard.png"))); // NOI18N
        btnCard19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCard19MouseExited(evt);
            }
        });
        btnCard19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCard19ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCard19, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 481, 95, -1));

        btnCard20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/backcard.png"))); // NOI18N
        btnCard20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCard20MouseExited(evt);
            }
        });
        btnCard20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCard20ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCard20, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 481, 95, -1));

        btnCard21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/backcard.png"))); // NOI18N
        btnCard21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCard21MouseExited(evt);
            }
        });
        btnCard21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCard21ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCard21, new org.netbeans.lib.awtextra.AbsoluteConstraints(429, 481, 95, -1));

        btnCard22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/backcard.png"))); // NOI18N
        btnCard22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCard22MouseExited(evt);
            }
        });
        btnCard22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCard22ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCard22, new org.netbeans.lib.awtextra.AbsoluteConstraints(542, 481, 95, -1));

        btnCard23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/backcard.png"))); // NOI18N
        btnCard23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCard23MouseExited(evt);
            }
        });
        btnCard23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCard23ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCard23, new org.netbeans.lib.awtextra.AbsoluteConstraints(655, 481, 95, -1));

        btnCard24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/backcard.png"))); // NOI18N
        btnCard24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCard24MouseExited(evt);
            }
        });
        btnCard24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCard24ActionPerformed(evt);
            }
        });
        getContentPane().add(btnCard24, new org.netbeans.lib.awtextra.AbsoluteConstraints(768, 481, 95, -1));

        lblGameBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/gameBackground.png"))); // NOI18N
        getContentPane().add(lblGameBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        String reset = JOptionPane.showInputDialog("¿Estas seguro que quieres resetear? Y / N");
        switch (reset) {
            case "y":
            case "yes":
            case "si":
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
                JOptionPane.showMessageDialog(null, reset + ", no es una opcion correcta");
                break;
        }
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        menu menu = new menu();
        menu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoActionPerformed
        info info = new info();
        info.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnInfoActionPerformed

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed

        btnCard1.setEnabled(true);
        btnCard2.setEnabled(true);
        btnCard3.setEnabled(true);
        btnCard4.setEnabled(true);
        btnCard5.setEnabled(true);
        btnCard6.setEnabled(true);
        btnCard7.setEnabled(true);
        btnCard8.setEnabled(true);
        btnCard9.setEnabled(true);
        btnCard10.setEnabled(true);
        btnCard11.setEnabled(true);
        btnCard12.setEnabled(true);
        btnCard13.setEnabled(true);
        btnCard14.setEnabled(true);
        btnCard15.setEnabled(true);
        btnCard16.setEnabled(true);
        btnCard17.setEnabled(true);
        btnCard18.setEnabled(true);
        btnCard19.setEnabled(true);
        btnCard20.setEnabled(true);
        btnCard21.setEnabled(true);
        btnCard22.setEnabled(true);
        btnCard23.setEnabled(true);
        btnCard24.setEnabled(true);

        while (cardCounter < 24) {
            Random rnd = new Random();
            int rndNumber = rnd.nextInt(12) + 1;
            int otroNumero = 0;

            for (int i = 0; i < 24; i++) {
                if (cards[i] == rndNumber) {
                    otroNumero++;
                }
            }

            if (otroNumero < 2) {
                cards[cardCounter] = rndNumber;
                cardCounter++;
            }
        }

        btnCard1.setDisabledIcon(new ImageIcon(getClass().getResource("/img/card" + cards[0] + ".png")));
        btnCard2.setDisabledIcon(new ImageIcon(getClass().getResource("/img/card" + cards[1] + ".png")));
        btnCard3.setDisabledIcon(new ImageIcon(getClass().getResource("/img/card" + cards[2] + ".png")));
        btnCard4.setDisabledIcon(new ImageIcon(getClass().getResource("/img/card" + cards[3] + ".png")));
        btnCard5.setDisabledIcon(new ImageIcon(getClass().getResource("/img/card" + cards[4] + ".png")));
        btnCard6.setDisabledIcon(new ImageIcon(getClass().getResource("/img/card" + cards[5] + ".png")));
        btnCard7.setDisabledIcon(new ImageIcon(getClass().getResource("/img/card" + cards[6] + ".png")));
        btnCard8.setDisabledIcon(new ImageIcon(getClass().getResource("/img/card" + cards[7] + ".png")));
        btnCard9.setDisabledIcon(new ImageIcon(getClass().getResource("/img/card" + cards[8] + ".png")));
        btnCard10.setDisabledIcon(new ImageIcon(getClass().getResource("/img/card" + cards[9] + ".png")));
        btnCard11.setDisabledIcon(new ImageIcon(getClass().getResource("/img/card" + cards[10] + ".png")));
        btnCard12.setDisabledIcon(new ImageIcon(getClass().getResource("/img/card" + cards[11] + ".png")));
        btnCard13.setDisabledIcon(new ImageIcon(getClass().getResource("/img/card" + cards[12] + ".png")));
        btnCard14.setDisabledIcon(new ImageIcon(getClass().getResource("/img/card" + cards[13] + ".png")));
        btnCard15.setDisabledIcon(new ImageIcon(getClass().getResource("/img/card" + cards[14] + ".png")));
        btnCard16.setDisabledIcon(new ImageIcon(getClass().getResource("/img/card" + cards[15] + ".png")));
        btnCard17.setDisabledIcon(new ImageIcon(getClass().getResource("/img/card" + cards[16] + ".png")));
        btnCard18.setDisabledIcon(new ImageIcon(getClass().getResource("/img/card" + cards[17] + ".png")));
        btnCard19.setDisabledIcon(new ImageIcon(getClass().getResource("/img/card" + cards[18] + ".png")));
        btnCard20.setDisabledIcon(new ImageIcon(getClass().getResource("/img/card" + cards[19] + ".png")));
        btnCard21.setDisabledIcon(new ImageIcon(getClass().getResource("/img/card" + cards[20] + ".png")));
        btnCard22.setDisabledIcon(new ImageIcon(getClass().getResource("/img/card" + cards[21] + ".png")));
        btnCard23.setDisabledIcon(new ImageIcon(getClass().getResource("/img/card" + cards[22] + ".png")));
        btnCard24.setDisabledIcon(new ImageIcon(getClass().getResource("/img/card" + cards[23] + ".png")));

        btnStart.setEnabled(false);
        lblMaxMoves.setText("" + menu.levelMovements);

    }//GEN-LAST:event_btnStartActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnCard1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCard1ActionPerformed

        if (btnCard1.isEnabled()) {
            if (revealCard1 == false) {
                btnCard1.setEnabled(false);
                image1 = (ImageIcon) btnCard1.getDisabledIcon();
                buttons[0] = btnCard1;
                revealCard1 = true;
            } else {
                btnCard1.setEnabled(false);
                image2 = (ImageIcon) btnCard1.getDisabledIcon();
                buttons[1] = btnCard1;
                revealCard2 = true;
            }
        }

    }//GEN-LAST:event_btnCard1ActionPerformed

    private void btnCard2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCard2ActionPerformed
        if (btnCard2.isEnabled()) {
            if (revealCard1 == false) {
                btnCard2.setEnabled(false);
                image1 = (ImageIcon) btnCard2.getDisabledIcon();
                buttons[0] = btnCard2;
                revealCard1 = true;
            } else {
                btnCard2.setEnabled(false);
                image2 = (ImageIcon) btnCard2.getDisabledIcon();
                buttons[1] = btnCard2;
                revealCard2 = true;
            }
        }
    }//GEN-LAST:event_btnCard2ActionPerformed

    private void btnCard3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCard3ActionPerformed
        if (btnCard3.isEnabled()) {
            if (revealCard1 == false) {
                btnCard3.setEnabled(false);
                image1 = (ImageIcon) btnCard3.getDisabledIcon();
                buttons[0] = btnCard3;
                revealCard1 = true;
            } else {
                btnCard3.setEnabled(false);
                image2 = (ImageIcon) btnCard3.getDisabledIcon();
                buttons[1] = btnCard3;
                revealCard2 = true;
            }
        }
    }//GEN-LAST:event_btnCard3ActionPerformed

    private void btnCard4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCard4ActionPerformed
        if (btnCard4.isEnabled()) {
            if (revealCard1 == false) {
                btnCard4.setEnabled(false);
                image1 = (ImageIcon) btnCard4.getDisabledIcon();
                buttons[0] = btnCard4;
                revealCard1 = true;
            } else {
                btnCard4.setEnabled(false);
                image2 = (ImageIcon) btnCard4.getDisabledIcon();
                buttons[1] = btnCard4;
                revealCard2 = true;
            }
        }
    }//GEN-LAST:event_btnCard4ActionPerformed

    private void btnCard6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCard6ActionPerformed
        if (btnCard6.isEnabled()) {
            if (revealCard1 == false) {
                btnCard6.setEnabled(false);
                image1 = (ImageIcon) btnCard6.getDisabledIcon();
                buttons[0] = btnCard6;
                revealCard1 = true;
            } else {
                btnCard6.setEnabled(false);
                image2 = (ImageIcon) btnCard6.getDisabledIcon();
                buttons[1] = btnCard6;
                revealCard2 = true;
            }
        }
    }//GEN-LAST:event_btnCard6ActionPerformed

    private void btnCard5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCard5ActionPerformed
        if (btnCard5.isEnabled()) {
            if (revealCard1 == false) {
                btnCard5.setEnabled(false);
                image1 = (ImageIcon) btnCard5.getDisabledIcon();
                buttons[0] = btnCard5;
                revealCard1 = true;
            } else {
                btnCard5.setEnabled(false);
                image2 = (ImageIcon) btnCard5.getDisabledIcon();
                buttons[1] = btnCard5;
                revealCard2 = true;
            }
        }
    }//GEN-LAST:event_btnCard5ActionPerformed

    private void btnCard7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCard7ActionPerformed
        if (btnCard7.isEnabled()) {
            if (revealCard1 == false) {
                btnCard7.setEnabled(false);
                image1 = (ImageIcon) btnCard7.getDisabledIcon();
                buttons[0] = btnCard7;
                revealCard1 = true;
            } else {
                btnCard7.setEnabled(false);
                image2 = (ImageIcon) btnCard7.getDisabledIcon();
                buttons[1] = btnCard7;
                revealCard2 = true;
            }
        }
    }//GEN-LAST:event_btnCard7ActionPerformed

    private void btnCard8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCard8ActionPerformed
        if (btnCard8.isEnabled()) {
            if (revealCard1 == false) {
                btnCard8.setEnabled(false);
                image1 = (ImageIcon) btnCard8.getDisabledIcon();
                buttons[0] = btnCard8;
                revealCard1 = true;
            } else {
                btnCard8.setEnabled(false);
                image2 = (ImageIcon) btnCard8.getDisabledIcon();
                buttons[1] = btnCard8;
                revealCard2 = true;
            }
        }
    }//GEN-LAST:event_btnCard8ActionPerformed

    private void btnCard9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCard9ActionPerformed
        if (btnCard9.isEnabled()) {
            if (revealCard1 == false) {
                btnCard9.setEnabled(false);
                image1 = (ImageIcon) btnCard9.getDisabledIcon();
                buttons[0] = btnCard9;
                revealCard1 = true;
            } else {
                btnCard9.setEnabled(false);
                image2 = (ImageIcon) btnCard9.getDisabledIcon();
                buttons[1] = btnCard9;
                revealCard2 = true;
            }
        }
    }//GEN-LAST:event_btnCard9ActionPerformed

    private void btnCard10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCard10ActionPerformed
        if (btnCard10.isEnabled()) {
            if (revealCard1 == false) {
                btnCard10.setEnabled(false);
                image1 = (ImageIcon) btnCard10.getDisabledIcon();
                buttons[0] = btnCard10;
                revealCard1 = true;
            } else {
                btnCard10.setEnabled(false);
                image2 = (ImageIcon) btnCard10.getDisabledIcon();
                buttons[1] = btnCard10;
                revealCard2 = true;
            }
        }
    }//GEN-LAST:event_btnCard10ActionPerformed

    private void btnCard11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCard11ActionPerformed
        if (btnCard11.isEnabled()) {
            if (revealCard1 == false) {
                btnCard11.setEnabled(false);
                image1 = (ImageIcon) btnCard11.getDisabledIcon();
                buttons[0] = btnCard11;
                revealCard1 = true;
            } else {
                btnCard11.setEnabled(false);
                image2 = (ImageIcon) btnCard11.getDisabledIcon();
                buttons[1] = btnCard11;
                revealCard2 = true;
            }
        }
    }//GEN-LAST:event_btnCard11ActionPerformed

    private void btnCard12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCard12ActionPerformed
        if (btnCard12.isEnabled()) {
            if (revealCard1 == false) {
                btnCard12.setEnabled(false);
                image1 = (ImageIcon) btnCard12.getDisabledIcon();
                buttons[0] = btnCard12;
                revealCard1 = true;
            } else {
                btnCard12.setEnabled(false);
                image2 = (ImageIcon) btnCard12.getDisabledIcon();
                buttons[1] = btnCard12;
                revealCard2 = true;
            }
        }
    }//GEN-LAST:event_btnCard12ActionPerformed

    private void btnCard13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCard13ActionPerformed
        if (btnCard13.isEnabled()) {
            if (revealCard1 == false) {
                btnCard13.setEnabled(false);
                image1 = (ImageIcon) btnCard13.getDisabledIcon();
                buttons[0] = btnCard13;
                revealCard1 = true;
            } else {
                btnCard13.setEnabled(false);
                image2 = (ImageIcon) btnCard13.getDisabledIcon();
                buttons[1] = btnCard13;
                revealCard2 = true;
            }
        }
    }//GEN-LAST:event_btnCard13ActionPerformed

    private void btnCard14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCard14ActionPerformed
        if (btnCard14.isEnabled()) {
            if (revealCard1 == false) {
                btnCard14.setEnabled(false);
                image1 = (ImageIcon) btnCard14.getDisabledIcon();
                buttons[0] = btnCard14;
                revealCard1 = true;
            } else {
                btnCard14.setEnabled(false);
                image2 = (ImageIcon) btnCard14.getDisabledIcon();
                buttons[1] = btnCard14;
                revealCard2 = true;
            }
        }
    }//GEN-LAST:event_btnCard14ActionPerformed

    private void btnCard15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCard15ActionPerformed
        if (btnCard15.isEnabled()) {
            if (revealCard1 == false) {
                btnCard15.setEnabled(false);
                image1 = (ImageIcon) btnCard15.getDisabledIcon();
                buttons[0] = btnCard15;
                revealCard1 = true;
            } else {
                btnCard15.setEnabled(false);
                image2 = (ImageIcon) btnCard15.getDisabledIcon();
                buttons[1] = btnCard15;
                revealCard2 = true;
            }
        }
    }//GEN-LAST:event_btnCard15ActionPerformed

    private void btnCard16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCard16ActionPerformed
        if (btnCard16.isEnabled()) {
            if (revealCard1 == false) {
                btnCard16.setEnabled(false);
                image1 = (ImageIcon) btnCard16.getDisabledIcon();
                buttons[0] = btnCard16;
                revealCard1 = true;
            } else {
                btnCard16.setEnabled(false);
                image2 = (ImageIcon) btnCard16.getDisabledIcon();
                buttons[1] = btnCard16;
                revealCard2 = true;
            }
        }
    }//GEN-LAST:event_btnCard16ActionPerformed

    private void btnCard17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCard17ActionPerformed
        if (btnCard17.isEnabled()) {
            if (revealCard1 == false) {
                btnCard17.setEnabled(false);
                image1 = (ImageIcon) btnCard17.getDisabledIcon();
                buttons[0] = btnCard17;
                revealCard1 = true;
            } else {
                btnCard17.setEnabled(false);
                image2 = (ImageIcon) btnCard17.getDisabledIcon();
                buttons[1] = btnCard17;
                revealCard2 = true;
            }
        }
    }//GEN-LAST:event_btnCard17ActionPerformed

    private void btnCard18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCard18ActionPerformed
        if (btnCard18.isEnabled()) {
            if (revealCard1 == false) {
                btnCard18.setEnabled(false);
                image1 = (ImageIcon) btnCard18.getDisabledIcon();
                buttons[0] = btnCard18;
                revealCard1 = true;
            } else {
                btnCard18.setEnabled(false);
                image2 = (ImageIcon) btnCard18.getDisabledIcon();
                buttons[1] = btnCard18;
                revealCard2 = true;
            }
        }
    }//GEN-LAST:event_btnCard18ActionPerformed

    private void btnCard19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCard19ActionPerformed
        if (btnCard19.isEnabled()) {
            if (revealCard1 == false) {
                btnCard19.setEnabled(false);
                image1 = (ImageIcon) btnCard19.getDisabledIcon();
                buttons[0] = btnCard19;
                revealCard1 = true;
            } else {
                btnCard19.setEnabled(false);
                image2 = (ImageIcon) btnCard19.getDisabledIcon();
                buttons[1] = btnCard19;
                revealCard2 = true;
            }
        }
    }//GEN-LAST:event_btnCard19ActionPerformed

    private void btnCard20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCard20ActionPerformed
        if (btnCard20.isEnabled()) {
            if (revealCard1 == false) {
                btnCard20.setEnabled(false);
                image1 = (ImageIcon) btnCard20.getDisabledIcon();
                buttons[0] = btnCard20;
                revealCard1 = true;
            } else {
                btnCard20.setEnabled(false);
                image2 = (ImageIcon) btnCard20.getDisabledIcon();
                buttons[1] = btnCard20;
                revealCard2 = true;
            }
        }
    }//GEN-LAST:event_btnCard20ActionPerformed

    private void btnCard21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCard21ActionPerformed
        if (btnCard21.isEnabled()) {
            if (revealCard1 == false) {
                btnCard21.setEnabled(false);
                image1 = (ImageIcon) btnCard21.getDisabledIcon();
                buttons[0] = btnCard21;
                revealCard1 = true;
            } else {
                btnCard21.setEnabled(false);
                image2 = (ImageIcon) btnCard21.getDisabledIcon();
                buttons[1] = btnCard21;
                revealCard2 = true;
            }
        }
    }//GEN-LAST:event_btnCard21ActionPerformed

    private void btnCard22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCard22ActionPerformed
        if (btnCard22.isEnabled()) {
            if (revealCard1 == false) {
                btnCard22.setEnabled(false);
                image1 = (ImageIcon) btnCard22.getDisabledIcon();
                buttons[0] = btnCard22;
                revealCard1 = true;
            } else {
                btnCard22.setEnabled(false);
                image2 = (ImageIcon) btnCard22.getDisabledIcon();
                buttons[1] = btnCard22;
                revealCard2 = true;
            }
        }
    }//GEN-LAST:event_btnCard22ActionPerformed

    private void btnCard23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCard23ActionPerformed
        if (btnCard23.isEnabled()) {
            if (revealCard1 == false) {
                btnCard23.setEnabled(false);
                image1 = (ImageIcon) btnCard23.getDisabledIcon();
                buttons[0] = btnCard23;
                revealCard1 = true;
            } else {
                btnCard23.setEnabled(false);
                image2 = (ImageIcon) btnCard23.getDisabledIcon();
                buttons[1] = btnCard23;
                revealCard2 = true;
            }
        }
    }//GEN-LAST:event_btnCard23ActionPerformed

    private void btnCard24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCard24ActionPerformed
        if (btnCard24.isEnabled()) {
            if (revealCard1 == false) {
                btnCard24.setEnabled(false);
                image1 = (ImageIcon) btnCard24.getDisabledIcon();
                buttons[0] = btnCard24;
                revealCard1 = true;
            } else {
                btnCard24.setEnabled(false);
                image2 = (ImageIcon) btnCard24.getDisabledIcon();
                buttons[1] = btnCard24;
                revealCard2 = true;
            }
        }
    }//GEN-LAST:event_btnCard24ActionPerformed

    private void btnCard1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCard1MouseExited
        if (revealCard1 && revealCard2) {
            if (image1.getDescription().compareTo(image2.getDescription()) != 0) {
                buttons[0].setEnabled(true);
                buttons[1].setEnabled(true);
            }
            revealCard1 = false;
            revealCard2 = false;

            counterTries++;
            lblCounter.setText("" + counterTries);

            if (!btnCard1.isEnabled()
                    && !btnCard2.isEnabled()
                    && !btnCard3.isEnabled()
                    && !btnCard4.isEnabled()
                    && !btnCard5.isEnabled()
                    && !btnCard6.isEnabled()
                    && !btnCard7.isEnabled()
                    && !btnCard8.isEnabled()
                    && !btnCard9.isEnabled()
                    && !btnCard10.isEnabled()
                    && !btnCard11.isEnabled()
                    && !btnCard12.isEnabled()
                    && !btnCard13.isEnabled()
                    && !btnCard14.isEnabled()
                    && !btnCard15.isEnabled()
                    && !btnCard16.isEnabled()
                    && !btnCard17.isEnabled()
                    && !btnCard18.isEnabled()
                    && !btnCard19.isEnabled()
                    && !btnCard20.isEnabled()
                    && !btnCard21.isEnabled()
                    && !btnCard22.isEnabled()
                    && !btnCard23.isEnabled()
                    && !btnCard24.isEnabled()) {
                JOptionPane.showMessageDialog(null, "Ganaste! completaste el juego en " + counterTries + " intentos");
            } else if (counterTries > menu.levelMovements) {
                JOptionPane.showMessageDialog(null, "Perdiste");

                btnCard1.setEnabled(false);
                btnCard2.setEnabled(false);
                btnCard3.setEnabled(false);
                btnCard4.setEnabled(false);
                btnCard5.setEnabled(false);
                btnCard6.setEnabled(false);
                btnCard7.setEnabled(false);
                btnCard8.setEnabled(false);
                btnCard9.setEnabled(false);
                btnCard10.setEnabled(false);
                btnCard11.setEnabled(false);
                btnCard12.setEnabled(false);
                btnCard13.setEnabled(false);
                btnCard14.setEnabled(false);
                btnCard15.setEnabled(false);
                btnCard16.setEnabled(false);
                btnCard17.setEnabled(false);
                btnCard18.setEnabled(false);
                btnCard19.setEnabled(false);
                btnCard20.setEnabled(false);
                btnCard21.setEnabled(false);
                btnCard22.setEnabled(false);
                btnCard23.setEnabled(false);
                btnCard24.setEnabled(false);

            }
        }

    }//GEN-LAST:event_btnCard1MouseExited

    private void btnCard2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCard2MouseExited
        if (revealCard1 && revealCard2) {
            if (image1.getDescription().compareTo(image2.getDescription()) != 0) {
                buttons[0].setEnabled(true);
                buttons[1].setEnabled(true);
            }
            revealCard1 = false;
            revealCard2 = false;

            counterTries++;
            lblCounter.setText("" + counterTries);

            if (!btnCard1.isEnabled()
                    && !btnCard2.isEnabled()
                    && !btnCard3.isEnabled()
                    && !btnCard4.isEnabled()
                    && !btnCard5.isEnabled()
                    && !btnCard6.isEnabled()
                    && !btnCard7.isEnabled()
                    && !btnCard8.isEnabled()
                    && !btnCard9.isEnabled()
                    && !btnCard10.isEnabled()
                    && !btnCard11.isEnabled()
                    && !btnCard12.isEnabled()
                    && !btnCard13.isEnabled()
                    && !btnCard14.isEnabled()
                    && !btnCard15.isEnabled()
                    && !btnCard16.isEnabled()
                    && !btnCard17.isEnabled()
                    && !btnCard18.isEnabled()
                    && !btnCard19.isEnabled()
                    && !btnCard20.isEnabled()
                    && !btnCard21.isEnabled()
                    && !btnCard22.isEnabled()
                    && !btnCard23.isEnabled()
                    && !btnCard24.isEnabled()) {
                JOptionPane.showMessageDialog(null, "Ganaste! completaste el juego en " + counterTries + " intentos");
            } else if (counterTries > menu.levelMovements) {
                JOptionPane.showMessageDialog(null, "Perdiste");

                btnCard1.setEnabled(false);
                btnCard2.setEnabled(false);
                btnCard3.setEnabled(false);
                btnCard4.setEnabled(false);
                btnCard5.setEnabled(false);
                btnCard6.setEnabled(false);
                btnCard7.setEnabled(false);
                btnCard8.setEnabled(false);
                btnCard9.setEnabled(false);
                btnCard10.setEnabled(false);
                btnCard11.setEnabled(false);
                btnCard12.setEnabled(false);
                btnCard13.setEnabled(false);
                btnCard14.setEnabled(false);
                btnCard15.setEnabled(false);
                btnCard16.setEnabled(false);
                btnCard17.setEnabled(false);
                btnCard18.setEnabled(false);
                btnCard19.setEnabled(false);
                btnCard20.setEnabled(false);
                btnCard21.setEnabled(false);
                btnCard22.setEnabled(false);
                btnCard23.setEnabled(false);
                btnCard24.setEnabled(false);

            }
        }
    }//GEN-LAST:event_btnCard2MouseExited

    private void btnCard3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCard3MouseExited
        if (revealCard1 && revealCard2) {
            if (image1.getDescription().compareTo(image2.getDescription()) != 0) {
                buttons[0].setEnabled(true);
                buttons[1].setEnabled(true);
            }
            revealCard1 = false;
            revealCard2 = false;

            counterTries++;
            lblCounter.setText("" + counterTries);

            if (!btnCard1.isEnabled()
                    && !btnCard2.isEnabled()
                    && !btnCard3.isEnabled()
                    && !btnCard4.isEnabled()
                    && !btnCard5.isEnabled()
                    && !btnCard6.isEnabled()
                    && !btnCard7.isEnabled()
                    && !btnCard8.isEnabled()
                    && !btnCard9.isEnabled()
                    && !btnCard10.isEnabled()
                    && !btnCard11.isEnabled()
                    && !btnCard12.isEnabled()
                    && !btnCard13.isEnabled()
                    && !btnCard14.isEnabled()
                    && !btnCard15.isEnabled()
                    && !btnCard16.isEnabled()
                    && !btnCard17.isEnabled()
                    && !btnCard18.isEnabled()
                    && !btnCard19.isEnabled()
                    && !btnCard20.isEnabled()
                    && !btnCard21.isEnabled()
                    && !btnCard22.isEnabled()
                    && !btnCard23.isEnabled()
                    && !btnCard24.isEnabled()) {
                JOptionPane.showMessageDialog(null, "Ganaste! completaste el juego en " + counterTries + " intentos");
            } else if (counterTries > menu.levelMovements) {
                JOptionPane.showMessageDialog(null, "Perdiste");

                btnCard1.setEnabled(false);
                btnCard2.setEnabled(false);
                btnCard3.setEnabled(false);
                btnCard4.setEnabled(false);
                btnCard5.setEnabled(false);
                btnCard6.setEnabled(false);
                btnCard7.setEnabled(false);
                btnCard8.setEnabled(false);
                btnCard9.setEnabled(false);
                btnCard10.setEnabled(false);
                btnCard11.setEnabled(false);
                btnCard12.setEnabled(false);
                btnCard13.setEnabled(false);
                btnCard14.setEnabled(false);
                btnCard15.setEnabled(false);
                btnCard16.setEnabled(false);
                btnCard17.setEnabled(false);
                btnCard18.setEnabled(false);
                btnCard19.setEnabled(false);
                btnCard20.setEnabled(false);
                btnCard21.setEnabled(false);
                btnCard22.setEnabled(false);
                btnCard23.setEnabled(false);
                btnCard24.setEnabled(false);

            }
        }
    }//GEN-LAST:event_btnCard3MouseExited

    private void btnCard4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCard4MouseExited
        if (revealCard1 && revealCard2) {
            if (image1.getDescription().compareTo(image2.getDescription()) != 0) {
                buttons[0].setEnabled(true);
                buttons[1].setEnabled(true);
            }
            revealCard1 = false;
            revealCard2 = false;

            counterTries++;
            lblCounter.setText("" + counterTries);

            if (!btnCard1.isEnabled()
                    && !btnCard2.isEnabled()
                    && !btnCard3.isEnabled()
                    && !btnCard4.isEnabled()
                    && !btnCard5.isEnabled()
                    && !btnCard6.isEnabled()
                    && !btnCard7.isEnabled()
                    && !btnCard8.isEnabled()
                    && !btnCard9.isEnabled()
                    && !btnCard10.isEnabled()
                    && !btnCard11.isEnabled()
                    && !btnCard12.isEnabled()
                    && !btnCard13.isEnabled()
                    && !btnCard14.isEnabled()
                    && !btnCard15.isEnabled()
                    && !btnCard16.isEnabled()
                    && !btnCard17.isEnabled()
                    && !btnCard18.isEnabled()
                    && !btnCard19.isEnabled()
                    && !btnCard20.isEnabled()
                    && !btnCard21.isEnabled()
                    && !btnCard22.isEnabled()
                    && !btnCard23.isEnabled()
                    && !btnCard24.isEnabled()) {
                JOptionPane.showMessageDialog(null, "Ganaste! completaste el juego en " + counterTries + " intentos");
            } else if (counterTries > menu.levelMovements) {
                JOptionPane.showMessageDialog(null, "Perdiste");

                btnCard1.setEnabled(false);
                btnCard2.setEnabled(false);
                btnCard3.setEnabled(false);
                btnCard4.setEnabled(false);
                btnCard5.setEnabled(false);
                btnCard6.setEnabled(false);
                btnCard7.setEnabled(false);
                btnCard8.setEnabled(false);
                btnCard9.setEnabled(false);
                btnCard10.setEnabled(false);
                btnCard11.setEnabled(false);
                btnCard12.setEnabled(false);
                btnCard13.setEnabled(false);
                btnCard14.setEnabled(false);
                btnCard15.setEnabled(false);
                btnCard16.setEnabled(false);
                btnCard17.setEnabled(false);
                btnCard18.setEnabled(false);
                btnCard19.setEnabled(false);
                btnCard20.setEnabled(false);
                btnCard21.setEnabled(false);
                btnCard22.setEnabled(false);
                btnCard23.setEnabled(false);
                btnCard24.setEnabled(false);

            }
        }
    }//GEN-LAST:event_btnCard4MouseExited

    private void btnCard6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCard6MouseExited
        if (revealCard1 && revealCard2) {
            if (image1.getDescription().compareTo(image2.getDescription()) != 0) {
                buttons[0].setEnabled(true);
                buttons[1].setEnabled(true);
            }
            revealCard1 = false;
            revealCard2 = false;

            counterTries++;
            lblCounter.setText("" + counterTries);

            if (!btnCard1.isEnabled()
                    && !btnCard2.isEnabled()
                    && !btnCard3.isEnabled()
                    && !btnCard4.isEnabled()
                    && !btnCard5.isEnabled()
                    && !btnCard6.isEnabled()
                    && !btnCard7.isEnabled()
                    && !btnCard8.isEnabled()
                    && !btnCard9.isEnabled()
                    && !btnCard10.isEnabled()
                    && !btnCard11.isEnabled()
                    && !btnCard12.isEnabled()
                    && !btnCard13.isEnabled()
                    && !btnCard14.isEnabled()
                    && !btnCard15.isEnabled()
                    && !btnCard16.isEnabled()
                    && !btnCard17.isEnabled()
                    && !btnCard18.isEnabled()
                    && !btnCard19.isEnabled()
                    && !btnCard20.isEnabled()
                    && !btnCard21.isEnabled()
                    && !btnCard22.isEnabled()
                    && !btnCard23.isEnabled()
                    && !btnCard24.isEnabled()) {
                JOptionPane.showMessageDialog(null, "Ganaste! completaste el juego en " + counterTries + " intentos");
            } else if (counterTries > menu.levelMovements) {
                JOptionPane.showMessageDialog(null, "Perdiste");

                btnCard1.setEnabled(false);
                btnCard2.setEnabled(false);
                btnCard3.setEnabled(false);
                btnCard4.setEnabled(false);
                btnCard5.setEnabled(false);
                btnCard6.setEnabled(false);
                btnCard7.setEnabled(false);
                btnCard8.setEnabled(false);
                btnCard9.setEnabled(false);
                btnCard10.setEnabled(false);
                btnCard11.setEnabled(false);
                btnCard12.setEnabled(false);
                btnCard13.setEnabled(false);
                btnCard14.setEnabled(false);
                btnCard15.setEnabled(false);
                btnCard16.setEnabled(false);
                btnCard17.setEnabled(false);
                btnCard18.setEnabled(false);
                btnCard19.setEnabled(false);
                btnCard20.setEnabled(false);
                btnCard21.setEnabled(false);
                btnCard22.setEnabled(false);
                btnCard23.setEnabled(false);
                btnCard24.setEnabled(false);

            }
        }
    }//GEN-LAST:event_btnCard6MouseExited

    private void btnCard5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCard5MouseExited
        if (revealCard1 && revealCard2) {
            if (image1.getDescription().compareTo(image2.getDescription()) != 0) {
                buttons[0].setEnabled(true);
                buttons[1].setEnabled(true);
            }
            revealCard1 = false;
            revealCard2 = false;

            counterTries++;
            lblCounter.setText("" + counterTries);

            if (!btnCard1.isEnabled()
                    && !btnCard2.isEnabled()
                    && !btnCard3.isEnabled()
                    && !btnCard4.isEnabled()
                    && !btnCard5.isEnabled()
                    && !btnCard6.isEnabled()
                    && !btnCard7.isEnabled()
                    && !btnCard8.isEnabled()
                    && !btnCard9.isEnabled()
                    && !btnCard10.isEnabled()
                    && !btnCard11.isEnabled()
                    && !btnCard12.isEnabled()
                    && !btnCard13.isEnabled()
                    && !btnCard14.isEnabled()
                    && !btnCard15.isEnabled()
                    && !btnCard16.isEnabled()
                    && !btnCard17.isEnabled()
                    && !btnCard18.isEnabled()
                    && !btnCard19.isEnabled()
                    && !btnCard20.isEnabled()
                    && !btnCard21.isEnabled()
                    && !btnCard22.isEnabled()
                    && !btnCard23.isEnabled()
                    && !btnCard24.isEnabled()) {
                JOptionPane.showMessageDialog(null, "Ganaste! completaste el juego en " + counterTries + " intentos");
            } else if (counterTries > menu.levelMovements) {
                JOptionPane.showMessageDialog(null, "Perdiste");

                btnCard1.setEnabled(false);
                btnCard2.setEnabled(false);
                btnCard3.setEnabled(false);
                btnCard4.setEnabled(false);
                btnCard5.setEnabled(false);
                btnCard6.setEnabled(false);
                btnCard7.setEnabled(false);
                btnCard8.setEnabled(false);
                btnCard9.setEnabled(false);
                btnCard10.setEnabled(false);
                btnCard11.setEnabled(false);
                btnCard12.setEnabled(false);
                btnCard13.setEnabled(false);
                btnCard14.setEnabled(false);
                btnCard15.setEnabled(false);
                btnCard16.setEnabled(false);
                btnCard17.setEnabled(false);
                btnCard18.setEnabled(false);
                btnCard19.setEnabled(false);
                btnCard20.setEnabled(false);
                btnCard21.setEnabled(false);
                btnCard22.setEnabled(false);
                btnCard23.setEnabled(false);
                btnCard24.setEnabled(false);

            }
        }
    }//GEN-LAST:event_btnCard5MouseExited

    private void btnCard7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCard7MouseExited
        if (revealCard1 && revealCard2) {
            if (image1.getDescription().compareTo(image2.getDescription()) != 0) {
                buttons[0].setEnabled(true);
                buttons[1].setEnabled(true);
            }
            revealCard1 = false;
            revealCard2 = false;

            counterTries++;
            lblCounter.setText("" + counterTries);

            if (!btnCard1.isEnabled()
                    && !btnCard2.isEnabled()
                    && !btnCard3.isEnabled()
                    && !btnCard4.isEnabled()
                    && !btnCard5.isEnabled()
                    && !btnCard6.isEnabled()
                    && !btnCard7.isEnabled()
                    && !btnCard8.isEnabled()
                    && !btnCard9.isEnabled()
                    && !btnCard10.isEnabled()
                    && !btnCard11.isEnabled()
                    && !btnCard12.isEnabled()
                    && !btnCard13.isEnabled()
                    && !btnCard14.isEnabled()
                    && !btnCard15.isEnabled()
                    && !btnCard16.isEnabled()
                    && !btnCard17.isEnabled()
                    && !btnCard18.isEnabled()
                    && !btnCard19.isEnabled()
                    && !btnCard20.isEnabled()
                    && !btnCard21.isEnabled()
                    && !btnCard22.isEnabled()
                    && !btnCard23.isEnabled()
                    && !btnCard24.isEnabled()) {
                JOptionPane.showMessageDialog(null, "Ganaste! completaste el juego en " + counterTries + " intentos");
            } else if (counterTries > menu.levelMovements) {
                JOptionPane.showMessageDialog(null, "Perdiste");

                btnCard1.setEnabled(false);
                btnCard2.setEnabled(false);
                btnCard3.setEnabled(false);
                btnCard4.setEnabled(false);
                btnCard5.setEnabled(false);
                btnCard6.setEnabled(false);
                btnCard7.setEnabled(false);
                btnCard8.setEnabled(false);
                btnCard9.setEnabled(false);
                btnCard10.setEnabled(false);
                btnCard11.setEnabled(false);
                btnCard12.setEnabled(false);
                btnCard13.setEnabled(false);
                btnCard14.setEnabled(false);
                btnCard15.setEnabled(false);
                btnCard16.setEnabled(false);
                btnCard17.setEnabled(false);
                btnCard18.setEnabled(false);
                btnCard19.setEnabled(false);
                btnCard20.setEnabled(false);
                btnCard21.setEnabled(false);
                btnCard22.setEnabled(false);
                btnCard23.setEnabled(false);
                btnCard24.setEnabled(false);

            }
        }
    }//GEN-LAST:event_btnCard7MouseExited

    private void btnCard8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCard8MouseExited
        if (revealCard1 && revealCard2) {
            if (image1.getDescription().compareTo(image2.getDescription()) != 0) {
                buttons[0].setEnabled(true);
                buttons[1].setEnabled(true);
            }
            revealCard1 = false;
            revealCard2 = false;

            counterTries++;
            lblCounter.setText("" + counterTries);

            if (!btnCard1.isEnabled()
                    && !btnCard2.isEnabled()
                    && !btnCard3.isEnabled()
                    && !btnCard4.isEnabled()
                    && !btnCard5.isEnabled()
                    && !btnCard6.isEnabled()
                    && !btnCard7.isEnabled()
                    && !btnCard8.isEnabled()
                    && !btnCard9.isEnabled()
                    && !btnCard10.isEnabled()
                    && !btnCard11.isEnabled()
                    && !btnCard12.isEnabled()
                    && !btnCard13.isEnabled()
                    && !btnCard14.isEnabled()
                    && !btnCard15.isEnabled()
                    && !btnCard16.isEnabled()
                    && !btnCard17.isEnabled()
                    && !btnCard18.isEnabled()
                    && !btnCard19.isEnabled()
                    && !btnCard20.isEnabled()
                    && !btnCard21.isEnabled()
                    && !btnCard22.isEnabled()
                    && !btnCard23.isEnabled()
                    && !btnCard24.isEnabled()) {
                JOptionPane.showMessageDialog(null, "Ganaste! completaste el juego en " + counterTries + " intentos");
            } else if (counterTries > menu.levelMovements) {
                JOptionPane.showMessageDialog(null, "Perdiste");

                btnCard1.setEnabled(false);
                btnCard2.setEnabled(false);
                btnCard3.setEnabled(false);
                btnCard4.setEnabled(false);
                btnCard5.setEnabled(false);
                btnCard6.setEnabled(false);
                btnCard7.setEnabled(false);
                btnCard8.setEnabled(false);
                btnCard9.setEnabled(false);
                btnCard10.setEnabled(false);
                btnCard11.setEnabled(false);
                btnCard12.setEnabled(false);
                btnCard13.setEnabled(false);
                btnCard14.setEnabled(false);
                btnCard15.setEnabled(false);
                btnCard16.setEnabled(false);
                btnCard17.setEnabled(false);
                btnCard18.setEnabled(false);
                btnCard19.setEnabled(false);
                btnCard20.setEnabled(false);
                btnCard21.setEnabled(false);
                btnCard22.setEnabled(false);
                btnCard23.setEnabled(false);
                btnCard24.setEnabled(false);

            }
        }
    }//GEN-LAST:event_btnCard8MouseExited

    private void btnCard9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCard9MouseExited
        if (revealCard1 && revealCard2) {
            if (image1.getDescription().compareTo(image2.getDescription()) != 0) {
                buttons[0].setEnabled(true);
                buttons[1].setEnabled(true);
            }
            revealCard1 = false;
            revealCard2 = false;

            counterTries++;
            lblCounter.setText("" + counterTries);

            if (!btnCard1.isEnabled()
                    && !btnCard2.isEnabled()
                    && !btnCard3.isEnabled()
                    && !btnCard4.isEnabled()
                    && !btnCard5.isEnabled()
                    && !btnCard6.isEnabled()
                    && !btnCard7.isEnabled()
                    && !btnCard8.isEnabled()
                    && !btnCard9.isEnabled()
                    && !btnCard10.isEnabled()
                    && !btnCard11.isEnabled()
                    && !btnCard12.isEnabled()
                    && !btnCard13.isEnabled()
                    && !btnCard14.isEnabled()
                    && !btnCard15.isEnabled()
                    && !btnCard16.isEnabled()
                    && !btnCard17.isEnabled()
                    && !btnCard18.isEnabled()
                    && !btnCard19.isEnabled()
                    && !btnCard20.isEnabled()
                    && !btnCard21.isEnabled()
                    && !btnCard22.isEnabled()
                    && !btnCard23.isEnabled()
                    && !btnCard24.isEnabled()) {
                JOptionPane.showMessageDialog(null, "Ganaste! completaste el juego en " + counterTries + " intentos");
            } else if (counterTries > menu.levelMovements) {
                JOptionPane.showMessageDialog(null, "Perdiste");

                btnCard1.setEnabled(false);
                btnCard2.setEnabled(false);
                btnCard3.setEnabled(false);
                btnCard4.setEnabled(false);
                btnCard5.setEnabled(false);
                btnCard6.setEnabled(false);
                btnCard7.setEnabled(false);
                btnCard8.setEnabled(false);
                btnCard9.setEnabled(false);
                btnCard10.setEnabled(false);
                btnCard11.setEnabled(false);
                btnCard12.setEnabled(false);
                btnCard13.setEnabled(false);
                btnCard14.setEnabled(false);
                btnCard15.setEnabled(false);
                btnCard16.setEnabled(false);
                btnCard17.setEnabled(false);
                btnCard18.setEnabled(false);
                btnCard19.setEnabled(false);
                btnCard20.setEnabled(false);
                btnCard21.setEnabled(false);
                btnCard22.setEnabled(false);
                btnCard23.setEnabled(false);
                btnCard24.setEnabled(false);

            }
        }
    }//GEN-LAST:event_btnCard9MouseExited

    private void btnCard10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCard10MouseExited
        if (revealCard1 && revealCard2) {
            if (image1.getDescription().compareTo(image2.getDescription()) != 0) {
                buttons[0].setEnabled(true);
                buttons[1].setEnabled(true);
            }
            revealCard1 = false;
            revealCard2 = false;

            counterTries++;
            lblCounter.setText("" + counterTries);

            if (!btnCard1.isEnabled()
                    && !btnCard2.isEnabled()
                    && !btnCard3.isEnabled()
                    && !btnCard4.isEnabled()
                    && !btnCard5.isEnabled()
                    && !btnCard6.isEnabled()
                    && !btnCard7.isEnabled()
                    && !btnCard8.isEnabled()
                    && !btnCard9.isEnabled()
                    && !btnCard10.isEnabled()
                    && !btnCard11.isEnabled()
                    && !btnCard12.isEnabled()
                    && !btnCard13.isEnabled()
                    && !btnCard14.isEnabled()
                    && !btnCard15.isEnabled()
                    && !btnCard16.isEnabled()
                    && !btnCard17.isEnabled()
                    && !btnCard18.isEnabled()
                    && !btnCard19.isEnabled()
                    && !btnCard20.isEnabled()
                    && !btnCard21.isEnabled()
                    && !btnCard22.isEnabled()
                    && !btnCard23.isEnabled()
                    && !btnCard24.isEnabled()) {
                JOptionPane.showMessageDialog(null, "Ganaste! completaste el juego en " + counterTries + " intentos");
            } else if (counterTries > menu.levelMovements) {
                JOptionPane.showMessageDialog(null, "Perdiste");

                btnCard1.setEnabled(false);
                btnCard2.setEnabled(false);
                btnCard3.setEnabled(false);
                btnCard4.setEnabled(false);
                btnCard5.setEnabled(false);
                btnCard6.setEnabled(false);
                btnCard7.setEnabled(false);
                btnCard8.setEnabled(false);
                btnCard9.setEnabled(false);
                btnCard10.setEnabled(false);
                btnCard11.setEnabled(false);
                btnCard12.setEnabled(false);
                btnCard13.setEnabled(false);
                btnCard14.setEnabled(false);
                btnCard15.setEnabled(false);
                btnCard16.setEnabled(false);
                btnCard17.setEnabled(false);
                btnCard18.setEnabled(false);
                btnCard19.setEnabled(false);
                btnCard20.setEnabled(false);
                btnCard21.setEnabled(false);
                btnCard22.setEnabled(false);
                btnCard23.setEnabled(false);
                btnCard24.setEnabled(false);

            }
        }
    }//GEN-LAST:event_btnCard10MouseExited

    private void btnCard11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCard11MouseExited
        if (revealCard1 && revealCard2) {
            if (image1.getDescription().compareTo(image2.getDescription()) != 0) {
                buttons[0].setEnabled(true);
                buttons[1].setEnabled(true);
            }
            revealCard1 = false;
            revealCard2 = false;

            counterTries++;
            lblCounter.setText("" + counterTries);

            if (!btnCard1.isEnabled()
                    && !btnCard2.isEnabled()
                    && !btnCard3.isEnabled()
                    && !btnCard4.isEnabled()
                    && !btnCard5.isEnabled()
                    && !btnCard6.isEnabled()
                    && !btnCard7.isEnabled()
                    && !btnCard8.isEnabled()
                    && !btnCard9.isEnabled()
                    && !btnCard10.isEnabled()
                    && !btnCard11.isEnabled()
                    && !btnCard12.isEnabled()
                    && !btnCard13.isEnabled()
                    && !btnCard14.isEnabled()
                    && !btnCard15.isEnabled()
                    && !btnCard16.isEnabled()
                    && !btnCard17.isEnabled()
                    && !btnCard18.isEnabled()
                    && !btnCard19.isEnabled()
                    && !btnCard20.isEnabled()
                    && !btnCard21.isEnabled()
                    && !btnCard22.isEnabled()
                    && !btnCard23.isEnabled()
                    && !btnCard24.isEnabled()) {
                JOptionPane.showMessageDialog(null, "Ganaste! completaste el juego en " + counterTries + " intentos");
            } else if (counterTries > menu.levelMovements) {
                JOptionPane.showMessageDialog(null, "Perdiste");

                btnCard1.setEnabled(false);
                btnCard2.setEnabled(false);
                btnCard3.setEnabled(false);
                btnCard4.setEnabled(false);
                btnCard5.setEnabled(false);
                btnCard6.setEnabled(false);
                btnCard7.setEnabled(false);
                btnCard8.setEnabled(false);
                btnCard9.setEnabled(false);
                btnCard10.setEnabled(false);
                btnCard11.setEnabled(false);
                btnCard12.setEnabled(false);
                btnCard13.setEnabled(false);
                btnCard14.setEnabled(false);
                btnCard15.setEnabled(false);
                btnCard16.setEnabled(false);
                btnCard17.setEnabled(false);
                btnCard18.setEnabled(false);
                btnCard19.setEnabled(false);
                btnCard20.setEnabled(false);
                btnCard21.setEnabled(false);
                btnCard22.setEnabled(false);
                btnCard23.setEnabled(false);
                btnCard24.setEnabled(false);

            }
        }
    }//GEN-LAST:event_btnCard11MouseExited

    private void btnCard12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCard12MouseExited
        if (revealCard1 && revealCard2) {
            if (image1.getDescription().compareTo(image2.getDescription()) != 0) {
                buttons[0].setEnabled(true);
                buttons[1].setEnabled(true);
            }
            revealCard1 = false;
            revealCard2 = false;

            counterTries++;
            lblCounter.setText("" + counterTries);

            if (!btnCard1.isEnabled()
                    && !btnCard2.isEnabled()
                    && !btnCard3.isEnabled()
                    && !btnCard4.isEnabled()
                    && !btnCard5.isEnabled()
                    && !btnCard6.isEnabled()
                    && !btnCard7.isEnabled()
                    && !btnCard8.isEnabled()
                    && !btnCard9.isEnabled()
                    && !btnCard10.isEnabled()
                    && !btnCard11.isEnabled()
                    && !btnCard12.isEnabled()
                    && !btnCard13.isEnabled()
                    && !btnCard14.isEnabled()
                    && !btnCard15.isEnabled()
                    && !btnCard16.isEnabled()
                    && !btnCard17.isEnabled()
                    && !btnCard18.isEnabled()
                    && !btnCard19.isEnabled()
                    && !btnCard20.isEnabled()
                    && !btnCard21.isEnabled()
                    && !btnCard22.isEnabled()
                    && !btnCard23.isEnabled()
                    && !btnCard24.isEnabled()) {
                JOptionPane.showMessageDialog(null, "Ganaste! completaste el juego en " + counterTries + " intentos");
            } else if (counterTries > menu.levelMovements) {
                JOptionPane.showMessageDialog(null, "Perdiste");

                btnCard1.setEnabled(false);
                btnCard2.setEnabled(false);
                btnCard3.setEnabled(false);
                btnCard4.setEnabled(false);
                btnCard5.setEnabled(false);
                btnCard6.setEnabled(false);
                btnCard7.setEnabled(false);
                btnCard8.setEnabled(false);
                btnCard9.setEnabled(false);
                btnCard10.setEnabled(false);
                btnCard11.setEnabled(false);
                btnCard12.setEnabled(false);
                btnCard13.setEnabled(false);
                btnCard14.setEnabled(false);
                btnCard15.setEnabled(false);
                btnCard16.setEnabled(false);
                btnCard17.setEnabled(false);
                btnCard18.setEnabled(false);
                btnCard19.setEnabled(false);
                btnCard20.setEnabled(false);
                btnCard21.setEnabled(false);
                btnCard22.setEnabled(false);
                btnCard23.setEnabled(false);
                btnCard24.setEnabled(false);

            }
        }
    }//GEN-LAST:event_btnCard12MouseExited

    private void btnCard13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCard13MouseExited
        if (revealCard1 && revealCard2) {
            if (image1.getDescription().compareTo(image2.getDescription()) != 0) {
                buttons[0].setEnabled(true);
                buttons[1].setEnabled(true);
            }
            revealCard1 = false;
            revealCard2 = false;

            counterTries++;
            lblCounter.setText("" + counterTries);

            if (!btnCard1.isEnabled()
                    && !btnCard2.isEnabled()
                    && !btnCard3.isEnabled()
                    && !btnCard4.isEnabled()
                    && !btnCard5.isEnabled()
                    && !btnCard6.isEnabled()
                    && !btnCard7.isEnabled()
                    && !btnCard8.isEnabled()
                    && !btnCard9.isEnabled()
                    && !btnCard10.isEnabled()
                    && !btnCard11.isEnabled()
                    && !btnCard12.isEnabled()
                    && !btnCard13.isEnabled()
                    && !btnCard14.isEnabled()
                    && !btnCard15.isEnabled()
                    && !btnCard16.isEnabled()
                    && !btnCard17.isEnabled()
                    && !btnCard18.isEnabled()
                    && !btnCard19.isEnabled()
                    && !btnCard20.isEnabled()
                    && !btnCard21.isEnabled()
                    && !btnCard22.isEnabled()
                    && !btnCard23.isEnabled()
                    && !btnCard24.isEnabled()) {
                JOptionPane.showMessageDialog(null, "Ganaste! completaste el juego en " + counterTries + " intentos");
            } else if (counterTries > menu.levelMovements) {
                JOptionPane.showMessageDialog(null, "Perdiste");

                btnCard1.setEnabled(false);
                btnCard2.setEnabled(false);
                btnCard3.setEnabled(false);
                btnCard4.setEnabled(false);
                btnCard5.setEnabled(false);
                btnCard6.setEnabled(false);
                btnCard7.setEnabled(false);
                btnCard8.setEnabled(false);
                btnCard9.setEnabled(false);
                btnCard10.setEnabled(false);
                btnCard11.setEnabled(false);
                btnCard12.setEnabled(false);
                btnCard13.setEnabled(false);
                btnCard14.setEnabled(false);
                btnCard15.setEnabled(false);
                btnCard16.setEnabled(false);
                btnCard17.setEnabled(false);
                btnCard18.setEnabled(false);
                btnCard19.setEnabled(false);
                btnCard20.setEnabled(false);
                btnCard21.setEnabled(false);
                btnCard22.setEnabled(false);
                btnCard23.setEnabled(false);
                btnCard24.setEnabled(false);

            }
        }
    }//GEN-LAST:event_btnCard13MouseExited

    private void btnCard14MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCard14MouseExited
        if (revealCard1 && revealCard2) {
            if (image1.getDescription().compareTo(image2.getDescription()) != 0) {
                buttons[0].setEnabled(true);
                buttons[1].setEnabled(true);
            }
            revealCard1 = false;
            revealCard2 = false;

            counterTries++;
            lblCounter.setText("" + counterTries);

            if (!btnCard1.isEnabled()
                    && !btnCard2.isEnabled()
                    && !btnCard3.isEnabled()
                    && !btnCard4.isEnabled()
                    && !btnCard5.isEnabled()
                    && !btnCard6.isEnabled()
                    && !btnCard7.isEnabled()
                    && !btnCard8.isEnabled()
                    && !btnCard9.isEnabled()
                    && !btnCard10.isEnabled()
                    && !btnCard11.isEnabled()
                    && !btnCard12.isEnabled()
                    && !btnCard13.isEnabled()
                    && !btnCard14.isEnabled()
                    && !btnCard15.isEnabled()
                    && !btnCard16.isEnabled()
                    && !btnCard17.isEnabled()
                    && !btnCard18.isEnabled()
                    && !btnCard19.isEnabled()
                    && !btnCard20.isEnabled()
                    && !btnCard21.isEnabled()
                    && !btnCard22.isEnabled()
                    && !btnCard23.isEnabled()
                    && !btnCard24.isEnabled()) {
                JOptionPane.showMessageDialog(null, "Ganaste! completaste el juego en " + counterTries + " intentos");
            } else if (counterTries > menu.levelMovements) {
                JOptionPane.showMessageDialog(null, "Perdiste");

                btnCard1.setEnabled(false);
                btnCard2.setEnabled(false);
                btnCard3.setEnabled(false);
                btnCard4.setEnabled(false);
                btnCard5.setEnabled(false);
                btnCard6.setEnabled(false);
                btnCard7.setEnabled(false);
                btnCard8.setEnabled(false);
                btnCard9.setEnabled(false);
                btnCard10.setEnabled(false);
                btnCard11.setEnabled(false);
                btnCard12.setEnabled(false);
                btnCard13.setEnabled(false);
                btnCard14.setEnabled(false);
                btnCard15.setEnabled(false);
                btnCard16.setEnabled(false);
                btnCard17.setEnabled(false);
                btnCard18.setEnabled(false);
                btnCard19.setEnabled(false);
                btnCard20.setEnabled(false);
                btnCard21.setEnabled(false);
                btnCard22.setEnabled(false);
                btnCard23.setEnabled(false);
                btnCard24.setEnabled(false);

            }
        }
    }//GEN-LAST:event_btnCard14MouseExited

    private void btnCard15MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCard15MouseExited
        if (revealCard1 && revealCard2) {
            if (image1.getDescription().compareTo(image2.getDescription()) != 0) {
                buttons[0].setEnabled(true);
                buttons[1].setEnabled(true);
            }
            revealCard1 = false;
            revealCard2 = false;

            counterTries++;
            lblCounter.setText("" + counterTries);

            if (!btnCard1.isEnabled()
                    && !btnCard2.isEnabled()
                    && !btnCard3.isEnabled()
                    && !btnCard4.isEnabled()
                    && !btnCard5.isEnabled()
                    && !btnCard6.isEnabled()
                    && !btnCard7.isEnabled()
                    && !btnCard8.isEnabled()
                    && !btnCard9.isEnabled()
                    && !btnCard10.isEnabled()
                    && !btnCard11.isEnabled()
                    && !btnCard12.isEnabled()
                    && !btnCard13.isEnabled()
                    && !btnCard14.isEnabled()
                    && !btnCard15.isEnabled()
                    && !btnCard16.isEnabled()
                    && !btnCard17.isEnabled()
                    && !btnCard18.isEnabled()
                    && !btnCard19.isEnabled()
                    && !btnCard20.isEnabled()
                    && !btnCard21.isEnabled()
                    && !btnCard22.isEnabled()
                    && !btnCard23.isEnabled()
                    && !btnCard24.isEnabled()) {
                JOptionPane.showMessageDialog(null, "Ganaste! completaste el juego en " + counterTries + " intentos");
            } else if (counterTries > menu.levelMovements) {
                JOptionPane.showMessageDialog(null, "Perdiste");

                btnCard1.setEnabled(false);
                btnCard2.setEnabled(false);
                btnCard3.setEnabled(false);
                btnCard4.setEnabled(false);
                btnCard5.setEnabled(false);
                btnCard6.setEnabled(false);
                btnCard7.setEnabled(false);
                btnCard8.setEnabled(false);
                btnCard9.setEnabled(false);
                btnCard10.setEnabled(false);
                btnCard11.setEnabled(false);
                btnCard12.setEnabled(false);
                btnCard13.setEnabled(false);
                btnCard14.setEnabled(false);
                btnCard15.setEnabled(false);
                btnCard16.setEnabled(false);
                btnCard17.setEnabled(false);
                btnCard18.setEnabled(false);
                btnCard19.setEnabled(false);
                btnCard20.setEnabled(false);
                btnCard21.setEnabled(false);
                btnCard22.setEnabled(false);
                btnCard23.setEnabled(false);
                btnCard24.setEnabled(false);

            }
        }
    }//GEN-LAST:event_btnCard15MouseExited

    private void btnCard16MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCard16MouseExited
        if (revealCard1 && revealCard2) {
            if (image1.getDescription().compareTo(image2.getDescription()) != 0) {
                buttons[0].setEnabled(true);
                buttons[1].setEnabled(true);
            }
            revealCard1 = false;
            revealCard2 = false;

            counterTries++;
            lblCounter.setText("" + counterTries);

            if (!btnCard1.isEnabled()
                    && !btnCard2.isEnabled()
                    && !btnCard3.isEnabled()
                    && !btnCard4.isEnabled()
                    && !btnCard5.isEnabled()
                    && !btnCard6.isEnabled()
                    && !btnCard7.isEnabled()
                    && !btnCard8.isEnabled()
                    && !btnCard9.isEnabled()
                    && !btnCard10.isEnabled()
                    && !btnCard11.isEnabled()
                    && !btnCard12.isEnabled()
                    && !btnCard13.isEnabled()
                    && !btnCard14.isEnabled()
                    && !btnCard15.isEnabled()
                    && !btnCard16.isEnabled()
                    && !btnCard17.isEnabled()
                    && !btnCard18.isEnabled()
                    && !btnCard19.isEnabled()
                    && !btnCard20.isEnabled()
                    && !btnCard21.isEnabled()
                    && !btnCard22.isEnabled()
                    && !btnCard23.isEnabled()
                    && !btnCard24.isEnabled()) {
                JOptionPane.showMessageDialog(null, "Ganaste! completaste el juego en " + counterTries + " intentos");
            } else if (counterTries > menu.levelMovements) {
                JOptionPane.showMessageDialog(null, "Perdiste");

                btnCard1.setEnabled(false);
                btnCard2.setEnabled(false);
                btnCard3.setEnabled(false);
                btnCard4.setEnabled(false);
                btnCard5.setEnabled(false);
                btnCard6.setEnabled(false);
                btnCard7.setEnabled(false);
                btnCard8.setEnabled(false);
                btnCard9.setEnabled(false);
                btnCard10.setEnabled(false);
                btnCard11.setEnabled(false);
                btnCard12.setEnabled(false);
                btnCard13.setEnabled(false);
                btnCard14.setEnabled(false);
                btnCard15.setEnabled(false);
                btnCard16.setEnabled(false);
                btnCard17.setEnabled(false);
                btnCard18.setEnabled(false);
                btnCard19.setEnabled(false);
                btnCard20.setEnabled(false);
                btnCard21.setEnabled(false);
                btnCard22.setEnabled(false);
                btnCard23.setEnabled(false);
                btnCard24.setEnabled(false);

            }
        }
    }//GEN-LAST:event_btnCard16MouseExited

    private void btnCard17MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCard17MouseExited
        if (revealCard1 && revealCard2) {
            if (image1.getDescription().compareTo(image2.getDescription()) != 0) {
                buttons[0].setEnabled(true);
                buttons[1].setEnabled(true);
            }
            revealCard1 = false;
            revealCard2 = false;

            counterTries++;
            lblCounter.setText("" + counterTries);

            if (!btnCard1.isEnabled()
                    && !btnCard2.isEnabled()
                    && !btnCard3.isEnabled()
                    && !btnCard4.isEnabled()
                    && !btnCard5.isEnabled()
                    && !btnCard6.isEnabled()
                    && !btnCard7.isEnabled()
                    && !btnCard8.isEnabled()
                    && !btnCard9.isEnabled()
                    && !btnCard10.isEnabled()
                    && !btnCard11.isEnabled()
                    && !btnCard12.isEnabled()
                    && !btnCard13.isEnabled()
                    && !btnCard14.isEnabled()
                    && !btnCard15.isEnabled()
                    && !btnCard16.isEnabled()
                    && !btnCard17.isEnabled()
                    && !btnCard18.isEnabled()
                    && !btnCard19.isEnabled()
                    && !btnCard20.isEnabled()
                    && !btnCard21.isEnabled()
                    && !btnCard22.isEnabled()
                    && !btnCard23.isEnabled()
                    && !btnCard24.isEnabled()) {
                JOptionPane.showMessageDialog(null, "Ganaste! completaste el juego en " + counterTries + " intentos");
            } else if (counterTries > menu.levelMovements) {
                JOptionPane.showMessageDialog(null, "Perdiste");

                btnCard1.setEnabled(false);
                btnCard2.setEnabled(false);
                btnCard3.setEnabled(false);
                btnCard4.setEnabled(false);
                btnCard5.setEnabled(false);
                btnCard6.setEnabled(false);
                btnCard7.setEnabled(false);
                btnCard8.setEnabled(false);
                btnCard9.setEnabled(false);
                btnCard10.setEnabled(false);
                btnCard11.setEnabled(false);
                btnCard12.setEnabled(false);
                btnCard13.setEnabled(false);
                btnCard14.setEnabled(false);
                btnCard15.setEnabled(false);
                btnCard16.setEnabled(false);
                btnCard17.setEnabled(false);
                btnCard18.setEnabled(false);
                btnCard19.setEnabled(false);
                btnCard20.setEnabled(false);
                btnCard21.setEnabled(false);
                btnCard22.setEnabled(false);
                btnCard23.setEnabled(false);
                btnCard24.setEnabled(false);

            }
        }
    }//GEN-LAST:event_btnCard17MouseExited

    private void btnCard18MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCard18MouseExited
        if (revealCard1 && revealCard2) {
            if (image1.getDescription().compareTo(image2.getDescription()) != 0) {
                buttons[0].setEnabled(true);
                buttons[1].setEnabled(true);
            }
            revealCard1 = false;
            revealCard2 = false;

            counterTries++;
            lblCounter.setText("" + counterTries);

            if (!btnCard1.isEnabled()
                    && !btnCard2.isEnabled()
                    && !btnCard3.isEnabled()
                    && !btnCard4.isEnabled()
                    && !btnCard5.isEnabled()
                    && !btnCard6.isEnabled()
                    && !btnCard7.isEnabled()
                    && !btnCard8.isEnabled()
                    && !btnCard9.isEnabled()
                    && !btnCard10.isEnabled()
                    && !btnCard11.isEnabled()
                    && !btnCard12.isEnabled()
                    && !btnCard13.isEnabled()
                    && !btnCard14.isEnabled()
                    && !btnCard15.isEnabled()
                    && !btnCard16.isEnabled()
                    && !btnCard17.isEnabled()
                    && !btnCard18.isEnabled()
                    && !btnCard19.isEnabled()
                    && !btnCard20.isEnabled()
                    && !btnCard21.isEnabled()
                    && !btnCard22.isEnabled()
                    && !btnCard23.isEnabled()
                    && !btnCard24.isEnabled()) {
                JOptionPane.showMessageDialog(null, "Ganaste! completaste el juego en " + counterTries + " intentos");
            } else if (counterTries > menu.levelMovements) {
                JOptionPane.showMessageDialog(null, "Perdiste");

                btnCard1.setEnabled(false);
                btnCard2.setEnabled(false);
                btnCard3.setEnabled(false);
                btnCard4.setEnabled(false);
                btnCard5.setEnabled(false);
                btnCard6.setEnabled(false);
                btnCard7.setEnabled(false);
                btnCard8.setEnabled(false);
                btnCard9.setEnabled(false);
                btnCard10.setEnabled(false);
                btnCard11.setEnabled(false);
                btnCard12.setEnabled(false);
                btnCard13.setEnabled(false);
                btnCard14.setEnabled(false);
                btnCard15.setEnabled(false);
                btnCard16.setEnabled(false);
                btnCard17.setEnabled(false);
                btnCard18.setEnabled(false);
                btnCard19.setEnabled(false);
                btnCard20.setEnabled(false);
                btnCard21.setEnabled(false);
                btnCard22.setEnabled(false);
                btnCard23.setEnabled(false);
                btnCard24.setEnabled(false);

            }
        }
    }//GEN-LAST:event_btnCard18MouseExited

    private void btnCard19MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCard19MouseExited
        if (revealCard1 && revealCard2) {
            if (image1.getDescription().compareTo(image2.getDescription()) != 0) {
                buttons[0].setEnabled(true);
                buttons[1].setEnabled(true);
            }
            revealCard1 = false;
            revealCard2 = false;

            counterTries++;
            lblCounter.setText("" + counterTries);

            if (!btnCard1.isEnabled()
                    && !btnCard2.isEnabled()
                    && !btnCard3.isEnabled()
                    && !btnCard4.isEnabled()
                    && !btnCard5.isEnabled()
                    && !btnCard6.isEnabled()
                    && !btnCard7.isEnabled()
                    && !btnCard8.isEnabled()
                    && !btnCard9.isEnabled()
                    && !btnCard10.isEnabled()
                    && !btnCard11.isEnabled()
                    && !btnCard12.isEnabled()
                    && !btnCard13.isEnabled()
                    && !btnCard14.isEnabled()
                    && !btnCard15.isEnabled()
                    && !btnCard16.isEnabled()
                    && !btnCard17.isEnabled()
                    && !btnCard18.isEnabled()
                    && !btnCard19.isEnabled()
                    && !btnCard20.isEnabled()
                    && !btnCard21.isEnabled()
                    && !btnCard22.isEnabled()
                    && !btnCard23.isEnabled()
                    && !btnCard24.isEnabled()) {
                JOptionPane.showMessageDialog(null, "Ganaste! completaste el juego en " + counterTries + " intentos");
            } else if (counterTries > menu.levelMovements) {
                JOptionPane.showMessageDialog(null, "Perdiste");

                btnCard1.setEnabled(false);
                btnCard2.setEnabled(false);
                btnCard3.setEnabled(false);
                btnCard4.setEnabled(false);
                btnCard5.setEnabled(false);
                btnCard6.setEnabled(false);
                btnCard7.setEnabled(false);
                btnCard8.setEnabled(false);
                btnCard9.setEnabled(false);
                btnCard10.setEnabled(false);
                btnCard11.setEnabled(false);
                btnCard12.setEnabled(false);
                btnCard13.setEnabled(false);
                btnCard14.setEnabled(false);
                btnCard15.setEnabled(false);
                btnCard16.setEnabled(false);
                btnCard17.setEnabled(false);
                btnCard18.setEnabled(false);
                btnCard19.setEnabled(false);
                btnCard20.setEnabled(false);
                btnCard21.setEnabled(false);
                btnCard22.setEnabled(false);
                btnCard23.setEnabled(false);
                btnCard24.setEnabled(false);

            }
        }
    }//GEN-LAST:event_btnCard19MouseExited

    private void btnCard20MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCard20MouseExited
        if (revealCard1 && revealCard2) {
            if (image1.getDescription().compareTo(image2.getDescription()) != 0) {
                buttons[0].setEnabled(true);
                buttons[1].setEnabled(true);
            }
            revealCard1 = false;
            revealCard2 = false;

            counterTries++;
            lblCounter.setText("" + counterTries);

            if (!btnCard1.isEnabled()
                    && !btnCard2.isEnabled()
                    && !btnCard3.isEnabled()
                    && !btnCard4.isEnabled()
                    && !btnCard5.isEnabled()
                    && !btnCard6.isEnabled()
                    && !btnCard7.isEnabled()
                    && !btnCard8.isEnabled()
                    && !btnCard9.isEnabled()
                    && !btnCard10.isEnabled()
                    && !btnCard11.isEnabled()
                    && !btnCard12.isEnabled()
                    && !btnCard13.isEnabled()
                    && !btnCard14.isEnabled()
                    && !btnCard15.isEnabled()
                    && !btnCard16.isEnabled()
                    && !btnCard17.isEnabled()
                    && !btnCard18.isEnabled()
                    && !btnCard19.isEnabled()
                    && !btnCard20.isEnabled()
                    && !btnCard21.isEnabled()
                    && !btnCard22.isEnabled()
                    && !btnCard23.isEnabled()
                    && !btnCard24.isEnabled()) {
                JOptionPane.showMessageDialog(null, "Ganaste! completaste el juego en " + counterTries + " intentos");
            } else if (counterTries > menu.levelMovements) {
                JOptionPane.showMessageDialog(null, "Perdiste");

                btnCard1.setEnabled(false);
                btnCard2.setEnabled(false);
                btnCard3.setEnabled(false);
                btnCard4.setEnabled(false);
                btnCard5.setEnabled(false);
                btnCard6.setEnabled(false);
                btnCard7.setEnabled(false);
                btnCard8.setEnabled(false);
                btnCard9.setEnabled(false);
                btnCard10.setEnabled(false);
                btnCard11.setEnabled(false);
                btnCard12.setEnabled(false);
                btnCard13.setEnabled(false);
                btnCard14.setEnabled(false);
                btnCard15.setEnabled(false);
                btnCard16.setEnabled(false);
                btnCard17.setEnabled(false);
                btnCard18.setEnabled(false);
                btnCard19.setEnabled(false);
                btnCard20.setEnabled(false);
                btnCard21.setEnabled(false);
                btnCard22.setEnabled(false);
                btnCard23.setEnabled(false);
                btnCard24.setEnabled(false);

            }
        }
    }//GEN-LAST:event_btnCard20MouseExited

    private void btnCard21MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCard21MouseExited
        if (revealCard1 && revealCard2) {
            if (image1.getDescription().compareTo(image2.getDescription()) != 0) {
                buttons[0].setEnabled(true);
                buttons[1].setEnabled(true);
            }
            revealCard1 = false;
            revealCard2 = false;

            counterTries++;
            lblCounter.setText("" + counterTries);

            if (!btnCard1.isEnabled()
                    && !btnCard2.isEnabled()
                    && !btnCard3.isEnabled()
                    && !btnCard4.isEnabled()
                    && !btnCard5.isEnabled()
                    && !btnCard6.isEnabled()
                    && !btnCard7.isEnabled()
                    && !btnCard8.isEnabled()
                    && !btnCard9.isEnabled()
                    && !btnCard10.isEnabled()
                    && !btnCard11.isEnabled()
                    && !btnCard12.isEnabled()
                    && !btnCard13.isEnabled()
                    && !btnCard14.isEnabled()
                    && !btnCard15.isEnabled()
                    && !btnCard16.isEnabled()
                    && !btnCard17.isEnabled()
                    && !btnCard18.isEnabled()
                    && !btnCard19.isEnabled()
                    && !btnCard20.isEnabled()
                    && !btnCard21.isEnabled()
                    && !btnCard22.isEnabled()
                    && !btnCard23.isEnabled()
                    && !btnCard24.isEnabled()) {
                JOptionPane.showMessageDialog(null, "Ganaste! completaste el juego en " + counterTries + " intentos");
            } else if (counterTries > menu.levelMovements) {
                JOptionPane.showMessageDialog(null, "Perdiste");

                btnCard1.setEnabled(false);
                btnCard2.setEnabled(false);
                btnCard3.setEnabled(false);
                btnCard4.setEnabled(false);
                btnCard5.setEnabled(false);
                btnCard6.setEnabled(false);
                btnCard7.setEnabled(false);
                btnCard8.setEnabled(false);
                btnCard9.setEnabled(false);
                btnCard10.setEnabled(false);
                btnCard11.setEnabled(false);
                btnCard12.setEnabled(false);
                btnCard13.setEnabled(false);
                btnCard14.setEnabled(false);
                btnCard15.setEnabled(false);
                btnCard16.setEnabled(false);
                btnCard17.setEnabled(false);
                btnCard18.setEnabled(false);
                btnCard19.setEnabled(false);
                btnCard20.setEnabled(false);
                btnCard21.setEnabled(false);
                btnCard22.setEnabled(false);
                btnCard23.setEnabled(false);
                btnCard24.setEnabled(false);

            }
        }
    }//GEN-LAST:event_btnCard21MouseExited

    private void btnCard22MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCard22MouseExited
        if (revealCard1 && revealCard2) {
            if (image1.getDescription().compareTo(image2.getDescription()) != 0) {
                buttons[0].setEnabled(true);
                buttons[1].setEnabled(true);
            }
            revealCard1 = false;
            revealCard2 = false;

            counterTries++;
            lblCounter.setText("" + counterTries);

            if (!btnCard1.isEnabled()
                    && !btnCard2.isEnabled()
                    && !btnCard3.isEnabled()
                    && !btnCard4.isEnabled()
                    && !btnCard5.isEnabled()
                    && !btnCard6.isEnabled()
                    && !btnCard7.isEnabled()
                    && !btnCard8.isEnabled()
                    && !btnCard9.isEnabled()
                    && !btnCard10.isEnabled()
                    && !btnCard11.isEnabled()
                    && !btnCard12.isEnabled()
                    && !btnCard13.isEnabled()
                    && !btnCard14.isEnabled()
                    && !btnCard15.isEnabled()
                    && !btnCard16.isEnabled()
                    && !btnCard17.isEnabled()
                    && !btnCard18.isEnabled()
                    && !btnCard19.isEnabled()
                    && !btnCard20.isEnabled()
                    && !btnCard21.isEnabled()
                    && !btnCard22.isEnabled()
                    && !btnCard23.isEnabled()
                    && !btnCard24.isEnabled()) {
                JOptionPane.showMessageDialog(null, "Ganaste! completaste el juego en " + counterTries + " intentos");
            } else if (counterTries > menu.levelMovements) {
                JOptionPane.showMessageDialog(null, "Perdiste");

                btnCard1.setEnabled(false);
                btnCard2.setEnabled(false);
                btnCard3.setEnabled(false);
                btnCard4.setEnabled(false);
                btnCard5.setEnabled(false);
                btnCard6.setEnabled(false);
                btnCard7.setEnabled(false);
                btnCard8.setEnabled(false);
                btnCard9.setEnabled(false);
                btnCard10.setEnabled(false);
                btnCard11.setEnabled(false);
                btnCard12.setEnabled(false);
                btnCard13.setEnabled(false);
                btnCard14.setEnabled(false);
                btnCard15.setEnabled(false);
                btnCard16.setEnabled(false);
                btnCard17.setEnabled(false);
                btnCard18.setEnabled(false);
                btnCard19.setEnabled(false);
                btnCard20.setEnabled(false);
                btnCard21.setEnabled(false);
                btnCard22.setEnabled(false);
                btnCard23.setEnabled(false);
                btnCard24.setEnabled(false);

            }
        }
    }//GEN-LAST:event_btnCard22MouseExited

    private void btnCard23MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCard23MouseExited
        if (revealCard1 && revealCard2) {
            if (image1.getDescription().compareTo(image2.getDescription()) != 0) {
                buttons[0].setEnabled(true);
                buttons[1].setEnabled(true);
            }
            revealCard1 = false;
            revealCard2 = false;

            counterTries++;
            lblCounter.setText("" + counterTries);

            if (!btnCard1.isEnabled()
                    && !btnCard2.isEnabled()
                    && !btnCard3.isEnabled()
                    && !btnCard4.isEnabled()
                    && !btnCard5.isEnabled()
                    && !btnCard6.isEnabled()
                    && !btnCard7.isEnabled()
                    && !btnCard8.isEnabled()
                    && !btnCard9.isEnabled()
                    && !btnCard10.isEnabled()
                    && !btnCard11.isEnabled()
                    && !btnCard12.isEnabled()
                    && !btnCard13.isEnabled()
                    && !btnCard14.isEnabled()
                    && !btnCard15.isEnabled()
                    && !btnCard16.isEnabled()
                    && !btnCard17.isEnabled()
                    && !btnCard18.isEnabled()
                    && !btnCard19.isEnabled()
                    && !btnCard20.isEnabled()
                    && !btnCard21.isEnabled()
                    && !btnCard22.isEnabled()
                    && !btnCard23.isEnabled()
                    && !btnCard24.isEnabled()) {
                JOptionPane.showMessageDialog(null, "Ganaste! completaste el juego en " + counterTries + " intentos");
            } else if (counterTries > menu.levelMovements) {
                JOptionPane.showMessageDialog(null, "Perdiste");

                btnCard1.setEnabled(false);
                btnCard2.setEnabled(false);
                btnCard3.setEnabled(false);
                btnCard4.setEnabled(false);
                btnCard5.setEnabled(false);
                btnCard6.setEnabled(false);
                btnCard7.setEnabled(false);
                btnCard8.setEnabled(false);
                btnCard9.setEnabled(false);
                btnCard10.setEnabled(false);
                btnCard11.setEnabled(false);
                btnCard12.setEnabled(false);
                btnCard13.setEnabled(false);
                btnCard14.setEnabled(false);
                btnCard15.setEnabled(false);
                btnCard16.setEnabled(false);
                btnCard17.setEnabled(false);
                btnCard18.setEnabled(false);
                btnCard19.setEnabled(false);
                btnCard20.setEnabled(false);
                btnCard21.setEnabled(false);
                btnCard22.setEnabled(false);
                btnCard23.setEnabled(false);
                btnCard24.setEnabled(false);

            }
        }
    }//GEN-LAST:event_btnCard23MouseExited

    private void btnCard24MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCard24MouseExited
        if (revealCard1 && revealCard2) {
            if (image1.getDescription().compareTo(image2.getDescription()) != 0) {
                buttons[0].setEnabled(true);
                buttons[1].setEnabled(true);
            }
            revealCard1 = false;
            revealCard2 = false;

            counterTries++;
            lblCounter.setText("" + counterTries);

            if (!btnCard1.isEnabled()
                    && !btnCard2.isEnabled()
                    && !btnCard3.isEnabled()
                    && !btnCard4.isEnabled()
                    && !btnCard5.isEnabled()
                    && !btnCard6.isEnabled()
                    && !btnCard7.isEnabled()
                    && !btnCard8.isEnabled()
                    && !btnCard9.isEnabled()
                    && !btnCard10.isEnabled()
                    && !btnCard11.isEnabled()
                    && !btnCard12.isEnabled()
                    && !btnCard13.isEnabled()
                    && !btnCard14.isEnabled()
                    && !btnCard15.isEnabled()
                    && !btnCard16.isEnabled()
                    && !btnCard17.isEnabled()
                    && !btnCard18.isEnabled()
                    && !btnCard19.isEnabled()
                    && !btnCard20.isEnabled()
                    && !btnCard21.isEnabled()
                    && !btnCard22.isEnabled()
                    && !btnCard23.isEnabled()
                    && !btnCard24.isEnabled()) {
                JOptionPane.showMessageDialog(null, "Ganaste! completaste el juego en " + counterTries + " intentos");
            } else if (counterTries > menu.levelMovements) {
                JOptionPane.showMessageDialog(null, "Perdiste");

                btnCard1.setEnabled(false);
                btnCard2.setEnabled(false);
                btnCard3.setEnabled(false);
                btnCard4.setEnabled(false);
                btnCard5.setEnabled(false);
                btnCard6.setEnabled(false);
                btnCard7.setEnabled(false);
                btnCard8.setEnabled(false);
                btnCard9.setEnabled(false);
                btnCard10.setEnabled(false);
                btnCard11.setEnabled(false);
                btnCard12.setEnabled(false);
                btnCard13.setEnabled(false);
                btnCard14.setEnabled(false);
                btnCard15.setEnabled(false);
                btnCard16.setEnabled(false);
                btnCard17.setEnabled(false);
                btnCard18.setEnabled(false);
                btnCard19.setEnabled(false);
                btnCard20.setEnabled(false);
                btnCard21.setEnabled(false);
                btnCard22.setEnabled(false);
                btnCard23.setEnabled(false);
                btnCard24.setEnabled(false);

            }
        }
    }//GEN-LAST:event_btnCard24MouseExited

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
            java.util.logging.Logger.getLogger(game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new game().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCard1;
    private javax.swing.JButton btnCard10;
    private javax.swing.JButton btnCard11;
    private javax.swing.JButton btnCard12;
    private javax.swing.JButton btnCard13;
    private javax.swing.JButton btnCard14;
    private javax.swing.JButton btnCard15;
    private javax.swing.JButton btnCard16;
    private javax.swing.JButton btnCard17;
    private javax.swing.JButton btnCard18;
    private javax.swing.JButton btnCard19;
    private javax.swing.JButton btnCard2;
    private javax.swing.JButton btnCard20;
    private javax.swing.JButton btnCard21;
    private javax.swing.JButton btnCard22;
    private javax.swing.JButton btnCard23;
    private javax.swing.JButton btnCard24;
    private javax.swing.JButton btnCard3;
    private javax.swing.JButton btnCard4;
    private javax.swing.JButton btnCard5;
    private javax.swing.JButton btnCard6;
    private javax.swing.JButton btnCard7;
    private javax.swing.JButton btnCard8;
    private javax.swing.JButton btnCard9;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnInfo;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnStart;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelCounter;
    private javax.swing.JLabel labelMaxMoves;
    private javax.swing.JLabel lblCounter;
    private javax.swing.JLabel lblGameBackground;
    private javax.swing.JLabel lblMaxMoves;
    // End of variables declaration//GEN-END:variables
}
