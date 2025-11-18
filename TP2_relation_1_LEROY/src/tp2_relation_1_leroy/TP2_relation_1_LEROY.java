/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_relation_1_leroy;

/**
 *
 * @author tessl
 */
public class TP2_relation_1_LEROY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Voiture uneClio = new Voiture("Clio", "Renault", 5);
        Voiture uneAutreClio = new Voiture("Clio", "Renault", 5);
        Voiture une2008 = new Voiture("2008", "Peugeot", 6);
        Voiture uneMicra = new Voiture("Micra", "Nissan", 4);

        Personne bob = new Personne("Bobby", "Sixkiller");
        Personne reno = new Personne("Reno", "Raines");

        System.out.println("Liste des voitures :");
        System.out.println(uneClio);
        System.out.println(uneAutreClio);
        System.out.println(une2008);
        System.out.println(uneMicra);

        // Ajout des voitures à Bob
        bob.ajouter_voiture(uneClio);
        bob.ajouter_voiture(une2008);

        // Ajout des voitures à Reno
        reno.ajouter_voiture(uneAutreClio);
        reno.ajouter_voiture(uneMicra);

        System.out.println("\nAprès attribution des propriétaires :");
        System.out.println(uneClio);
        System.out.println(uneAutreClio);
        System.out.println(une2008);
        System.out.println(uneMicra);

        System.out.println("\nDétails des personnes :");
        System.out.println(bob);
        System.out.println(reno);
    }
        
    }
    

