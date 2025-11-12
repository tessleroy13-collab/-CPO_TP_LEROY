/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_bieres_leroyyy;

/**
 *
 * @author tessl
 */
public class BouteilleBiere {String nom;
    double degreAlcool;
    String brasserie;
    boolean ouverte;

    
    public BouteilleBiere(String unNom, double unDegre, String uneBrasserie) {
        nom = unNom;
        degreAlcool = unDegre;
        brasserie = uneBrasserie;
        ouverte = false;
    }

 
    public void lireEtiquette() {
        System.out.println("Bouteille de " + nom + " (" + degreAlcool + " degres)\nBrasserie : " + brasserie);
    }

   
    public boolean decapsuler() {
        if (!ouverte) {
            ouverte = true;
            return true;
        } else {
            System.out.println("Erreur : biere déjà ouverte");
            return false;
        }
    }

    @Override
    public String toString() {
        return nom + " (" + degreAlcool + " degrés) Ouverte ? " + (ouverte ? "oui" : "non");
    }
}
    

