/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author tessl
 */
public class FenetreFin extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FenetreFin.class.getName());


    public FenetreFin(boolean gagne, String code, int essais, int max) {
        initComponents(gagne, code, essais, max);
    }

    private void initComponents(boolean gagne, String code, int essais, int max) {

        setLayout(null);
        setSize(350, 220);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        javax.swing.JLabel message = new javax.swing.JLabel();
        javax.swing.JLabel codeLbl = new javax.swing.JLabel("Code secret : " + code);
        javax.swing.JButton recommencer = new javax.swing.JButton("Recommencer");

        message.setBounds(30, 30, 300, 30);
        codeLbl.setBounds(30, 70, 300, 30);
        recommencer.setBounds(100, 120, 130, 30);

        if (gagne) {
            message.setText("🎉 BRAVO ! Vous avez gagné !");
        } else {
            message.setText("😭 PERDU ! Plus de tentatives.");
        }

        add(message);
        add(codeLbl);
        add(recommencer);

        recommencer.addActionListener(e -> {
            new FenetreAccueil().setVisible(true);
            dispose();
        });
    }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bouton_recommencer = new javax.swing.JButton();
        message_fin = new javax.swing.JLabel();
        code_secret = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bouton_recommencer.setText("Recommencer");
        bouton_recommencer.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 255, 204), new java.awt.Color(0, 255, 204), new java.awt.Color(0, 255, 204), new java.awt.Color(0, 255, 204)));
        bouton_recommencer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bouton_recommencerActionPerformed(evt);
            }
        });

        message_fin.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        message_fin.setForeground(new java.awt.Color(0, 255, 204));
        message_fin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        message_fin.setText("Message de fin");

        code_secret.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        code_secret.setText("code secret");
        code_secret.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(message_fin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(31, 31, 31))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(bouton_recommencer, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(code_secret, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(message_fin)
                .addGap(56, 56, 56)
                .addComponent(code_secret)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                .addComponent(bouton_recommencer)
                .addGap(49, 49, 49))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bouton_recommencerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bouton_recommencerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bouton_recommencerActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new FenetreFin(jeu.estGagne(), jeu.getCodeSecretString(), jeu.getTentativesEffectuees(), jeu.getMaxTentatives()).setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bouton_recommencer;
    private javax.swing.JLabel code_secret;
    private javax.swing.JLabel message_fin;
    // End of variables declaration//GEN-END:variables

