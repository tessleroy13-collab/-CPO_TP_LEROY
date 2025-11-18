/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_leroy;

import java.util.ArrayList;


/**
 *
 * @author tessl
 */
public class TP3_Heroic_Fantasy_LEROY {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Epee excalibur = new Epee("Excalibur", 7, 5);
        Epee durandal = new Epee("Durandal", 4, 7);

        // 11. Deux bâtons
        Baton chene = new Baton("Chêne", 4, 5);
        Baton charme = new Baton("Charme", 5, 6);

        // 12. Tableau dynamique ArrayList
        ArrayList<Arme> armes = new ArrayList<>();

        armes.add(excalibur);
        armes.add(durandal);
        armes.add(chene);
        armes.add(charme);

        // 13. Affichage des armes
        System.out.println("Liste des armes :");
        for (int i = 0; i < armes.size(); i++) {
            System.out.println(armes.get(i));
        }
    }
    }
    
