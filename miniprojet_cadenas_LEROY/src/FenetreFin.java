import java.util.logging.Level;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */



public class FenetreFin extends javax.swing.JFrame {
    
    // Variables et logger
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FenetreFin.class.getName());

    

    // Constructeur: C'est le SEUL CONSTRUCTEUR nécessaire
    public FenetreFin(boolean gagne, String codeSecret, int tentatives) {
        initComponents();
        if (gagne) {
            message_fin.setText("BRAVO ! Vous avez trouvé le code en " + tentatives + " tentatives !");
        } else {
            message_fin.setText("PERDU ! Vous avez épuisé vos tentatives.");
        }
        code_secret.setText("Le code secret était : " + codeSecret);
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
          try {
        FenetreAccueil accueil = new FenetreAccueil();
        accueil.setVisible(true);
        this.dispose();
    } catch (Exception ex) {
        // C'EST CETTE LIGNE QUI NÉCESSITE Level
        logger.log(Level.SEVERE, "Impossible d'ouvrir FenetreAccueil", ex);
    }
    }//GEN-LAST:event_bouton_recommencerActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bouton_recommencer;
    private javax.swing.JLabel code_secret;
    private javax.swing.JLabel message_fin;
    // End of variables declaration//GEN-END:variables
}