/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_leroy;

/**
 *
 * @author tessl
 */
public class Personne {
    String prenom;
    String nom;

    int nbVoitures;
    Voiture[] liste_voitures;

    public Personne(String unPrenom, String unNom) {
        prenom = unPrenom;
        nom = unNom;

        nbVoitures = 0;
        liste_voitures = new Voiture[3]; // réservé pour 3 voitures max
    }

    @Override
    public String toString() {
        return prenom + " " + nom + " possède " + nbVoitures + " voiture(s).";
    }

    // méthode demandée : ajouter une voiture au propriétaire
    public boolean ajouter_voiture(Voiture voiture_a_ajouter) {

        // 1. La voiture a déjà un propriétaire
        if (voiture_a_ajouter.proprietaire != null) {
            return false;
        }

        // 2. Plus de place dans le tableau
        if (nbVoitures >= 3) {
            return false;
        }

        // 3. Ajout possible
        liste_voitures[nbVoitures] = voiture_a_ajouter;
        nbVoitures++;

        // on avertit la voiture que son propriétaire est la personne courante
        voiture_a_ajouter.proprietaire = this;

        return true;
    }
    
}
