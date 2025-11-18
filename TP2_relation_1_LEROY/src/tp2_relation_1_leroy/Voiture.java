/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_leroy;

/**
 *
 * @author tessl
 */
public class Voiture {
     String modele;
    String marque;
    int puissanceCV;

    Personne proprietaire;   // référence vers le propriétaire (null si aucun)

    public Voiture(String unModele, String uneMarque, int unePuissance) {
        modele = unModele;
        marque = uneMarque;
        puissanceCV = unePuissance;
        proprietaire = null; // obligatoire !
    }

    @Override
    public String toString() {
        String chaine;
        chaine = marque + " " + modele + " (" + puissanceCV + "CV)";
        if (proprietaire == null) {
            chaine += " – pas de propriétaire";
        } else {
            chaine += " – propriétaire : " + proprietaire.prenom + " " + proprietaire.nom;
        }
        return chaine;
    }
}
