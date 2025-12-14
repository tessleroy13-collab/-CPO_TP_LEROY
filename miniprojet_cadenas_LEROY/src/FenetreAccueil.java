/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
 

    public class FenetreAccueil extends javax.swing.JFrame {

   private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FenetreAccueil.class.getName());

    /**
     * Creates new form FenetreAccueil
     */
    public FenetreAccueil() {
        initComponents();
    }

    private void lancerJeu(jeu.NiveauDifficulte niveau) {
        interfacecadenas jeuinterfacecadenas = new interfacecadenas(niveau);
        jeuinterfacecadenas.setVisible(true);
        this.dispose();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bouton_facile = new javax.swing.JButton();
        bouton_difficile = new javax.swing.JButton();
        texte_niveau = new javax.swing.JLabel();
        bouton_normal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bouton_facile.setText("Niveau facile ");
        bouton_facile.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 255, 204), new java.awt.Color(51, 255, 204), new java.awt.Color(0, 255, 204), new java.awt.Color(0, 255, 204)));
        bouton_facile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bouton_facileActionPerformed(evt);
            }
        });

        bouton_difficile.setText("Niveau difficile");
        bouton_difficile.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 255, 204), new java.awt.Color(0, 255, 204), new java.awt.Color(0, 255, 204), new java.awt.Color(0, 255, 204)));
        bouton_difficile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bouton_difficileActionPerformed(evt);
            }
        });

        texte_niveau.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        texte_niveau.setForeground(new java.awt.Color(255, 153, 153));
        texte_niveau.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        texte_niveau.setText("quelle niveau ?");

        bouton_normal.setText("Niveau normal");
        bouton_normal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 255, 204), new java.awt.Color(0, 255, 204), new java.awt.Color(0, 255, 204), new java.awt.Color(0, 255, 204)));
        bouton_normal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bouton_normalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(texte_niveau, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bouton_facile, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(bouton_difficile, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bouton_normal, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(texte_niveau)
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bouton_facile)
                    .addComponent(bouton_difficile))
                .addGap(32, 32, 32)
                .addComponent(bouton_normal)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bouton_facileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bouton_facileActionPerformed
      lancerJeu(jeu.NiveauDifficulte.FACILE);
    }//GEN-LAST:event_bouton_facileActionPerformed

    private void bouton_difficileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bouton_difficileActionPerformed
        lancerJeu(jeu.NiveauDifficulte.DIFFICILE);
    }//GEN-LAST:event_bouton_difficileActionPerformed

    private void bouton_normalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bouton_normalActionPerformed
       lancerJeu(jeu.NiveauDifficulte.NORMAL);
    }//GEN-LAST:event_bouton_normalActionPerformed

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String args[]) {
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
        java.awt.EventQueue.invokeLater(() -> new FenetreAccueil().setVisible(true));
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bouton_difficile;
    private javax.swing.JButton bouton_facile;
    private javax.swing.JButton bouton_normal;
    private javax.swing.JLabel texte_niveau;
    // End of variables declaration//GEN-END:variables
    }
